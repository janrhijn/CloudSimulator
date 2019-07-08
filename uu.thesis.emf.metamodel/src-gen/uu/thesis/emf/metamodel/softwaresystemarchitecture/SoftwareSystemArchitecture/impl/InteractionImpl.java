/**
 */
package uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Informationflow;
import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Interaction;
import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.SoftwareSystemArchitecturePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.impl.InteractionImpl#getInformationflow <em>Informationflow</em>}</li>
 *   <li>{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.impl.InteractionImpl#getData <em>Data</em>}</li>
 *   <li>{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.impl.InteractionImpl#isForce_receiver_as_connector <em>Force receiver as connector</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InteractionImpl extends MinimalEObjectImpl.Container implements Interaction {
	/**
	 * The cached value of the '{@link #getInformationflow() <em>Informationflow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformationflow()
	 * @generated
	 * @ordered
	 */
	protected Informationflow informationflow;

	/**
	 * The default value of the '{@link #getData() <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected static final int DATA_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected int data = DATA_EDEFAULT;

	/**
	 * The default value of the '{@link #isForce_receiver_as_connector() <em>Force receiver as connector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isForce_receiver_as_connector()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FORCE_RECEIVER_AS_CONNECTOR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isForce_receiver_as_connector() <em>Force receiver as connector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isForce_receiver_as_connector()
	 * @generated
	 * @ordered
	 */
	protected boolean force_receiver_as_connector = FORCE_RECEIVER_AS_CONNECTOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoftwareSystemArchitecturePackage.Literals.INTERACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Informationflow getInformationflow() {
		if (informationflow != null && informationflow.eIsProxy()) {
			InternalEObject oldInformationflow = (InternalEObject) informationflow;
			informationflow = (Informationflow) eResolveProxy(oldInformationflow);
			if (informationflow != oldInformationflow) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SoftwareSystemArchitecturePackage.INTERACTION__INFORMATIONFLOW, oldInformationflow,
							informationflow));
			}
		}
		return informationflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Informationflow basicGetInformationflow() {
		return informationflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInformationflow(Informationflow newInformationflow) {
		Informationflow oldInformationflow = informationflow;
		informationflow = newInformationflow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SoftwareSystemArchitecturePackage.INTERACTION__INFORMATIONFLOW, oldInformationflow,
					informationflow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getData() {
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setData(int newData) {
		int oldData = data;
		data = newData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwareSystemArchitecturePackage.INTERACTION__DATA,
					oldData, data));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isForce_receiver_as_connector() {
		return force_receiver_as_connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForce_receiver_as_connector(boolean newForce_receiver_as_connector) {
		boolean oldForce_receiver_as_connector = force_receiver_as_connector;
		force_receiver_as_connector = newForce_receiver_as_connector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SoftwareSystemArchitecturePackage.INTERACTION__FORCE_RECEIVER_AS_CONNECTOR,
					oldForce_receiver_as_connector, force_receiver_as_connector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SoftwareSystemArchitecturePackage.INTERACTION__INFORMATIONFLOW:
			if (resolve)
				return getInformationflow();
			return basicGetInformationflow();
		case SoftwareSystemArchitecturePackage.INTERACTION__DATA:
			return getData();
		case SoftwareSystemArchitecturePackage.INTERACTION__FORCE_RECEIVER_AS_CONNECTOR:
			return isForce_receiver_as_connector();
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
		case SoftwareSystemArchitecturePackage.INTERACTION__INFORMATIONFLOW:
			setInformationflow((Informationflow) newValue);
			return;
		case SoftwareSystemArchitecturePackage.INTERACTION__DATA:
			setData((Integer) newValue);
			return;
		case SoftwareSystemArchitecturePackage.INTERACTION__FORCE_RECEIVER_AS_CONNECTOR:
			setForce_receiver_as_connector((Boolean) newValue);
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
		case SoftwareSystemArchitecturePackage.INTERACTION__INFORMATIONFLOW:
			setInformationflow((Informationflow) null);
			return;
		case SoftwareSystemArchitecturePackage.INTERACTION__DATA:
			setData(DATA_EDEFAULT);
			return;
		case SoftwareSystemArchitecturePackage.INTERACTION__FORCE_RECEIVER_AS_CONNECTOR:
			setForce_receiver_as_connector(FORCE_RECEIVER_AS_CONNECTOR_EDEFAULT);
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
		case SoftwareSystemArchitecturePackage.INTERACTION__INFORMATIONFLOW:
			return informationflow != null;
		case SoftwareSystemArchitecturePackage.INTERACTION__DATA:
			return data != DATA_EDEFAULT;
		case SoftwareSystemArchitecturePackage.INTERACTION__FORCE_RECEIVER_AS_CONNECTOR:
			return force_receiver_as_connector != FORCE_RECEIVER_AS_CONNECTOR_EDEFAULT;
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
		result.append(" (data: ");
		result.append(data);
		result.append(", force_receiver_as_connector: ");
		result.append(force_receiver_as_connector);
		result.append(')');
		return result.toString();
	}

} //InteractionImpl
