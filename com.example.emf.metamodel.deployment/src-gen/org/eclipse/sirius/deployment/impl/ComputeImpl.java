/**
 */
package org.eclipse.sirius.deployment.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sirius.deployment.Compute;
import org.eclipse.sirius.deployment.DeploymentPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.deployment.impl.ComputeImpl#getServicerate <em>Servicerate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComputeImpl extends FeatureImpl implements Compute {
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
	protected ComputeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeploymentPackage.Literals.COMPUTE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.COMPUTE__SERVICERATE,
					oldServicerate, servicerate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DeploymentPackage.COMPUTE__SERVICERATE:
			return getServicerate();
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
		case DeploymentPackage.COMPUTE__SERVICERATE:
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
		case DeploymentPackage.COMPUTE__SERVICERATE:
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
		case DeploymentPackage.COMPUTE__SERVICERATE:
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
		result.append(" (servicerate: ");
		result.append(servicerate);
		result.append(')');
		return result.toString();
	}

} //ComputeImpl
