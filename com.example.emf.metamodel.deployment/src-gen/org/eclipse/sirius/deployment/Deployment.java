/**
 */
package org.eclipse.sirius.deployment;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.deployment.Deployment#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.sirius.deployment.Deployment#getContain <em>Contain</em>}</li>
 *   <li>{@link org.eclipse.sirius.deployment.Deployment#getVpc <em>Vpc</em>}</li>
 *   <li>{@link org.eclipse.sirius.deployment.Deployment#getScenarios <em>Scenarios</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.deployment.DeploymentPackage#getDeployment()
 * @model
 * @generated
 */
public interface Deployment extends EObject {
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
	 * @see org.eclipse.sirius.deployment.DeploymentPackage#getDeployment_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.deployment.Deployment#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Contain</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.deployment.Instance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contain</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contain</em>' containment reference list.
	 * @see org.eclipse.sirius.deployment.DeploymentPackage#getDeployment_Contain()
	 * @model containment="true"
	 * @generated
	 */
	EList<Instance> getContain();

	/**
	 * Returns the value of the '<em><b>Vpc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vpc</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vpc</em>' containment reference.
	 * @see #setVpc(VPC)
	 * @see org.eclipse.sirius.deployment.DeploymentPackage#getDeployment_Vpc()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VPC getVpc();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.deployment.Deployment#getVpc <em>Vpc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vpc</em>' containment reference.
	 * @see #getVpc()
	 * @generated
	 */
	void setVpc(VPC value);

	/**
	 * Returns the value of the '<em><b>Scenarios</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.deployment.Scenario}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenarios</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenarios</em>' containment reference list.
	 * @see org.eclipse.sirius.deployment.DeploymentPackage#getDeployment_Scenarios()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Scenario> getScenarios();

} // Deployment
