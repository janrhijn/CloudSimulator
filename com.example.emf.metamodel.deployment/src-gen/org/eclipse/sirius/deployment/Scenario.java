/**
 */
package org.eclipse.sirius.deployment;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.deployment.Scenario#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.sirius.deployment.Scenario#getArrivalrate <em>Arrivalrate</em>}</li>
 *   <li>{@link org.eclipse.sirius.deployment.Scenario#getDataflow <em>Dataflow</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.deployment.DeploymentPackage#getScenario()
 * @model
 * @generated
 */
public interface Scenario extends EObject {
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
	 * @see org.eclipse.sirius.deployment.DeploymentPackage#getScenario_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.deployment.Scenario#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Arrivalrate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arrivalrate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arrivalrate</em>' attribute.
	 * @see #setArrivalrate(int)
	 * @see org.eclipse.sirius.deployment.DeploymentPackage#getScenario_Arrivalrate()
	 * @model
	 * @generated
	 */
	int getArrivalrate();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.deployment.Scenario#getArrivalrate <em>Arrivalrate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arrivalrate</em>' attribute.
	 * @see #getArrivalrate()
	 * @generated
	 */
	void setArrivalrate(int value);

	/**
	 * Returns the value of the '<em><b>Dataflow</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.deployment.DataFlow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dataflow</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataflow</em>' containment reference list.
	 * @see org.eclipse.sirius.deployment.DeploymentPackage#getScenario_Dataflow()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<DataFlow> getDataflow();

} // Scenario
