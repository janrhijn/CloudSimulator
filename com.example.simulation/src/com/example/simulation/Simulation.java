package com.example.simulation;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Import EMF Deployment Meta-model
import org.eclipse.sirius.deployment.*;

// Import Java logging services
//import java.util.logging.Logger;
//import java.util.logging.Level;

public class Simulation {
	Deployment deployment;
	Double utilizationRate = 0.7;
	Clock clock = new Clock();
	
	QueueingNode qn = new QueueingNode();
	
	public Simulation(Deployment deployment) {
		this.deployment = deployment;
	}
	
	public void Simulate(int simduration) {
		System.out.println("Simulation time: " + simduration + " sec");
		
		Instant start = Instant.now(); // Start time of simulation
		System.out.println("Simulation started at " + start);
		
		// Add all Components in one list
		List<Component> componentList = new ArrayList<Component>();
		componentList.addAll(deployment.getVpc().getDeployed());
		componentList.addAll(deployment.getContain());
		
		// Simulate
		for(int i = 1; i<=simduration; i++) {
			clock.timeTick(); // Increment clock with 1 second
//			System.out.println(clock.toString());
			
			for(Iterator<Component> componentIterator = componentList.iterator(); componentIterator.hasNext();) {
				Component component = componentIterator.next();
				
//				System.out.println("Name component: " + component.getName());
				component.setServerDuration(i); // Performance wise, this can also be afterwards

				Double meanServiceRate = 0.0;
				Double totalLambda = 0.0;
				
				for(Iterator<Feature> featureIterator = component.getContains().iterator(); featureIterator.hasNext();) {
					Feature feature = featureIterator.next();
//					System.out.println(feature.getName());
					
					for(Iterator<Scenario> scenarioIterator = deployment.getScenarios().iterator(); scenarioIterator.hasNext();) {
					Scenario scenario = scenarioIterator.next();
//					double sojournTime = 0.0;
					
//					System.out.println("Scenario: " + scenario.getName() + " Arrival Rate: " +scenario.getArrivalrate());
						
						// Iterate over InformationFlow in order to determine data in/out transfers
						for(Iterator<InformationFlow> informationflowIterator = scenario.getInformationflow().iterator(); informationflowIterator.hasNext();) {
							InformationFlow informationflow = informationflowIterator.next();
							
							int arrivalRatePerInformationFlow = (int) Math.round(scenario.getArrivalrate() * informationflow.getProbability());
															
							// Determine the receiver features of the instance
							if(informationflow.getReceiver() == feature) {
//								System.out.println("Scenario: " + scenario.getName() + "InformationFlow: " + informationflow.getSender().getName() + " -> " + informationflow.getReceiver().getName() + " Arrival Rate: " + arrivalRate);
								// Only set DataIn and Request if feature is the first incoming Feature, otherwise these metrics are summed up multiple times.
								if(!component.getContains().contains(informationflow.getSender())) {
									component.setDataIn(component.getDataIn() + informationflow.getData() * arrivalRatePerInformationFlow);
									component.setRequest(component.getRequest() + arrivalRatePerInformationFlow);
								}
										
								// Determine the Compute features of the instance
								if(feature.eClass().getName() == "Compute") {
									Compute compute = (Compute) feature;
//									System.out.println(" " + feature.getName() + " "+ compute.getServicerate() + " arrival rate " + scenario.getArrivalrate());
									totalLambda += arrivalRatePerInformationFlow;
									meanServiceRate = (arrivalRatePerInformationFlow / totalLambda) * compute.getServicerate() + ((totalLambda - arrivalRatePerInformationFlow) / totalLambda) * meanServiceRate;
//									System.out.println(component.getName() + " meanServiceRate " + meanServiceRate);
								}
								
								// Determine the Storage features of the instance
								if(feature.eClass().getName() == "Storage") {
//									System.out.println(feature.getName());
									
									component.setStorageCapacity(component.getStorageCapacity() + informationflow.getData() * arrivalRatePerInformationFlow);
								}
							}
								
							// Determine the sender features of the component
							if(informationflow.getSender() == feature && (!component.getContains().contains(informationflow.getReceiver()))) {
//								System.out.println(" Scenario " + scenario.getName() + " Sender feature " + feature.getName() + " Data: " + dataflow.getData());
								component.setDataOut(component.getDataOut() + informationflow.getData() * scenario.getArrivalrate());
							}
						}
//						scenario.setMeanSojournTime(value);
					}
				}
				
				if(meanServiceRate > 0.0) {
					int servers = qn.DetermineServersOnWaitingTime(totalLambda, meanServiceRate, 100);
					System.out.println("Sojourn time for " + component.getName() + " is: " + qn.SojournTime(totalLambda, meanServiceRate) + " (" + qn.QueueWaitingTime(totalLambda, meanServiceRate) + " sec waiting time)" +" ms by " + servers + " servers");
					
					component.setServerUnitTime(component.getServerUnitTime() + servers);
					component.setDeployedUnits(servers);
					
//					System.out.println(component.getName() + " totalLambda: " + totalLambda + " meanServiceRate: " + meanServiceRate + " Servers: " + servers + " Minimal Requiered Servers: " + qn.MinRequiredServers(totalLambda, meanServiceRate));
				}
			}
		}
		
		Instant end = Instant.now(); // End time of simulation
		System.out.println("Simulation end at: " + end);
		System.out.println("Time to simulate: " + Duration.between(start, end).toString() + "\n" );
	}
}
