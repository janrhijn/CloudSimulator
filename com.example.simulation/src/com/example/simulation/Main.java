package com.example.simulation;

import org.eclipse.sirius.deployment.Deployment;
import org.eclipse.sirius.deployment.DeploymentPackage;

import com.example.model.load.LoadModel;

//import java.util.logging.Logger;

public class Main {
//	private static Logger LOGGER = Logger.getLogger("InfoLogging");

	public static void main(String[] args) {
//		LOGGER.info("Logging an INFO-level message");
		
		// Register EMF meta-model
		DeploymentPackage.eINSTANCE.eClass();

		// Init LoadModel plugin
		LoadModel lm = new LoadModel();
				
		// Invoke Load and init deployment with loaded model				
		Deployment deployment = lm.Load();
		
		Transformation trans = new Transformation(deployment);
		Simulation sim = new Simulation(deployment);
		Estimation estimate = new Estimation(deployment);
		DeploymentToString output = new DeploymentToString(deployment);
		
		// Transform deployment for simulation
//		trans.TransformateAll();
		trans.splitBidirectionalInformationFlow.Split();
		trans.transformPropabilityInformationFlow.Transformate();
		trans.transformToHorizontalBehavior.Transformate();
		// Print new model in console
		output.PrintLine();
		
		// Simulation of deployment		
		sim.Simulate(1); // Simulate with simduration
		output.PrintComponentMetrics();
		
		// Cost estimation of deployment
//		estimate.Estimate();
	}
	
}
