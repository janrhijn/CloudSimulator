package com.example.simulation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.sirius.deployment.Component;
import org.eclipse.sirius.deployment.Deployment;
import org.eclipse.sirius.deployment.Feature;
import org.eclipse.sirius.deployment.InformationFlow;
import org.eclipse.sirius.deployment.Scenario;

public class DeploymentToString {
	Deployment deployment;
	List<Component> componentList;
	
	public DeploymentToString(Deployment deployment) {
		this.deployment = deployment;
		
		this.componentList = new ArrayList<Component>();
		this.componentList.addAll(deployment.getVpc().getDeployed());
		this.componentList.addAll(deployment.getContain());
	}
	
	public void PrintLine() {
//		List<Component> componentList = new ArrayList<Component>();
//		componentList.addAll(deployment.getVpc().getDeployed());
//		componentList.addAll(deployment.getContain());
		
		for(Iterator<Component> componentIterator = componentList.iterator(); componentIterator.hasNext();) {
			Component component = componentIterator.next();
			System.out.println("Component " + component.getName());
			
			for(Iterator<Feature> featureIterator = component.getContains().iterator(); featureIterator.hasNext();) {
				Feature feature = featureIterator.next();
				System.out.println(" Feature " + feature.getName());
			}
		}
		
		for(Iterator<Scenario> scenarioIterator = deployment.getScenarios().iterator(); scenarioIterator.hasNext();) {
			Scenario scenario = scenarioIterator.next();
			System.out.println("Scenario: " + scenario.getName() + " Arrival Rate: " + scenario.getArrivalrate());
				
			// Iterate over dataflow in order to determine data transfers
			for(Iterator<InformationFlow> informationflowIterator = scenario.getInformationflow().iterator(); informationflowIterator.hasNext();) {
				InformationFlow informationflow = informationflowIterator.next();
				
				if(informationflow.isBiDirectional()) {
					System.out.println(" Informationflow " + informationflow.getSender().getName() + " <-> " + informationflow.getReceiver().getName() );
				} else {
					System.out.println(" Informationflow " + informationflow.getSender().getName() + " -> " + informationflow.getReceiver().getName() + " Probabilty " + informationflow.getProbability());
				}
				
			}
		}
	}
	
	public void PrintComponentMetrics() {
		for(Iterator<Component> componentIterator = componentList.iterator(); componentIterator.hasNext();) {
			Component component = componentIterator.next();	
			System.out.println("Component " + component.getName());
			
			System.out.println(" Server Units " + component.getServerUnitTime());
			System.out.println(" Storage Capacity " + component.getStorageCapacity());
			System.out.println(" DataIn " + component.getDataIn());
			System.out.println(" DataOut " + component.getDataOut());
			System.out.println(" Requests " + component.getRequest());
		}
	}
}
