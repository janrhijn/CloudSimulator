package uu.thesis.softwaresystemarchitecture.design;

import java.util.Iterator;

import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.*;


/**
 * The services class used by VSM.
 */
public class Services {    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
    
	
	public Boolean InformationflowRed(Software_System softwareSystem, Informationflow informationflow) {
		Scenario_Model scenarioModel = null;
		for(Iterator<Viewpoint> viewpointIterator = softwareSystem.getViewpoint().iterator(); viewpointIterator.hasNext();) {
			Viewpoint viewPoint = viewpointIterator.next();
			if(viewPoint.eClass().getName() == "Scenario_Model") {
				scenarioModel = (Scenario_Model) viewPoint;
			} 
		}
		
		for(Scenario scenario:scenarioModel.getScenario_overlay()) {
	    	for(Interaction interaction:scenario.getInteraction()) {
	    		if(interaction.getInformationflow().equals(informationflow) && scenario.getColour().equals(Colour.RED)) {
	    			return true;
	    		} 
	    	}
		}
		return false;
	}
	
	public Boolean InformationflowBlue(Software_System softwareSystem, Informationflow informationflow) {
		Scenario_Model scenarioModel = null;
		for(Iterator<Viewpoint> viewpointIterator = softwareSystem.getViewpoint().iterator(); viewpointIterator.hasNext();) {
			Viewpoint viewPoint = viewpointIterator.next();
			if(viewPoint.eClass().getName() == "Scenario_Model") {
				scenarioModel = (Scenario_Model) viewPoint;
			} 
		}
		
		for(Scenario scenario:scenarioModel.getScenario_overlay()) {
			for(Interaction interaction:scenario.getInteraction()) {
	    		if(interaction.getInformationflow().equals(informationflow) && scenario.getColour().equals(Colour.BLUE)) {
	    			return true;
	    		}
	    	}
		}
		return false;
	}
	
	public Boolean InformationflowGreen(Software_System softwareSystem, Informationflow informationflow) {
		Scenario_Model scenarioModel = null;
		for(Iterator<Viewpoint> viewpointIterator = softwareSystem.getViewpoint().iterator(); viewpointIterator.hasNext();) {
			Viewpoint viewPoint = viewpointIterator.next();
			if(viewPoint.eClass().getName() == "Scenario_Model") {
				scenarioModel = (Scenario_Model) viewPoint;
			} 
		}
		
		for(Scenario scenario:scenarioModel.getScenario_overlay()) {
	    	for(Interaction interaction:scenario.getInteraction()) {
	    		if(interaction.getInformationflow().equals(informationflow) && scenario.getColour().equals(Colour.GREEN)) {
	    			return true;
	    		} 
	    	}
		}
		return false;
	}
	
	public Boolean InformationflowPurple(Software_System softwareSystem, Informationflow informationflow) {
		Scenario_Model scenarioModel = null;
		for(Iterator<Viewpoint> viewpointIterator = softwareSystem.getViewpoint().iterator(); viewpointIterator.hasNext();) {
			Viewpoint viewPoint = viewpointIterator.next();
			if(viewPoint.eClass().getName() == "Scenario_Model") {
				scenarioModel = (Scenario_Model) viewPoint;
			} 
		}
		
		for(Scenario scenario:scenarioModel.getScenario_overlay()) {
	    	for(Interaction interaction:scenario.getInteraction()) {
	    		if(interaction.getInformationflow().equals(informationflow) && scenario.getColour().equals(Colour.PURPLE)) {
	    			return true;
	    		} 
	    	}
		}
		return false;
	}
	
	public Boolean InformationflowYellow(Software_System softwareSystem, Informationflow informationflow) {
		Scenario_Model scenarioModel = null;
		for(Iterator<Viewpoint> viewpointIterator = softwareSystem.getViewpoint().iterator(); viewpointIterator.hasNext();) {
			Viewpoint viewPoint = viewpointIterator.next();
			if(viewPoint.eClass().getName() == "Scenario_Model") {
				scenarioModel = (Scenario_Model) viewPoint;
			} 
		}
		
		for(Scenario scenario:scenarioModel.getScenario_overlay()) {
	    	for(Interaction interaction:scenario.getInteraction()) {
	    		if(interaction.getInformationflow().equals(informationflow) && scenario.getColour().equals(Colour.YELLOW)) {
	    			return true;
	    		} 
	    	}
		}
		return false;
	}

}
