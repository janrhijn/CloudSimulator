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

import org.eclipse.sirius.deployment.DeploymentPackage;
import org.eclipse.sirius.deployment.Feature;
import org.eclipse.sirius.deployment.Instance;
import org.eclipse.sirius.deployment.PricingFunction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.deployment.impl.InstanceImpl#getContains <em>Contains</em>}</li>
 *   <li>{@link org.eclipse.sirius.deployment.impl.InstanceImpl#getPricingscheme <em>Pricingscheme</em>}</li>
 *   <li>{@link org.eclipse.sirius.deployment.impl.InstanceImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstanceImpl extends MinimalEObjectImpl.Container implements Instance {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeploymentPackage.Literals.INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Feature> getContains() {
		if (contains == null) {
			contains = new EObjectContainmentEList<Feature>(Feature.class, this, DeploymentPackage.INSTANCE__CONTAINS);
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
					DeploymentPackage.INSTANCE__PRICINGSCHEME);
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
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.INSTANCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DeploymentPackage.INSTANCE__CONTAINS:
			return ((InternalEList<?>) getContains()).basicRemove(otherEnd, msgs);
		case DeploymentPackage.INSTANCE__PRICINGSCHEME:
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
		case DeploymentPackage.INSTANCE__CONTAINS:
			return getContains();
		case DeploymentPackage.INSTANCE__PRICINGSCHEME:
			return getPricingscheme();
		case DeploymentPackage.INSTANCE__NAME:
			return getName();
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
		case DeploymentPackage.INSTANCE__CONTAINS:
			getContains().clear();
			getContains().addAll((Collection<? extends Feature>) newValue);
			return;
		case DeploymentPackage.INSTANCE__PRICINGSCHEME:
			getPricingscheme().clear();
			getPricingscheme().addAll((Collection<? extends PricingFunction>) newValue);
			return;
		case DeploymentPackage.INSTANCE__NAME:
			setName((String) newValue);
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
		case DeploymentPackage.INSTANCE__CONTAINS:
			getContains().clear();
			return;
		case DeploymentPackage.INSTANCE__PRICINGSCHEME:
			getPricingscheme().clear();
			return;
		case DeploymentPackage.INSTANCE__NAME:
			setName(NAME_EDEFAULT);
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
		case DeploymentPackage.INSTANCE__CONTAINS:
			return contains != null && !contains.isEmpty();
		case DeploymentPackage.INSTANCE__PRICINGSCHEME:
			return pricingscheme != null && !pricingscheme.isEmpty();
		case DeploymentPackage.INSTANCE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(')');
		return result.toString();
	}

} //InstanceImpl
