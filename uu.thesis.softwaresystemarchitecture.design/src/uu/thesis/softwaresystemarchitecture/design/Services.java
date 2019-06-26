package uu.thesis.softwaresystemarchitecture.design;

import org.eclipse.emf.ecore.EObject;

import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.*;

/**
 * The services class used by VSM.
 */
public class Services {
//	Software_System softwareSystem;
    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
    public EObject myService(EObject self, String arg) {
       // TODO Auto-generated code
      return self;
    }
    
    public Component GetComponentFromFeature(Feature feature, Deployment_Model deploymentModel) {

    	for(Component component: deploymentModel.getContains()) {
    		System.out.println(component.getName());
    		if(component.getContains().contains(feature)) {
    			return component;
    		}
    	}
    	return null;
    }
    
//    public int DetermineColourScenario(Interaction informationFlow) {
//    	Scenario scenario = (Scenario) informationFlow.eContainer();
//    	Functional_Architecture_Model fam = (Functional_Architecture_Model) scenario.eContainer();
//    	int colour = fam.getScenario_overlay().indexOf(scenario);
//    	colour = colour % 5;
//    	
//    	return colour;
//    }
}
