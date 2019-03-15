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

import org.eclipse.sirius.deployment.Deployment;
import org.eclipse.sirius.deployment.DeploymentPackage;
import org.eclipse.sirius.deployment.Instance;
import org.eclipse.sirius.deployment.Scenario;
import org.eclipse.sirius.deployment.VPC;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.deployment.impl.DeploymentImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.sirius.deployment.impl.DeploymentImpl#getContain <em>Contain</em>}</li>
 *   <li>{@link org.eclipse.sirius.deployment.impl.DeploymentImpl#getVpc <em>Vpc</em>}</li>
 *   <li>{@link org.eclipse.sirius.deployment.impl.DeploymentImpl#getScenarios <em>Scenarios</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeploymentImpl extends MinimalEObjectImpl.Container implements Deployment {
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
	 * The cached value of the '{@link #getContain() <em>Contain</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContain()
	 * @generated
	 * @ordered
	 */
	protected EList<Instance> contain;

	/**
	 * The cached value of the '{@link #getVpc() <em>Vpc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpc()
	 * @generated
	 * @ordered
	 */
	protected VPC vpc;

	/**
	 * The cached value of the '{@link #getScenarios() <em>Scenarios</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenarios()
	 * @generated
	 * @ordered
	 */
	protected EList<Scenario> scenarios;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeploymentPackage.Literals.DEPLOYMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.DEPLOYMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Instance> getContain() {
		if (contain == null) {
			contain = new EObjectContainmentEList<Instance>(Instance.class, this,
					DeploymentPackage.DEPLOYMENT__CONTAIN);
		}
		return contain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VPC getVpc() {
		return vpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVpc(VPC newVpc, NotificationChain msgs) {
		VPC oldVpc = vpc;
		vpc = newVpc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DeploymentPackage.DEPLOYMENT__VPC, oldVpc, newVpc);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVpc(VPC newVpc) {
		if (newVpc != vpc) {
			NotificationChain msgs = null;
			if (vpc != null)
				msgs = ((InternalEObject) vpc).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DeploymentPackage.DEPLOYMENT__VPC, null, msgs);
			if (newVpc != null)
				msgs = ((InternalEObject) newVpc).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DeploymentPackage.DEPLOYMENT__VPC, null, msgs);
			msgs = basicSetVpc(newVpc, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.DEPLOYMENT__VPC, newVpc, newVpc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Scenario> getScenarios() {
		if (scenarios == null) {
			scenarios = new EObjectContainmentEList<Scenario>(Scenario.class, this,
					DeploymentPackage.DEPLOYMENT__SCENARIOS);
		}
		return scenarios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DeploymentPackage.DEPLOYMENT__CONTAIN:
			return ((InternalEList<?>) getContain()).basicRemove(otherEnd, msgs);
		case DeploymentPackage.DEPLOYMENT__VPC:
			return basicSetVpc(null, msgs);
		case DeploymentPackage.DEPLOYMENT__SCENARIOS:
			return ((InternalEList<?>) getScenarios()).basicRemove(otherEnd, msgs);
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
		case DeploymentPackage.DEPLOYMENT__NAME:
			return getName();
		case DeploymentPackage.DEPLOYMENT__CONTAIN:
			return getContain();
		case DeploymentPackage.DEPLOYMENT__VPC:
			return getVpc();
		case DeploymentPackage.DEPLOYMENT__SCENARIOS:
			return getScenarios();
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
		case DeploymentPackage.DEPLOYMENT__NAME:
			setName((String) newValue);
			return;
		case DeploymentPackage.DEPLOYMENT__CONTAIN:
			getContain().clear();
			getContain().addAll((Collection<? extends Instance>) newValue);
			return;
		case DeploymentPackage.DEPLOYMENT__VPC:
			setVpc((VPC) newValue);
			return;
		case DeploymentPackage.DEPLOYMENT__SCENARIOS:
			getScenarios().clear();
			getScenarios().addAll((Collection<? extends Scenario>) newValue);
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
		case DeploymentPackage.DEPLOYMENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case DeploymentPackage.DEPLOYMENT__CONTAIN:
			getContain().clear();
			return;
		case DeploymentPackage.DEPLOYMENT__VPC:
			setVpc((VPC) null);
			return;
		case DeploymentPackage.DEPLOYMENT__SCENARIOS:
			getScenarios().clear();
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
		case DeploymentPackage.DEPLOYMENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case DeploymentPackage.DEPLOYMENT__CONTAIN:
			return contain != null && !contain.isEmpty();
		case DeploymentPackage.DEPLOYMENT__VPC:
			return vpc != null;
		case DeploymentPackage.DEPLOYMENT__SCENARIOS:
			return scenarios != null && !scenarios.isEmpty();
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

} //DeploymentImpl
