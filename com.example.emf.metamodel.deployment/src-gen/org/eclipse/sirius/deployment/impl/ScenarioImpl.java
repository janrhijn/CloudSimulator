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

import org.eclipse.sirius.deployment.DataFlow;
import org.eclipse.sirius.deployment.DeploymentPackage;
import org.eclipse.sirius.deployment.Scenario;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.deployment.impl.ScenarioImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.sirius.deployment.impl.ScenarioImpl#getArrivalrate <em>Arrivalrate</em>}</li>
 *   <li>{@link org.eclipse.sirius.deployment.impl.ScenarioImpl#getDataflow <em>Dataflow</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScenarioImpl extends MinimalEObjectImpl.Container implements Scenario {
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
	 * The default value of the '{@link #getArrivalrate() <em>Arrivalrate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrivalrate()
	 * @generated
	 * @ordered
	 */
	protected static final int ARRIVALRATE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getArrivalrate() <em>Arrivalrate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrivalrate()
	 * @generated
	 * @ordered
	 */
	protected int arrivalrate = ARRIVALRATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDataflow() <em>Dataflow</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataflow()
	 * @generated
	 * @ordered
	 */
	protected EList<DataFlow> dataflow;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScenarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeploymentPackage.Literals.SCENARIO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.SCENARIO__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getArrivalrate() {
		return arrivalrate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArrivalrate(int newArrivalrate) {
		int oldArrivalrate = arrivalrate;
		arrivalrate = newArrivalrate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.SCENARIO__ARRIVALRATE,
					oldArrivalrate, arrivalrate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataFlow> getDataflow() {
		if (dataflow == null) {
			dataflow = new EObjectContainmentEList<DataFlow>(DataFlow.class, this,
					DeploymentPackage.SCENARIO__DATAFLOW);
		}
		return dataflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DeploymentPackage.SCENARIO__DATAFLOW:
			return ((InternalEList<?>) getDataflow()).basicRemove(otherEnd, msgs);
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
		case DeploymentPackage.SCENARIO__NAME:
			return getName();
		case DeploymentPackage.SCENARIO__ARRIVALRATE:
			return getArrivalrate();
		case DeploymentPackage.SCENARIO__DATAFLOW:
			return getDataflow();
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
		case DeploymentPackage.SCENARIO__NAME:
			setName((String) newValue);
			return;
		case DeploymentPackage.SCENARIO__ARRIVALRATE:
			setArrivalrate((Integer) newValue);
			return;
		case DeploymentPackage.SCENARIO__DATAFLOW:
			getDataflow().clear();
			getDataflow().addAll((Collection<? extends DataFlow>) newValue);
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
		case DeploymentPackage.SCENARIO__NAME:
			setName(NAME_EDEFAULT);
			return;
		case DeploymentPackage.SCENARIO__ARRIVALRATE:
			setArrivalrate(ARRIVALRATE_EDEFAULT);
			return;
		case DeploymentPackage.SCENARIO__DATAFLOW:
			getDataflow().clear();
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
		case DeploymentPackage.SCENARIO__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case DeploymentPackage.SCENARIO__ARRIVALRATE:
			return arrivalrate != ARRIVALRATE_EDEFAULT;
		case DeploymentPackage.SCENARIO__DATAFLOW:
			return dataflow != null && !dataflow.isEmpty();
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
		result.append(", arrivalrate: ");
		result.append(arrivalrate);
		result.append(')');
		return result.toString();
	}

} //ScenarioImpl
