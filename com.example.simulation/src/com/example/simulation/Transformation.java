package com.example.simulation;

//import org.eclipse.sirius.deployment.Deployment;
import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.*;

public class Transformation {
//	private Deployment deployment;
	public TransformToHorizontalBehavior transformToHorizontalBehavior;
	public TransformForceFeatureAsConnector transformForceFeatureAsConnector;
//	public SplitBidirectionalInformationFlow splitBidirectionalInformationFlow;
//	public TransformPropabilityInformationFlow transformPropabilityInformationFlow;
//	
	public Transformation(Functional_Architecture_Model fam, Deployment_Model deploymentModel) {
//	public Transformation(Deployment deployment) {
//		this.deployment = deployment;
		
		this.transformToHorizontalBehavior = new TransformToHorizontalBehavior(fam, deploymentModel);
		this.transformForceFeatureAsConnector = new TransformForceFeatureAsConnector(fam, deploymentModel);
//		this.splitBidirectionalInformationFlow = new SplitBidirectionalInformationFlow(deployment);
//		this.transformPropabilityInformationFlow = new TransformPropabilityInformationFlow(fam, deploymentModel);
	}
	
	public void TransformateAll() {
//		this.splitBidirectionalInformationFlow.Split();
		this.transformForceFeatureAsConnector.Transformate();
		this.transformToHorizontalBehavior.Transformate();
//		this.transformPropabilityInformationFlow.Transformate();
	}
}
