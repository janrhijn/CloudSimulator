/**
 */
package org.eclipse.sirius.deployment.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.sirius.deployment.BillingType;
import org.eclipse.sirius.deployment.ConsumptionMetric;
import org.eclipse.sirius.deployment.DataType;
import org.eclipse.sirius.deployment.DeploymentPackage;
import org.eclipse.sirius.deployment.PricingFunction;
import org.eclipse.sirius.deployment.RequestType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pricing Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.deployment.impl.PricingFunctionImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link org.eclipse.sirius.deployment.impl.PricingFunctionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.sirius.deployment.impl.PricingFunctionImpl#getMetric <em>Metric</em>}</li>
 *   <li>{@link org.eclipse.sirius.deployment.impl.PricingFunctionImpl#getBillingType <em>Billing Type</em>}</li>
 *   <li>{@link org.eclipse.sirius.deployment.impl.PricingFunctionImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.eclipse.sirius.deployment.impl.PricingFunctionImpl#getRequestType <em>Request Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PricingFunctionImpl extends MinimalEObjectImpl.Container implements PricingFunction {
	/**
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final double PRICE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected double price = PRICE_EDEFAULT;

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
	 * The default value of the '{@link #getMetric() <em>Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetric()
	 * @generated
	 * @ordered
	 */
	protected static final ConsumptionMetric METRIC_EDEFAULT = ConsumptionMetric.SERVER_DURATION;

	/**
	 * The cached value of the '{@link #getMetric() <em>Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetric()
	 * @generated
	 * @ordered
	 */
	protected ConsumptionMetric metric = METRIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getBillingType() <em>Billing Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillingType()
	 * @generated
	 * @ordered
	 */
	protected static final BillingType BILLING_TYPE_EDEFAULT = BillingType.HOUR;

	/**
	 * The cached value of the '{@link #getBillingType() <em>Billing Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillingType()
	 * @generated
	 * @ordered
	 */
	protected BillingType billingType = BILLING_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected static final DataType DATA_TYPE_EDEFAULT = DataType.KILOBYTE;

	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected DataType dataType = DATA_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequestType() <em>Request Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestType()
	 * @generated
	 * @ordered
	 */
	protected static final RequestType REQUEST_TYPE_EDEFAULT = RequestType.MILLION;

	/**
	 * The cached value of the '{@link #getRequestType() <em>Request Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestType()
	 * @generated
	 * @ordered
	 */
	protected RequestType requestType = REQUEST_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PricingFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeploymentPackage.Literals.PRICING_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrice(double newPrice) {
		double oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.PRICING_FUNCTION__PRICE, oldPrice,
					price));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.PRICING_FUNCTION__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsumptionMetric getMetric() {
		return metric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMetric(ConsumptionMetric newMetric) {
		ConsumptionMetric oldMetric = metric;
		metric = newMetric == null ? METRIC_EDEFAULT : newMetric;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.PRICING_FUNCTION__METRIC, oldMetric,
					metric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BillingType getBillingType() {
		return billingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBillingType(BillingType newBillingType) {
		BillingType oldBillingType = billingType;
		billingType = newBillingType == null ? BILLING_TYPE_EDEFAULT : newBillingType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.PRICING_FUNCTION__BILLING_TYPE,
					oldBillingType, billingType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType getDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataType(DataType newDataType) {
		DataType oldDataType = dataType;
		dataType = newDataType == null ? DATA_TYPE_EDEFAULT : newDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.PRICING_FUNCTION__DATA_TYPE,
					oldDataType, dataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequestType getRequestType() {
		return requestType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequestType(RequestType newRequestType) {
		RequestType oldRequestType = requestType;
		requestType = newRequestType == null ? REQUEST_TYPE_EDEFAULT : newRequestType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.PRICING_FUNCTION__REQUEST_TYPE,
					oldRequestType, requestType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DeploymentPackage.PRICING_FUNCTION__PRICE:
			return getPrice();
		case DeploymentPackage.PRICING_FUNCTION__NAME:
			return getName();
		case DeploymentPackage.PRICING_FUNCTION__METRIC:
			return getMetric();
		case DeploymentPackage.PRICING_FUNCTION__BILLING_TYPE:
			return getBillingType();
		case DeploymentPackage.PRICING_FUNCTION__DATA_TYPE:
			return getDataType();
		case DeploymentPackage.PRICING_FUNCTION__REQUEST_TYPE:
			return getRequestType();
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
		case DeploymentPackage.PRICING_FUNCTION__PRICE:
			setPrice((Double) newValue);
			return;
		case DeploymentPackage.PRICING_FUNCTION__NAME:
			setName((String) newValue);
			return;
		case DeploymentPackage.PRICING_FUNCTION__METRIC:
			setMetric((ConsumptionMetric) newValue);
			return;
		case DeploymentPackage.PRICING_FUNCTION__BILLING_TYPE:
			setBillingType((BillingType) newValue);
			return;
		case DeploymentPackage.PRICING_FUNCTION__DATA_TYPE:
			setDataType((DataType) newValue);
			return;
		case DeploymentPackage.PRICING_FUNCTION__REQUEST_TYPE:
			setRequestType((RequestType) newValue);
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
		case DeploymentPackage.PRICING_FUNCTION__PRICE:
			setPrice(PRICE_EDEFAULT);
			return;
		case DeploymentPackage.PRICING_FUNCTION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case DeploymentPackage.PRICING_FUNCTION__METRIC:
			setMetric(METRIC_EDEFAULT);
			return;
		case DeploymentPackage.PRICING_FUNCTION__BILLING_TYPE:
			setBillingType(BILLING_TYPE_EDEFAULT);
			return;
		case DeploymentPackage.PRICING_FUNCTION__DATA_TYPE:
			setDataType(DATA_TYPE_EDEFAULT);
			return;
		case DeploymentPackage.PRICING_FUNCTION__REQUEST_TYPE:
			setRequestType(REQUEST_TYPE_EDEFAULT);
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
		case DeploymentPackage.PRICING_FUNCTION__PRICE:
			return price != PRICE_EDEFAULT;
		case DeploymentPackage.PRICING_FUNCTION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case DeploymentPackage.PRICING_FUNCTION__METRIC:
			return metric != METRIC_EDEFAULT;
		case DeploymentPackage.PRICING_FUNCTION__BILLING_TYPE:
			return billingType != BILLING_TYPE_EDEFAULT;
		case DeploymentPackage.PRICING_FUNCTION__DATA_TYPE:
			return dataType != DATA_TYPE_EDEFAULT;
		case DeploymentPackage.PRICING_FUNCTION__REQUEST_TYPE:
			return requestType != REQUEST_TYPE_EDEFAULT;
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
		result.append(" (price: ");
		result.append(price);
		result.append(", name: ");
		result.append(name);
		result.append(", metric: ");
		result.append(metric);
		result.append(", billingType: ");
		result.append(billingType);
		result.append(", dataType: ");
		result.append(dataType);
		result.append(", requestType: ");
		result.append(requestType);
		result.append(')');
		return result.toString();
	}

} //PricingFunctionImpl
