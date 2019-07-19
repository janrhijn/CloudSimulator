/**
 */
package uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Capability;
import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Component;
import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Feature;
import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Pricing_Function;
import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.SoftwareSystemArchitecturePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.impl.ComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.impl.ComponentImpl#getContains <em>Contains</em>}</li>
 *   <li>{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.impl.ComponentImpl#isPart_of_vpc <em>Part of vpc</em>}</li>
 *   <li>{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.impl.ComponentImpl#getServer_duration <em>Server duration</em>}</li>
 *   <li>{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.impl.ComponentImpl#getServer_unit <em>Server unit</em>}</li>
 *   <li>{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.impl.ComponentImpl#getData_in <em>Data in</em>}</li>
 *   <li>{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.impl.ComponentImpl#getData_out <em>Data out</em>}</li>
 *   <li>{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.impl.ComponentImpl#getStorage_capacity <em>Storage capacity</em>}</li>
 *   <li>{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.impl.ComponentImpl#getRequest <em>Request</em>}</li>
 *   <li>{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.impl.ComponentImpl#getOperational_component_cost <em>Operational component cost</em>}</li>
 *   <li>{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.impl.ComponentImpl#getMax_waiting_time <em>Max waiting time</em>}</li>
 *   <li>{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.impl.ComponentImpl#getData_processed <em>Data processed</em>}</li>
 *   <li>{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.impl.ComponentImpl#getCapability <em>Capability</em>}</li>
 *   <li>{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.impl.ComponentImpl#getPricing_scheme <em>Pricing scheme</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImpl extends MinimalEObjectImpl.Container implements Component {
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
	 * The cached value of the '{@link #getContains() <em>Contains</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContains()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> contains;

	/**
	 * The default value of the '{@link #isPart_of_vpc() <em>Part of vpc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPart_of_vpc()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PART_OF_VPC_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isPart_of_vpc() <em>Part of vpc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPart_of_vpc()
	 * @generated
	 * @ordered
	 */
	protected boolean part_of_vpc = PART_OF_VPC_EDEFAULT;

	/**
	 * The default value of the '{@link #getServer_duration() <em>Server duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServer_duration()
	 * @generated
	 * @ordered
	 */
	protected static final int SERVER_DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getServer_duration() <em>Server duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServer_duration()
	 * @generated
	 * @ordered
	 */
	protected int server_duration = SERVER_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getServer_unit() <em>Server unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServer_unit()
	 * @generated
	 * @ordered
	 */
	protected static final int SERVER_UNIT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getServer_unit() <em>Server unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServer_unit()
	 * @generated
	 * @ordered
	 */
	protected int server_unit = SERVER_UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getData_in() <em>Data in</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData_in()
	 * @generated
	 * @ordered
	 */
	protected static final long DATA_IN_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getData_in() <em>Data in</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData_in()
	 * @generated
	 * @ordered
	 */
	protected long data_in = DATA_IN_EDEFAULT;

	/**
	 * The default value of the '{@link #getData_out() <em>Data out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData_out()
	 * @generated
	 * @ordered
	 */
	protected static final long DATA_OUT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getData_out() <em>Data out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData_out()
	 * @generated
	 * @ordered
	 */
	protected long data_out = DATA_OUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getStorage_capacity() <em>Storage capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorage_capacity()
	 * @generated
	 * @ordered
	 */
	protected static final long STORAGE_CAPACITY_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getStorage_capacity() <em>Storage capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorage_capacity()
	 * @generated
	 * @ordered
	 */
	protected long storage_capacity = STORAGE_CAPACITY_EDEFAULT;

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
	 * The default value of the '{@link #getOperational_component_cost() <em>Operational component cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperational_component_cost()
	 * @generated
	 * @ordered
	 */
	protected static final double OPERATIONAL_COMPONENT_COST_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getOperational_component_cost() <em>Operational component cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperational_component_cost()
	 * @generated
	 * @ordered
	 */
	protected double operational_component_cost = OPERATIONAL_COMPONENT_COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getMax_waiting_time() <em>Max waiting time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_waiting_time()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_WAITING_TIME_EDEFAULT = 100;

	/**
	 * The cached value of the '{@link #getMax_waiting_time() <em>Max waiting time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_waiting_time()
	 * @generated
	 * @ordered
	 */
	protected int max_waiting_time = MAX_WAITING_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getData_processed() <em>Data processed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData_processed()
	 * @generated
	 * @ordered
	 */
	protected static final long DATA_PROCESSED_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getData_processed() <em>Data processed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData_processed()
	 * @generated
	 * @ordered
	 */
	protected long data_processed = DATA_PROCESSED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCapability() <em>Capability</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapability()
	 * @generated
	 * @ordered
	 */
	protected EList<Capability> capability;

	/**
	 * The cached value of the '{@link #getPricing_scheme() <em>Pricing scheme</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPricing_scheme()
	 * @generated
	 * @ordered
	 */
	protected EList<Pricing_Function> pricing_scheme;

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
		return SoftwareSystemArchitecturePackage.Literals.COMPONENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwareSystemArchitecturePackage.COMPONENT__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Feature> getContains() {
		if (contains == null) {
			contains = new EObjectResolvingEList<Feature>(Feature.class, this,
					SoftwareSystemArchitecturePackage.COMPONENT__CONTAINS);
		}
		return contains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPart_of_vpc() {
		return part_of_vpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPart_of_vpc(boolean newPart_of_vpc) {
		boolean oldPart_of_vpc = part_of_vpc;
		part_of_vpc = newPart_of_vpc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SoftwareSystemArchitecturePackage.COMPONENT__PART_OF_VPC, oldPart_of_vpc, part_of_vpc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getServer_duration() {
		return server_duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServer_duration(int newServer_duration) {
		int oldServer_duration = server_duration;
		server_duration = newServer_duration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SoftwareSystemArchitecturePackage.COMPONENT__SERVER_DURATION, oldServer_duration, server_duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getServer_unit() {
		return server_unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServer_unit(int newServer_unit) {
		int oldServer_unit = server_unit;
		server_unit = newServer_unit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SoftwareSystemArchitecturePackage.COMPONENT__SERVER_UNIT, oldServer_unit, server_unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getData_in() {
		return data_in;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setData_in(long newData_in) {
		long oldData_in = data_in;
		data_in = newData_in;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwareSystemArchitecturePackage.COMPONENT__DATA_IN,
					oldData_in, data_in));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getData_out() {
		return data_out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setData_out(long newData_out) {
		long oldData_out = data_out;
		data_out = newData_out;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwareSystemArchitecturePackage.COMPONENT__DATA_OUT,
					oldData_out, data_out));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getStorage_capacity() {
		return storage_capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStorage_capacity(long newStorage_capacity) {
		long oldStorage_capacity = storage_capacity;
		storage_capacity = newStorage_capacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SoftwareSystemArchitecturePackage.COMPONENT__STORAGE_CAPACITY, oldStorage_capacity,
					storage_capacity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwareSystemArchitecturePackage.COMPONENT__REQUEST,
					oldRequest, request));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getOperational_component_cost() {
		return operational_component_cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperational_component_cost(double newOperational_component_cost) {
		double oldOperational_component_cost = operational_component_cost;
		operational_component_cost = newOperational_component_cost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SoftwareSystemArchitecturePackage.COMPONENT__OPERATIONAL_COMPONENT_COST,
					oldOperational_component_cost, operational_component_cost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMax_waiting_time() {
		return max_waiting_time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMax_waiting_time(int newMax_waiting_time) {
		int oldMax_waiting_time = max_waiting_time;
		max_waiting_time = newMax_waiting_time;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SoftwareSystemArchitecturePackage.COMPONENT__MAX_WAITING_TIME, oldMax_waiting_time,
					max_waiting_time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getData_processed() {
		return data_processed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setData_processed(long newData_processed) {
		long oldData_processed = data_processed;
		data_processed = newData_processed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SoftwareSystemArchitecturePackage.COMPONENT__DATA_PROCESSED, oldData_processed, data_processed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Capability> getCapability() {
		if (capability == null) {
			capability = new EObjectContainmentEList<Capability>(Capability.class, this,
					SoftwareSystemArchitecturePackage.COMPONENT__CAPABILITY);
		}
		return capability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Pricing_Function> getPricing_scheme() {
		if (pricing_scheme == null) {
			pricing_scheme = new EObjectContainmentEList<Pricing_Function>(Pricing_Function.class, this,
					SoftwareSystemArchitecturePackage.COMPONENT__PRICING_SCHEME);
		}
		return pricing_scheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SoftwareSystemArchitecturePackage.COMPONENT__CAPABILITY:
			return ((InternalEList<?>) getCapability()).basicRemove(otherEnd, msgs);
		case SoftwareSystemArchitecturePackage.COMPONENT__PRICING_SCHEME:
			return ((InternalEList<?>) getPricing_scheme()).basicRemove(otherEnd, msgs);
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
		case SoftwareSystemArchitecturePackage.COMPONENT__NAME:
			return getName();
		case SoftwareSystemArchitecturePackage.COMPONENT__CONTAINS:
			return getContains();
		case SoftwareSystemArchitecturePackage.COMPONENT__PART_OF_VPC:
			return isPart_of_vpc();
		case SoftwareSystemArchitecturePackage.COMPONENT__SERVER_DURATION:
			return getServer_duration();
		case SoftwareSystemArchitecturePackage.COMPONENT__SERVER_UNIT:
			return getServer_unit();
		case SoftwareSystemArchitecturePackage.COMPONENT__DATA_IN:
			return getData_in();
		case SoftwareSystemArchitecturePackage.COMPONENT__DATA_OUT:
			return getData_out();
		case SoftwareSystemArchitecturePackage.COMPONENT__STORAGE_CAPACITY:
			return getStorage_capacity();
		case SoftwareSystemArchitecturePackage.COMPONENT__REQUEST:
			return getRequest();
		case SoftwareSystemArchitecturePackage.COMPONENT__OPERATIONAL_COMPONENT_COST:
			return getOperational_component_cost();
		case SoftwareSystemArchitecturePackage.COMPONENT__MAX_WAITING_TIME:
			return getMax_waiting_time();
		case SoftwareSystemArchitecturePackage.COMPONENT__DATA_PROCESSED:
			return getData_processed();
		case SoftwareSystemArchitecturePackage.COMPONENT__CAPABILITY:
			return getCapability();
		case SoftwareSystemArchitecturePackage.COMPONENT__PRICING_SCHEME:
			return getPricing_scheme();
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
		case SoftwareSystemArchitecturePackage.COMPONENT__NAME:
			setName((String) newValue);
			return;
		case SoftwareSystemArchitecturePackage.COMPONENT__CONTAINS:
			getContains().clear();
			getContains().addAll((Collection<? extends Feature>) newValue);
			return;
		case SoftwareSystemArchitecturePackage.COMPONENT__PART_OF_VPC:
			setPart_of_vpc((Boolean) newValue);
			return;
		case SoftwareSystemArchitecturePackage.COMPONENT__SERVER_DURATION:
			setServer_duration((Integer) newValue);
			return;
		case SoftwareSystemArchitecturePackage.COMPONENT__SERVER_UNIT:
			setServer_unit((Integer) newValue);
			return;
		case SoftwareSystemArchitecturePackage.COMPONENT__DATA_IN:
			setData_in((Long) newValue);
			return;
		case SoftwareSystemArchitecturePackage.COMPONENT__DATA_OUT:
			setData_out((Long) newValue);
			return;
		case SoftwareSystemArchitecturePackage.COMPONENT__STORAGE_CAPACITY:
			setStorage_capacity((Long) newValue);
			return;
		case SoftwareSystemArchitecturePackage.COMPONENT__REQUEST:
			setRequest((Long) newValue);
			return;
		case SoftwareSystemArchitecturePackage.COMPONENT__OPERATIONAL_COMPONENT_COST:
			setOperational_component_cost((Double) newValue);
			return;
		case SoftwareSystemArchitecturePackage.COMPONENT__MAX_WAITING_TIME:
			setMax_waiting_time((Integer) newValue);
			return;
		case SoftwareSystemArchitecturePackage.COMPONENT__DATA_PROCESSED:
			setData_processed((Long) newValue);
			return;
		case SoftwareSystemArchitecturePackage.COMPONENT__CAPABILITY:
			getCapability().clear();
			getCapability().addAll((Collection<? extends Capability>) newValue);
			return;
		case SoftwareSystemArchitecturePackage.COMPONENT__PRICING_SCHEME:
			getPricing_scheme().clear();
			getPricing_scheme().addAll((Collection<? extends Pricing_Function>) newValue);
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
		case SoftwareSystemArchitecturePackage.COMPONENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case SoftwareSystemArchitecturePackage.COMPONENT__CONTAINS:
			getContains().clear();
			return;
		case SoftwareSystemArchitecturePackage.COMPONENT__PART_OF_VPC:
			setPart_of_vpc(PART_OF_VPC_EDEFAULT);
			return;
		case SoftwareSystemArchitecturePackage.COMPONENT__SERVER_DURATION:
			setServer_duration(SERVER_DURATION_EDEFAULT);
			return;
		case SoftwareSystemArchitecturePackage.COMPONENT__SERVER_UNIT:
			setServer_unit(SERVER_UNIT_EDEFAULT);
			return;
		case SoftwareSystemArchitecturePackage.COMPONENT__DATA_IN:
			setData_in(DATA_IN_EDEFAULT);
			return;
		case SoftwareSystemArchitecturePackage.COMPONENT__DATA_OUT:
			setData_out(DATA_OUT_EDEFAULT);
			return;
		case SoftwareSystemArchitecturePackage.COMPONENT__STORAGE_CAPACITY:
			setStorage_capacity(STORAGE_CAPACITY_EDEFAULT);
			return;
		case SoftwareSystemArchitecturePackage.COMPONENT__REQUEST:
			setRequest(REQUEST_EDEFAULT);
			return;
		case SoftwareSystemArchitecturePackage.COMPONENT__OPERATIONAL_COMPONENT_COST:
			setOperational_component_cost(OPERATIONAL_COMPONENT_COST_EDEFAULT);
			return;
		case SoftwareSystemArchitecturePackage.COMPONENT__MAX_WAITING_TIME:
			setMax_waiting_time(MAX_WAITING_TIME_EDEFAULT);
			return;
		case SoftwareSystemArchitecturePackage.COMPONENT__DATA_PROCESSED:
			setData_processed(DATA_PROCESSED_EDEFAULT);
			return;
		case SoftwareSystemArchitecturePackage.COMPONENT__CAPABILITY:
			getCapability().clear();
			return;
		case SoftwareSystemArchitecturePackage.COMPONENT__PRICING_SCHEME:
			getPricing_scheme().clear();
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
		case SoftwareSystemArchitecturePackage.COMPONENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case SoftwareSystemArchitecturePackage.COMPONENT__CONTAINS:
			return contains != null && !contains.isEmpty();
		case SoftwareSystemArchitecturePackage.COMPONENT__PART_OF_VPC:
			return part_of_vpc != PART_OF_VPC_EDEFAULT;
		case SoftwareSystemArchitecturePackage.COMPONENT__SERVER_DURATION:
			return server_duration != SERVER_DURATION_EDEFAULT;
		case SoftwareSystemArchitecturePackage.COMPONENT__SERVER_UNIT:
			return server_unit != SERVER_UNIT_EDEFAULT;
		case SoftwareSystemArchitecturePackage.COMPONENT__DATA_IN:
			return data_in != DATA_IN_EDEFAULT;
		case SoftwareSystemArchitecturePackage.COMPONENT__DATA_OUT:
			return data_out != DATA_OUT_EDEFAULT;
		case SoftwareSystemArchitecturePackage.COMPONENT__STORAGE_CAPACITY:
			return storage_capacity != STORAGE_CAPACITY_EDEFAULT;
		case SoftwareSystemArchitecturePackage.COMPONENT__REQUEST:
			return request != REQUEST_EDEFAULT;
		case SoftwareSystemArchitecturePackage.COMPONENT__OPERATIONAL_COMPONENT_COST:
			return operational_component_cost != OPERATIONAL_COMPONENT_COST_EDEFAULT;
		case SoftwareSystemArchitecturePackage.COMPONENT__MAX_WAITING_TIME:
			return max_waiting_time != MAX_WAITING_TIME_EDEFAULT;
		case SoftwareSystemArchitecturePackage.COMPONENT__DATA_PROCESSED:
			return data_processed != DATA_PROCESSED_EDEFAULT;
		case SoftwareSystemArchitecturePackage.COMPONENT__CAPABILITY:
			return capability != null && !capability.isEmpty();
		case SoftwareSystemArchitecturePackage.COMPONENT__PRICING_SCHEME:
			return pricing_scheme != null && !pricing_scheme.isEmpty();
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
		result.append(", part_of_vpc: ");
		result.append(part_of_vpc);
		result.append(", server_duration: ");
		result.append(server_duration);
		result.append(", server_unit: ");
		result.append(server_unit);
		result.append(", data_in: ");
		result.append(data_in);
		result.append(", data_out: ");
		result.append(data_out);
		result.append(", storage_capacity: ");
		result.append(storage_capacity);
		result.append(", request: ");
		result.append(request);
		result.append(", operational_component_cost: ");
		result.append(operational_component_cost);
		result.append(", max_waiting_time: ");
		result.append(max_waiting_time);
		result.append(", data_processed: ");
		result.append(data_processed);
		result.append(')');
		return result.toString();
	}

} //ComponentImpl
