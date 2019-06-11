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
		System.out.println("Simulation time: " + simduration + " sec");
		
		Instant start = Instant.now(); // Start time of simulation
		System.out.println("Simulation started at " + start);
		
		// Simulate
		for(int i = 1; i<=simduration; i++) {
			clock.timeTick(); // Increment clock with 1 second
			
			for(Iterator<Component> componentIterator = this.deploymentModel.getContains().iterator(); componentIterator.hasNext();) {
				Component component = componentIterator.next();
//				System.out.println("Name component: " + component.getName());
				
				component.setServer_duration(i);

				// Init component variables
				Double meanServiceRate = 0.0;
				Double totalLambda = 0.0;
				
				for(Iterator<Feature> featureIterator = component.getContains().iterator(); featureIterator.hasNext();) {
					Feature feature = featureIterator.next();
//					System.out.println(feature.getName());
					
					for(Iterator<Scenario> scenarioIterator = this.fam.getScenario_overlay().iterator(); scenarioIterator.hasNext();) {
					Scenario scenario = scenarioIterator.next();
//						System.out.println("Scenario: " + scenario.getName() + " Arrival Rate: " +scenario.getArrivalrate());
						
						// Iterate over InformationFlow in order to determine data in/out transfers
						for(Iterator<InformationFlow> informationflowIterator = scenario.getInformationflow().iterator(); informationflowIterator.hasNext();) {
							InformationFlow informationflow = informationflowIterator.next();
							
//							int arrivalRatePerInformationFlow = (int) Math.round(scenario.getArrivalrate() * informationflow.getProbability());
							int arrivalRatePerInformationFlow = scenario.getArrivalrate();
//							System.out.println(arrivalRatePerInformationFlow);
							
							// Set sender and receiver feature based on informationflow
							Feature senderFeature = (Feature) informationflow.getFlow().eContainer();
							Feature receiverFeature = (Feature) informationflow.getFlow().getReceiver();
							
							// Determine the receiver features of the component
							if(receiverFeature.equals(feature)) {
//								System.out.println("Scenario: " + scenario.getName() + " InformationFlow (" + informationflow.getFlow().getName() + "): " + senderFeature.getName() + " -> " + receiverFeature.getName());
								
								//TODO Specify data proccessed
								// Only set DataIn and Request if feature is the first incoming Feature, otherwise these metrics are summed up multiple times.
								if(!component.getContains().contains(senderFeature)) {
									Component senderComponent = utulities.determineComponentFromFeature(deploymentModel, senderFeature);
//									System.out.println(component.getName() + " Data In " + senderFeature.getName() + " -> " + receiverFeature.getName() + " Scenario: " + scenario.getName());

									// Only set Data_In if one of the Components is not part of the VPC
 									if((!component.isPart_of_vpc() && senderComponent.isPart_of_vpc()) || (component.isPart_of_vpc() && !senderComponent.isPart_of_vpc()) ) {
 										component.setData_in(component.getData_in() + informationflow.getData() * arrivalRatePerInformationFlow);
 									}	
								}
										
								// Determine the Compute features of the component
								if(feature.getFeature_type().equals(Feature_Type.PROCESS)) {
									totalLambda += arrivalRatePerInformationFlow;
									meanServiceRate = (arrivalRatePerInformationFlow / totalLambda) * feature.getServicerate() + ((totalLambda - arrivalRatePerInformationFlow) / totalLambda) * meanServiceRate;
//									System.out.println(component.getName() + " meanServiceRate " + meanServiceRate);
								}
								
								// Determine the Storage features of the instance
								if(feature.getFeature_type().equals(Feature_Type.STORAGE)) {
									component.setStorage_capacity(component.getStorage_capacity() + informationflow.getData() * arrivalRatePerInformationFlow);
								}
							}
								
							// Determine the sender features of the component
							if(senderFeature.equals(feature) && (!component.getContains().contains(receiverFeature))) {
								Component receiverComponent = utulities.determineComponentFromFeature(deploymentModel, receiverFeature);
//								System.out.println(component.getName() + " Data Out " + senderFeature.getName() + " -> " + receiverFeature.getName() + " Scenario: " + scenario.getName());
								
								// Only set Data_Out if one of the Components is not part of the VPC
								if((!component.isPart_of_vpc() && receiverComponent.isPart_of_vpc()) || (component.isPart_of_vpc() && !receiverComponent.isPart_of_vpc()) ) {
//									System.out.println(component.getName() + " Data Out " + senderFeature.getName() + " -> " + receiverFeature.getName() + " Scenario: " + scenario.getName());
									component.setData_out(component.getData_out() + (informationflow.getData() * arrivalRatePerInformationFlow));
								}	
							}
						}
					}
				}
				
				if(meanServiceRate > 0.0) {
					int servers = qn.DetermineServersOnWaitingTime(totalLambda, meanServiceRate, component.getMax_waiting_time());
//					System.out.println("Sojourn time for " + component.getName() + " is: " + qn.SojournTime(totalLambda, meanServiceRate) + " (" + qn.QueueWaitingTime(totalLambda, meanServiceRate) + " sec waiting time)" +" ms by " + servers + " servers");
					
					component.setServer_unit(component.getServer_unit() + servers);
					
//					System.out.println(component.getName() + " totalLambda: " + totalLambda + " meanServiceRate: " + meanServiceRate + " Servers: " + servers + " Minimal Requiered Servers: " + qn.MinRequiredServers(totalLambda, meanServiceRate));
				}
			}
		}
		
		Instant end = Instant.now(); // End time of simulation
		System.out.println("Simulation end at: " + end);
		System.out.println("Time to simulate: " + Duration.between(start, end).toString() + "\n" );
	}
}
