package com.example.simulation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Import EMF Meta-model
import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.*;

public class TransformToHorizontalBehavior {
	Functional_Architecture_Model fam;
	Deployment_Model deploymentModel;
	Scenario_Model scenarioModel;
	
	Utulities utulities = new Utulities();

	public TransformToHorizontalBehavior(Functional_Architecture_Model fam, Deployment_Model deploymentModel,  Scenario_Model scenarioModel) {
		this.fam = fam;
		this.deploymentModel = deploymentModel;
		this.scenarioModel = scenarioModel;
	}
	
	public void Transformate() {
		// Iterate over Scenarios
		for(Iterator<Scenario> scenarioIterator = scenarioModel.getScenario_overlay().iterator(); scenarioIterator.hasNext();) {
			Scenario scenario = scenarioIterator.next();
		
			// Find a set of (two) features suitable for merging
			Interaction mergeableFeaturesSet = searchMergeableFeatures(scenario);
					
			// Find next mergeable feature set till no horizontal behavior left
			while(mergeableFeaturesSet != null) {
				// Merge the set of found features
				mergeMergeableFeatures(scenario, mergeableFeaturesSet);
				// Find new set of mergeable feature if possible 
				mergeableFeaturesSet = searchMergeableFeatures(scenario);
			}
		}
		
		// Remove not-used Features from model
		// Necessary, because the algorithm produce many not-used Features in order to work (this optimize the performance of the simulation)
		CleanUp();
	}
	
	
	private Interaction searchMergeableFeatures(Scenario scenario) {
		// Iterate over InformationFlows of scenario
		for(Iterator<Interaction> dataflowIterator = scenario.getInteraction().iterator(); dataflowIterator.hasNext();) {
			Interaction interaction = dataflowIterator.next();
//			System.out.println(informationflow.getSender() + " and " + informationflow.getReceiver());
			
			// Init sender and receiver Feature from the InformationFlow
			Feature senderFeature = (Feature) interaction.getInformationflow().eContainer();
			Feature receiverFeature = (Feature) interaction.getInformationflow().getReceiver();
			
			// Filter on Compute feature only for both sender and receiver
			if(senderFeature.getFeature_type().equals(Feature_Type.PROCESS) && receiverFeature.getFeature_type().equals(Feature_Type.PROCESS)) {
				// Check if both Features are in the same Component
				if(utulities.determineComponentFromFeature(deploymentModel, senderFeature) == utulities.determineComponentFromFeature(deploymentModel, receiverFeature)) {
//					System.out.println("Mergeable Features " + senderFeature.getName() + " " + receiverFeature.getName());
					
					// Return InformationFlow if both Features are from Compute class and in the same Component
					return interaction;
				}
			}
		}
		
		// Return null when no Mergeable feature is found
		return null;
	}
	
	private void mergeMergeableFeatures(Scenario scenario, Interaction interaction) {
		// Init Factory in order to create new Feature
		SoftwareSystemArchitectureFactory factory = SoftwareSystemArchitectureFactory.eINSTANCE;

		// Init sender and receiver Feature from the InformationFlow
		Feature senderFeatureA = (Feature) interaction.getInformationflow().eContainer();
		Feature receiverFeatureB = (Feature) interaction.getInformationflow().getReceiver();

		// Merge both Features and create a new merged Feature
		Feature mergedFeature = factory.createFeature();
		mergedFeature.setFeature_type(Feature_Type.PROCESS);
		mergedFeature.setName("(" + senderFeatureA.getName() + receiverFeatureB.getName()+ ")");
		
		// Calculate new service rate of merged Feature
		double newServiceRate = Math.pow(senderFeatureA.getServicerate(), -1) + Math.pow(receiverFeatureB.getServicerate(), -1);
		mergedFeature.setServicerate(Math.pow(newServiceRate, -1));
		
		// Add merged Feature to Component
		utulities.determineComponentFromFeature(deploymentModel, senderFeatureA).getContains().add(mergedFeature);

		// Delete current Interaction, because it is not needed anymore
		scenario.getInteraction().remove(interaction);
		
		// Set mergedfeature as new receiver in Interaction
		for(Interaction informationflow:scenario.getInteraction()) {
			// Senderfeature is the incoming feature of the merged feature (see details in paper)
			if(senderFeatureA.equals(informationflow.getInformationflow().getReceiver())) {
				// set mergedFeature as new receiver in Interaction
				informationflow.getInformationflow().setReceiver(mergedFeature);
			}
		}
		
		// Set mergedfeature as new sender in Interaction
		// Iterate over all Interactions in Scenario, because a Feature can have multiple outgoing Informationflows (see details in paper)
		for(Interaction informationflow:scenario.getInteraction()) {
			// Init sender and receiver of associated Interaction
			Feature sender = (Feature) informationflow.getInformationflow().eContainer();
			Feature receiver = informationflow.getInformationflow().getReceiver();
			
			List<Informationflow> addFlowToMergeableFeature = new ArrayList<Informationflow>();
			// Check if both features are a sender in an Interaction
			if(sender.equals(senderFeatureA) || sender.equals(receiverFeatureB)) {
				// Iterate through all flows of sender, because sender can have multiple flows (see details in paper)
				for(Informationflow flow:sender.getFlow()) {
					// If receiver in flow is the same as the receiver in the flow add flow to addFlowToMergeableFeature list
					if(flow.getReceiver().equals(receiver)) {
						addFlowToMergeableFeature.add(flow);
					}
				}
			}
			
			for(Informationflow flow:addFlowToMergeableFeature) {
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
				for(Iterator<Scenario> scenarioIterator = this.scenarioModel.getScenario_overlay().iterator(); scenarioIterator.hasNext();) {
					Scenario scenario = scenarioIterator.next();
						
					// Iterate over all Interactions in Scenario
					for(Iterator<Interaction> interactionIterator = scenario.getInteraction().iterator(); interactionIterator.hasNext();) {
						Interaction interaction = interactionIterator.next();
						
						// Init sender and receiver from Interaction
						Feature sender = (Feature) interaction.getInformationflow().eContainer();
						Feature receiver = interaction.getInformationflow().getReceiver();
						
						// Check if Feature is present in an Interaction
						if(receiver.equals(feature) || sender.equals(feature)) {
							inModel = true;
						}	
					}
				}
				
				// If Feature is not present in any Interaction, it can be removed
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
