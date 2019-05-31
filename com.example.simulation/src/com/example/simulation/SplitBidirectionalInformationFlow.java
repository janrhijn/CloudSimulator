//package com.example.simulation;
//
//import java.util.Iterator;
//
//import org.eclipse.sirius.deployment.Component;
//import org.eclipse.sirius.deployment.Connector;
//import org.eclipse.sirius.deployment.Deployment;
//import org.eclipse.sirius.deployment.DeploymentFactory;
//import org.eclipse.sirius.deployment.InformationFlow;
//import org.eclipse.sirius.deployment.Scenario;
//
//public class SplitBidirectionalInformationFlow {
//	Deployment deployment;
//	TransformToHorizontalBehavior transformToHorizontalBehavior;
//
//	public SplitBidirectionalInformationFlow(Deployment deployment) {
//		this.deployment = deployment;
////		transformToHorizontalBehavior = new TransformToHorizontalBehavior(deployment); // Determine ComponentFromFeature	
//	}
//	
//	public void Split() {
//		DeploymentFactory factory = DeploymentFactory.eINSTANCE;
//		
//		for(Iterator<Scenario> scenarioIterator = deployment.getScenarios().iterator(); scenarioIterator.hasNext();) {
//			Scenario scenario = scenarioIterator.next();
//			
//			int size  = scenario.getInformationflow().size();
//			for(int i = size; i > 0; i--) {
//				InformationFlow informationflow = scenario.getInformationflow().get(i-1);
//				
//				if(informationflow.isBiDirectional()) {
//					System.out.println("Split of informationflow " + informationflow.getReceiver().getName() + " <-> " + informationflow.getSender().getName());
//					
//					// Init new InformationFlow 
//					InformationFlow newInformationFlow = factory.createInformationFlow();
//					newInformationFlow.setData(informationflow.getDataReverse());
//					newInformationFlow.setSender(informationflow.getReceiver());
//					scenario.getInformationflow().add(newInformationFlow);
//					
//					// Check if the sender (which, is receiver in reverse-InformationFlow) is Compute or Storage 
//					if(informationflow.getSender().eClass().getName() == "Compute" || informationflow.getSender().eClass().getName() == "Storage") {
//						// Create new Connector if feature is Compute or Storage
//						Connector newReceiverFeature = factory.createConnector();
//						newReceiverFeature.setName(informationflow.getSender().getName() + "_Connector");
//						
//						// Determine Component from Sender feature
////						Component component = transformToHorizontalBehavior.determineComponentFromFeature(informationflow.getSender());
////						component.getContains().add(newReceiverFeature);
//						
//						// Add new Connector feature as receiver of the new InformationFlow
//						newInformationFlow.setReceiver(newReceiverFeature);
//						
////						System.out.println(newReceiverFeature.getName() + " is added to " + component.getName());
//					} else {
//						// If sender feature is already Connector just set it as receiver
//						newInformationFlow.setReceiver(informationflow.getSender());
//					}
//					
//					// Adjust old InformationFlow
//					informationflow.setBiDirectional(false);
//					informationflow.setDataReverse(0);
//				}
//			}
//		}
//	}
//}
