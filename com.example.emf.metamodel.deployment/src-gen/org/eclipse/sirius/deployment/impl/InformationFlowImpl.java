/**
 */
package org.eclipse.sirius.deployment.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.sirius.deployment.DeploymentPackage;
import org.eclipse.sirius.deployment.Feature;
import org.eclipse.sirius.deployment.InformationFlow;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Information Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.deployment.impl.InformationFlowImpl#getData <em>Data</em>}</li>
 *   <li>{@link org.eclipse.sirius.deployment.impl.InformationFlowImpl#getSender <em>Sender</em>}</li>
 *   <li>{@link org.eclipse.sirius.deployment.impl.InformationFlowImpl#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link org.eclipse.sirius.deployment.impl.InformationFlowImpl#getDataReverse <em>Data Reverse</em>}</li>
 *   <li>{@link org.eclipse.sirius.deployment.impl.InformationFlowImpl#getProbability <em>Probability</em>}</li>
 *   <li>{@link org.eclipse.sirius.deployment.impl.InformationFlowImpl#isBiDirectional <em>Bi Directional</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InformationFlowImpl extends MinimalEObjectImpl.Container implements InformationFlow {
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
	 * The cached value of the '{@link #getSender() <em>Sender</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSender()
	 * @generated
	 * @ordered
	 */
	protected Feature sender;

	/**
	 * The cached value of the '{@link #getReceiver() <em>Receiver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiver()
	 * @generated
	 * @ordered
	 */
	protected Feature receiver;

	/**
	 * The default value of the '{@link #getDataReverse() <em>Data Reverse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataReverse()
	 * @generated
	 * @ordered
	 */
	protected static final int DATA_REVERSE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDataReverse() <em>Data Reverse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataReverse()
	 * @generated
	 * @ordered
	 */
	protected int dataReverse = DATA_REVERSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected static final double PROBABILITY_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected double probability = PROBABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isBiDirectional() <em>Bi Directional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBiDirectional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BI_DIRECTIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBiDirectional() <em>Bi Directional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBiDirectional()
	 * @generated
	 * @ordered
	 */
	protected boolean biDirectional = BI_DIRECTIONAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InformationFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeploymentPackage.Literals.INFORMATION_FLOW;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.INFORMATION_FLOW__DATA, oldData,
					data));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getSender() {
		if (sender != null && sender.eIsProxy()) {
			InternalEObject oldSender = (InternalEObject) sender;
			sender = (Feature) eResolveProxy(oldSender);
			if (sender != oldSender) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							DeploymentPackage.INFORMATION_FLOW__SENDER, oldSender, sender));
			}
		}
		return sender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetSender() {
		return sender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSender(Feature newSender) {
		Feature oldSender = sender;
		sender = newSender;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.INFORMATION_FLOW__SENDER, oldSender,
					sender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getReceiver() {
		if (receiver != null && receiver.eIsProxy()) {
			InternalEObject oldReceiver = (InternalEObject) receiver;
			receiver = (Feature) eResolveProxy(oldReceiver);
			if (receiver != oldReceiver) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							DeploymentPackage.INFORMATION_FLOW__RECEIVER, oldReceiver, receiver));
			}
		}
		return receiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetReceiver() {
		return receiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReceiver(Feature newReceiver) {
		Feature oldReceiver = receiver;
		receiver = newReceiver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.INFORMATION_FLOW__RECEIVER,
					oldReceiver, receiver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDataReverse() {
		return dataReverse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataReverse(int newDataReverse) {
		int oldDataReverse = dataReverse;
		dataReverse = newDataReverse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.INFORMATION_FLOW__DATA_REVERSE,
					oldDataReverse, dataReverse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getProbability() {
		return probability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProbability(double newProbability) {
		double oldProbability = probability;
		probability = newProbability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.INFORMATION_FLOW__PROBABILITY,
					oldProbability, probability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBiDirectional() {
		return biDirectional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBiDirectional(boolean newBiDirectional) {
		boolean oldBiDirectional = biDirectional;
		biDirectional = newBiDirectional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.INFORMATION_FLOW__BI_DIRECTIONAL,
					oldBiDirectional, biDirectional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DeploymentPackage.INFORMATION_FLOW__DATA:
			return getData();
		case DeploymentPackage.INFORMATION_FLOW__SENDER:
			if (resolve)
				return getSender();
			return basicGetSender();
		case DeploymentPackage.INFORMATION_FLOW__RECEIVER:
			if (resolve)
				return getReceiver();
			return basicGetReceiver();
		case DeploymentPackage.INFORMATION_FLOW__DATA_REVERSE:
			return getDataReverse();
		case DeploymentPackage.INFORMATION_FLOW__PROBABILITY:
			return getProbability();
		case DeploymentPackage.INFORMATION_FLOW__BI_DIRECTIONAL:
			return isBiDirectional();
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
		case DeploymentPackage.INFORMATION_FLOW__DATA:
			setData((Integer) newValue);
			return;
		case DeploymentPackage.INFORMATION_FLOW__SENDER:
			setSender((Feature) newValue);
			return;
		case DeploymentPackage.INFORMATION_FLOW__RECEIVER:
			setReceiver((Feature) newValue);
			return;
		case DeploymentPackage.INFORMATION_FLOW__DATA_REVERSE:
			setDataReverse((Integer) newValue);
			return;
		case DeploymentPackage.INFORMATION_FLOW__PROBABILITY:
			setProbability((Double) newValue);
			return;
		case DeploymentPackage.INFORMATION_FLOW__BI_DIRECTIONAL:
			setBiDirectional((Boolean) newValue);
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
		case DeploymentPackage.INFORMATION_FLOW__DATA:
			setData(DATA_EDEFAULT);
			return;
		case DeploymentPackage.INFORMATION_FLOW__SENDER:
			setSender((Feature) null);
			return;
		case DeploymentPackage.INFORMATION_FLOW__RECEIVER:
			setReceiver((Feature) null);
			return;
		case DeploymentPackage.INFORMATION_FLOW__DATA_REVERSE:
			setDataReverse(DATA_REVERSE_EDEFAULT);
			return;
		case DeploymentPackage.INFORMATION_FLOW__PROBABILITY:
			setProbability(PROBABILITY_EDEFAULT);
			return;
		case DeploymentPackage.INFORMATION_FLOW__BI_DIRECTIONAL:
			setBiDirectional(BI_DIRECTIONAL_EDEFAULT);
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
		case DeploymentPackage.INFORMATION_FLOW__DATA:
			return data != DATA_EDEFAULT;
		case DeploymentPackage.INFORMATION_FLOW__SENDER:
			return sender != null;
		case DeploymentPackage.INFORMATION_FLOW__RECEIVER:
			return receiver != null;
		case DeploymentPackage.INFORMATION_FLOW__DATA_REVERSE:
			return dataReverse != DATA_REVERSE_EDEFAULT;
		case DeploymentPackage.INFORMATION_FLOW__PROBABILITY:
			return probability != PROBABILITY_EDEFAULT;
		case DeploymentPackage.INFORMATION_FLOW__BI_DIRECTIONAL:
			return biDirectional != BI_DIRECTIONAL_EDEFAULT;
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
		result.append(", dataReverse: ");
		result.append(dataReverse);
		result.append(", probability: ");
		result.append(probability);
		result.append(", biDirectional: ");
		result.append(biDirectional);
		result.append(')');
		return result.toString();
	}

} //InformationFlowImpl
