/**
 */
package org.eclipse.sirius.deployment;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.deployment.Instance#getContains <em>Contains</em>}</li>
 *   <li>{@link org.eclipse.sirius.deployment.Instance#getPricingscheme <em>Pricingscheme</em>}</li>
 *   <li>{@link org.eclipse.sirius.deployment.Instance#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.deployment.DeploymentPackage#getInstance()
 * @model
 * @generated
 */
public interface Instance extends EObject {
	/**
	 * Returns the value of the '<em><b>Contains</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.deployment.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' containment reference list.
	 * @see org.eclipse.sirius.deployment.DeploymentPackage#getInstance_Contains()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Feature> getContains();

	/**
	 * Returns the value of the '<em><b>Pricingscheme</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.deployment.PricingFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pricingscheme</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pricingscheme</em>' containment reference list.
	 * @see org.eclipse.sirius.deployment.DeploymentPackage#getInstance_Pricingscheme()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<PricingFunction> getPricingscheme();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.sirius.deployment.DeploymentPackage#getInstance_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.deployment.Instance#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Instance
