package com.example.simulation;

import java.util.Iterator;

import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.*;

public class TransformForceFeatureAsConnector {
	Functional_Architecture_Model fam;
	Deployment_Model deploymentModel;
	
	Utulities utulities = new Utulities();
	
	public TransformForceFeatureAsConnector(Functional_Architecture_Model fam, Deployment_Model deploymentModel) {
		this.fam = fam;
		this.deploymentModel = deploymentModel;
	}
	
	public void Transformate() {
		SoftwareSystemArchitectureFactory factory = SoftwareSystemArchitectureFactory.eINSTANCE;
		
		// Iterate through all scenarios
		for(Iterator<Scenario> scenarioIterator = this.fam.getScenario_overlay().iterator(); scenarioIterator.hasNext();) {
			Scenario scenario = scenarioIterator.next();
			
			// Iterate through all informationflows within a scenario
			for(Iterator<InformationFlow> informationflowIterator = scenario.getInformationflow().iterator(); informationflowIterator.hasNext();) {
				InformationFlow informationflow = informationflowIterator.next();
				
				// Check if informationflow has property isForce_receiver_as_connector
				if(informationflow.isForce_receiver_as_connector()) {
					// Init receiver feature from informationflow
					Feature oldReceiverFeature = informationflow.getFlow().getReceiver();
					
					// Only duplicate if feature has PROCESS as feature type
					if(oldReceiverFeature.getFeature_type().equals(Feature_Type.PROCESS)) {
						// Init new feature with feature type as CONNECTOR
						Feature newReceiverFeature = factory.createFeature();
						newReceiverFeature.setName(oldReceiverFeature.getName() + "'");
						newReceiverFeature.setFeature_type(Feature_Type.CONNECTOR);
						
						// Set new duplicated feature to flow 
						informationflow.getFlow().setReceiver(newReceiverFeature);
						
						//TODO als ik tijd over heb: de informationflow waarbij de feature een sender is wordt niet aangepast, hierdoor blijven beide features bestaan in de data (performance wise niet handig)
						
						// Add Feature to associated Component
						utulities.determineComponentFromFeature(deploymentModel, oldReceiverFeature).getContains().add(newReceiverFeature);
						System.out.println(oldReceiverFeature.getName() + " is forced to connector");
					}
				}
			}
		
		}
		
		
	}

}
