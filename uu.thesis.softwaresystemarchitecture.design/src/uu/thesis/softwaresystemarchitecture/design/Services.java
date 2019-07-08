package uu.thesis.softwaresystemarchitecture.design;

import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.*;

/**
 * The services class used by VSM.
 */
public class Services {    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
    
	
	public Boolean InformationflowRed(Functional_Architecture_Model fam, Informationflow informationflow) {
		for(Scenario scenario:fam.getScenario_overlay()) {
	    	for(Interaction interaction:scenario.getInteraction()) {
	    		if(interaction.getInformationflow().equals(informationflow) && scenario.getColour().equals(Colour.RED)) {
	    			return true;
	    		} 
	    	}
		}
		return false;
	}
	
	public Boolean InformationflowBlue(Functional_Architecture_Model fam, Informationflow informationflow) {
		for(Scenario scenario:fam.getScenario_overlay()) {
			for(Interaction interaction:scenario.getInteraction()) {
	    		if(interaction.getInformationflow().equals(informationflow) && scenario.getColour().equals(Colour.BLUE)) {
	    			return true;
	    		}
	    	}
		}
		return false;
	}
	
	public Boolean InformationflowGreen(Functional_Architecture_Model fam, Informationflow informationflow) {
		for(Scenario scenario:fam.getScenario_overlay()) {
	    	for(Interaction interaction:scenario.getInteraction()) {
	    		if(interaction.getInformationflow().equals(informationflow) && scenario.getColour().equals(Colour.GREEN)) {
	    			return true;
	    		} 
	    	}
		}
		return false;
	}
	
	public Boolean InformationflowPurple(Functional_Architecture_Model fam, Informationflow informationflow) {
		for(Scenario scenario:fam.getScenario_overlay()) {
	    	for(Interaction interaction:scenario.getInteraction()) {
	    		if(interaction.getInformationflow().equals(informationflow) && scenario.getColour().equals(Colour.PURPLE)) {
	    			return true;
	    		} 
	    	}
		}
		return false;
	}
	
	public Boolean InformationflowYellow(Functional_Architecture_Model fam, Informationflow informationflow) {
		for(Scenario scenario:fam.getScenario_overlay()) {
	    	for(Interaction interaction:scenario.getInteraction()) {
	    		if(interaction.getInformationflow().equals(informationflow) && scenario.getColour().equals(Colour.YELLOW)) {
	    			return true;
	    		} 
	    	}
		}
		return false;
	}

}
