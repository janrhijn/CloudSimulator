package com.example.model.load;

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.*;

public class LoadModel {
	
	 public LoadModel() {
		 
	 }
	 
	 public Software_System Load() {
		 SoftwareSystemArchitecturePackage.eINSTANCE.eClass();
		 
		 Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		 Map<String, Object> m = reg.getExtensionToFactoryMap();
		 m.put("softwaresystemarchitecture", new XMIResourceFactoryImpl());
		 
		 ResourceSet resSet = new ResourceSetImpl();
		 
		 // Windows
//		 Resource res = resSet.getResource(URI.createURI("file:/C:\\Users\\jrhijn004\\git\\CloudSimulator\\uu.thesis.softwaresystemarchitecture.sample\\My.softwaresystemarchitecture"), true);

		 // Mac
		 Resource res = resSet.getResource(URI.createURI("/Users/janvanrhijn/git/CloudSimulator/uu.thesis.softwaresystemarchitecture.sample/My.softwaresystemarchitecture"), true);

		 Software_System model = (Software_System) res.getContents().get(0);
		 
		 System.out.println("Model: " + model.getName() + " is loaded\n");
		 
		 return model;
	 }	 
}


