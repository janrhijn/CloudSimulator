package com.example.simulation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Import EMF Meta-model
import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.*;

public class TransformToHorizontalBehavior {
	Functional_Architecture_Model fam;
	Deployment_Model deploymentModel;
	
	Utulities utulities = new Utulities();

	public TransformToHorizontalBehavior(Functional_Architecture_Model fam, Deployment_Model deploymentModel) {
		this.fam = fam;
		this.deploymentModel = deploymentModel;
	}
	
	public void Transformate() {
		// Iterate over Scenarios
		for(Iterator<Scenario> scenarioIterator = fam.getScenario_overlay().iterator(); scenarioIterator.hasNext();) {
			Scenario scenario = scenarioIterator.next();
		
			// Find a set of (two) features suitable for merging
			InformationFlow mergeableFeaturesSet = searchMergeableFeatures(scenario);
					
			// Find next mergeable feature set till no horizontal behavior left
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
			
			// Init sender and receiver Feature from the InformationFlow
			Feature senderFeature = (Feature) informationflow.getFlow().eContainer();
			Feature receiverFeature = (Feature) informationflow.getFlow().getReceiver();
			
			// Filter on Compute feature only for both sender and receiver
			if(senderFeature.getFeature_type().equals(Feature_Type.PROCESS) && receiverFeature.getFeature_type().equals(Feature_Type.PROCESS)) {
				// Check if both Features are in the same Component
				if(utulities.determineComponentFromFeature(deploymentModel, senderFeature) == utulities.determineComponentFromFeature(deploymentModel, receiverFeature)) {
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
		SoftwareSystemArchitectureFactory factory = SoftwareSystemArchitectureFactory.eINSTANCE;

		// Init sender and receiver Feature from the InformationFlow
		Feature senderFeatureA = (Feature) informationFlow.getFlow().eContainer();
		Feature receiverFeatureB = (Feature) informationFlow.getFlow().getReceiver();

		// Merge both Features and create a new merged Feature
		Feature mergedFeature = factory.createFeature();
		mergedFeature.setFeature_type(Feature_Type.PROCESS);
		mergedFeature.setName("(" + senderFeatureA.getName() + receiverFeatureB.getName()+ ")");
		
		// Calculate new service rate of merged Feature
		double newServiceRate = Math.pow(senderFeatureA.getServicerate(), -1) + Math.pow(receiverFeatureB.getServicerate(), -1);
		mergedFeature.setServicerate(Math.pow(newServiceRate, -1));
		
		// Add merged Feature to Component
		utulities.determineComponentFromFeature(deploymentModel, senderFeatureA).getContains().add(mergedFeature);

		// Delete current InformationFlow, because it is not needed anymore
		scenario.getInformationflow().remove(informationFlow);
		
		// Set mergedfeature as new receiver in Informationflows
		for(InformationFlow informationflow:scenario.getInformationflow()) {
			// Senderfeature is the incoming feature of the merged feature (see details in paper)
			if(senderFeatureA.equals(informationflow.getFlow().getReceiver())) {
				// set mergedFeature as new receiver in informationflow
				informationflow.getFlow().setReceiver(mergedFeature);
			}
		}
		
		// Set mergedfeature as new sender in InformationFlows
		// Iterate through all informationflows in scenario, because a feature can have multiple outflows (see details in paper)
		for(InformationFlow informationflow:scenario.getInformationflow()) {
			// Init sender and receiver of associated informationflow
			Feature sender = (Feature) informationflow.getFlow().eContainer();
			Feature receiver = informationflow.getFlow().getReceiver();
			
			List<Flow> addFlowToMergeableFeature = new ArrayList<Flow>();
			// Check if both features are a sender in an informationflow
			if(sender.equals(senderFeatureA) || sender.equals(receiverFeatureB)) {
				// Iterate through all flows of sender, because sender can have multiple flows (see details in paper)
				for(Flow flow:sender.getFlow()) {
					// If receiver in flow is the same as the receiver in the flow add flow to addFlowToMergeableFeature list
					if(flow.getReceiver().equals(receiver)) {
						addFlowToMergeableFeature.add(flow);
					}
				}
			}
			
			for(Flow flow:addFlowToMergeableFeature) {
				mergedFeature.getFlow().add(flow);
			}
		}
		System.out.println("New merged feature " + mergedFeature.getName() + " service rate: " + mergedFeature.getServicerate());
	}
	
	private void CleanUp() {
		List<Feature> featureRemovalList = new ArrayList<Feature>();
		
		// Iterate over Components
		for(Iterator<Component> componentIterator = this.deploymentModel.getContains().iterator(); componentIterator.hasNext();) {
			Component component = componentIterator.next();
			
			// Iterate over Features in Component
			for(Iterator<Feature> featureIterator = component.getContains().iterator(); featureIterator.hasNext();) {
				Feature feature = featureIterator.next();
				boolean inModel = false;
				
				// Iterate over Scenarios
				for(Iterator<Scenario> scenarioIterator = this.fam.getScenario_overlay().iterator(); scenarioIterator.hasNext();) {
					Scenario scenario = scenarioIterator.next();
						
					// Iterate over Informationflows in Scenario
					for(Iterator<InformationFlow> informationflowIterator = scenario.getInformationflow().iterator(); informationflowIterator.hasNext();) {
						InformationFlow informationflow = informationflowIterator.next();
						
						// Init sender and receiver from informationflow
						Feature sender = (Feature) informationflow.getFlow().eContainer();
						Feature receiver = informationflow.getFlow().getReceiver();
						
						// Check if Feature is present in an Informationflow
						if(receiver.equals(feature) || sender.equals(feature)) {
							inModel = true;
						}	
					}
				}
				
				// If Feature is not present in any Informationflow, it can be removed
				if(!inModel) {
					System.out.println(component.getName() + " " + feature.getName());
					featureRemovalList.add(feature);
				}
			}
		}
		
		// Deletion outside iteration, otherwise concurrence error
		for(Feature feature:featureRemovalList) {
			// Get associated Component of the Feature
			Component component = utulities.determineComponentFromFeature(deploymentModel, feature);
			// Delete Feature from Component
			component.getContains().remove(feature);
			
			System.out.println("Feature: " + feature.getName() + " from " + component.getName() + " is removed");
		}
	}
}
