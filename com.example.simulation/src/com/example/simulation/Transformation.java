package com.example.simulation;

import org.eclipse.sirius.deployment.Deployment;

public class Transformation {
//	private Deployment deployment;
	public TransformToHorizontalBehavior transformToHorizontalBehavior;
	public SplitBidirectionalInformationFlow splitBidirectionalInformationFlow;
	public TransformPropabilityInformationFlow transformPropabilityInformationFlow;
	
	public Transformation(Deployment deployment) {
//		this.deployment = deployment;
		
		this.transformToHorizontalBehavior = new TransformToHorizontalBehavior(deployment);		
		this.splitBidirectionalInformationFlow = new SplitBidirectionalInformationFlow(deployment);
		this.transformPropabilityInformationFlow = new TransformPropabilityInformationFlow(deployment);
	}
	
	public void TransformateAll() {
		this.splitBidirectionalInformationFlow.Split();
		this.transformToHorizontalBehavior.Transformate();
		this.transformPropabilityInformationFlow.Transformate();
	}
}
