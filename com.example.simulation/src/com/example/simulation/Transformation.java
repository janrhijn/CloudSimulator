package com.example.simulation;

import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.*;

public class Transformation {
	public TransformToHorizontalBehavior transformToHorizontalBehavior;
	public TransformForceFeatureAsConnector transformForceFeatureAsConnector;
//	public TransformPropabilityInformationFlow transformPropabilityInformationFlow;

	public Transformation(Functional_Architecture_Model fam, Deployment_Model deploymentModel, Scenario_Model scenarioModel) {
		this.transformToHorizontalBehavior = new TransformToHorizontalBehavior(fam, deploymentModel, scenarioModel);
		this.transformForceFeatureAsConnector = new TransformForceFeatureAsConnector(fam, deploymentModel, scenarioModel);
//		this.transformPropabilityInformationFlow = new TransformPropabilityInformationFlow(fam, deploymentModel);
	}
	
	public void TransformateAll() {
		this.transformForceFeatureAsConnector.Transformate();
		this.transformToHorizontalBehavior.Transformate();
//		this.transformPropabilityInformationFlow.Transformate();
	}
}
