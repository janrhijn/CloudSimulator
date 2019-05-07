/**
 */
package org.eclipse.sirius.deployment;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Information Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.deployment.InformationFlow#getData <em>Data</em>}</li>
 *   <li>{@link org.eclipse.sirius.deployment.InformationFlow#getSender <em>Sender</em>}</li>
 *   <li>{@link org.eclipse.sirius.deployment.InformationFlow#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link org.eclipse.sirius.deployment.InformationFlow#getDataReverse <em>Data Reverse</em>}</li>
 *   <li>{@link org.eclipse.sirius.deployment.InformationFlow#getProbability <em>Probability</em>}</li>
 *   <li>{@link org.eclipse.sirius.deployment.InformationFlow#isBiDirectional <em>Bi Directional</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.deployment.DeploymentPackage#getInformationFlow()
 * @model
 * @generated
 */
public interface InformationFlow extends EObject {
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
	 * @see org.eclipse.sirius.deployment.DeploymentPackage#getInformationFlow_Data()
	 * @model
	 * @generated
	 */
	int getData();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.deployment.InformationFlow#getData <em>Data</em>}' attribute.
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
	 * @see org.eclipse.sirius.deployment.DeploymentPackage#getInformationFlow_Sender()
	 * @model required="true"
	 * @generated
	 */
	Feature getSender();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.deployment.InformationFlow#getSender <em>Sender</em>}' reference.
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
	 * @see org.eclipse.sirius.deployment.DeploymentPackage#getInformationFlow_Receiver()
	 * @model required="true"
	 * @generated
	 */
	Feature getReceiver();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.deployment.InformationFlow#getReceiver <em>Receiver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiver</em>' reference.
	 * @see #getReceiver()
	 * @generated
	 */
	void setReceiver(Feature value);

	/**
	 * Returns the value of the '<em><b>Data Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Reverse</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Reverse</em>' attribute.
	 * @see #setDataReverse(int)
	 * @see org.eclipse.sirius.deployment.DeploymentPackage#getInformationFlow_DataReverse()
	 * @model
	 * @generated
	 */
	int getDataReverse();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.deployment.InformationFlow#getDataReverse <em>Data Reverse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Reverse</em>' attribute.
	 * @see #getDataReverse()
	 * @generated
	 */
	void setDataReverse(int value);

	/**
	 * Returns the value of the '<em><b>Probability</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Probability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probability</em>' attribute.
	 * @see #setProbability(double)
	 * @see org.eclipse.sirius.deployment.DeploymentPackage#getInformationFlow_Probability()
	 * @model default="1.0"
	 * @generated
	 */
	double getProbability();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.deployment.InformationFlow#getProbability <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probability</em>' attribute.
	 * @see #getProbability()
	 * @generated
	 */
	void setProbability(double value);

	/**
	 * Returns the value of the '<em><b>Bi Directional</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bi Directional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bi Directional</em>' attribute.
	 * @see #setBiDirectional(boolean)
	 * @see org.eclipse.sirius.deployment.DeploymentPackage#getInformationFlow_BiDirectional()
	 * @model default="false"
	 * @generated
	 */
	boolean isBiDirectional();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.deployment.InformationFlow#isBiDirectional <em>Bi Directional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bi Directional</em>' attribute.
	 * @see #isBiDirectional()
	 * @generated
	 */
	void setBiDirectional(boolean value);

} // InformationFlow
