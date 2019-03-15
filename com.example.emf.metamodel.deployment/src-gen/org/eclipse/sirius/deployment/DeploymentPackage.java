/**
 */
package org.eclipse.sirius.deployment;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.sirius.deployment.DeploymentFactory
 * @model kind="package"
 * @generated
 */
public interface DeploymentPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "deployment";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/sirius/deployment";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "deployment";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DeploymentPackage eINSTANCE = org.eclipse.sirius.deployment.impl.DeploymentPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.deployment.impl.DeploymentImpl <em>Deployment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.deployment.impl.DeploymentImpl
	 * @see org.eclipse.sirius.deployment.impl.DeploymentPackageImpl#getDeployment()
	 * @generated
	 */
	int DEPLOYMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Contain</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__CONTAIN = 1;

	/**
	 * The feature id for the '<em><b>Vpc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__VPC = 2;

	/**
	 * The feature id for the '<em><b>Scenarios</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__SCENARIOS = 3;

	/**
	 * The number of structural features of the '<em>Deployment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Deployment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.deployment.impl.InstanceImpl <em>Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.deployment.impl.InstanceImpl
	 * @see org.eclipse.sirius.deployment.impl.DeploymentPackageImpl#getInstance()
	 * @generated
	 */
	int INSTANCE = 1;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__CONTAINS = 0;

	/**
	 * The feature id for the '<em><b>Pricingscheme</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__PRICINGSCHEME = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.deployment.impl.PricingFunctionImpl <em>Pricing Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.deployment.impl.PricingFunctionImpl
	 * @see org.eclipse.sirius.deployment.impl.DeploymentPackageImpl#getPricingFunction()
	 * @generated
	 */
	int PRICING_FUNCTION = 2;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_FUNCTION__METRIC = 0;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_FUNCTION__PRICE = 1;

	/**
	 * The number of structural features of the '<em>Pricing Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_FUNCTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Pricing Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_FUNCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.deployment.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.deployment.impl.FeatureImpl
	 * @see org.eclipse.sirius.deployment.impl.DeploymentPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.deployment.impl.ComputeImpl <em>Compute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.deployment.impl.ComputeImpl
	 * @see org.eclipse.sirius.deployment.impl.DeploymentPackageImpl#getCompute()
	 * @generated
	 */
	int COMPUTE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE__NAME = FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Servicerate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE__SERVICERATE = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Compute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Compute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE_OPERATION_COUNT = FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.deployment.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.deployment.impl.ConnectorImpl
	 * @see org.eclipse.sirius.deployment.impl.DeploymentPackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__NAME = FEATURE__NAME;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_OPERATION_COUNT = FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.deployment.impl.StorageImpl <em>Storage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.deployment.impl.StorageImpl
	 * @see org.eclipse.sirius.deployment.impl.DeploymentPackageImpl#getStorage()
	 * @generated
	 */
	int STORAGE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__NAME = FEATURE__NAME;

	/**
	 * The number of structural features of the '<em>Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_OPERATION_COUNT = FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.deployment.impl.VPCImpl <em>VPC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.deployment.impl.VPCImpl
	 * @see org.eclipse.sirius.deployment.impl.DeploymentPackageImpl#getVPC()
	 * @generated
	 */
	int VPC = 7;

	/**
	 * The feature id for the '<em><b>Deployed</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC__DEPLOYED = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC__NAME = 1;

	/**
	 * The number of structural features of the '<em>VPC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>VPC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.deployment.impl.ScenarioImpl <em>Scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.deployment.impl.ScenarioImpl
	 * @see org.eclipse.sirius.deployment.impl.DeploymentPackageImpl#getScenario()
	 * @generated
	 */
	int SCENARIO = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__NAME = 0;

	/**
	 * The feature id for the '<em><b>Arrivalrate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__ARRIVALRATE = 1;

	/**
	 * The feature id for the '<em><b>Dataflow</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__DATAFLOW = 2;

	/**
	 * The number of structural features of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.deployment.impl.DataFlowImpl <em>Data Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.deployment.impl.DataFlowImpl
	 * @see org.eclipse.sirius.deployment.impl.DeploymentPackageImpl#getDataFlow()
	 * @generated
	 */
	int DATA_FLOW = 9;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__DATA = 0;

	/**
	 * The feature id for the '<em><b>Sender</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__SENDER = 1;

	/**
	 * The feature id for the '<em><b>Receiver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__RECEIVER = 2;

	/**
	 * The number of structural features of the '<em>Data Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Data Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.deployment.Deployment <em>Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployment</em>'.
	 * @see org.eclipse.sirius.deployment.Deployment
	 * @generated
	 */
	EClass getDeployment();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.deployment.Deployment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.sirius.deployment.Deployment#getName()
	 * @see #getDeployment()
	 * @generated
	 */
	EAttribute getDeployment_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.deployment.Deployment#getContain <em>Contain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contain</em>'.
	 * @see org.eclipse.sirius.deployment.Deployment#getContain()
	 * @see #getDeployment()
	 * @generated
	 */
	EReference getDeployment_Contain();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.sirius.deployment.Deployment#getVpc <em>Vpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vpc</em>'.
	 * @see org.eclipse.sirius.deployment.Deployment#getVpc()
	 * @see #getDeployment()
	 * @generated
	 */
	EReference getDeployment_Vpc();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.deployment.Deployment#getScenarios <em>Scenarios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scenarios</em>'.
	 * @see org.eclipse.sirius.deployment.Deployment#getScenarios()
	 * @see #getDeployment()
	 * @generated
	 */
	EReference getDeployment_Scenarios();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.deployment.Instance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance</em>'.
	 * @see org.eclipse.sirius.deployment.Instance
	 * @generated
	 */
	EClass getInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.deployment.Instance#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains</em>'.
	 * @see org.eclipse.sirius.deployment.Instance#getContains()
	 * @see #getInstance()
	 * @generated
	 */
	EReference getInstance_Contains();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.deployment.Instance#getPricingscheme <em>Pricingscheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pricingscheme</em>'.
	 * @see org.eclipse.sirius.deployment.Instance#getPricingscheme()
	 * @see #getInstance()
	 * @generated
	 */
	EReference getInstance_Pricingscheme();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.deployment.Instance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.sirius.deployment.Instance#getName()
	 * @see #getInstance()
	 * @generated
	 */
	EAttribute getInstance_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.deployment.PricingFunction <em>Pricing Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pricing Function</em>'.
	 * @see org.eclipse.sirius.deployment.PricingFunction
	 * @generated
	 */
	EClass getPricingFunction();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.deployment.PricingFunction#getMetric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metric</em>'.
	 * @see org.eclipse.sirius.deployment.PricingFunction#getMetric()
	 * @see #getPricingFunction()
	 * @generated
	 */
	EAttribute getPricingFunction_Metric();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.deployment.PricingFunction#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see org.eclipse.sirius.deployment.PricingFunction#getPrice()
	 * @see #getPricingFunction()
	 * @generated
	 */
	EAttribute getPricingFunction_Price();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.deployment.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see org.eclipse.sirius.deployment.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.deployment.Feature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.sirius.deployment.Feature#getName()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.deployment.Compute <em>Compute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compute</em>'.
	 * @see org.eclipse.sirius.deployment.Compute
	 * @generated
	 */
	EClass getCompute();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.deployment.Compute#getServicerate <em>Servicerate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Servicerate</em>'.
	 * @see org.eclipse.sirius.deployment.Compute#getServicerate()
	 * @see #getCompute()
	 * @generated
	 */
	EAttribute getCompute_Servicerate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.deployment.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see org.eclipse.sirius.deployment.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.deployment.Storage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storage</em>'.
	 * @see org.eclipse.sirius.deployment.Storage
	 * @generated
	 */
	EClass getStorage();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.deployment.VPC <em>VPC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VPC</em>'.
	 * @see org.eclipse.sirius.deployment.VPC
	 * @generated
	 */
	EClass getVPC();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.deployment.VPC#getDeployed <em>Deployed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deployed</em>'.
	 * @see org.eclipse.sirius.deployment.VPC#getDeployed()
	 * @see #getVPC()
	 * @generated
	 */
	EReference getVPC_Deployed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.deployment.VPC#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.sirius.deployment.VPC#getName()
	 * @see #getVPC()
	 * @generated
	 */
	EAttribute getVPC_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.deployment.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario</em>'.
	 * @see org.eclipse.sirius.deployment.Scenario
	 * @generated
	 */
	EClass getScenario();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.deployment.Scenario#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.sirius.deployment.Scenario#getName()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.deployment.Scenario#getArrivalrate <em>Arrivalrate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arrivalrate</em>'.
	 * @see org.eclipse.sirius.deployment.Scenario#getArrivalrate()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_Arrivalrate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.deployment.Scenario#getDataflow <em>Dataflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dataflow</em>'.
	 * @see org.eclipse.sirius.deployment.Scenario#getDataflow()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Dataflow();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.deployment.DataFlow <em>Data Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Flow</em>'.
	 * @see org.eclipse.sirius.deployment.DataFlow
	 * @generated
	 */
	EClass getDataFlow();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.deployment.DataFlow#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see org.eclipse.sirius.deployment.DataFlow#getData()
	 * @see #getDataFlow()
	 * @generated
	 */
	EAttribute getDataFlow_Data();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.deployment.DataFlow#getSender <em>Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sender</em>'.
	 * @see org.eclipse.sirius.deployment.DataFlow#getSender()
	 * @see #getDataFlow()
	 * @generated
	 */
	EReference getDataFlow_Sender();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.deployment.DataFlow#getReceiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receiver</em>'.
	 * @see org.eclipse.sirius.deployment.DataFlow#getReceiver()
	 * @see #getDataFlow()
	 * @generated
	 */
	EReference getDataFlow_Receiver();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DeploymentFactory getDeploymentFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.deployment.impl.DeploymentImpl <em>Deployment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.deployment.impl.DeploymentImpl
		 * @see org.eclipse.sirius.deployment.impl.DeploymentPackageImpl#getDeployment()
		 * @generated
		 */
		EClass DEPLOYMENT = eINSTANCE.getDeployment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT__NAME = eINSTANCE.getDeployment_Name();

		/**
		 * The meta object literal for the '<em><b>Contain</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT__CONTAIN = eINSTANCE.getDeployment_Contain();

		/**
		 * The meta object literal for the '<em><b>Vpc</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT__VPC = eINSTANCE.getDeployment_Vpc();

		/**
		 * The meta object literal for the '<em><b>Scenarios</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT__SCENARIOS = eINSTANCE.getDeployment_Scenarios();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.deployment.impl.InstanceImpl <em>Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.deployment.impl.InstanceImpl
		 * @see org.eclipse.sirius.deployment.impl.DeploymentPackageImpl#getInstance()
		 * @generated
		 */
		EClass INSTANCE = eINSTANCE.getInstance();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE__CONTAINS = eINSTANCE.getInstance_Contains();

		/**
		 * The meta object literal for the '<em><b>Pricingscheme</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE__PRICINGSCHEME = eINSTANCE.getInstance_Pricingscheme();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE__NAME = eINSTANCE.getInstance_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.deployment.impl.PricingFunctionImpl <em>Pricing Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.deployment.impl.PricingFunctionImpl
		 * @see org.eclipse.sirius.deployment.impl.DeploymentPackageImpl#getPricingFunction()
		 * @generated
		 */
		EClass PRICING_FUNCTION = eINSTANCE.getPricingFunction();

		/**
		 * The meta object literal for the '<em><b>Metric</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRICING_FUNCTION__METRIC = eINSTANCE.getPricingFunction_Metric();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRICING_FUNCTION__PRICE = eINSTANCE.getPricingFunction_Price();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.deployment.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.deployment.impl.FeatureImpl
		 * @see org.eclipse.sirius.deployment.impl.DeploymentPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__NAME = eINSTANCE.getFeature_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.deployment.impl.ComputeImpl <em>Compute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.deployment.impl.ComputeImpl
		 * @see org.eclipse.sirius.deployment.impl.DeploymentPackageImpl#getCompute()
		 * @generated
		 */
		EClass COMPUTE = eINSTANCE.getCompute();

		/**
		 * The meta object literal for the '<em><b>Servicerate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTE__SERVICERATE = eINSTANCE.getCompute_Servicerate();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.deployment.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.deployment.impl.ConnectorImpl
		 * @see org.eclipse.sirius.deployment.impl.DeploymentPackageImpl#getConnector()
		 * @generated
		 */
		EClass CONNECTOR = eINSTANCE.getConnector();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.deployment.impl.StorageImpl <em>Storage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.deployment.impl.StorageImpl
		 * @see org.eclipse.sirius.deployment.impl.DeploymentPackageImpl#getStorage()
		 * @generated
		 */
		EClass STORAGE = eINSTANCE.getStorage();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.deployment.impl.VPCImpl <em>VPC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.deployment.impl.VPCImpl
		 * @see org.eclipse.sirius.deployment.impl.DeploymentPackageImpl#getVPC()
		 * @generated
		 */
		EClass VPC = eINSTANCE.getVPC();

		/**
		 * The meta object literal for the '<em><b>Deployed</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VPC__DEPLOYED = eINSTANCE.getVPC_Deployed();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC__NAME = eINSTANCE.getVPC_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.deployment.impl.ScenarioImpl <em>Scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.deployment.impl.ScenarioImpl
		 * @see org.eclipse.sirius.deployment.impl.DeploymentPackageImpl#getScenario()
		 * @generated
		 */
		EClass SCENARIO = eINSTANCE.getScenario();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__NAME = eINSTANCE.getScenario_Name();

		/**
		 * The meta object literal for the '<em><b>Arrivalrate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__ARRIVALRATE = eINSTANCE.getScenario_Arrivalrate();

		/**
		 * The meta object literal for the '<em><b>Dataflow</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__DATAFLOW = eINSTANCE.getScenario_Dataflow();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.deployment.impl.DataFlowImpl <em>Data Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.deployment.impl.DataFlowImpl
		 * @see org.eclipse.sirius.deployment.impl.DeploymentPackageImpl#getDataFlow()
		 * @generated
		 */
		EClass DATA_FLOW = eINSTANCE.getDataFlow();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_FLOW__DATA = eINSTANCE.getDataFlow_Data();

		/**
		 * The meta object literal for the '<em><b>Sender</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FLOW__SENDER = eINSTANCE.getDataFlow_Sender();

		/**
		 * The meta object literal for the '<em><b>Receiver</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FLOW__RECEIVER = eINSTANCE.getDataFlow_Receiver();

	}

} //DeploymentPackage
