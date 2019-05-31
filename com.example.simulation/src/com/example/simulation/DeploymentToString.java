package com.example.simulation;

//import java.util.ArrayList;
import java.util.Iterator;
//import java.util.List;

//import org.eclipse.sirius.deployment.Component;
//import org.eclipse.sirius.deployment.Deployment;
//import org.eclipse.sirius.deployment.Feature;
//import org.eclipse.sirius.deployment.InformationFlow;
//import org.eclipse.sirius.deployment.Scenario;

import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.*;


public class DeploymentToString {
//	Deployment_Model deploymentModel;
//	Functional_Architecture_Model fam;
//	Deployment deployment;
//	List<Component> componentList;
	
//	public DeploymentToString(Deployment deployment) {
//		this.deployment = deployment;
//		
//		this.componentList = new ArrayList<Component>();
//		this.componentList.addAll(deployment.getVpc().getDeployed());
//		this.componentList.addAll(deployment.getContain());
//	}
	
	public DeploymentToString() {
//		// Set viewpoint to associated class
//		for(Iterator<Viewpoint> viewpointIterator = softwareSystem.getViewpoint().iterator(); viewpointIterator.hasNext();) {
//			Viewpoint viewPoint = viewpointIterator.next();
//			// TODO Switch
//			if(viewPoint.eClass().getName() == "Deployment_Model") {
//				deploymentModel = (Deployment_Model) viewPoint;
//			} else if (viewPoint.eClass().getName() == "Functional_Architecture_Model") {
//				fam = (Functional_Architecture_Model) viewPoint;
//			}
//		}
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
	
	public void PrintFAM(Functional_Architecture_Model fam) {
		for(Iterator<Scenario> scenarioIterator = fam.getScenario_overlay().iterator(); scenarioIterator.hasNext();) {
			Scenario scenario = scenarioIterator.next();
			System.out.println("Scenario: " + scenario.getName() + " arrivalrate: " + scenario.getArrivalrate());
				
			// Iterate over dataflow in order to determine data transfers
			for(Iterator<InformationFlow> informationflowIterator = scenario.getInformationflow().iterator(); informationflowIterator.hasNext();) {
				InformationFlow informationflow = informationflowIterator.next();
				
				// Cast eContainer to feature (which is the sender)
				Feature sender = (Feature) informationflow.getFlow().eContainer();
				System.out.println(" Informationflow sender: " + sender.getName() + " -> receiver: " + informationflow.getFlow().getReceiver().getName());
			}
		}
	}
	
//	public void PrintLine() {
////		List<Component> componentList = new ArrayList<Component>();
////		componentList.addAll(deployment.getVpc().getDeployed());
////		componentList.addAll(deployment.getContain());
//		
//		for(Iterator<Component> componentIterator = componentList.iterator(); componentIterator.hasNext();) {
//			Component component = componentIterator.next();
//			System.out.println("Component " + component.getName());
//			
//			for(Iterator<Feature> featureIterator = component.getContains().iterator(); featureIterator.hasNext();) {
//				Feature feature = featureIterator.next();
//				System.out.println(" Feature " + feature.getName());
//			}
//		}
//		
//		for(Iterator<Scenario> scenarioIterator = deployment.getScenarios().iterator(); scenarioIterator.hasNext();) {
//			Scenario scenario = scenarioIterator.next();
//			System.out.println("Scenario: " + scenario.getName() + " Arrival Rate: " + scenario.getArrivalrate());
//				
//			// Iterate over dataflow in order to determine data transfers
//			for(Iterator<InformationFlow> informationflowIterator = scenario.getInformationflow().iterator(); informationflowIterator.hasNext();) {
//				InformationFlow informationflow = informationflowIterator.next();
//				
//				if(informationflow.isBiDirectional()) {
//					System.out.println(" Informationflow " + informationflow.getSender().getName() + " <-> " + informationflow.getReceiver().getName() );
//				} else {
//					System.out.println(" Informationflow " + informationflow.getSender().getName() + " -> " + informationflow.getReceiver().getName() + " Probabilty " + informationflow.getProbability());
//				}
//				
//			}
//		}
//	}
//	
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
