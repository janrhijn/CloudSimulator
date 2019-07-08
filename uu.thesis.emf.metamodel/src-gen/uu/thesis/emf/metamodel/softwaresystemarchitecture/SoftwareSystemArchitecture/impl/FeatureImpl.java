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
import org.eclipse.emf.ecore.util.InternalEList;

import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Feature;
import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Feature_Type;
import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Informationflow;
import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.SoftwareSystemArchitecturePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.impl.FeatureImpl#getName <em>Name</em>}</li>
 *   <li>{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.impl.FeatureImpl#getFlow <em>Flow</em>}</li>
 *   <li>{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.impl.FeatureImpl#getFeature_type <em>Feature type</em>}</li>
 *   <li>{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.impl.FeatureImpl#getServicerate <em>Servicerate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureImpl extends MinimalEObjectImpl.Container implements Feature {
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
	 * The cached value of the '{@link #getFlow() <em>Flow</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlow()
	 * @generated
	 * @ordered
	 */
	protected EList<Informationflow> flow;

	/**
	 * The default value of the '{@link #getFeature_type() <em>Feature type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature_type()
	 * @generated
	 * @ordered
	 */
	protected static final Feature_Type FEATURE_TYPE_EDEFAULT = Feature_Type.CONNECTOR;

	/**
	 * The cached value of the '{@link #getFeature_type() <em>Feature type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature_type()
	 * @generated
	 * @ordered
	 */
	protected Feature_Type feature_type = FEATURE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getServicerate() <em>Servicerate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicerate()
	 * @generated
	 * @ordered
	 */
	protected static final double SERVICERATE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getServicerate() <em>Servicerate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicerate()
	 * @generated
	 * @ordered
	 */
	protected double servicerate = SERVICERATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoftwareSystemArchitecturePackage.Literals.FEATURE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwareSystemArchitecturePackage.FEATURE__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Informationflow> getFlow() {
		if (flow == null) {
			flow = new EObjectContainmentEList<Informationflow>(Informationflow.class, this,
					SoftwareSystemArchitecturePackage.FEATURE__FLOW);
		}
		return flow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature_Type getFeature_type() {
		return feature_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFeature_type(Feature_Type newFeature_type) {
		Feature_Type oldFeature_type = feature_type;
		feature_type = newFeature_type == null ? FEATURE_TYPE_EDEFAULT : newFeature_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SoftwareSystemArchitecturePackage.FEATURE__FEATURE_TYPE, oldFeature_type, feature_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getServicerate() {
		return servicerate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServicerate(double newServicerate) {
		double oldServicerate = servicerate;
		servicerate = newServicerate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SoftwareSystemArchitecturePackage.FEATURE__SERVICERATE, oldServicerate, servicerate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SoftwareSystemArchitecturePackage.FEATURE__FLOW:
			return ((InternalEList<?>) getFlow()).basicRemove(otherEnd, msgs);
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
		case SoftwareSystemArchitecturePackage.FEATURE__NAME:
			return getName();
		case SoftwareSystemArchitecturePackage.FEATURE__FLOW:
			return getFlow();
		case SoftwareSystemArchitecturePackage.FEATURE__FEATURE_TYPE:
			return getFeature_type();
		case SoftwareSystemArchitecturePackage.FEATURE__SERVICERATE:
			return getServicerate();
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
		case SoftwareSystemArchitecturePackage.FEATURE__NAME:
			setName((String) newValue);
			return;
		case SoftwareSystemArchitecturePackage.FEATURE__FLOW:
			getFlow().clear();
			getFlow().addAll((Collection<? extends Informationflow>) newValue);
			return;
		case SoftwareSystemArchitecturePackage.FEATURE__FEATURE_TYPE:
			setFeature_type((Feature_Type) newValue);
			return;
		case SoftwareSystemArchitecturePackage.FEATURE__SERVICERATE:
			setServicerate((Double) newValue);
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
		case SoftwareSystemArchitecturePackage.FEATURE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case SoftwareSystemArchitecturePackage.FEATURE__FLOW:
			getFlow().clear();
			return;
		case SoftwareSystemArchitecturePackage.FEATURE__FEATURE_TYPE:
			setFeature_type(FEATURE_TYPE_EDEFAULT);
			return;
		case SoftwareSystemArchitecturePackage.FEATURE__SERVICERATE:
			setServicerate(SERVICERATE_EDEFAULT);
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
		case SoftwareSystemArchitecturePackage.FEATURE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case SoftwareSystemArchitecturePackage.FEATURE__FLOW:
			return flow != null && !flow.isEmpty();
		case SoftwareSystemArchitecturePackage.FEATURE__FEATURE_TYPE:
			return feature_type != FEATURE_TYPE_EDEFAULT;
		case SoftwareSystemArchitecturePackage.FEATURE__SERVICERATE:
			return servicerate != SERVICERATE_EDEFAULT;
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
		result.append(", feature_type: ");
		result.append(feature_type);
		result.append(", servicerate: ");
		result.append(servicerate);
		result.append(')');
		return result.toString();
	}

} //FeatureImpl
