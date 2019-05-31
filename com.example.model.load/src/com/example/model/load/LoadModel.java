package com.example.model.load;

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

//import org.eclipse.sirius.deployment.*;
import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.*;
//import uu.thesis.emf.metamodel.softwaresystemarchitecture.*;

public class LoadModel {
	
	 public LoadModel() {
//		 Load();
	 }
	 
	 public Software_System Load() {
//		 DeploymentPackage.eINSTANCE.eClass();
		 SoftwareSystemArchitecturePackage.eINSTANCE.eClass();
		 
		 Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		 Map<String, Object> m = reg.getExtensionToFactoryMap();
		 
		 // Old metamodel
//		 m.put("deployment", new XMIResourceFactoryImpl());
		 m.put("softwaresystemarchitecture", new XMIResourceFactoryImpl());
		 
		 ResourceSet resSet = new ResourceSetImpl();
		 
		 // TODO Dit kan op een betere manier, maar voor nu werkt het
		 // Old metamodel
//		 Resource res = resSet.getResource(URI.createURI("file:///C:\\Users\\jrhijn004\\runtime-EclipseApplication\\org.eclipse.sirius.deployment.sample\\My.deployment"), true);
		 Resource res = resSet.getResource(URI.createURI("file:///C:\\Users\\jrhijn004\\runtime-EclipseApplication\\uu.thesis.softwaresystemarchitecture\\sample.softwaresystemarchitecture"), true);

		 // Old metamodel
//		 Deployment model = (Deployment) res.getContents().get(0);
		 Software_System model = (Software_System) res.getContents().get(0);
		 
		 System.out.println("Model: " + model.getName() + " is loaded");
		 
		 return model;
	 }	 
}


