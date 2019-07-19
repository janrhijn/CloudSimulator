/**
 */
package uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.SoftwareSystemArchitecturePackage
 * @generated
 */
public interface SoftwareSystemArchitectureFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SoftwareSystemArchitectureFactory eINSTANCE = uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.impl.SoftwareSystemArchitectureFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Software System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Software System</em>'.
	 * @generated
	 */
	Software_System createSoftware_System();

	/**
	 * Returns a new object of class '<em>Functional Architecture Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Functional Architecture Model</em>'.
	 * @generated
	 */
	Functional_Architecture_Model createFunctional_Architecture_Model();

	/**
	 * Returns a new object of class '<em>Deployment Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deployment Model</em>'.
	 * @generated
	 */
	Deployment_Model createDeployment_Model();

	/**
	 * Returns a new object of class '<em>Composite Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Module</em>'.
	 * @generated
	 */
	Composite_Module createComposite_Module();

	/**
	 * Returns a new object of class '<em>Atomic Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atomic Module</em>'.
	 * @generated
	 */
	Atomic_Module createAtomic_Module();

	/**
	 * Returns a new object of class '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature</em>'.
	 * @generated
	 */
	Feature createFeature();

	/**
	 * Returns a new object of class '<em>Informationflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Informationflow</em>'.
	 * @generated
	 */
	Informationflow createInformationflow();

	/**
	 * Returns a new object of class '<em>Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scenario</em>'.
	 * @generated
	 */
	Scenario createScenario();

	/**
	 * Returns a new object of class '<em>Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interaction</em>'.
	 * @generated
	 */
	Interaction createInteraction();

	/**
	 * Returns a new object of class '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component</em>'.
	 * @generated
	 */
	Component createComponent();

	/**
	 * Returns a new object of class '<em>Pricing Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pricing Function</em>'.
	 * @generated
	 */
	Pricing_Function createPricing_Function();

	/**
	 * Returns a new object of class '<em>Server Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Server Unit</em>'.
	 * @generated
	 */
	Server_Unit createServer_Unit();

	/**
	 * Returns a new object of class '<em>Data in</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data in</em>'.
	 * @generated
	 */
	Data_in createData_in();

	/**
	 * Returns a new object of class '<em>Data Out</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Out</em>'.
	 * @generated
	 */
	Data_Out createData_Out();

	/**
	 * Returns a new object of class '<em>Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Request</em>'.
	 * @generated
	 */
	Request createRequest();

	/**
	 * Returns a new object of class '<em>Storage Capacity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Storage Capacity</em>'.
	 * @generated
	 */
	Storage_Capacity createStorage_Capacity();

	/**
	 * Returns a new object of class '<em>Data Processed</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Processed</em>'.
	 * @generated
	 */
	Data_Processed createData_Processed();

	/**
	 * Returns a new object of class '<em>Server Duration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Server Duration</em>'.
	 * @generated
	 */
	Server_Duration createServer_Duration();

	/**
	 * Returns a new object of class '<em>Scenario Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scenario Model</em>'.
	 * @generated
	 */
	Scenario_Model createScenario_Model();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SoftwareSystemArchitecturePackage getSoftwareSystemArchitecturePackage();

} //SoftwareSystemArchitectureFactory
