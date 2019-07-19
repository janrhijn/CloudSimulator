package com.example.simulation;

import java.util.Iterator;

import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.*;


public class DeploymentToString {
	
	public DeploymentToString() {

	}
	
	public void PrintDeploymentModel(Deployment_Model deploymentModel) {
		for(Iterator<Component> componentIterator = deploymentModel.getContains().iterator(); componentIterator.hasNext();) {
			Component component = componentIterator.next();
			System.out.println("Component " + component.getName());
			
			for(Iterator<Feature> featureIterator = component.getContains().iterator(); featureIterator.hasNext();) {
				Feature feature = featureIterator.next();
				System.out.println(" Feature " + feature.getName());
			}
		}
	}
	
	public void PrintScenarioModel(Scenario_Model scenarioModel) {
		for(Iterator<Scenario> scenarioIterator = scenarioModel.getScenario_overlay().iterator(); scenarioIterator.hasNext();) {
			Scenario scenario = scenarioIterator.next();
			System.out.println("Scenario: " + scenario.getName() + " arrivalrate: " + scenario.getArrivalrate());
				
			// Iterate over dataflow in order to determine data transfers
			for(Iterator<Interaction> informationflowIterator = scenario.getInteraction().iterator(); informationflowIterator.hasNext();) {
				Interaction informationflow = informationflowIterator.next();
				
				// Cast eContainer to feature (which is the sender)
				Feature sender = (Feature) informationflow.getInformationflow().eContainer();
				System.out.println(" Informationflow sender: " + sender.getName() + " -> receiver: " + informationflow.getInformationflow().getReceiver().getName());
			}
		}
	}

	public void PrintComponentMetrics(Deployment_Model deploymentModel) {
		for(Iterator<Component> componentIterator = deploymentModel.getContains().iterator(); componentIterator.hasNext();) {
			Component component = componentIterator.next();	
			System.out.println("Component " + component.getName());
			
			System.out.println(" Server Unit " + component.getServer_unit());
			System.out.println(" Server Unit " + component.getServer_unit());
			System.out.println(" Storage Capacity " + component.getStorage_capacity());
			System.out.println(" DataIn " + component.getData_in());
			System.out.println(" DataOut " + component.getData_out());
			System.out.println(" Requests " + component.getRequest());
		}
	}
}
