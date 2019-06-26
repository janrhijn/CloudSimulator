package com.example.simulation;

import java.util.Iterator;

//import org.eclipse.sirius.deployment.Deployment;
//import org.eclipse.sirius.deployment.DeploymentPackage;

import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.*;

import com.example.model.load.LoadModel;

//import java.util.logging.Logger;

public class Main {
//	private static Logger LOGGER = Logger.getLogger("InfoLogging");

	public static void main(String[] args) {
//		LOGGER.info("Logging an INFO-level message");
		Deployment_Model deploymentModel = null;
		Functional_Architecture_Model fam = null;
		
		// Register EMF meta-model
//		DeploymentPackage.eINSTANCE.eClass();
		SoftwareSystemArchitecturePackage.eINSTANCE.eClass();

		// Init LoadModel plugin
		LoadModel lm = new LoadModel();
				
		// Invoke Load and init deployment with loaded model				
//		Deployment deployment = lm.Load();
		Software_System softwareSystem = lm.Load();
		
		// Set viewpoint to associated class
		for(Iterator<Viewpoint> viewpointIterator = softwareSystem.getViewpoint().iterator(); viewpointIterator.hasNext();) {
			Viewpoint viewPoint = viewpointIterator.next();
			if(viewPoint.eClass().getName() == "Deployment_Model") {
				deploymentModel = (Deployment_Model) viewPoint;
			} else if (viewPoint.eClass().getName() == "Functional_Architecture_Model") {
				fam = (Functional_Architecture_Model) viewPoint;
			}
		}
		
		Transformation trans = new Transformation(fam, deploymentModel);
		Simulation sim = new Simulation(fam, deploymentModel);
		Estimation estimate = new Estimation(deploymentModel);
		DeploymentToString output = new DeploymentToString();
		
		// Transform deployment for simulation
//		trans.TransformateAll();
//		trans.splitBidirectionalInformationFlow.Split();
//		trans.transformPropabilityInformationFlow.Transformate();
		trans.transformForceFeatureAsConnector.Transformate();
		trans.transformToHorizontalBehavior.Transformate();

		// Print new model in console
		output.PrintDeploymentModel(deploymentModel);
		output.PrintFAM(fam);

		// Simulation of deployment
		sim.Simulate(60*60*24*7); // Simulate with simduration
//		output.PrintComponentMetrics(deploymentModel);
		
		// Cost estimation of deployment
		estimate.Estimate();
	}
	
	
	
}
