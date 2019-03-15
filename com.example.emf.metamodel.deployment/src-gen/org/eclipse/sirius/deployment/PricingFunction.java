/**
 */
package org.eclipse.sirius.deployment;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pricing Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.deployment.PricingFunction#getMetric <em>Metric</em>}</li>
 *   <li>{@link org.eclipse.sirius.deployment.PricingFunction#getPrice <em>Price</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.deployment.DeploymentPackage#getPricingFunction()
 * @model
 * @generated
 */
public interface PricingFunction extends EObject {
	/**
	 * Returns the value of the '<em><b>Metric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metric</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric</em>' attribute.
	 * @see #setMetric(int)
	 * @see org.eclipse.sirius.deployment.DeploymentPackage#getPricingFunction_Metric()
	 * @model
	 * @generated
	 */
	int getMetric();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.deployment.PricingFunction#getMetric <em>Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metric</em>' attribute.
	 * @see #getMetric()
	 * @generated
	 */
	void setMetric(int value);

	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #setPrice(double)
	 * @see org.eclipse.sirius.deployment.DeploymentPackage#getPricingFunction_Price()
	 * @model
	 * @generated
	 */
	double getPrice();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.deployment.PricingFunction#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(double value);

} // PricingFunction
