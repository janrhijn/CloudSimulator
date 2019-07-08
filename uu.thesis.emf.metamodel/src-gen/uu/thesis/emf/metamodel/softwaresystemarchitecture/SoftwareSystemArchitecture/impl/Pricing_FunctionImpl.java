/**
 */
package uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Billing_Type;
import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Consumption_Metric;
import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Data_Type;
import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Duration_Type;
import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Pricing_Function;
import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Request_Type;
import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.SoftwareSystemArchitecturePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pricing Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.impl.Pricing_FunctionImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.impl.Pricing_FunctionImpl#getConsumption_metric <em>Consumption metric</em>}</li>
 *   <li>{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.impl.Pricing_FunctionImpl#getDuration_type <em>Duration type</em>}</li>
 *   <li>{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.impl.Pricing_FunctionImpl#getData_type <em>Data type</em>}</li>
 *   <li>{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.impl.Pricing_FunctionImpl#getRequest_type <em>Request type</em>}</li>
 *   <li>{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.impl.Pricing_FunctionImpl#getBilling_type <em>Billing type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Pricing_FunctionImpl extends CapabilityImpl implements Pricing_Function {
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
	 * The default value of the '{@link #getConsumption_metric() <em>Consumption metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumption_metric()
	 * @generated
	 * @ordered
	 */
	protected static final Consumption_Metric CONSUMPTION_METRIC_EDEFAULT = Consumption_Metric.SERVER_DURATION;

	/**
	 * The cached value of the '{@link #getConsumption_metric() <em>Consumption metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumption_metric()
	 * @generated
	 * @ordered
	 */
	protected Consumption_Metric consumption_metric = CONSUMPTION_METRIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration_type() <em>Duration type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration_type()
	 * @generated
	 * @ordered
	 */
	protected static final Duration_Type DURATION_TYPE_EDEFAULT = Duration_Type.NONE;

	/**
	 * The cached value of the '{@link #getDuration_type() <em>Duration type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration_type()
	 * @generated
	 * @ordered
	 */
	protected Duration_Type duration_type = DURATION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getData_type() <em>Data type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData_type()
	 * @generated
	 * @ordered
	 */
	protected static final Data_Type DATA_TYPE_EDEFAULT = Data_Type.NONE;

	/**
	 * The cached value of the '{@link #getData_type() <em>Data type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData_type()
	 * @generated
	 * @ordered
	 */
	protected Data_Type data_type = DATA_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequest_type() <em>Request type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequest_type()
	 * @generated
	 * @ordered
	 */
	protected static final Request_Type REQUEST_TYPE_EDEFAULT = Request_Type.NONE;

	/**
	 * The cached value of the '{@link #getRequest_type() <em>Request type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequest_type()
	 * @generated
	 * @ordered
	 */
	protected Request_Type request_type = REQUEST_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBilling_type() <em>Billing type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBilling_type()
	 * @generated
	 * @ordered
	 */
	protected static final Billing_Type BILLING_TYPE_EDEFAULT = Billing_Type.SECOND;

	/**
	 * The cached value of the '{@link #getBilling_type() <em>Billing type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBilling_type()
	 * @generated
	 * @ordered
	 */
	protected Billing_Type billing_type = BILLING_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Pricing_FunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoftwareSystemArchitecturePackage.Literals.PRICING_FUNCTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					SoftwareSystemArchitecturePackage.PRICING_FUNCTION__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Consumption_Metric getConsumption_metric() {
		return consumption_metric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConsumption_metric(Consumption_Metric newConsumption_metric) {
		Consumption_Metric oldConsumption_metric = consumption_metric;
		consumption_metric = newConsumption_metric == null ? CONSUMPTION_METRIC_EDEFAULT : newConsumption_metric;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SoftwareSystemArchitecturePackage.PRICING_FUNCTION__CONSUMPTION_METRIC, oldConsumption_metric,
					consumption_metric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Duration_Type getDuration_type() {
		return duration_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDuration_type(Duration_Type newDuration_type) {
		Duration_Type oldDuration_type = duration_type;
		duration_type = newDuration_type == null ? DURATION_TYPE_EDEFAULT : newDuration_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SoftwareSystemArchitecturePackage.PRICING_FUNCTION__DURATION_TYPE, oldDuration_type,
					duration_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Data_Type getData_type() {
		return data_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setData_type(Data_Type newData_type) {
		Data_Type oldData_type = data_type;
		data_type = newData_type == null ? DATA_TYPE_EDEFAULT : newData_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SoftwareSystemArchitecturePackage.PRICING_FUNCTION__DATA_TYPE, oldData_type, data_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Request_Type getRequest_type() {
		return request_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequest_type(Request_Type newRequest_type) {
		Request_Type oldRequest_type = request_type;
		request_type = newRequest_type == null ? REQUEST_TYPE_EDEFAULT : newRequest_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SoftwareSystemArchitecturePackage.PRICING_FUNCTION__REQUEST_TYPE, oldRequest_type, request_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Billing_Type getBilling_type() {
		return billing_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBilling_type(Billing_Type newBilling_type) {
		Billing_Type oldBilling_type = billing_type;
		billing_type = newBilling_type == null ? BILLING_TYPE_EDEFAULT : newBilling_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SoftwareSystemArchitecturePackage.PRICING_FUNCTION__BILLING_TYPE, oldBilling_type, billing_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SoftwareSystemArchitecturePackage.PRICING_FUNCTION__PRICE:
			return getPrice();
		case SoftwareSystemArchitecturePackage.PRICING_FUNCTION__CONSUMPTION_METRIC:
			return getConsumption_metric();
		case SoftwareSystemArchitecturePackage.PRICING_FUNCTION__DURATION_TYPE:
			return getDuration_type();
		case SoftwareSystemArchitecturePackage.PRICING_FUNCTION__DATA_TYPE:
			return getData_type();
		case SoftwareSystemArchitecturePackage.PRICING_FUNCTION__REQUEST_TYPE:
			return getRequest_type();
		case SoftwareSystemArchitecturePackage.PRICING_FUNCTION__BILLING_TYPE:
			return getBilling_type();
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
		case SoftwareSystemArchitecturePackage.PRICING_FUNCTION__PRICE:
			setPrice((Double) newValue);
			return;
		case SoftwareSystemArchitecturePackage.PRICING_FUNCTION__CONSUMPTION_METRIC:
			setConsumption_metric((Consumption_Metric) newValue);
			return;
		case SoftwareSystemArchitecturePackage.PRICING_FUNCTION__DURATION_TYPE:
			setDuration_type((Duration_Type) newValue);
			return;
		case SoftwareSystemArchitecturePackage.PRICING_FUNCTION__DATA_TYPE:
			setData_type((Data_Type) newValue);
			return;
		case SoftwareSystemArchitecturePackage.PRICING_FUNCTION__REQUEST_TYPE:
			setRequest_type((Request_Type) newValue);
			return;
		case SoftwareSystemArchitecturePackage.PRICING_FUNCTION__BILLING_TYPE:
			setBilling_type((Billing_Type) newValue);
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
		case SoftwareSystemArchitecturePackage.PRICING_FUNCTION__PRICE:
			setPrice(PRICE_EDEFAULT);
			return;
		case SoftwareSystemArchitecturePackage.PRICING_FUNCTION__CONSUMPTION_METRIC:
			setConsumption_metric(CONSUMPTION_METRIC_EDEFAULT);
			return;
		case SoftwareSystemArchitecturePackage.PRICING_FUNCTION__DURATION_TYPE:
			setDuration_type(DURATION_TYPE_EDEFAULT);
			return;
		case SoftwareSystemArchitecturePackage.PRICING_FUNCTION__DATA_TYPE:
			setData_type(DATA_TYPE_EDEFAULT);
			return;
		case SoftwareSystemArchitecturePackage.PRICING_FUNCTION__REQUEST_TYPE:
			setRequest_type(REQUEST_TYPE_EDEFAULT);
			return;
		case SoftwareSystemArchitecturePackage.PRICING_FUNCTION__BILLING_TYPE:
			setBilling_type(BILLING_TYPE_EDEFAULT);
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
		case SoftwareSystemArchitecturePackage.PRICING_FUNCTION__PRICE:
			return price != PRICE_EDEFAULT;
		case SoftwareSystemArchitecturePackage.PRICING_FUNCTION__CONSUMPTION_METRIC:
			return consumption_metric != CONSUMPTION_METRIC_EDEFAULT;
		case SoftwareSystemArchitecturePackage.PRICING_FUNCTION__DURATION_TYPE:
			return duration_type != DURATION_TYPE_EDEFAULT;
		case SoftwareSystemArchitecturePackage.PRICING_FUNCTION__DATA_TYPE:
			return data_type != DATA_TYPE_EDEFAULT;
		case SoftwareSystemArchitecturePackage.PRICING_FUNCTION__REQUEST_TYPE:
			return request_type != REQUEST_TYPE_EDEFAULT;
		case SoftwareSystemArchitecturePackage.PRICING_FUNCTION__BILLING_TYPE:
			return billing_type != BILLING_TYPE_EDEFAULT;
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
		result.append(", consumption_metric: ");
		result.append(consumption_metric);
		result.append(", duration_type: ");
		result.append(duration_type);
		result.append(", data_type: ");
		result.append(data_type);
		result.append(", request_type: ");
		result.append(request_type);
		result.append(", billing_type: ");
		result.append(billing_type);
		result.append(')');
		return result.toString();
	}

} //Pricing_FunctionImpl
