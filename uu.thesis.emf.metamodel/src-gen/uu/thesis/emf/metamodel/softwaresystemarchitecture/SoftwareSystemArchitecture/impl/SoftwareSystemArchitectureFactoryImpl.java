/**
 */
package uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Atomic_Module;
import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Billing_Type;
import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Colour;
import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Component;
import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Composite_Module;
import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Consumption_Metric;
import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Data_Type;
import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Deployment_Model;
import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Duration_Type;
import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Feature;
import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Feature_Type;
import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Functional_Architecture_Model;
import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Informationflow;
import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Interaction;
import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Pricing_Function;
import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Request_Type;
import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Scenario;
import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.SoftwareSystemArchitectureFactory;
import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.SoftwareSystemArchitecturePackage;
import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Software_System;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SoftwareSystemArchitectureFactoryImpl extends EFactoryImpl implements SoftwareSystemArchitectureFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SoftwareSystemArchitectureFactory init() {
		try {
			SoftwareSystemArchitectureFactory theSoftwareSystemArchitectureFactory = (SoftwareSystemArchitectureFactory) EPackage.Registry.INSTANCE
					.getEFactory(SoftwareSystemArchitecturePackage.eNS_URI);
			if (theSoftwareSystemArchitectureFactory != null) {
				return theSoftwareSystemArchitectureFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SoftwareSystemArchitectureFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareSystemArchitectureFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case SoftwareSystemArchitecturePackage.SOFTWARE_SYSTEM:
			return createSoftware_System();
		case SoftwareSystemArchitecturePackage.FUNCTIONAL_ARCHITECTURE_MODEL:
			return createFunctional_Architecture_Model();
		case SoftwareSystemArchitecturePackage.DEPLOYMENT_MODEL:
			return createDeployment_Model();
		case SoftwareSystemArchitecturePackage.COMPOSITE_MODULE:
			return createComposite_Module();
		case SoftwareSystemArchitecturePackage.ATOMIC_MODULE:
			return createAtomic_Module();
		case SoftwareSystemArchitecturePackage.FEATURE:
			return createFeature();
		case SoftwareSystemArchitecturePackage.INFORMATIONFLOW:
			return createInformationflow();
		case SoftwareSystemArchitecturePackage.SCENARIO:
			return createScenario();
		case SoftwareSystemArchitecturePackage.INTERACTION:
			return createInteraction();
		case SoftwareSystemArchitecturePackage.COMPONENT:
			return createComponent();
		case SoftwareSystemArchitecturePackage.PRICING_FUNCTION:
			return createPricing_Function();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case SoftwareSystemArchitecturePackage.FEATURE_TYPE:
			return createFeature_TypeFromString(eDataType, initialValue);
		case SoftwareSystemArchitecturePackage.COLOUR:
			return createColourFromString(eDataType, initialValue);
		case SoftwareSystemArchitecturePackage.DURATION_TYPE:
			return createDuration_TypeFromString(eDataType, initialValue);
		case SoftwareSystemArchitecturePackage.DATA_TYPE:
			return createData_TypeFromString(eDataType, initialValue);
		case SoftwareSystemArchitecturePackage.REQUEST_TYPE:
			return createRequest_TypeFromString(eDataType, initialValue);
		case SoftwareSystemArchitecturePackage.CONSUMPTION_METRIC:
			return createConsumption_MetricFromString(eDataType, initialValue);
		case SoftwareSystemArchitecturePackage.BILLING_TYPE:
			return createBilling_TypeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case SoftwareSystemArchitecturePackage.FEATURE_TYPE:
			return convertFeature_TypeToString(eDataType, instanceValue);
		case SoftwareSystemArchitecturePackage.COLOUR:
			return convertColourToString(eDataType, instanceValue);
		case SoftwareSystemArchitecturePackage.DURATION_TYPE:
			return convertDuration_TypeToString(eDataType, instanceValue);
		case SoftwareSystemArchitecturePackage.DATA_TYPE:
			return convertData_TypeToString(eDataType, instanceValue);
		case SoftwareSystemArchitecturePackage.REQUEST_TYPE:
			return convertRequest_TypeToString(eDataType, instanceValue);
		case SoftwareSystemArchitecturePackage.CONSUMPTION_METRIC:
			return convertConsumption_MetricToString(eDataType, instanceValue);
		case SoftwareSystemArchitecturePackage.BILLING_TYPE:
			return convertBilling_TypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Software_System createSoftware_System() {
		Software_SystemImpl software_System = new Software_SystemImpl();
		return software_System;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Functional_Architecture_Model createFunctional_Architecture_Model() {
		Functional_Architecture_ModelImpl functional_Architecture_Model = new Functional_Architecture_ModelImpl();
		return functional_Architecture_Model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Deployment_Model createDeployment_Model() {
		Deployment_ModelImpl deployment_Model = new Deployment_ModelImpl();
		return deployment_Model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Composite_Module createComposite_Module() {
		Composite_ModuleImpl composite_Module = new Composite_ModuleImpl();
		return composite_Module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Atomic_Module createAtomic_Module() {
		Atomic_ModuleImpl atomic_Module = new Atomic_ModuleImpl();
		return atomic_Module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature createFeature() {
		FeatureImpl feature = new FeatureImpl();
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Informationflow createInformationflow() {
		InformationflowImpl informationflow = new InformationflowImpl();
		return informationflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Scenario createScenario() {
		ScenarioImpl scenario = new ScenarioImpl();
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Interaction createInteraction() {
		InteractionImpl interaction = new InteractionImpl();
		return interaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pricing_Function createPricing_Function() {
		Pricing_FunctionImpl pricing_Function = new Pricing_FunctionImpl();
		return pricing_Function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature_Type createFeature_TypeFromString(EDataType eDataType, String initialValue) {
		Feature_Type result = Feature_Type.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFeature_TypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Colour createColourFromString(EDataType eDataType, String initialValue) {
		Colour result = Colour.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColourToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration_Type createDuration_TypeFromString(EDataType eDataType, String initialValue) {
		Duration_Type result = Duration_Type.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDuration_TypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data_Type createData_TypeFromString(EDataType eDataType, String initialValue) {
		Data_Type result = Data_Type.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertData_TypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Request_Type createRequest_TypeFromString(EDataType eDataType, String initialValue) {
		Request_Type result = Request_Type.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRequest_TypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Consumption_Metric createConsumption_MetricFromString(EDataType eDataType, String initialValue) {
		Consumption_Metric result = Consumption_Metric.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConsumption_MetricToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Billing_Type createBilling_TypeFromString(EDataType eDataType, String initialValue) {
		Billing_Type result = Billing_Type.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBilling_TypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SoftwareSystemArchitecturePackage getSoftwareSystemArchitecturePackage() {
		return (SoftwareSystemArchitecturePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SoftwareSystemArchitecturePackage getPackage() {
		return SoftwareSystemArchitecturePackage.eINSTANCE;
	}

} //SoftwareSystemArchitectureFactoryImpl
