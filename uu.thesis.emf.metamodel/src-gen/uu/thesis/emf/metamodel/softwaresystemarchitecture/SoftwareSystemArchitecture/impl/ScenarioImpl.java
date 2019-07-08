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

import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Colour;
import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Interaction;
import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Scenario;
import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.SoftwareSystemArchitecturePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.impl.ScenarioImpl#getName <em>Name</em>}</li>
 *   <li>{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.impl.ScenarioImpl#getInteraction <em>Interaction</em>}</li>
 *   <li>{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.impl.ScenarioImpl#getArrivalrate <em>Arrivalrate</em>}</li>
 *   <li>{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.impl.ScenarioImpl#getColour <em>Colour</em>}</li>
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
	 * The cached value of the '{@link #getInteraction() <em>Interaction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteraction()
	 * @generated
	 * @ordered
	 */
	protected EList<Interaction> interaction;

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
		return SoftwareSystemArchitecturePackage.Literals.SCENARIO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwareSystemArchitecturePackage.SCENARIO__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Interaction> getInteraction() {
		if (interaction == null) {
			interaction = new EObjectContainmentEList<Interaction>(Interaction.class, this,
					SoftwareSystemArchitecturePackage.SCENARIO__INTERACTION);
		}
		return interaction;
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					SoftwareSystemArchitecturePackage.SCENARIO__ARRIVALRATE, oldArrivalrate, arrivalrate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwareSystemArchitecturePackage.SCENARIO__COLOUR,
					oldColour, colour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SoftwareSystemArchitecturePackage.SCENARIO__INTERACTION:
			return ((InternalEList<?>) getInteraction()).basicRemove(otherEnd, msgs);
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
		case SoftwareSystemArchitecturePackage.SCENARIO__NAME:
			return getName();
		case SoftwareSystemArchitecturePackage.SCENARIO__INTERACTION:
			return getInteraction();
		case SoftwareSystemArchitecturePackage.SCENARIO__ARRIVALRATE:
			return getArrivalrate();
		case SoftwareSystemArchitecturePackage.SCENARIO__COLOUR:
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
		case SoftwareSystemArchitecturePackage.SCENARIO__NAME:
			setName((String) newValue);
			return;
		case SoftwareSystemArchitecturePackage.SCENARIO__INTERACTION:
			getInteraction().clear();
			getInteraction().addAll((Collection<? extends Interaction>) newValue);
			return;
		case SoftwareSystemArchitecturePackage.SCENARIO__ARRIVALRATE:
			setArrivalrate((Integer) newValue);
			return;
		case SoftwareSystemArchitecturePackage.SCENARIO__COLOUR:
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
		case SoftwareSystemArchitecturePackage.SCENARIO__NAME:
			setName(NAME_EDEFAULT);
			return;
		case SoftwareSystemArchitecturePackage.SCENARIO__INTERACTION:
			getInteraction().clear();
			return;
		case SoftwareSystemArchitecturePackage.SCENARIO__ARRIVALRATE:
			setArrivalrate(ARRIVALRATE_EDEFAULT);
			return;
		case SoftwareSystemArchitecturePackage.SCENARIO__COLOUR:
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
		case SoftwareSystemArchitecturePackage.SCENARIO__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case SoftwareSystemArchitecturePackage.SCENARIO__INTERACTION:
			return interaction != null && !interaction.isEmpty();
		case SoftwareSystemArchitecturePackage.SCENARIO__ARRIVALRATE:
			return arrivalrate != ARRIVALRATE_EDEFAULT;
		case SoftwareSystemArchitecturePackage.SCENARIO__COLOUR:
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
		result.append(", colour: ");
		result.append(colour);
		result.append(')');
		return result.toString();
	}

} //ScenarioImpl
