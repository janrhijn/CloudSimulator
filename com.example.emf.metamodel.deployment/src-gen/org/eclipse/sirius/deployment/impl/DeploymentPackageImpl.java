/**
 */
package org.eclipse.sirius.deployment.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.sirius.deployment.ArrivalRateWeekDistribution;
import org.eclipse.sirius.deployment.BillingType;
import org.eclipse.sirius.deployment.Colour;
import org.eclipse.sirius.deployment.Component;
import org.eclipse.sirius.deployment.Compute;
import org.eclipse.sirius.deployment.Connector;
import org.eclipse.sirius.deployment.ConsumptionMetric;
import org.eclipse.sirius.deployment.DataType;
import org.eclipse.sirius.deployment.Deployment;
import org.eclipse.sirius.deployment.DeploymentFactory;
import org.eclipse.sirius.deployment.DeploymentPackage;
import org.eclipse.sirius.deployment.Feature;
import org.eclipse.sirius.deployment.InformationFlow;
import org.eclipse.sirius.deployment.PricingFunction;
import org.eclipse.sirius.deployment.RequestType;
import org.eclipse.sirius.deployment.Scenario;
import org.eclipse.sirius.deployment.ServiceLevel;
import org.eclipse.sirius.deployment.Storage;
import org.eclipse.sirius.deployment.WeekDay;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeploymentPackageImpl extends EPackageImpl implements DeploymentPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pricingFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass computeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vpcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scenarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass informationFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrivalRateWeekDistributionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum serviceLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum consumptionMetricEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum billingTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum requestTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum weekDayEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum colourEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType newDataType7EDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.sirius.deployment.DeploymentPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DeploymentPackageImpl() {
		super(eNS_URI, DeploymentFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link DeploymentPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DeploymentPackage init() {
		if (isInited)
			return (DeploymentPackage) EPackage.Registry.INSTANCE.getEPackage(DeploymentPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDeploymentPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DeploymentPackageImpl theDeploymentPackage = registeredDeploymentPackage instanceof DeploymentPackageImpl
				? (DeploymentPackageImpl) registeredDeploymentPackage
				: new DeploymentPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theDeploymentPackage.createPackageContents();

		// Initialize created meta-data
		theDeploymentPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDeploymentPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DeploymentPackage.eNS_URI, theDeploymentPackage);
		return theDeploymentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeployment() {
		return deploymentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeployment_Name() {
		return (EAttribute) deploymentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeployment_Contain() {
		return (EReference) deploymentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeployment_Vpc() {
		return (EReference) deploymentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeployment_Scenarios() {
		return (EReference) deploymentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeployment_OperationalCost() {
		return (EAttribute) deploymentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_Contains() {
		return (EReference) componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_Pricingscheme() {
		return (EReference) componentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponent_Name() {
		return (EAttribute) componentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponent_ServiceLevel() {
		return (EAttribute) componentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponent_ServerDuration() {
		return (EAttribute) componentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponent_ServerUnitTime() {
		return (EAttribute) componentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponent_DataIn() {
		return (EAttribute) componentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponent_DataOut() {
		return (EAttribute) componentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponent_StorageCapacity() {
		return (EAttribute) componentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponent_Request() {
		return (EAttribute) componentEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponent_OperationalComponentCost() {
		return (EAttribute) componentEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponent_DeployedUnits() {
		return (EAttribute) componentEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponent_MaxWaitingTime() {
		return (EAttribute) componentEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPricingFunction() {
		return pricingFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPricingFunction_Price() {
		return (EAttribute) pricingFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPricingFunction_Name() {
		return (EAttribute) pricingFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPricingFunction_Metric() {
		return (EAttribute) pricingFunctionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPricingFunction_BillingType() {
		return (EAttribute) pricingFunctionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPricingFunction_DataType() {
		return (EAttribute) pricingFunctionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPricingFunction_RequestType() {
		return (EAttribute) pricingFunctionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeature() {
		return featureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeature_Name() {
		return (EAttribute) featureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompute() {
		return computeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCompute_Servicerate() {
		return (EAttribute) computeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConnector() {
		return connectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStorage() {
		return storageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVPC() {
		return vpcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVPC_Name() {
		return (EAttribute) vpcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVPC_Deployed() {
		return (EReference) vpcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getScenario() {
		return scenarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScenario_Name() {
		return (EAttribute) scenarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScenario_Arrivalrate() {
		return (EAttribute) scenarioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScenario_Informationflow() {
		return (EReference) scenarioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScenario_MeanSojournTime() {
		return (EAttribute) scenarioEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScenario_MaxSojournTime() {
		return (EAttribute) scenarioEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScenario_Colour() {
		return (EAttribute) scenarioEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScenario_Arrivalrateweekdistribution() {
		return (EReference) scenarioEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInformationFlow() {
		return informationFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInformationFlow_Data() {
		return (EAttribute) informationFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInformationFlow_Sender() {
		return (EReference) informationFlowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInformationFlow_Receiver() {
		return (EReference) informationFlowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInformationFlow_DataReverse() {
		return (EAttribute) informationFlowEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInformationFlow_Probability() {
		return (EAttribute) informationFlowEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInformationFlow_BiDirectional() {
		return (EAttribute) informationFlowEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInformationFlow_ComputedArrivalRate() {
		return (EAttribute) informationFlowEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArrivalRateWeekDistribution() {
		return arrivalRateWeekDistributionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArrivalRateWeekDistribution_Monday() {
		return (EAttribute) arrivalRateWeekDistributionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArrivalRateWeekDistribution_Tuesday() {
		return (EAttribute) arrivalRateWeekDistributionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArrivalRateWeekDistribution_Wednesday() {
		return (EAttribute) arrivalRateWeekDistributionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArrivalRateWeekDistribution_Thursday() {
		return (EAttribute) arrivalRateWeekDistributionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArrivalRateWeekDistribution_Friday() {
		return (EAttribute) arrivalRateWeekDistributionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArrivalRateWeekDistribution_Saturday() {
		return (EAttribute) arrivalRateWeekDistributionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArrivalRateWeekDistribution_Sunday() {
		return (EAttribute) arrivalRateWeekDistributionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArrivalRateWeekDistribution_TotalPerWeek() {
		return (EAttribute) arrivalRateWeekDistributionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getServiceLevel() {
		return serviceLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getConsumptionMetric() {
		return consumptionMetricEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDataType() {
		return dataTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getBillingType() {
		return billingTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRequestType() {
		return requestTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getWeekDay() {
		return weekDayEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getColour() {
		return colourEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getNewDataType7() {
		return newDataType7EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeploymentFactory getDeploymentFactory() {
		return (DeploymentFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		deploymentEClass = createEClass(DEPLOYMENT);
		createEAttribute(deploymentEClass, DEPLOYMENT__NAME);
		createEReference(deploymentEClass, DEPLOYMENT__CONTAIN);
		createEReference(deploymentEClass, DEPLOYMENT__VPC);
		createEReference(deploymentEClass, DEPLOYMENT__SCENARIOS);
		createEAttribute(deploymentEClass, DEPLOYMENT__OPERATIONAL_COST);

		componentEClass = createEClass(COMPONENT);
		createEReference(componentEClass, COMPONENT__CONTAINS);
		createEReference(componentEClass, COMPONENT__PRICINGSCHEME);
		createEAttribute(componentEClass, COMPONENT__NAME);
		createEAttribute(componentEClass, COMPONENT__SERVICE_LEVEL);
		createEAttribute(componentEClass, COMPONENT__SERVER_DURATION);
		createEAttribute(componentEClass, COMPONENT__SERVER_UNIT_TIME);
		createEAttribute(componentEClass, COMPONENT__DATA_IN);
		createEAttribute(componentEClass, COMPONENT__DATA_OUT);
		createEAttribute(componentEClass, COMPONENT__STORAGE_CAPACITY);
		createEAttribute(componentEClass, COMPONENT__REQUEST);
		createEAttribute(componentEClass, COMPONENT__OPERATIONAL_COMPONENT_COST);
		createEAttribute(componentEClass, COMPONENT__DEPLOYED_UNITS);
		createEAttribute(componentEClass, COMPONENT__MAX_WAITING_TIME);

		pricingFunctionEClass = createEClass(PRICING_FUNCTION);
		createEAttribute(pricingFunctionEClass, PRICING_FUNCTION__PRICE);
		createEAttribute(pricingFunctionEClass, PRICING_FUNCTION__NAME);
		createEAttribute(pricingFunctionEClass, PRICING_FUNCTION__METRIC);
		createEAttribute(pricingFunctionEClass, PRICING_FUNCTION__BILLING_TYPE);
		createEAttribute(pricingFunctionEClass, PRICING_FUNCTION__DATA_TYPE);
		createEAttribute(pricingFunctionEClass, PRICING_FUNCTION__REQUEST_TYPE);

		featureEClass = createEClass(FEATURE);
		createEAttribute(featureEClass, FEATURE__NAME);

		computeEClass = createEClass(COMPUTE);
		createEAttribute(computeEClass, COMPUTE__SERVICERATE);

		connectorEClass = createEClass(CONNECTOR);

		storageEClass = createEClass(STORAGE);

		vpcEClass = createEClass(VPC);
		createEAttribute(vpcEClass, VPC__NAME);
		createEReference(vpcEClass, VPC__DEPLOYED);

		scenarioEClass = createEClass(SCENARIO);
		createEAttribute(scenarioEClass, SCENARIO__NAME);
		createEAttribute(scenarioEClass, SCENARIO__ARRIVALRATE);
		createEReference(scenarioEClass, SCENARIO__INFORMATIONFLOW);
		createEAttribute(scenarioEClass, SCENARIO__MEAN_SOJOURN_TIME);
		createEAttribute(scenarioEClass, SCENARIO__MAX_SOJOURN_TIME);
		createEAttribute(scenarioEClass, SCENARIO__COLOUR);
		createEReference(scenarioEClass, SCENARIO__ARRIVALRATEWEEKDISTRIBUTION);

		informationFlowEClass = createEClass(INFORMATION_FLOW);
		createEAttribute(informationFlowEClass, INFORMATION_FLOW__DATA);
		createEReference(informationFlowEClass, INFORMATION_FLOW__SENDER);
		createEReference(informationFlowEClass, INFORMATION_FLOW__RECEIVER);
		createEAttribute(informationFlowEClass, INFORMATION_FLOW__DATA_REVERSE);
		createEAttribute(informationFlowEClass, INFORMATION_FLOW__PROBABILITY);
		createEAttribute(informationFlowEClass, INFORMATION_FLOW__BI_DIRECTIONAL);
		createEAttribute(informationFlowEClass, INFORMATION_FLOW__COMPUTED_ARRIVAL_RATE);

		arrivalRateWeekDistributionEClass = createEClass(ARRIVAL_RATE_WEEK_DISTRIBUTION);
		createEAttribute(arrivalRateWeekDistributionEClass, ARRIVAL_RATE_WEEK_DISTRIBUTION__MONDAY);
		createEAttribute(arrivalRateWeekDistributionEClass, ARRIVAL_RATE_WEEK_DISTRIBUTION__TUESDAY);
		createEAttribute(arrivalRateWeekDistributionEClass, ARRIVAL_RATE_WEEK_DISTRIBUTION__WEDNESDAY);
		createEAttribute(arrivalRateWeekDistributionEClass, ARRIVAL_RATE_WEEK_DISTRIBUTION__THURSDAY);
		createEAttribute(arrivalRateWeekDistributionEClass, ARRIVAL_RATE_WEEK_DISTRIBUTION__FRIDAY);
		createEAttribute(arrivalRateWeekDistributionEClass, ARRIVAL_RATE_WEEK_DISTRIBUTION__SATURDAY);
		createEAttribute(arrivalRateWeekDistributionEClass, ARRIVAL_RATE_WEEK_DISTRIBUTION__SUNDAY);
		createEAttribute(arrivalRateWeekDistributionEClass, ARRIVAL_RATE_WEEK_DISTRIBUTION__TOTAL_PER_WEEK);

		// Create enums
		serviceLevelEEnum = createEEnum(SERVICE_LEVEL);
		consumptionMetricEEnum = createEEnum(CONSUMPTION_METRIC);
		dataTypeEEnum = createEEnum(DATA_TYPE);
		billingTypeEEnum = createEEnum(BILLING_TYPE);
		requestTypeEEnum = createEEnum(REQUEST_TYPE);
		weekDayEEnum = createEEnum(WEEK_DAY);
		colourEEnum = createEEnum(COLOUR);

		// Create data types
		newDataType7EDataType = createEDataType(NEW_DATA_TYPE7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		computeEClass.getESuperTypes().add(this.getFeature());
		connectorEClass.getESuperTypes().add(this.getFeature());
		storageEClass.getESuperTypes().add(this.getFeature());

		// Initialize classes, features, and operations; add parameters
		initEClass(deploymentEClass, Deployment.class, "Deployment", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeployment_Name(), ecorePackage.getEString(), "name", null, 0, 1, Deployment.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeployment_Contain(), this.getComponent(), null, "contain", null, 0, -1, Deployment.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeployment_Vpc(), this.getVPC(), null, "vpc", null, 1, 1, Deployment.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getDeployment_Scenarios(), this.getScenario(), null, "scenarios", null, 1, -1, Deployment.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeployment_OperationalCost(), ecorePackage.getEDouble(), "operationalCost", null, 0, 1,
				Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponent_Contains(), this.getFeature(), null, "contains", null, 1, -1, Component.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Pricingscheme(), this.getPricingFunction(), null, "pricingscheme", null, 0, -1,
				Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_Name(), ecorePackage.getEString(), "name", null, 0, 1, Component.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_ServiceLevel(), this.getServiceLevel(), "serviceLevel", null, 0, 1, Component.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_ServerDuration(), ecorePackage.getEInt(), "serverDuration", null, 0, 1,
				Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_ServerUnitTime(), ecorePackage.getELong(), "serverUnitTime", null, 0, 1,
				Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_DataIn(), ecorePackage.getELong(), "dataIn", null, 0, 1, Component.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_DataOut(), ecorePackage.getELong(), "dataOut", null, 0, 1, Component.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_StorageCapacity(), ecorePackage.getELong(), "storageCapacity", null, 0, 1,
				Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_Request(), ecorePackage.getELong(), "request", null, 0, 1, Component.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_OperationalComponentCost(), ecorePackage.getEDouble(), "operationalComponentCost",
				null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_DeployedUnits(), ecorePackage.getEInt(), "deployedUnits", null, 0, 1,
				Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_MaxWaitingTime(), ecorePackage.getEDouble(), "maxWaitingTime", "150", 0, 1,
				Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(pricingFunctionEClass, PricingFunction.class, "PricingFunction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPricingFunction_Price(), ecorePackage.getEDouble(), "price", null, 0, 1,
				PricingFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPricingFunction_Name(), ecorePackage.getEString(), "name", null, 0, 1, PricingFunction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPricingFunction_Metric(), this.getConsumptionMetric(), "metric", null, 0, 1,
				PricingFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPricingFunction_BillingType(), this.getBillingType(), "billingType", "NONE", 0, 1,
				PricingFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPricingFunction_DataType(), this.getDataType(), "dataType", "NONE", 0, 1,
				PricingFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPricingFunction_RequestType(), this.getRequestType(), "requestType", "NONE", 0, 1,
				PricingFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(featureEClass, Feature.class, "Feature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeature_Name(), ecorePackage.getEString(), "name", null, 0, 1, Feature.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(computeEClass, Compute.class, "Compute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompute_Servicerate(), ecorePackage.getEDouble(), "servicerate", null, 0, 1, Compute.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectorEClass, Connector.class, "Connector", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(storageEClass, Storage.class, "Storage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vpcEClass, org.eclipse.sirius.deployment.VPC.class, "VPC", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVPC_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				org.eclipse.sirius.deployment.VPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVPC_Deployed(), this.getComponent(), null, "deployed", null, 0, -1,
				org.eclipse.sirius.deployment.VPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scenarioEClass, Scenario.class, "Scenario", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScenario_Name(), ecorePackage.getEString(), "name", null, 0, 1, Scenario.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScenario_Arrivalrate(), ecorePackage.getEInt(), "arrivalrate", null, 0, 1, Scenario.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenario_Informationflow(), this.getInformationFlow(), null, "informationflow", null, 1, -1,
				Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScenario_MeanSojournTime(), ecorePackage.getEDouble(), "meanSojournTime", null, 0, 1,
				Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getScenario_MaxSojournTime(), ecorePackage.getEDouble(), "maxSojournTime", null, 0, 1,
				Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getScenario_Colour(), this.getColour(), "colour", null, 0, 1, Scenario.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenario_Arrivalrateweekdistribution(), this.getArrivalRateWeekDistribution(), null,
				"arrivalrateweekdistribution", null, 0, 1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(informationFlowEClass, InformationFlow.class, "InformationFlow", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInformationFlow_Data(), ecorePackage.getEInt(), "data", null, 0, 1, InformationFlow.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInformationFlow_Sender(), this.getFeature(), null, "sender", null, 1, 1,
				InformationFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInformationFlow_Receiver(), this.getFeature(), null, "receiver", null, 1, 1,
				InformationFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInformationFlow_DataReverse(), ecorePackage.getEInt(), "dataReverse", null, 0, 1,
				InformationFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getInformationFlow_Probability(), ecorePackage.getEDouble(), "probability", "1.0", 0, 1,
				InformationFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getInformationFlow_BiDirectional(), ecorePackage.getEBoolean(), "biDirectional", "false", 0, 1,
				InformationFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getInformationFlow_ComputedArrivalRate(), ecorePackage.getEDouble(), "computedArrivalRate", null,
				0, 1, InformationFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrivalRateWeekDistributionEClass, ArrivalRateWeekDistribution.class, "ArrivalRateWeekDistribution",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArrivalRateWeekDistribution_Monday(), ecorePackage.getEDouble(), "Monday", null, 0, 1,
				ArrivalRateWeekDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArrivalRateWeekDistribution_Tuesday(), ecorePackage.getEDouble(), "Tuesday", null, 0, 1,
				ArrivalRateWeekDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArrivalRateWeekDistribution_Wednesday(), ecorePackage.getEDouble(), "Wednesday", null, 0, 1,
				ArrivalRateWeekDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArrivalRateWeekDistribution_Thursday(), ecorePackage.getEDouble(), "Thursday", null, 0, 1,
				ArrivalRateWeekDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArrivalRateWeekDistribution_Friday(), ecorePackage.getEDouble(), "Friday", null, 0, 1,
				ArrivalRateWeekDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArrivalRateWeekDistribution_Saturday(), ecorePackage.getEDouble(), "Saturday", null, 0, 1,
				ArrivalRateWeekDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArrivalRateWeekDistribution_Sunday(), ecorePackage.getEDouble(), "Sunday", null, 0, 1,
				ArrivalRateWeekDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArrivalRateWeekDistribution_TotalPerWeek(), ecorePackage.getEInt(), "TotalPerWeek", null, 0,
				1, ArrivalRateWeekDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(serviceLevelEEnum, ServiceLevel.class, "ServiceLevel");
		addEEnumLiteral(serviceLevelEEnum, ServiceLevel.IAAS);
		addEEnumLiteral(serviceLevelEEnum, ServiceLevel.PAAS);
		addEEnumLiteral(serviceLevelEEnum, ServiceLevel.SAAS);
		addEEnumLiteral(serviceLevelEEnum, ServiceLevel.FAAS);
		addEEnumLiteral(serviceLevelEEnum, ServiceLevel.OTHER);

		initEEnum(consumptionMetricEEnum, ConsumptionMetric.class, "ConsumptionMetric");
		addEEnumLiteral(consumptionMetricEEnum, ConsumptionMetric.SERVER_DURATION);
		addEEnumLiteral(consumptionMetricEEnum, ConsumptionMetric.SERVER_UNIT_TIME);
		addEEnumLiteral(consumptionMetricEEnum, ConsumptionMetric.DATA_IN);
		addEEnumLiteral(consumptionMetricEEnum, ConsumptionMetric.DATA_OUT);
		addEEnumLiteral(consumptionMetricEEnum, ConsumptionMetric.STORAGE_CAPACITY);
		addEEnumLiteral(consumptionMetricEEnum, ConsumptionMetric.REQUEST);
		addEEnumLiteral(consumptionMetricEEnum, ConsumptionMetric.DATA_PROCESSED);

		initEEnum(dataTypeEEnum, DataType.class, "DataType");
		addEEnumLiteral(dataTypeEEnum, DataType.KILOBYTE);
		addEEnumLiteral(dataTypeEEnum, DataType.MEGABYTE);
		addEEnumLiteral(dataTypeEEnum, DataType.GIGABYTE);
		addEEnumLiteral(dataTypeEEnum, DataType.NONE);

		initEEnum(billingTypeEEnum, BillingType.class, "BillingType");
		addEEnumLiteral(billingTypeEEnum, BillingType.HOUR);
		addEEnumLiteral(billingTypeEEnum, BillingType.SECOND);
		addEEnumLiteral(billingTypeEEnum, BillingType.NONE);

		initEEnum(requestTypeEEnum, RequestType.class, "RequestType");
		addEEnumLiteral(requestTypeEEnum, RequestType.MILLION);
		addEEnumLiteral(requestTypeEEnum, RequestType.THOUSAND);
		addEEnumLiteral(requestTypeEEnum, RequestType.UNIT);
		addEEnumLiteral(requestTypeEEnum, RequestType.NONE);

		initEEnum(weekDayEEnum, WeekDay.class, "WeekDay");
		addEEnumLiteral(weekDayEEnum, WeekDay.SUNDAY);
		addEEnumLiteral(weekDayEEnum, WeekDay.MONDAY);
		addEEnumLiteral(weekDayEEnum, WeekDay.TUESDAY);
		addEEnumLiteral(weekDayEEnum, WeekDay.WEDNESDAY);
		addEEnumLiteral(weekDayEEnum, WeekDay.THURSDAY);
		addEEnumLiteral(weekDayEEnum, WeekDay.FRIDAY);
		addEEnumLiteral(weekDayEEnum, WeekDay.SATURDAY);

		initEEnum(colourEEnum, Colour.class, "Colour");
		addEEnumLiteral(colourEEnum, Colour.RED);
		addEEnumLiteral(colourEEnum, Colour.BLUE);
		addEEnumLiteral(colourEEnum, Colour.YELLOW);
		addEEnumLiteral(colourEEnum, Colour.PURPLE);
		addEEnumLiteral(colourEEnum, Colour.GREEN);

		// Initialize data types
		initEDataType(newDataType7EDataType, Object.class, "NewDataType7", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //DeploymentPackageImpl
