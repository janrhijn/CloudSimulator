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

import org.eclipse.sirius.deployment.Component;
import org.eclipse.sirius.deployment.Deployment;
import org.eclipse.sirius.deployment.DeploymentPackage;
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
 *   <li>{@link org.eclipse.sirius.deployment.impl.DeploymentImpl#getOperationalCost <em>Operational Cost</em>}</li>
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
	protected EList<Component> contain;

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
	 * The default value of the '{@link #getOperationalCost() <em>Operational Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationalCost()
	 * @generated
	 * @ordered
	 */
	protected static final double OPERATIONAL_COST_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getOperationalCost() <em>Operational Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationalCost()
	 * @generated
	 * @ordered
	 */
	protected double operationalCost = OPERATIONAL_COST_EDEFAULT;

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
	public EList<Component> getContain() {
		if (contain == null) {
			contain = new EObjectContainmentEList<Component>(Component.class, this,
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
	public double getOperationalCost() {
		return operationalCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperationalCost(double newOperationalCost) {
		double oldOperationalCost = operationalCost;
		operationalCost = newOperationalCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.DEPLOYMENT__OPERATIONAL_COST,
					oldOperationalCost, operationalCost));
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
		case DeploymentPackage.DEPLOYMENT__OPERATIONAL_COST:
			return getOperationalCost();
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
			getContain().addAll((Collection<? extends Component>) newValue);
			return;
		case DeploymentPackage.DEPLOYMENT__VPC:
			setVpc((VPC) newValue);
			return;
		case DeploymentPackage.DEPLOYMENT__SCENARIOS:
			getScenarios().clear();
			getScenarios().addAll((Collection<? extends Scenario>) newValue);
			return;
		case DeploymentPackage.DEPLOYMENT__OPERATIONAL_COST:
			setOperationalCost((Double) newValue);
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
		case DeploymentPackage.DEPLOYMENT__OPERATIONAL_COST:
			setOperationalCost(OPERATIONAL_COST_EDEFAULT);
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
		case DeploymentPackage.DEPLOYMENT__OPERATIONAL_COST:
			return operationalCost != OPERATIONAL_COST_EDEFAULT;
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
		result.append(", operationalCost: ");
		result.append(operationalCost);
		result.append(')');
		return result.toString();
	}

} //DeploymentImpl
