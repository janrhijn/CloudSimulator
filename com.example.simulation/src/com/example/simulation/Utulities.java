package com.example.simulation;

import java.util.Iterator;

import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Component;
import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Deployment_Model;
import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Feature;

public class Utulities {

	public Utulities() {
		// TODO Auto-generated constructor stub
	}
	
	public Component determineComponentFromFeature(Deployment_Model deploymentModel, Feature feature) {
		// Iterate over all components
		for(Iterator<Component> componentIterator = deploymentModel.getContains().iterator(); componentIterator.hasNext();) {
			Component component = componentIterator.next();
			
			if(component.getContains().contains(feature)) {
//				System.out.println(feature.getName() + " found in " + component.getName());
				// return Component if Feature is found in Component
				return component;
			}
		}
		
		// Return null if no Component is found
		// TODO dit kan in principe niet gebeuren, misschien nog een extra check hiervoor inbouwen
		System.out.println("Error no component found");
		return null;
	}
}
