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

import org.eclipse.sirius.deployment.Colour;
import org.eclipse.sirius.deployment.DeploymentPackage;
import org.eclipse.sirius.deployment.InformationFlow;
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
 *   <li>{@link org.eclipse.sirius.deployment.impl.ScenarioImpl#getInformationflow <em>Informationflow</em>}</li>
 *   <li>{@link org.eclipse.sirius.deployment.impl.ScenarioImpl#getMeanSojournTime <em>Mean Sojourn Time</em>}</li>
 *   <li>{@link org.eclipse.sirius.deployment.impl.ScenarioImpl#getMaxSojournTime <em>Max Sojourn Time</em>}</li>
 *   <li>{@link org.eclipse.sirius.deployment.impl.ScenarioImpl#getColour <em>Colour</em>}</li>
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
	 * The cached value of the '{@link #getInformationflow() <em>Informationflow</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformationflow()
	 * @generated
	 * @ordered
	 */
	protected EList<InformationFlow> informationflow;

	/**
	 * The default value of the '{@link #getMeanSojournTime() <em>Mean Sojourn Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeanSojournTime()
	 * @generated
	 * @ordered
	 */
	protected static final double MEAN_SOJOURN_TIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMeanSojournTime() <em>Mean Sojourn Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeanSojournTime()
	 * @generated
	 * @ordered
	 */
	protected double meanSojournTime = MEAN_SOJOURN_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxSojournTime() <em>Max Sojourn Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSojournTime()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_SOJOURN_TIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaxSojournTime() <em>Max Sojourn Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSojournTime()
	 * @generated
	 * @ordered
	 */
	protected double maxSojournTime = MAX_SOJOURN_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getColour() <em>Colour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColour()
	 * @generated
	 * @ordered
	 */
	protected static final Colour COLOUR_EDEFAULT = Colour.RED;

	/**
	 * The cached value of the '{@link #getColour() <em>Colour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColour()
	 * @generated
	 * @ordered
	 */
	protected Colour colour = COLOUR_EDEFAULT;

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
	public EList<InformationFlow> getInformationflow() {
		if (informationflow == null) {
			informationflow = new EObjectContainmentEList<InformationFlow>(InformationFlow.class, this,
					DeploymentPackage.SCENARIO__INFORMATIONFLOW);
		}
		return informationflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMeanSojournTime() {
		return meanSojournTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMeanSojournTime(double newMeanSojournTime) {
		double oldMeanSojournTime = meanSojournTime;
		meanSojournTime = newMeanSojournTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.SCENARIO__MEAN_SOJOURN_TIME,
					oldMeanSojournTime, meanSojournTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMaxSojournTime() {
		return maxSojournTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxSojournTime(double newMaxSojournTime) {
		double oldMaxSojournTime = maxSojournTime;
		maxSojournTime = newMaxSojournTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.SCENARIO__MAX_SOJOURN_TIME,
					oldMaxSojournTime, maxSojournTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Colour getColour() {
		return colour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColour(Colour newColour) {
		Colour oldColour = colour;
		colour = newColour == null ? COLOUR_EDEFAULT : newColour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.SCENARIO__COLOUR, oldColour,
					colour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DeploymentPackage.SCENARIO__INFORMATIONFLOW:
			return ((InternalEList<?>) getInformationflow()).basicRemove(otherEnd, msgs);
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
		case DeploymentPackage.SCENARIO__INFORMATIONFLOW:
			return getInformationflow();
		case DeploymentPackage.SCENARIO__MEAN_SOJOURN_TIME:
			return getMeanSojournTime();
		case DeploymentPackage.SCENARIO__MAX_SOJOURN_TIME:
			return getMaxSojournTime();
		case DeploymentPackage.SCENARIO__COLOUR:
			return getColour();
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
		case DeploymentPackage.SCENARIO__INFORMATIONFLOW:
			getInformationflow().clear();
			getInformationflow().addAll((Collection<? extends InformationFlow>) newValue);
			return;
		case DeploymentPackage.SCENARIO__MEAN_SOJOURN_TIME:
			setMeanSojournTime((Double) newValue);
			return;
		case DeploymentPackage.SCENARIO__MAX_SOJOURN_TIME:
			setMaxSojournTime((Double) newValue);
			return;
		case DeploymentPackage.SCENARIO__COLOUR:
			setColour((Colour) newValue);
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
		case DeploymentPackage.SCENARIO__INFORMATIONFLOW:
			getInformationflow().clear();
			return;
		case DeploymentPackage.SCENARIO__MEAN_SOJOURN_TIME:
			setMeanSojournTime(MEAN_SOJOURN_TIME_EDEFAULT);
			return;
		case DeploymentPackage.SCENARIO__MAX_SOJOURN_TIME:
			setMaxSojournTime(MAX_SOJOURN_TIME_EDEFAULT);
			return;
		case DeploymentPackage.SCENARIO__COLOUR:
			setColour(COLOUR_EDEFAULT);
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
		case DeploymentPackage.SCENARIO__INFORMATIONFLOW:
			return informationflow != null && !informationflow.isEmpty();
		case DeploymentPackage.SCENARIO__MEAN_SOJOURN_TIME:
			return meanSojournTime != MEAN_SOJOURN_TIME_EDEFAULT;
		case DeploymentPackage.SCENARIO__MAX_SOJOURN_TIME:
			return maxSojournTime != MAX_SOJOURN_TIME_EDEFAULT;
		case DeploymentPackage.SCENARIO__COLOUR:
			return colour != COLOUR_EDEFAULT;
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
		result.append(", meanSojournTime: ");
		result.append(meanSojournTime);
		result.append(", maxSojournTime: ");
		result.append(maxSojournTime);
		result.append(", colour: ");
		result.append(colour);
		result.append(')');
		return result.toString();
	}

} //ScenarioImpl
