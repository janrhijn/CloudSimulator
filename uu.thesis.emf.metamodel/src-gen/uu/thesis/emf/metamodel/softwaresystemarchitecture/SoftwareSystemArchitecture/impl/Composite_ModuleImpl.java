/**
 */
package uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Composite_Module;
import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.SoftwareSystemArchitecturePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.impl.Composite_ModuleImpl#getSub_module <em>Sub module</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Composite_ModuleImpl extends ModuleImpl implements Composite_Module {
	/**
	 * The cached value of the '{@link #getSub_module() <em>Sub module</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSub_module()
	 * @generated
	 * @ordered
	 */
	protected EList<uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Module> sub_module;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Composite_ModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoftwareSystemArchitecturePackage.Literals.COMPOSITE_MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Module> getSub_module() {
		if (sub_module == null) {
			sub_module = new EObjectContainmentEList<uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Module>(
					uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Module.class, this,
					SoftwareSystemArchitecturePackage.COMPOSITE_MODULE__SUB_MODULE);
		}
		return sub_module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SoftwareSystemArchitecturePackage.COMPOSITE_MODULE__SUB_MODULE:
			return ((InternalEList<?>) getSub_module()).basicRemove(otherEnd, msgs);
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
		case SoftwareSystemArchitecturePackage.COMPOSITE_MODULE__SUB_MODULE:
			return getSub_module();
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
		case SoftwareSystemArchitecturePackage.COMPOSITE_MODULE__SUB_MODULE:
			getSub_module().clear();
			getSub_module().addAll(
					(Collection<? extends uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Module>) newValue);
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
		case SoftwareSystemArchitecturePackage.COMPOSITE_MODULE__SUB_MODULE:
			getSub_module().clear();
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
		case SoftwareSystemArchitecturePackage.COMPOSITE_MODULE__SUB_MODULE:
			return sub_module != null && !sub_module.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Composite_ModuleImpl
