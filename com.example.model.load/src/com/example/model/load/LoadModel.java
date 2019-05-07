package com.example.model.load;

import java.util.Map;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.sirius.deployment.*;

public class LoadModel {
	
	 public LoadModel() {
//		 Load();
	 }
	 
	 public Deployment Load() {
//		 DeploymentPackage.eINSTANCE.eClass();
		 
		 Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		 Map<String, Object> m = reg.getExtensionToFactoryMap();
		 m.put("deployment", new XMIResourceFactoryImpl());
		 
		 ResourceSet resSet = new ResourceSetImpl();
		 
//		 URI fileURI = URI.createFileURI("file:///C:\\Users\\jrhijn004\\runtime-EclipseApplication\\org.eclipse.sirius.deployment.sample\\My.deployment");
//		 System.out.println(fileURI);
		 
//		 Resource res = resSet.getResource(URI.createURI("/org.eclipse.sirius.deployment.sample/My.deployment"), true);
		 // Dit kan op een betere manier, maar voor nu werkt het
		 Resource res = resSet.getResource(URI.createURI("file:///C:\\Users\\jrhijn004\\runtime-EclipseApplication\\org.eclipse.sirius.deployment.sample3\\My.deployment"), true);
		 
		 Deployment model = (Deployment) res.getContents().get(0);
		 
		 System.out.println("Model: " + model.getName() + " is loaded");
		 
		 return model;
	 }	 
}
