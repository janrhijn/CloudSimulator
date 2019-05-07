/**
 */
package org.eclipse.sirius.deployment;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
	 * The feature id for the '<em><b>Operational Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__OPERATIONAL_COST = 4;

	/**
	 * The number of structural features of the '<em>Deployment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Deployment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.deployment.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.deployment.impl.ComponentImpl
	 * @see org.eclipse.sirius.deployment.impl.DeploymentPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CONTAINS = 0;

	/**
	 * The feature id for the '<em><b>Pricingscheme</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PRICINGSCHEME = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = 2;

	/**
	 * The feature id for the '<em><b>Service Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__SERVICE_LEVEL = 3;

	/**
	 * The feature id for the '<em><b>Server Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__SERVER_DURATION = 4;

	/**
	 * The feature id for the '<em><b>Server Unit Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__SERVER_UNIT_TIME = 5;

	/**
	 * The feature id for the '<em><b>Data In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__DATA_IN = 6;

	/**
	 * The feature id for the '<em><b>Data Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__DATA_OUT = 7;

	/**
	 * The feature id for the '<em><b>Storage Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__STORAGE_CAPACITY = 8;

	/**
	 * The feature id for the '<em><b>Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__REQUEST = 9;

	/**
	 * The feature id for the '<em><b>Operational Component Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__OPERATIONAL_COMPONENT_COST = 10;

	/**
	 * The feature id for the '<em><b>Deployed Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__DEPLOYED_UNITS = 11;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_FUNCTION__PRICE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_FUNCTION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_FUNCTION__METRIC = 2;

	/**
	 * The feature id for the '<em><b>Billing Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_FUNCTION__BILLING_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_FUNCTION__DATA_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Request Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_FUNCTION__REQUEST_TYPE = 5;

	/**
	 * The number of structural features of the '<em>Pricing Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_FUNCTION_FEATURE_COUNT = 6;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC__NAME = 0;

	/**
	 * The feature id for the '<em><b>Deployed</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC__DEPLOYED = 1;

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
	 * The feature id for the '<em><b>Informationflow</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__INFORMATIONFLOW = 2;

	/**
	 * The feature id for the '<em><b>Mean Sojourn Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__MEAN_SOJOURN_TIME = 3;

	/**
	 * The feature id for the '<em><b>Max Sojourn Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__MAX_SOJOURN_TIME = 4;

	/**
	 * The feature id for the '<em><b>Colour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__COLOUR = 5;

	/**
	 * The number of structural features of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.deployment.impl.InformationFlowImpl <em>Information Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.deployment.impl.InformationFlowImpl
	 * @see org.eclipse.sirius.deployment.impl.DeploymentPackageImpl#getInformationFlow()
	 * @generated
	 */
	int INFORMATION_FLOW = 9;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW__DATA = 0;

	/**
	 * The feature id for the '<em><b>Sender</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW__SENDER = 1;

	/**
	 * The feature id for the '<em><b>Receiver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW__RECEIVER = 2;

	/**
	 * The feature id for the '<em><b>Data Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW__DATA_REVERSE = 3;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW__PROBABILITY = 4;

	/**
	 * The feature id for the '<em><b>Bi Directional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW__BI_DIRECTIONAL = 5;

	/**
	 * The number of structural features of the '<em>Information Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Information Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.deployment.impl.ConsumptionMetrics2Impl <em>Consumption Metrics2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.deployment.impl.ConsumptionMetrics2Impl
	 * @see org.eclipse.sirius.deployment.impl.DeploymentPackageImpl#getConsumptionMetrics2()
	 * @generated
	 */
	int CONSUMPTION_METRICS2 = 10;

	/**
	 * The feature id for the '<em><b>Server Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMPTION_METRICS2__SERVER_TIME = 0;

	/**
	 * The feature id for the '<em><b>Server Unit Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMPTION_METRICS2__SERVER_UNIT_TIME = 1;

	/**
	 * The feature id for the '<em><b>Data In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMPTION_METRICS2__DATA_IN = 2;

	/**
	 * The feature id for the '<em><b>Data Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMPTION_METRICS2__DATA_OUT = 3;

	/**
	 * The feature id for the '<em><b>Storage Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMPTION_METRICS2__STORAGE_CAPACITY = 4;

	/**
	 * The feature id for the '<em><b>Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMPTION_METRICS2__REQUEST = 5;

	/**
	 * The number of structural features of the '<em>Consumption Metrics2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMPTION_METRICS2_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Consumption Metrics2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMPTION_METRICS2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.deployment.ServiceLevel <em>Service Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.deployment.ServiceLevel
	 * @see org.eclipse.sirius.deployment.impl.DeploymentPackageImpl#getServiceLevel()
	 * @generated
	 */
	int SERVICE_LEVEL = 11;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.deployment.ConsumptionMetric <em>Consumption Metric</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.deployment.ConsumptionMetric
	 * @see org.eclipse.sirius.deployment.impl.DeploymentPackageImpl#getConsumptionMetric()
	 * @generated
	 */
	int CONSUMPTION_METRIC = 12;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.deployment.DataType <em>Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.deployment.DataType
	 * @see org.eclipse.sirius.deployment.impl.DeploymentPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 13;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.deployment.BillingType <em>Billing Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.deployment.BillingType
	 * @see org.eclipse.sirius.deployment.impl.DeploymentPackageImpl#getBillingType()
	 * @generated
	 */
	int BILLING_TYPE = 14;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.deployment.RequestType <em>Request Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.deployment.RequestType
	 * @see org.eclipse.sirius.deployment.impl.DeploymentPackageImpl#getRequestType()
	 * @generated
	 */
	int REQUEST_TYPE = 15;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.deployment.WeekDay <em>Week Day</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.deployment.WeekDay
	 * @see org.eclipse.sirius.deployment.impl.DeploymentPackageImpl#getWeekDay()
	 * @generated
	 */
	int WEEK_DAY = 16;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.deployment.Colour <em>Colour</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.deployment.Colour
	 * @see org.eclipse.sirius.deployment.impl.DeploymentPackageImpl#getColour()
	 * @generated
	 */
	int COLOUR = 17;

	/**
	 * The meta object id for the '<em>New Data Type7</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.eclipse.sirius.deployment.impl.DeploymentPackageImpl#getNewDataType7()
	 * @generated
	 */
	int NEW_DATA_TYPE7 = 18;

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
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.deployment.Deployment#getOperationalCost <em>Operational Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operational Cost</em>'.
	 * @see org.eclipse.sirius.deployment.Deployment#getOperationalCost()
	 * @see #getDeployment()
	 * @generated
	 */
	EAttribute getDeployment_OperationalCost();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.deployment.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see org.eclipse.sirius.deployment.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.deployment.Component#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains</em>'.
	 * @see org.eclipse.sirius.deployment.Component#getContains()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Contains();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.deployment.Component#getPricingscheme <em>Pricingscheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pricingscheme</em>'.
	 * @see org.eclipse.sirius.deployment.Component#getPricingscheme()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Pricingscheme();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.deployment.Component#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.sirius.deployment.Component#getName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.deployment.Component#getServiceLevel <em>Service Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Level</em>'.
	 * @see org.eclipse.sirius.deployment.Component#getServiceLevel()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_ServiceLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.deployment.Component#getServerDuration <em>Server Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server Duration</em>'.
	 * @see org.eclipse.sirius.deployment.Component#getServerDuration()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_ServerDuration();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.deployment.Component#getServerUnitTime <em>Server Unit Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server Unit Time</em>'.
	 * @see org.eclipse.sirius.deployment.Component#getServerUnitTime()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_ServerUnitTime();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.deployment.Component#getDataIn <em>Data In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data In</em>'.
	 * @see org.eclipse.sirius.deployment.Component#getDataIn()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_DataIn();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.deployment.Component#getDataOut <em>Data Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Out</em>'.
	 * @see org.eclipse.sirius.deployment.Component#getDataOut()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_DataOut();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.deployment.Component#getStorageCapacity <em>Storage Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Storage Capacity</em>'.
	 * @see org.eclipse.sirius.deployment.Component#getStorageCapacity()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_StorageCapacity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.deployment.Component#getRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Request</em>'.
	 * @see org.eclipse.sirius.deployment.Component#getRequest()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Request();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.deployment.Component#getOperationalComponentCost <em>Operational Component Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operational Component Cost</em>'.
	 * @see org.eclipse.sirius.deployment.Component#getOperationalComponentCost()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_OperationalComponentCost();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.deployment.Component#getDeployedUnits <em>Deployed Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deployed Units</em>'.
	 * @see org.eclipse.sirius.deployment.Component#getDeployedUnits()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_DeployedUnits();

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
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.deployment.PricingFunction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.sirius.deployment.PricingFunction#getName()
	 * @see #getPricingFunction()
	 * @generated
	 */
	EAttribute getPricingFunction_Name();

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
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.deployment.PricingFunction#getBillingType <em>Billing Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Billing Type</em>'.
	 * @see org.eclipse.sirius.deployment.PricingFunction#getBillingType()
	 * @see #getPricingFunction()
	 * @generated
	 */
	EAttribute getPricingFunction_BillingType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.deployment.PricingFunction#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see org.eclipse.sirius.deployment.PricingFunction#getDataType()
	 * @see #getPricingFunction()
	 * @generated
	 */
	EAttribute getPricingFunction_DataType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.deployment.PricingFunction#getRequestType <em>Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Request Type</em>'.
	 * @see org.eclipse.sirius.deployment.PricingFunction#getRequestType()
	 * @see #getPricingFunction()
	 * @generated
	 */
	EAttribute getPricingFunction_RequestType();

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
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.deployment.Scenario#getInformationflow <em>Informationflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Informationflow</em>'.
	 * @see org.eclipse.sirius.deployment.Scenario#getInformationflow()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Informationflow();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.deployment.Scenario#getMeanSojournTime <em>Mean Sojourn Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mean Sojourn Time</em>'.
	 * @see org.eclipse.sirius.deployment.Scenario#getMeanSojournTime()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_MeanSojournTime();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.deployment.Scenario#getMaxSojournTime <em>Max Sojourn Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Sojourn Time</em>'.
	 * @see org.eclipse.sirius.deployment.Scenario#getMaxSojournTime()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_MaxSojournTime();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.deployment.Scenario#getColour <em>Colour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Colour</em>'.
	 * @see org.eclipse.sirius.deployment.Scenario#getColour()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_Colour();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.deployment.InformationFlow <em>Information Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Information Flow</em>'.
	 * @see org.eclipse.sirius.deployment.InformationFlow
	 * @generated
	 */
	EClass getInformationFlow();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.deployment.InformationFlow#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see org.eclipse.sirius.deployment.InformationFlow#getData()
	 * @see #getInformationFlow()
	 * @generated
	 */
	EAttribute getInformationFlow_Data();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.deployment.InformationFlow#getSender <em>Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sender</em>'.
	 * @see org.eclipse.sirius.deployment.InformationFlow#getSender()
	 * @see #getInformationFlow()
	 * @generated
	 */
	EReference getInformationFlow_Sender();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.deployment.InformationFlow#getReceiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receiver</em>'.
	 * @see org.eclipse.sirius.deployment.InformationFlow#getReceiver()
	 * @see #getInformationFlow()
	 * @generated
	 */
	EReference getInformationFlow_Receiver();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.deployment.InformationFlow#getDataReverse <em>Data Reverse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Reverse</em>'.
	 * @see org.eclipse.sirius.deployment.InformationFlow#getDataReverse()
	 * @see #getInformationFlow()
	 * @generated
	 */
	EAttribute getInformationFlow_DataReverse();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.deployment.InformationFlow#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see org.eclipse.sirius.deployment.InformationFlow#getProbability()
	 * @see #getInformationFlow()
	 * @generated
	 */
	EAttribute getInformationFlow_Probability();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.deployment.InformationFlow#isBiDirectional <em>Bi Directional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bi Directional</em>'.
	 * @see org.eclipse.sirius.deployment.InformationFlow#isBiDirectional()
	 * @see #getInformationFlow()
	 * @generated
	 */
	EAttribute getInformationFlow_BiDirectional();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.deployment.ConsumptionMetrics2 <em>Consumption Metrics2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Consumption Metrics2</em>'.
	 * @see org.eclipse.sirius.deployment.ConsumptionMetrics2
	 * @generated
	 */
	EClass getConsumptionMetrics2();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.deployment.ConsumptionMetrics2#getServerTime <em>Server Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server Time</em>'.
	 * @see org.eclipse.sirius.deployment.ConsumptionMetrics2#getServerTime()
	 * @see #getConsumptionMetrics2()
	 * @generated
	 */
	EAttribute getConsumptionMetrics2_ServerTime();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.deployment.ConsumptionMetrics2#getServerUnitTime <em>Server Unit Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server Unit Time</em>'.
	 * @see org.eclipse.sirius.deployment.ConsumptionMetrics2#getServerUnitTime()
	 * @see #getConsumptionMetrics2()
	 * @generated
	 */
	EAttribute getConsumptionMetrics2_ServerUnitTime();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.deployment.ConsumptionMetrics2#getDataIn <em>Data In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data In</em>'.
	 * @see org.eclipse.sirius.deployment.ConsumptionMetrics2#getDataIn()
	 * @see #getConsumptionMetrics2()
	 * @generated
	 */
	EAttribute getConsumptionMetrics2_DataIn();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.deployment.ConsumptionMetrics2#getDataOut <em>Data Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Out</em>'.
	 * @see org.eclipse.sirius.deployment.ConsumptionMetrics2#getDataOut()
	 * @see #getConsumptionMetrics2()
	 * @generated
	 */
	EAttribute getConsumptionMetrics2_DataOut();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.deployment.ConsumptionMetrics2#getStorageCapacity <em>Storage Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Storage Capacity</em>'.
	 * @see org.eclipse.sirius.deployment.ConsumptionMetrics2#getStorageCapacity()
	 * @see #getConsumptionMetrics2()
	 * @generated
	 */
	EAttribute getConsumptionMetrics2_StorageCapacity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.deployment.ConsumptionMetrics2#getRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Request</em>'.
	 * @see org.eclipse.sirius.deployment.ConsumptionMetrics2#getRequest()
	 * @see #getConsumptionMetrics2()
	 * @generated
	 */
	EAttribute getConsumptionMetrics2_Request();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.sirius.deployment.ServiceLevel <em>Service Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Service Level</em>'.
	 * @see org.eclipse.sirius.deployment.ServiceLevel
	 * @generated
	 */
	EEnum getServiceLevel();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.sirius.deployment.ConsumptionMetric <em>Consumption Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Consumption Metric</em>'.
	 * @see org.eclipse.sirius.deployment.ConsumptionMetric
	 * @generated
	 */
	EEnum getConsumptionMetric();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.sirius.deployment.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Type</em>'.
	 * @see org.eclipse.sirius.deployment.DataType
	 * @generated
	 */
	EEnum getDataType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.sirius.deployment.BillingType <em>Billing Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Billing Type</em>'.
	 * @see org.eclipse.sirius.deployment.BillingType
	 * @generated
	 */
	EEnum getBillingType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.sirius.deployment.RequestType <em>Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Request Type</em>'.
	 * @see org.eclipse.sirius.deployment.RequestType
	 * @generated
	 */
	EEnum getRequestType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.sirius.deployment.WeekDay <em>Week Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Week Day</em>'.
	 * @see org.eclipse.sirius.deployment.WeekDay
	 * @generated
	 */
	EEnum getWeekDay();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.sirius.deployment.Colour <em>Colour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Colour</em>'.
	 * @see org.eclipse.sirius.deployment.Colour
	 * @generated
	 */
	EEnum getColour();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>New Data Type7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>New Data Type7</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getNewDataType7();

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
		 * The meta object literal for the '<em><b>Operational Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT__OPERATIONAL_COST = eINSTANCE.getDeployment_OperationalCost();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.deployment.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.deployment.impl.ComponentImpl
		 * @see org.eclipse.sirius.deployment.impl.DeploymentPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__CONTAINS = eINSTANCE.getComponent_Contains();

		/**
		 * The meta object literal for the '<em><b>Pricingscheme</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__PRICINGSCHEME = eINSTANCE.getComponent_Pricingscheme();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

		/**
		 * The meta object literal for the '<em><b>Service Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__SERVICE_LEVEL = eINSTANCE.getComponent_ServiceLevel();

		/**
		 * The meta object literal for the '<em><b>Server Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__SERVER_DURATION = eINSTANCE.getComponent_ServerDuration();

		/**
		 * The meta object literal for the '<em><b>Server Unit Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__SERVER_UNIT_TIME = eINSTANCE.getComponent_ServerUnitTime();

		/**
		 * The meta object literal for the '<em><b>Data In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__DATA_IN = eINSTANCE.getComponent_DataIn();

		/**
		 * The meta object literal for the '<em><b>Data Out</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__DATA_OUT = eINSTANCE.getComponent_DataOut();

		/**
		 * The meta object literal for the '<em><b>Storage Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__STORAGE_CAPACITY = eINSTANCE.getComponent_StorageCapacity();

		/**
		 * The meta object literal for the '<em><b>Request</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__REQUEST = eINSTANCE.getComponent_Request();

		/**
		 * The meta object literal for the '<em><b>Operational Component Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__OPERATIONAL_COMPONENT_COST = eINSTANCE.getComponent_OperationalComponentCost();

		/**
		 * The meta object literal for the '<em><b>Deployed Units</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__DEPLOYED_UNITS = eINSTANCE.getComponent_DeployedUnits();

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
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRICING_FUNCTION__PRICE = eINSTANCE.getPricingFunction_Price();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRICING_FUNCTION__NAME = eINSTANCE.getPricingFunction_Name();

		/**
		 * The meta object literal for the '<em><b>Metric</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRICING_FUNCTION__METRIC = eINSTANCE.getPricingFunction_Metric();

		/**
		 * The meta object literal for the '<em><b>Billing Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRICING_FUNCTION__BILLING_TYPE = eINSTANCE.getPricingFunction_BillingType();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRICING_FUNCTION__DATA_TYPE = eINSTANCE.getPricingFunction_DataType();

		/**
		 * The meta object literal for the '<em><b>Request Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRICING_FUNCTION__REQUEST_TYPE = eINSTANCE.getPricingFunction_RequestType();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC__NAME = eINSTANCE.getVPC_Name();

		/**
		 * The meta object literal for the '<em><b>Deployed</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VPC__DEPLOYED = eINSTANCE.getVPC_Deployed();

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
		 * The meta object literal for the '<em><b>Informationflow</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__INFORMATIONFLOW = eINSTANCE.getScenario_Informationflow();

		/**
		 * The meta object literal for the '<em><b>Mean Sojourn Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__MEAN_SOJOURN_TIME = eINSTANCE.getScenario_MeanSojournTime();

		/**
		 * The meta object literal for the '<em><b>Max Sojourn Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__MAX_SOJOURN_TIME = eINSTANCE.getScenario_MaxSojournTime();

		/**
		 * The meta object literal for the '<em><b>Colour</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__COLOUR = eINSTANCE.getScenario_Colour();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.deployment.impl.InformationFlowImpl <em>Information Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.deployment.impl.InformationFlowImpl
		 * @see org.eclipse.sirius.deployment.impl.DeploymentPackageImpl#getInformationFlow()
		 * @generated
		 */
		EClass INFORMATION_FLOW = eINSTANCE.getInformationFlow();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFORMATION_FLOW__DATA = eINSTANCE.getInformationFlow_Data();

		/**
		 * The meta object literal for the '<em><b>Sender</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFORMATION_FLOW__SENDER = eINSTANCE.getInformationFlow_Sender();

		/**
		 * The meta object literal for the '<em><b>Receiver</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFORMATION_FLOW__RECEIVER = eINSTANCE.getInformationFlow_Receiver();

		/**
		 * The meta object literal for the '<em><b>Data Reverse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFORMATION_FLOW__DATA_REVERSE = eINSTANCE.getInformationFlow_DataReverse();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFORMATION_FLOW__PROBABILITY = eINSTANCE.getInformationFlow_Probability();

		/**
		 * The meta object literal for the '<em><b>Bi Directional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFORMATION_FLOW__BI_DIRECTIONAL = eINSTANCE.getInformationFlow_BiDirectional();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.deployment.impl.ConsumptionMetrics2Impl <em>Consumption Metrics2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.deployment.impl.ConsumptionMetrics2Impl
		 * @see org.eclipse.sirius.deployment.impl.DeploymentPackageImpl#getConsumptionMetrics2()
		 * @generated
		 */
		EClass CONSUMPTION_METRICS2 = eINSTANCE.getConsumptionMetrics2();

		/**
		 * The meta object literal for the '<em><b>Server Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSUMPTION_METRICS2__SERVER_TIME = eINSTANCE.getConsumptionMetrics2_ServerTime();

		/**
		 * The meta object literal for the '<em><b>Server Unit Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSUMPTION_METRICS2__SERVER_UNIT_TIME = eINSTANCE.getConsumptionMetrics2_ServerUnitTime();

		/**
		 * The meta object literal for the '<em><b>Data In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSUMPTION_METRICS2__DATA_IN = eINSTANCE.getConsumptionMetrics2_DataIn();

		/**
		 * The meta object literal for the '<em><b>Data Out</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSUMPTION_METRICS2__DATA_OUT = eINSTANCE.getConsumptionMetrics2_DataOut();

		/**
		 * The meta object literal for the '<em><b>Storage Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSUMPTION_METRICS2__STORAGE_CAPACITY = eINSTANCE.getConsumptionMetrics2_StorageCapacity();

		/**
		 * The meta object literal for the '<em><b>Request</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSUMPTION_METRICS2__REQUEST = eINSTANCE.getConsumptionMetrics2_Request();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.deployment.ServiceLevel <em>Service Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.deployment.ServiceLevel
		 * @see org.eclipse.sirius.deployment.impl.DeploymentPackageImpl#getServiceLevel()
		 * @generated
		 */
		EEnum SERVICE_LEVEL = eINSTANCE.getServiceLevel();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.deployment.ConsumptionMetric <em>Consumption Metric</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.deployment.ConsumptionMetric
		 * @see org.eclipse.sirius.deployment.impl.DeploymentPackageImpl#getConsumptionMetric()
		 * @generated
		 */
		EEnum CONSUMPTION_METRIC = eINSTANCE.getConsumptionMetric();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.deployment.DataType <em>Data Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.deployment.DataType
		 * @see org.eclipse.sirius.deployment.impl.DeploymentPackageImpl#getDataType()
		 * @generated
		 */
		EEnum DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.deployment.BillingType <em>Billing Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.deployment.BillingType
		 * @see org.eclipse.sirius.deployment.impl.DeploymentPackageImpl#getBillingType()
		 * @generated
		 */
		EEnum BILLING_TYPE = eINSTANCE.getBillingType();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.deployment.RequestType <em>Request Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.deployment.RequestType
		 * @see org.eclipse.sirius.deployment.impl.DeploymentPackageImpl#getRequestType()
		 * @generated
		 */
		EEnum REQUEST_TYPE = eINSTANCE.getRequestType();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.deployment.WeekDay <em>Week Day</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.deployment.WeekDay
		 * @see org.eclipse.sirius.deployment.impl.DeploymentPackageImpl#getWeekDay()
		 * @generated
		 */
		EEnum WEEK_DAY = eINSTANCE.getWeekDay();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.deployment.Colour <em>Colour</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.deployment.Colour
		 * @see org.eclipse.sirius.deployment.impl.DeploymentPackageImpl#getColour()
		 * @generated
		 */
		EEnum COLOUR = eINSTANCE.getColour();

		/**
		 * The meta object literal for the '<em>New Data Type7</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.eclipse.sirius.deployment.impl.DeploymentPackageImpl#getNewDataType7()
		 * @generated
		 */
		EDataType NEW_DATA_TYPE7 = eINSTANCE.getNewDataType7();

	}

} //DeploymentPackage
