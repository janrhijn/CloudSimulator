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

import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.SoftwareSystemArchitecturePackage;
import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Software_System;
import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Viewpoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Software System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.impl.Software_SystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.impl.Software_SystemImpl#getViewpoint <em>Viewpoint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Software_SystemImpl extends MinimalEObjectImpl.Container implements Software_System {
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
	 * The cached value of the '{@link #getViewpoint() <em>Viewpoint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewpoint()
	 * @generated
	 * @ordered
	 */
	protected EList<Viewpoint> viewpoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Software_SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoftwareSystemArchitecturePackage.Literals.SOFTWARE_SYSTEM;
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					SoftwareSystemArchitecturePackage.SOFTWARE_SYSTEM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Viewpoint> getViewpoint() {
		if (viewpoint == null) {
			viewpoint = new EObjectContainmentEList<Viewpoint>(Viewpoint.class, this,
					SoftwareSystemArchitecturePackage.SOFTWARE_SYSTEM__VIEWPOINT);
		}
		return viewpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SoftwareSystemArchitecturePackage.SOFTWARE_SYSTEM__VIEWPOINT:
			return ((InternalEList<?>) getViewpoint()).basicRemove(otherEnd, msgs);
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
		case SoftwareSystemArchitecturePackage.SOFTWARE_SYSTEM__NAME:
			return getName();
		case SoftwareSystemArchitecturePackage.SOFTWARE_SYSTEM__VIEWPOINT:
			return getViewpoint();
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
		case SoftwareSystemArchitecturePackage.SOFTWARE_SYSTEM__NAME:
			setName((String) newValue);
			return;
		case SoftwareSystemArchitecturePackage.SOFTWARE_SYSTEM__VIEWPOINT:
			getViewpoint().clear();
			getViewpoint().addAll((Collection<? extends Viewpoint>) newValue);
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
		case SoftwareSystemArchitecturePackage.SOFTWARE_SYSTEM__NAME:
			setName(NAME_EDEFAULT);
			return;
		case SoftwareSystemArchitecturePackage.SOFTWARE_SYSTEM__VIEWPOINT:
			getViewpoint().clear();
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
		case SoftwareSystemArchitecturePackage.SOFTWARE_SYSTEM__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case SoftwareSystemArchitecturePackage.SOFTWARE_SYSTEM__VIEWPOINT:
			return viewpoint != null && !viewpoint.isEmpty();
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

} //Software_SystemImpl
