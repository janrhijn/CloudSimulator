/**
 */
package uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Atomic_Module;
import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Capability;
import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Component;
import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Composite_Module;
import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Deployment_Model;
import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Feature;
import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Functional_Architecture_Model;
import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Informationflow;
import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Interaction;
import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Pricing_Function;
import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Scenario;
import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.SoftwareSystemArchitecturePackage;
import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Software_System;
import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Viewpoint;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.SoftwareSystemArchitecturePackage
 * @generated
 */
public class SoftwareSystemArchitectureSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SoftwareSystemArchitecturePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareSystemArchitectureSwitch() {
		if (modelPackage == null) {
			modelPackage = SoftwareSystemArchitecturePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case SoftwareSystemArchitecturePackage.SOFTWARE_SYSTEM: {
			Software_System software_System = (Software_System) theEObject;
			T result = caseSoftware_System(software_System);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SoftwareSystemArchitecturePackage.FUNCTIONAL_ARCHITECTURE_MODEL: {
			Functional_Architecture_Model functional_Architecture_Model = (Functional_Architecture_Model) theEObject;
			T result = caseFunctional_Architecture_Model(functional_Architecture_Model);
			if (result == null)
				result = caseViewpoint(functional_Architecture_Model);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SoftwareSystemArchitecturePackage.DEPLOYMENT_MODEL: {
			Deployment_Model deployment_Model = (Deployment_Model) theEObject;
			T result = caseDeployment_Model(deployment_Model);
			if (result == null)
				result = caseViewpoint(deployment_Model);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SoftwareSystemArchitecturePackage.VIEWPOINT: {
			Viewpoint viewpoint = (Viewpoint) theEObject;
			T result = caseViewpoint(viewpoint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SoftwareSystemArchitecturePackage.MODULE: {
			uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Module module = (uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Module) theEObject;
			T result = caseModule(module);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SoftwareSystemArchitecturePackage.COMPOSITE_MODULE: {
			Composite_Module composite_Module = (Composite_Module) theEObject;
			T result = caseComposite_Module(composite_Module);
			if (result == null)
				result = caseModule(composite_Module);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SoftwareSystemArchitecturePackage.ATOMIC_MODULE: {
			Atomic_Module atomic_Module = (Atomic_Module) theEObject;
			T result = caseAtomic_Module(atomic_Module);
			if (result == null)
				result = caseModule(atomic_Module);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SoftwareSystemArchitecturePackage.FEATURE: {
			Feature feature = (Feature) theEObject;
			T result = caseFeature(feature);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SoftwareSystemArchitecturePackage.INFORMATIONFLOW: {
			Informationflow informationflow = (Informationflow) theEObject;
			T result = caseInformationflow(informationflow);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SoftwareSystemArchitecturePackage.SCENARIO: {
			Scenario scenario = (Scenario) theEObject;
			T result = caseScenario(scenario);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SoftwareSystemArchitecturePackage.INTERACTION: {
			Interaction interaction = (Interaction) theEObject;
			T result = caseInteraction(interaction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SoftwareSystemArchitecturePackage.COMPONENT: {
			Component component = (Component) theEObject;
			T result = caseComponent(component);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SoftwareSystemArchitecturePackage.PRICING_FUNCTION: {
			Pricing_Function pricing_Function = (Pricing_Function) theEObject;
			T result = casePricing_Function(pricing_Function);
			if (result == null)
				result = caseCapability(pricing_Function);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SoftwareSystemArchitecturePackage.CAPABILITY: {
			Capability capability = (Capability) theEObject;
			T result = caseCapability(capability);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Software System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Software System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoftware_System(Software_System object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functional Architecture Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functional Architecture Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctional_Architecture_Model(Functional_Architecture_Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployment Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployment Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeployment_Model(Deployment_Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Viewpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Viewpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewpoint(Viewpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModule(uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Module object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComposite_Module(Composite_Module object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atomic Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atomic Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtomic_Module(Atomic_Module object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeature(Feature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Informationflow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Informationflow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInformationflow(Informationflow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scenario</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScenario(Scenario object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteraction(Interaction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pricing Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pricing Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePricing_Function(Pricing_Function object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapability(Capability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SoftwareSystemArchitectureSwitch
