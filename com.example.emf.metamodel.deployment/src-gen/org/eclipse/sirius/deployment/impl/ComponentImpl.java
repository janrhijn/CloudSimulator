/**
 */
package org.eclipse.sirius.deployment.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.sirius.deployment.Component;
import org.eclipse.sirius.deployment.DeploymentPackage;
import org.eclipse.sirius.deployment.Feature;
import org.eclipse.sirius.deployment.PricingFunction;
import org.eclipse.sirius.deployment.ServiceLevel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.deployment.impl.ComponentImpl#getContains <em>Contains</em>}</li>
 *   <li>{@link org.eclipse.sirius.deployment.impl.ComponentImpl#getPricingscheme <em>Pricingscheme</em>}</li>
 *   <li>{@link org.eclipse.sirius.deployment.impl.ComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.sirius.deployment.impl.ComponentImpl#getServiceLevel <em>Service Level</em>}</li>
 *   <li>{@link org.eclipse.sirius.deployment.impl.ComponentImpl#getServerDuration <em>Server Duration</em>}</li>
 *   <li>{@link org.eclipse.sirius.deployment.impl.ComponentImpl#getServerUnitTime <em>Server Unit Time</em>}</li>
 *   <li>{@link org.eclipse.sirius.deployment.impl.ComponentImpl#getDataIn <em>Data In</em>}</li>
 *   <li>{@link org.eclipse.sirius.deployment.impl.ComponentImpl#getDataOut <em>Data Out</em>}</li>
 *   <li>{@link org.eclipse.sirius.deployment.impl.ComponentImpl#getStorageCapacity <em>Storage Capacity</em>}</li>
 *   <li>{@link org.eclipse.sirius.deployment.impl.ComponentImpl#getRequest <em>Request</em>}</li>
 *   <li>{@link org.eclipse.sirius.deployment.impl.ComponentImpl#getOperationalComponentCost <em>Operational Component Cost</em>}</li>
 *   <li>{@link org.eclipse.sirius.deployment.impl.ComponentImpl#getDeployedUnits <em>Deployed Units</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImpl extends MinimalEObjectImpl.Container implements Component {
	/**
	 * The cached value of the '{@link #getContains() <em>Contains</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContains()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> contains;

	/**
	 * The cached value of the '{@link #getPricingscheme() <em>Pricingscheme</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPricingscheme()
	 * @generated
	 * @ordered
	 */
	protected EList<PricingFunction> pricingscheme;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceLevel() <em>Service Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceLevel()
	 * @generated
	 * @ordered
	 */
	protected static final ServiceLevel SERVICE_LEVEL_EDEFAULT = ServiceLevel.IAAS;

	/**
	 * The cached value of the '{@link #getServiceLevel() <em>Service Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceLevel()
	 * @generated
	 * @ordered
	 */
	protected ServiceLevel serviceLevel = SERVICE_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getServerDuration() <em>Server Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerDuration()
	 * @generated
	 * @ordered
	 */
	protected static final int SERVER_DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getServerDuration() <em>Server Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerDuration()
	 * @generated
	 * @ordered
	 */
	protected int serverDuration = SERVER_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getServerUnitTime() <em>Server Unit Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerUnitTime()
	 * @generated
	 * @ordered
	 */
	protected static final long SERVER_UNIT_TIME_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getServerUnitTime() <em>Server Unit Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerUnitTime()
	 * @generated
	 * @ordered
	 */
	protected long serverUnitTime = SERVER_UNIT_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataIn() <em>Data In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataIn()
	 * @generated
	 * @ordered
	 */
	protected static final long DATA_IN_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getDataIn() <em>Data In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataIn()
	 * @generated
	 * @ordered
	 */
	protected long dataIn = DATA_IN_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataOut() <em>Data Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataOut()
	 * @generated
	 * @ordered
	 */
	protected static final long DATA_OUT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getDataOut() <em>Data Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataOut()
	 * @generated
	 * @ordered
	 */
	protected long dataOut = DATA_OUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getStorageCapacity() <em>Storage Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final long STORAGE_CAPACITY_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getStorageCapacity() <em>Storage Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageCapacity()
	 * @generated
	 * @ordered
	 */
	protected long storageCapacity = STORAGE_CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequest() <em>Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequest()
	 * @generated
	 * @ordered
	 */
	protected static final long REQUEST_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getRequest() <em>Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequest()
	 * @generated
	 * @ordered
	 */
	protected long request = REQUEST_EDEFAULT;

	/**
	 * The default value of the '{@link #getOperationalComponentCost() <em>Operational Component Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationalComponentCost()
	 * @generated
	 * @ordered
	 */
	protected static final double OPERATIONAL_COMPONENT_COST_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getOperationalComponentCost() <em>Operational Component Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationalComponentCost()
	 * @generated
	 * @ordered
	 */
	protected double operationalComponentCost = OPERATIONAL_COMPONENT_COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeployedUnits() <em>Deployed Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployedUnits()
	 * @generated
	 * @ordered
	 */
	protected static final int DEPLOYED_UNITS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDeployedUnits() <em>Deployed Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployedUnits()
	 * @generated
	 * @ordered
	 */
	protected int deployedUnits = DEPLOYED_UNITS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeploymentPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Feature> getContains() {
		if (contains == null) {
			contains = new EObjectContainmentEList<Feature>(Feature.class, this, DeploymentPackage.COMPONENT__CONTAINS);
		}
		return contains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PricingFunction> getPricingscheme() {
		if (pricingscheme == null) {
			pricingscheme = new EObjectContainmentEList<PricingFunction>(PricingFunction.class, this,
					DeploymentPackage.COMPONENT__PRICINGSCHEME);
		}
		return pricingscheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.COMPONENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceLevel getServiceLevel() {
		return serviceLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServiceLevel(ServiceLevel newServiceLevel) {
		ServiceLevel oldServiceLevel = serviceLevel;
		serviceLevel = newServiceLevel == null ? SERVICE_LEVEL_EDEFAULT : newServiceLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.COMPONENT__SERVICE_LEVEL,
					oldServiceLevel, serviceLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getServerDuration() {
		return serverDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServerDuration(int newServerDuration) {
		int oldServerDuration = serverDuration;
		serverDuration = newServerDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.COMPONENT__SERVER_DURATION,
					oldServerDuration, serverDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getServerUnitTime() {
		return serverUnitTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServerUnitTime(long newServerUnitTime) {
		long oldServerUnitTime = serverUnitTime;
		serverUnitTime = newServerUnitTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.COMPONENT__SERVER_UNIT_TIME,
					oldServerUnitTime, serverUnitTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getDataIn() {
		return dataIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataIn(long newDataIn) {
		long oldDataIn = dataIn;
		dataIn = newDataIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.COMPONENT__DATA_IN, oldDataIn,
					dataIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getDataOut() {
		return dataOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataOut(long newDataOut) {
		long oldDataOut = dataOut;
		dataOut = newDataOut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.COMPONENT__DATA_OUT, oldDataOut,
					dataOut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getStorageCapacity() {
		return storageCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStorageCapacity(long newStorageCapacity) {
		long oldStorageCapacity = storageCapacity;
		storageCapacity = newStorageCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.COMPONENT__STORAGE_CAPACITY,
					oldStorageCapacity, storageCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getRequest() {
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequest(long newRequest) {
		long oldRequest = request;
		request = newRequest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.COMPONENT__REQUEST, oldRequest,
					request));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getOperationalComponentCost() {
		return operationalComponentCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperationalComponentCost(double newOperationalComponentCost) {
		double oldOperationalComponentCost = operationalComponentCost;
		operationalComponentCost = newOperationalComponentCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DeploymentPackage.COMPONENT__OPERATIONAL_COMPONENT_COST, oldOperationalComponentCost,
					operationalComponentCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDeployedUnits() {
		return deployedUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeployedUnits(int newDeployedUnits) {
		int oldDeployedUnits = deployedUnits;
		deployedUnits = newDeployedUnits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.COMPONENT__DEPLOYED_UNITS,
					oldDeployedUnits, deployedUnits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DeploymentPackage.COMPONENT__CONTAINS:
			return ((InternalEList<?>) getContains()).basicRemove(otherEnd, msgs);
		case DeploymentPackage.COMPONENT__PRICINGSCHEME:
			return ((InternalEList<?>) getPricingscheme()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DeploymentPackage.COMPONENT__CONTAINS:
			return getContains();
		case DeploymentPackage.COMPONENT__PRICINGSCHEME:
			return getPricingscheme();
		case DeploymentPackage.COMPONENT__NAME:
			return getName();
		case DeploymentPackage.COMPONENT__SERVICE_LEVEL:
			return getServiceLevel();
		case DeploymentPackage.COMPONENT__SERVER_DURATION:
			return getServerDuration();
		case DeploymentPackage.COMPONENT__SERVER_UNIT_TIME:
			return getServerUnitTime();
		case DeploymentPackage.COMPONENT__DATA_IN:
			return getDataIn();
		case DeploymentPackage.COMPONENT__DATA_OUT:
			return getDataOut();
		case DeploymentPackage.COMPONENT__STORAGE_CAPACITY:
			return getStorageCapacity();
		case DeploymentPackage.COMPONENT__REQUEST:
			return getRequest();
		case DeploymentPackage.COMPONENT__OPERATIONAL_COMPONENT_COST:
			return getOperationalComponentCost();
		case DeploymentPackage.COMPONENT__DEPLOYED_UNITS:
			return getDeployedUnits();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DeploymentPackage.COMPONENT__CONTAINS:
			getContains().clear();
			getContains().addAll((Collection<? extends Feature>) newValue);
			return;
		case DeploymentPackage.COMPONENT__PRICINGSCHEME:
			getPricingscheme().clear();
			getPricingscheme().addAll((Collection<? extends PricingFunction>) newValue);
			return;
		case DeploymentPackage.COMPONENT__NAME:
			setName((String) newValue);
			return;
		case DeploymentPackage.COMPONENT__SERVICE_LEVEL:
			setServiceLevel((ServiceLevel) newValue);
			return;
		case DeploymentPackage.COMPONENT__SERVER_DURATION:
			setServerDuration((Integer) newValue);
			return;
		case DeploymentPackage.COMPONENT__SERVER_UNIT_TIME:
			setServerUnitTime((Long) newValue);
			return;
		case DeploymentPackage.COMPONENT__DATA_IN:
			setDataIn((Long) newValue);
			return;
		case DeploymentPackage.COMPONENT__DATA_OUT:
			setDataOut((Long) newValue);
			return;
		case DeploymentPackage.COMPONENT__STORAGE_CAPACITY:
			setStorageCapacity((Long) newValue);
			return;
		case DeploymentPackage.COMPONENT__REQUEST:
			setRequest((Long) newValue);
			return;
		case DeploymentPackage.COMPONENT__OPERATIONAL_COMPONENT_COST:
			setOperationalComponentCost((Double) newValue);
			return;
		case DeploymentPackage.COMPONENT__DEPLOYED_UNITS:
			setDeployedUnits((Integer) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case DeploymentPackage.COMPONENT__CONTAINS:
			getContains().clear();
			return;
		case DeploymentPackage.COMPONENT__PRICINGSCHEME:
			getPricingscheme().clear();
			return;
		case DeploymentPackage.COMPONENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case DeploymentPackage.COMPONENT__SERVICE_LEVEL:
			setServiceLevel(SERVICE_LEVEL_EDEFAULT);
			return;
		case DeploymentPackage.COMPONENT__SERVER_DURATION:
			setServerDuration(SERVER_DURATION_EDEFAULT);
			return;
		case DeploymentPackage.COMPONENT__SERVER_UNIT_TIME:
			setServerUnitTime(SERVER_UNIT_TIME_EDEFAULT);
			return;
		case DeploymentPackage.COMPONENT__DATA_IN:
			setDataIn(DATA_IN_EDEFAULT);
			return;
		case DeploymentPackage.COMPONENT__DATA_OUT:
			setDataOut(DATA_OUT_EDEFAULT);
			return;
		case DeploymentPackage.COMPONENT__STORAGE_CAPACITY:
			setStorageCapacity(STORAGE_CAPACITY_EDEFAULT);
			return;
		case DeploymentPackage.COMPONENT__REQUEST:
			setRequest(REQUEST_EDEFAULT);
			return;
		case DeploymentPackage.COMPONENT__OPERATIONAL_COMPONENT_COST:
			setOperationalComponentCost(OPERATIONAL_COMPONENT_COST_EDEFAULT);
			return;
		case DeploymentPackage.COMPONENT__DEPLOYED_UNITS:
			setDeployedUnits(DEPLOYED_UNITS_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case DeploymentPackage.COMPONENT__CONTAINS:
			return contains != null && !contains.isEmpty();
		case DeploymentPackage.COMPONENT__PRICINGSCHEME:
			return pricingscheme != null && !pricingscheme.isEmpty();
		case DeploymentPackage.COMPONENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case DeploymentPackage.COMPONENT__SERVICE_LEVEL:
			return serviceLevel != SERVICE_LEVEL_EDEFAULT;
		case DeploymentPackage.COMPONENT__SERVER_DURATION:
			return serverDuration != SERVER_DURATION_EDEFAULT;
		case DeploymentPackage.COMPONENT__SERVER_UNIT_TIME:
			return serverUnitTime != SERVER_UNIT_TIME_EDEFAULT;
		case DeploymentPackage.COMPONENT__DATA_IN:
			return dataIn != DATA_IN_EDEFAULT;
		case DeploymentPackage.COMPONENT__DATA_OUT:
			return dataOut != DATA_OUT_EDEFAULT;
		case DeploymentPackage.COMPONENT__STORAGE_CAPACITY:
			return storageCapacity != STORAGE_CAPACITY_EDEFAULT;
		case DeploymentPackage.COMPONENT__REQUEST:
			return request != REQUEST_EDEFAULT;
		case DeploymentPackage.COMPONENT__OPERATIONAL_COMPONENT_COST:
			return operationalComponentCost != OPERATIONAL_COMPONENT_COST_EDEFAULT;
		case DeploymentPackage.COMPONENT__DEPLOYED_UNITS:
			return deployedUnits != DEPLOYED_UNITS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", serviceLevel: ");
		result.append(serviceLevel);
		result.append(", serverDuration: ");
		result.append(serverDuration);
		result.append(", serverUnitTime: ");
		result.append(serverUnitTime);
		result.append(", dataIn: ");
		result.append(dataIn);
		result.append(", dataOut: ");
		result.append(dataOut);
		result.append(", storageCapacity: ");
		result.append(storageCapacity);
		result.append(", request: ");
		result.append(request);
		result.append(", operationalComponentCost: ");
		result.append(operationalComponentCost);
		result.append(", deployedUnits: ");
		result.append(deployedUnits);
		result.append(')');
		return result.toString();
	}

} //ComponentImpl
