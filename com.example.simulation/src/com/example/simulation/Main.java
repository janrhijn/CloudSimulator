package com.example.simulation;

import java.util.Iterator;

import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.*;

import com.example.model.load.LoadModel;


public class Main {

	public static void main(String[] args) {		
		// Register EMF meta-model
		SoftwareSystemArchitecturePackage.eINSTANCE.eClass();

		// Initialize LoadModel plugin
		LoadModel lm = new LoadModel();
				
		// Invoke Load and Initialize deployment with loaded model				
		Software_System softwareSystem = lm.Load();
		
		// Initialize viewpoints
		Deployment_Model deploymentModel = null;
		Functional_Architecture_Model fam = null;
		
		// Set viewpoint to associated class
		for(Iterator<Viewpoint> viewpointIterator = softwareSystem.getViewpoint().iterator(); viewpointIterator.hasNext();) {
			Viewpoint viewPoint = viewpointIterator.next();
			if(viewPoint.eClass().getName() == "Deployment_Model") {
				deploymentModel = (Deployment_Model) viewPoint;
			} else if (viewPoint.eClass().getName() == "Functional_Architecture_Model") {
				fam = (Functional_Architecture_Model) viewPoint;
			}
		}
		
		// Initialize required classes
		Transformation trans = new Transformation(fam, deploymentModel);
		Simulation sim = new Simulation(fam, deploymentModel);
		Estimation estimate = new Estimation(deploymentModel);
		DeploymentToString output = new DeploymentToString();
		
		// Transform deployment for simulation
		trans.TransformateAll();
//		trans.transformPropabilityInformationFlow.Transformate();
//		trans.transformForceFeatureAsConnector.Transformate();
//		trans.transformToHorizontalBehavior.Transformate();

		// Print transformated model in console
		output.PrintDeploymentModel(deploymentModel);
		output.PrintFAM(fam);

		// Simulate deployment
		sim.Simulate(60*60*24*1); // Simulate with simulation duration
//		output.PrintComponentMetrics(deploymentModel);
		
		// Cost estimation of deployment
		estimate.Estimate();
	}
	
	
	
}
