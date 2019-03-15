/**
 */
package org.eclipse.sirius.deployment;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.deployment.DataFlow#getData <em>Data</em>}</li>
 *   <li>{@link org.eclipse.sirius.deployment.DataFlow#getSender <em>Sender</em>}</li>
 *   <li>{@link org.eclipse.sirius.deployment.DataFlow#getReceiver <em>Receiver</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.deployment.DeploymentPackage#getDataFlow()
 * @model
 * @generated
 */
public interface DataFlow extends EObject {
	/**
	 * Returns the value of the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' attribute.
	 * @see #setData(int)
	 * @see org.eclipse.sirius.deployment.DeploymentPackage#getDataFlow_Data()
	 * @model
	 * @generated
	 */
	int getData();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.deployment.DataFlow#getData <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' attribute.
	 * @see #getData()
	 * @generated
	 */
	void setData(int value);

	/**
	 * Returns the value of the '<em><b>Sender</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sender</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sender</em>' reference.
	 * @see #setSender(Feature)
	 * @see org.eclipse.sirius.deployment.DeploymentPackage#getDataFlow_Sender()
	 * @model required="true"
	 * @generated
	 */
	Feature getSender();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.deployment.DataFlow#getSender <em>Sender</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sender</em>' reference.
	 * @see #getSender()
	 * @generated
	 */
	void setSender(Feature value);

	/**
	 * Returns the value of the '<em><b>Receiver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receiver</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receiver</em>' reference.
	 * @see #setReceiver(Feature)
	 * @see org.eclipse.sirius.deployment.DeploymentPackage#getDataFlow_Receiver()
	 * @model required="true"
	 * @generated
	 */
	Feature getReceiver();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.deployment.DataFlow#getReceiver <em>Receiver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiver</em>' reference.
	 * @see #getReceiver()
	 * @generated
	 */
	void setReceiver(Feature value);

} // DataFlow
