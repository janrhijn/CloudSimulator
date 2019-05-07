package com.example.simulation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.sirius.deployment.DeploymentFactory;
import org.eclipse.sirius.deployment.Deployment;
import org.eclipse.sirius.deployment.InformationFlow;
import org.eclipse.sirius.deployment.Scenario;

public class TransformPropabilityInformationFlow {
	Deployment deployment;
	TransformToHorizontalBehavior transformToHorizontalBehavior;
	
	public TransformPropabilityInformationFlow(Deployment deployment) {
		this.deployment = deployment;
		transformToHorizontalBehavior = new TransformToHorizontalBehavior(deployment); // Determine ComponentFromFeature	
	}
	
	//TODO kijken hoe
	public void Transformate() {
		// Init Factory in order to create new Feature
		DeploymentFactory factory = DeploymentFactory.eINSTANCE;
		
		for(Iterator<Scenario> scenarioIterator = deployment.getScenarios().iterator(); scenarioIterator.hasNext();) {
			Scenario scenario = scenarioIterator.next();
			
			List<InformationFlow> addInformationFlowList = new ArrayList<InformationFlow>();
				
			// Iterate over InformationFlow in order to determine data in/out transfers
			for(Iterator<InformationFlow> informationflowIterator = scenario.getInformationflow().iterator(); informationflowIterator.hasNext();) {
				InformationFlow informationflow = informationflowIterator.next();
					
				if(informationflow.getProbability() != 1.0) {
					// Create new InformationFlow back with probability of 1-p
					InformationFlow newInformationflow = factory.createInformationFlow();
					newInformationflow.setSender(informationflow.getReceiver());
					newInformationflow.setReceiver(informationflow.getSender());
					newInformationflow.setData(0);
					newInformationflow.setProbability(1 - informationflow.getProbability());
					addInformationFlowList.add(newInformationflow);
					

					// Adjust propobility of informationflow with 1 + 1-p
					informationflow.setProbability(1 + (1 - informationflow.getProbability()));
						
					System.out.println("New informationflow " + newInformationflow.getSender().getName() + " -> " + newInformationflow.getReceiver().getName());
						
				}
			}
			
			for(InformationFlow informationflow:addInformationFlowList) {
				scenario.getInformationflow().add(informationflow);
			}
		}
	}
}
