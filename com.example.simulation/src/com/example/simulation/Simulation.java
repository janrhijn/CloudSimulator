package com.example.simulation;

import java.time.Duration;
import java.time.Instant;
import java.util.Iterator;

// Import EMF Meta-model
import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.*;

// Import Java logging services
//import java.util.logging.Logger;
//import java.util.logging.Level;

public class Simulation {
	Functional_Architecture_Model fam;
	Deployment_Model deploymentModel;
	
	Clock clock = new Clock();
	QueueingNode qn = new QueueingNode();
	Utulities utulities = new Utulities();
	
	public Simulation(Functional_Architecture_Model fam, Deployment_Model deploymentModel) {
		this.fam = fam;
		this.deploymentModel = deploymentModel;
	}
	
	public void Simulate(int simduration) {
		System.out.println("\nSimulation");
		System.out.println(" Simulation duration: " + simduration + " sec");
		
		Instant start = Instant.now(); // Start time of simulation
		System.out.println(" Simulation started at " + start);
		
		// Simulation
		for(int i = 1; i<=simduration; i++) {
			clock.timeTick(); // Increment clock with 1 second for each simulation unit
			
			// Iterate over Components in deployment model
			for(Iterator<Component> componentIterator = this.deploymentModel.getContains().iterator(); componentIterator.hasNext();) {
				Component component = componentIterator.next();

				// Set server_duration pricing function capability
				component.setServer_duration(i);

				// Initialize Component workload variables
				Double meanServiceRate = 0.0;
				Double totalLambda = 0.0;
				
				// Iterate over Features of Component
				for(Iterator<Feature> featureIterator = component.getContains().iterator(); featureIterator.hasNext();) {
					Feature feature = featureIterator.next();
					
					// Iterate over all Scenarios in FAM
					for(Iterator<Scenario> scenarioIterator = this.fam.getScenario_overlay().iterator(); scenarioIterator.hasNext();) {
					Scenario scenario = scenarioIterator.next();
						
						// Iterate over Interaction in order to determine data in/out transfers for each component
						for(Iterator<Interaction> interactionIterator = scenario.getInteraction().iterator(); interactionIterator.hasNext();) {
							Interaction interaction = interactionIterator.next();
							
							//TODO kijken of we dit nog gaan toepassen
//							int arrivalRatePerInformationFlow = (int) Math.round(scenario.getArrivalrate() * informationflow.getProbability());
							int arrivalRatePerInformationFlow = scenario.getArrivalrate();
							
							// Initialize sender and receiver feature from Interaction
							Feature senderFeature = (Feature) interaction.getInformationflow().eContainer();
							Feature receiverFeature = (Feature) interaction.getInformationflow().getReceiver();
							
							// Determine all receiver features of the Component
							if(receiverFeature.equals(feature)) {								
								//TODO Specify data processed
								
								// Only set DataIn and Request if feature is the first incoming Feature, otherwise metrics are summed up multiple times.
								if(!component.getContains().contains(senderFeature)) {
									// Set request pricing function capability
									component.setRequest(component.getRequest() + arrivalRatePerInformationFlow);	

									// Only set data_in capability if one of the Components is not part of the VPC
									Component senderComponent = utulities.determineComponentFromFeature(deploymentModel, senderFeature); // Determine sending Component
 									if((!component.isPart_of_vpc() && senderComponent.isPart_of_vpc()) || (component.isPart_of_vpc() && !senderComponent.isPart_of_vpc()) ) {
 										// Set data_in pricing function capability
 										component.setData_in(component.getData_in() + interaction.getData() * arrivalRatePerInformationFlow);
 									}	
								}
										
								// Determine if Feature has a PROCESS feature_type
								if(feature.getFeature_type().equals(Feature_Type.PROCESS)) {
									// Composition method
									totalLambda += arrivalRatePerInformationFlow;
									meanServiceRate = (arrivalRatePerInformationFlow / totalLambda) * feature.getServicerate() + ((totalLambda - arrivalRatePerInformationFlow) / totalLambda) * meanServiceRate;
								}
								
								// Determine if Feature has a STORAGE feature_type
								if(feature.getFeature_type().equals(Feature_Type.STORAGE)) {
									// Set storage pricing function capability
									component.setStorage_capacity(component.getStorage_capacity() + interaction.getData() * arrivalRatePerInformationFlow);
								}
							}
								
							// Determine all sender features of the component
							if(senderFeature.equals(feature) && (!component.getContains().contains(receiverFeature))) {								
								// Only set data_out capability if one of the Components is not part of the VPC
								Component receiverComponent = utulities.determineComponentFromFeature(deploymentModel, receiverFeature); // Determine receiving Component
								if((!component.isPart_of_vpc() && receiverComponent.isPart_of_vpc()) || (component.isPart_of_vpc() && !receiverComponent.isPart_of_vpc()) ) {
									// Set data_out pricing function capability
									component.setData_out(component.getData_out() + (interaction.getData() * arrivalRatePerInformationFlow));
								}	
							}
						}
					}
				}
				
				// Estimate amount of required servers based on workload
				if(meanServiceRate > 0.0) {
					int servers = qn.DetermineServersOnWaitingTime(totalLambda, meanServiceRate, component.getMax_waiting_time());
//					System.out.println("Sojourn time for " + component.getName() + " is: " + qn.SojournTime(totalLambda, meanServiceRate) + " (" + qn.QueueWaitingTime(totalLambda, meanServiceRate) + " sec waiting time)" +" ms by " + servers + " servers");
					
					// Set sever_unit pricing function capability
					component.setServer_unit(component.getServer_unit() + servers);
				}
			}
		}
		
		Instant end = Instant.now(); // End time of simulation
		System.out.println(" Simulation ended at: " + end);
		System.out.println(" Time to simulate: " + Duration.between(start, end).toString());
	}
}
