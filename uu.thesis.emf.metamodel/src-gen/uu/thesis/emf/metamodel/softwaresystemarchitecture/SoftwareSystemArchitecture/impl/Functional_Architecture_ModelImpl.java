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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Functional_Architecture_Model;
import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Scenario;
import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.SoftwareSystemArchitecturePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functional Architecture Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.impl.Functional_Architecture_ModelImpl#getProduct_context <em>Product context</em>}</li>
 *   <li>{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.impl.Functional_Architecture_ModelImpl#getScenario_overlay <em>Scenario overlay</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Functional_Architecture_ModelImpl extends ViewpointImpl implements Functional_Architecture_Model {
	/**
	 * The cached value of the '{@link #getProduct_context() <em>Product context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduct_context()
	 * @generated
	 * @ordered
	 */
	protected uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Module product_context;

	/**
	 * The cached value of the '{@link #getScenario_overlay() <em>Scenario overlay</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenario_overlay()
	 * @generated
	 * @ordered
	 */
	protected EList<Scenario> scenario_overlay;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Functional_Architecture_ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoftwareSystemArchitecturePackage.Literals.FUNCTIONAL_ARCHITECTURE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Module getProduct_context() {
		return product_context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProduct_context(
			uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Module newProduct_context,
			NotificationChain msgs) {
		uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Module oldProduct_context = product_context;
		product_context = newProduct_context;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SoftwareSystemArchitecturePackage.FUNCTIONAL_ARCHITECTURE_MODEL__PRODUCT_CONTEXT,
					oldProduct_context, newProduct_context);
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
	public void setProduct_context(
			uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Module newProduct_context) {
		if (newProduct_context != product_context) {
			NotificationChain msgs = null;
			if (product_context != null)
				msgs = ((InternalEObject) product_context).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- SoftwareSystemArchitecturePackage.FUNCTIONAL_ARCHITECTURE_MODEL__PRODUCT_CONTEXT,
						null, msgs);
			if (newProduct_context != null)
				msgs = ((InternalEObject) newProduct_context).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- SoftwareSystemArchitecturePackage.FUNCTIONAL_ARCHITECTURE_MODEL__PRODUCT_CONTEXT,
						null, msgs);
			msgs = basicSetProduct_context(newProduct_context, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SoftwareSystemArchitecturePackage.FUNCTIONAL_ARCHITECTURE_MODEL__PRODUCT_CONTEXT,
					newProduct_context, newProduct_context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Scenario> getScenario_overlay() {
		if (scenario_overlay == null) {
			scenario_overlay = new EObjectContainmentEList<Scenario>(Scenario.class, this,
					SoftwareSystemArchitecturePackage.FUNCTIONAL_ARCHITECTURE_MODEL__SCENARIO_OVERLAY);
		}
		return scenario_overlay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SoftwareSystemArchitecturePackage.FUNCTIONAL_ARCHITECTURE_MODEL__PRODUCT_CONTEXT:
			return basicSetProduct_context(null, msgs);
		case SoftwareSystemArchitecturePackage.FUNCTIONAL_ARCHITECTURE_MODEL__SCENARIO_OVERLAY:
			return ((InternalEList<?>) getScenario_overlay()).basicRemove(otherEnd, msgs);
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
		case SoftwareSystemArchitecturePackage.FUNCTIONAL_ARCHITECTURE_MODEL__PRODUCT_CONTEXT:
			return getProduct_context();
		case SoftwareSystemArchitecturePackage.FUNCTIONAL_ARCHITECTURE_MODEL__SCENARIO_OVERLAY:
			return getScenario_overlay();
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
		case SoftwareSystemArchitecturePackage.FUNCTIONAL_ARCHITECTURE_MODEL__PRODUCT_CONTEXT:
			setProduct_context(
					(uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Module) newValue);
			return;
		case SoftwareSystemArchitecturePackage.FUNCTIONAL_ARCHITECTURE_MODEL__SCENARIO_OVERLAY:
			getScenario_overlay().clear();
			getScenario_overlay().addAll((Collection<? extends Scenario>) newValue);
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
		case SoftwareSystemArchitecturePackage.FUNCTIONAL_ARCHITECTURE_MODEL__PRODUCT_CONTEXT:
			setProduct_context(
					(uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Module) null);
			return;
		case SoftwareSystemArchitecturePackage.FUNCTIONAL_ARCHITECTURE_MODEL__SCENARIO_OVERLAY:
			getScenario_overlay().clear();
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
		case SoftwareSystemArchitecturePackage.FUNCTIONAL_ARCHITECTURE_MODEL__PRODUCT_CONTEXT:
			return product_context != null;
		case SoftwareSystemArchitecturePackage.FUNCTIONAL_ARCHITECTURE_MODEL__SCENARIO_OVERLAY:
			return scenario_overlay != null && !scenario_overlay.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Functional_Architecture_ModelImpl
