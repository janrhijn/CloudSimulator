package com.example.simulation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.sirius.deployment.Component;
import org.eclipse.sirius.deployment.Compute;
import org.eclipse.sirius.deployment.Deployment;
import org.eclipse.sirius.deployment.DeploymentFactory;
import org.eclipse.sirius.deployment.Feature;
import org.eclipse.sirius.deployment.InformationFlow;
import org.eclipse.sirius.deployment.Scenario;

public class TransformToHorizontalBehavior {
	Deployment deployment;

	public TransformToHorizontalBehavior(Deployment deployment) {
		this.deployment = deployment;
	}
	
	public void Transformate() {
		// Iterate over scenarios
		for(Iterator<Scenario> scenarioIterator = deployment.getScenarios().iterator(); scenarioIterator.hasNext();) {
			Scenario scenario = scenarioIterator.next();
		
			// Find a set of (two) features capable for merging
			InformationFlow mergeableFeaturesSet = searchMergeableFeatures(scenario);
					
			// Find next mergeable feature till there is no horizontal behavior left
			while(mergeableFeaturesSet != null) {
				// Merge the set of found features
				mergeMergeableFeatures(scenario, mergeableFeaturesSet);
				// Find new set of mergeable feature if possible 
				mergeableFeaturesSet = searchMergeableFeatures(scenario);
			}
		}
		
		// Remove not-used Features from model
		// Neccessary, because the algorithm produce many not-used Features in order to work (for optimizing performance of the simulation)
		CleanUp();
	}
	
	
	private InformationFlow searchMergeableFeatures(Scenario scenario) {
		// Iterate over InformationFlows of scenario
		for(Iterator<InformationFlow> dataflowIterator = scenario.getInformationflow().iterator(); dataflowIterator.hasNext();) {
			InformationFlow informationflow = dataflowIterator.next();
//			System.out.println(informationflow.getSender() + " and " + informationflow.getReceiver());
			
			// Filter on Compute feature only for both sender and receiver
			if(informationflow.getSender().eClass().getName() == "Compute" && informationflow.getReceiver().eClass().getName() == "Compute") {
				// Init sender and receiver Feature from the InformationFlow
				Feature senderFeature = informationflow.getSender();
				Feature receiverFeature = informationflow.getReceiver();
				
				// Check if both Features are in the same Component
				if(determineComponentFromFeature(senderFeature) == determineComponentFromFeature(receiverFeature)) {
//					System.out.println("Mergeable Features " + senderFeature.getName() + " " + receiverFeature.getName());
					
					// Return InformationFlow if both Features are from Compute class and in the same Component
					return informationflow;
				}
			}
		}
		
		// Return null when no Mergeable feature is found
		return null;
	}
	
	private void mergeMergeableFeatures(Scenario scenario, InformationFlow informationFlow) {
		// Init Factory in order to create new Feature
		DeploymentFactory factory = DeploymentFactory.eINSTANCE;
		
		// Init sender and receiver Feature from the InformationFlow
		Compute senderFeature = (Compute) informationFlow.getSender();
		Compute receiverFeature = (Compute) informationFlow.getReceiver();			

		// Merge both Features and create a new merged Feature
		Compute mergedFeature = factory.createCompute();
		mergedFeature.setName(senderFeature.getName() + receiverFeature.getName());
		// Calculate new service rate of merged Feature
		double newServiceRate = Math.pow(senderFeature.getServicerate(), -1) + Math.pow(receiverFeature.getServicerate(), -1);
		mergedFeature.setServicerate(Math.pow(newServiceRate, -1));
		
		// Add merged Feature to Component
		determineComponentFromFeature(senderFeature).getContains().add(mergedFeature);

		// Delete current InformationFlow, because it is not needed anymore
		scenario.getInformationflow().remove(informationFlow);
		
		// Set mergedfeature as new receiver in InformationFlows
		for(InformationFlow df:scenario.getInformationflow()) {
//			System.out.println(df.getSender().getName() + " -> " + df.getReceiver().getName() + " receiverFeature: " + receiverFeature.getName());
			
			// Senderfeature is incoming feature of the merged feature
			if(senderFeature.equals(df.getReceiver())) {
				// set mergedFeature as new receiver in informationflow
				df.setReceiver(mergedFeature);
			}
		}
		
		// Set mergedfeature as new sender in InformationFlows
		for(InformationFlow df:scenario.getInformationflow()) {
//			System.out.println(df.getSender().getName() + " -> " + df.getReceiver().getName());
			
			if(senderFeature.equals(df.getSender()) || receiverFeature.equals(df.getSender())) {
//				System.out.println("senderFeature " + + df.getData());
				df.setSender(mergedFeature);
			}

		}
		
		System.out.println("New merged feature " + mergedFeature.getName() + " service rate: " + mergedFeature.getServicerate());
	}
	
	public Component determineComponentFromFeature(Feature feature) {
		// Add all Components in one list
		List<Component> componentList = new ArrayList<Component>();
		componentList.addAll(deployment.getVpc().getDeployed());
		componentList.addAll(deployment.getContain());
		
		// Iterate over all components from VPC
		for(Iterator<Component> componentIterator = componentList.iterator(); componentIterator.hasNext();) {
			Component component = componentIterator.next();
			
			if(component.getContains().contains(feature)) {
//				System.out.println("Feature found in " + instance.getName());
				
				// return Component if Feature is found in Component
				return component;
			}
		}
		
		// Return null if no Component is found
		// TODO dit kan in principe niet gebeuren, misschien nog een extra check hiervoor inbouwen
		System.out.println("Error no component found");
		return null;
	}
	
	private void CleanUp() {
		// Init list with all components (from VPC and deployment)
		List<Component> componentList = new ArrayList<Component>();
		componentList.addAll(deployment.getVpc().getDeployed());
		componentList.addAll(deployment.getContain());
		
		List<Feature> featureRemovalList = new ArrayList<Feature>();
		
		// Iterate over Components
		for(Iterator<Component> componentIterator = componentList.iterator(); componentIterator.hasNext();) {
			Component component = componentIterator.next();
			
			// Iterate over Features in Component
			for(Iterator<Feature> featureIterator = component.getContains().iterator(); featureIterator.hasNext();) {
				Feature feature = featureIterator.next();
				boolean inModel = false;
				
				// Iterate over Scenarios
				for(Iterator<Scenario> scenarioIterator = deployment.getScenarios().iterator(); scenarioIterator.hasNext();) {
					Scenario scenario = scenarioIterator.next();
						
					// Iterate over InformationFlows in Scenario
					for(Iterator<InformationFlow> informationflowIterator = scenario.getInformationflow().iterator(); informationflowIterator.hasNext();) {
						InformationFlow informationflow = informationflowIterator.next();
						
						// Check if Feature is present in an InformationFlow
						if(informationflow.getReceiver().equals(feature) || informationflow.getSender().equals(feature)) {
							inModel = true;
						}	
					}
				}
				
				// If Feature is not present in any InformationFlow, it can be removed
				if(!inModel) {
					featureRemovalList.add(feature);
				}
			}
		}
		
		// Deletion outside iteration, otherwise concurrence error
		for(Feature feature:featureRemovalList) {
			// Get Component of the Feature
			Component component = determineComponentFromFeature(feature);
			// Delete Feature from Component
			component.getContains().remove(feature);
			
			System.out.println("Feature: " + feature.getName() + " from " + component.getName() + " is removed");
		}
		
	}
}
