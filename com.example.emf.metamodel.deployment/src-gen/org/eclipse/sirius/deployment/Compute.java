/**
 */
package org.eclipse.sirius.deployment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.deployment.Compute#getServicerate <em>Servicerate</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.deployment.DeploymentPackage#getCompute()
 * @model
 * @generated
 */
public interface Compute extends Feature {
	/**
	 * Returns the value of the '<em><b>Servicerate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Servicerate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servicerate</em>' attribute.
	 * @see #setServicerate(double)
	 * @see org.eclipse.sirius.deployment.DeploymentPackage#getCompute_Servicerate()
	 * @model
	 * @generated
	 */
	double getServicerate();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.deployment.Compute#getServicerate <em>Servicerate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Servicerate</em>' attribute.
	 * @see #getServicerate()
	 * @generated
	 */
	void setServicerate(double value);

} // Compute
