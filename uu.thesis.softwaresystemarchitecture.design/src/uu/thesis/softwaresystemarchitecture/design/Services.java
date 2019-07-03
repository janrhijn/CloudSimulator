package uu.thesis.softwaresystemarchitecture.design;

//import java.util.ArrayList;
//import java.util.List;

import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.*;

/**
 * The services class used by VSM.
 */
public class Services {    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
    
	//TODO dit kan wellicht mooier
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

//	public void NotReferencedFeatures(Software_System softwareSystem) {
//		Deployment_Model deploymentModel = null;
//		Functional_Architecture_Model fam = null;
//		
//		List<Feature> allFeatures = new ArrayList<Feature>();
//		List<Feature> referencedFeatures = new ArrayList<Feature>();
//		
//		for(Viewpoint viewPoint:softwareSystem.getViewpoint()) {
//			if(viewPoint.eClass().getName() == "Deployment_Model") {
//				deploymentModel = (Deployment_Model) viewPoint;
//			} else if (viewPoint.eClass().getName() == "Functional_Architecture_Model") {
//				fam = (Functional_Architecture_Model) viewPoint;
//			}
//		}
//		
//		for(Component component:deploymentModel.getContains()) {
//			for(Feature feature:component.getContains()) {
//				referencedFeatures.add(feature);
//			}
//		}
//		
//		for(Scenario scenario:fam.getScenario_overlay()) {
//			for(Interaction interaction :scenario.getInteraction()) {
//				allFeatures.add(interaction.getInformationflow().getReceiver());
//				allFeatures.add((Feature) interaction.getInformationflow().eContainer());
//			}
//		}
//		
//	}
}
