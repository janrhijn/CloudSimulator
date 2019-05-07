/**
 */
package org.eclipse.sirius.deployment.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.sirius.deployment.ConsumptionMetrics2;
import org.eclipse.sirius.deployment.DeploymentPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Consumption Metrics2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.deployment.impl.ConsumptionMetrics2Impl#getServerTime <em>Server Time</em>}</li>
 *   <li>{@link org.eclipse.sirius.deployment.impl.ConsumptionMetrics2Impl#getServerUnitTime <em>Server Unit Time</em>}</li>
 *   <li>{@link org.eclipse.sirius.deployment.impl.ConsumptionMetrics2Impl#getDataIn <em>Data In</em>}</li>
 *   <li>{@link org.eclipse.sirius.deployment.impl.ConsumptionMetrics2Impl#getDataOut <em>Data Out</em>}</li>
 *   <li>{@link org.eclipse.sirius.deployment.impl.ConsumptionMetrics2Impl#getStorageCapacity <em>Storage Capacity</em>}</li>
 *   <li>{@link org.eclipse.sirius.deployment.impl.ConsumptionMetrics2Impl#getRequest <em>Request</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConsumptionMetrics2Impl extends MinimalEObjectImpl.Container implements ConsumptionMetrics2 {
	/**
	 * The default value of the '{@link #getServerTime() <em>Server Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerTime()
	 * @generated
	 * @ordered
	 */
	protected static final int SERVER_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getServerTime() <em>Server Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerTime()
	 * @generated
	 * @ordered
	 */
	protected int serverTime = SERVER_TIME_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsumptionMetrics2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeploymentPackage.Literals.CONSUMPTION_METRICS2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getServerTime() {
		return serverTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServerTime(int newServerTime) {
		int oldServerTime = serverTime;
		serverTime = newServerTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.CONSUMPTION_METRICS2__SERVER_TIME,
					oldServerTime, serverTime));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					DeploymentPackage.CONSUMPTION_METRICS2__SERVER_UNIT_TIME, oldServerUnitTime, serverUnitTime));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.CONSUMPTION_METRICS2__DATA_IN,
					oldDataIn, dataIn));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.CONSUMPTION_METRICS2__DATA_OUT,
					oldDataOut, dataOut));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					DeploymentPackage.CONSUMPTION_METRICS2__STORAGE_CAPACITY, oldStorageCapacity, storageCapacity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.CONSUMPTION_METRICS2__REQUEST,
					oldRequest, request));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DeploymentPackage.CONSUMPTION_METRICS2__SERVER_TIME:
			return getServerTime();
		case DeploymentPackage.CONSUMPTION_METRICS2__SERVER_UNIT_TIME:
			return getServerUnitTime();
		case DeploymentPackage.CONSUMPTION_METRICS2__DATA_IN:
			return getDataIn();
		case DeploymentPackage.CONSUMPTION_METRICS2__DATA_OUT:
			return getDataOut();
		case DeploymentPackage.CONSUMPTION_METRICS2__STORAGE_CAPACITY:
			return getStorageCapacity();
		case DeploymentPackage.CONSUMPTION_METRICS2__REQUEST:
			return getRequest();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DeploymentPackage.CONSUMPTION_METRICS2__SERVER_TIME:
			setServerTime((Integer) newValue);
			return;
		case DeploymentPackage.CONSUMPTION_METRICS2__SERVER_UNIT_TIME:
			setServerUnitTime((Long) newValue);
			return;
		case DeploymentPackage.CONSUMPTION_METRICS2__DATA_IN:
			setDataIn((Long) newValue);
			return;
		case DeploymentPackage.CONSUMPTION_METRICS2__DATA_OUT:
			setDataOut((Long) newValue);
			return;
		case DeploymentPackage.CONSUMPTION_METRICS2__STORAGE_CAPACITY:
			setStorageCapacity((Long) newValue);
			return;
		case DeploymentPackage.CONSUMPTION_METRICS2__REQUEST:
			setRequest((Long) newValue);
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
		case DeploymentPackage.CONSUMPTION_METRICS2__SERVER_TIME:
			setServerTime(SERVER_TIME_EDEFAULT);
			return;
		case DeploymentPackage.CONSUMPTION_METRICS2__SERVER_UNIT_TIME:
			setServerUnitTime(SERVER_UNIT_TIME_EDEFAULT);
			return;
		case DeploymentPackage.CONSUMPTION_METRICS2__DATA_IN:
			setDataIn(DATA_IN_EDEFAULT);
			return;
		case DeploymentPackage.CONSUMPTION_METRICS2__DATA_OUT:
			setDataOut(DATA_OUT_EDEFAULT);
			return;
		case DeploymentPackage.CONSUMPTION_METRICS2__STORAGE_CAPACITY:
			setStorageCapacity(STORAGE_CAPACITY_EDEFAULT);
			return;
		case DeploymentPackage.CONSUMPTION_METRICS2__REQUEST:
			setRequest(REQUEST_EDEFAULT);
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
		case DeploymentPackage.CONSUMPTION_METRICS2__SERVER_TIME:
			return serverTime != SERVER_TIME_EDEFAULT;
		case DeploymentPackage.CONSUMPTION_METRICS2__SERVER_UNIT_TIME:
			return serverUnitTime != SERVER_UNIT_TIME_EDEFAULT;
		case DeploymentPackage.CONSUMPTION_METRICS2__DATA_IN:
			return dataIn != DATA_IN_EDEFAULT;
		case DeploymentPackage.CONSUMPTION_METRICS2__DATA_OUT:
			return dataOut != DATA_OUT_EDEFAULT;
		case DeploymentPackage.CONSUMPTION_METRICS2__STORAGE_CAPACITY:
			return storageCapacity != STORAGE_CAPACITY_EDEFAULT;
		case DeploymentPackage.CONSUMPTION_METRICS2__REQUEST:
			return request != REQUEST_EDEFAULT;
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
		result.append(" (ServerTime: ");
		result.append(serverTime);
		result.append(", ServerUnitTime: ");
		result.append(serverUnitTime);
		result.append(", DataIn: ");
		result.append(dataIn);
		result.append(", DataOut: ");
		result.append(dataOut);
		result.append(", StorageCapacity: ");
		result.append(storageCapacity);
		result.append(", Request: ");
		result.append(request);
		result.append(')');
		return result.toString();
	}

} //ConsumptionMetrics2Impl
