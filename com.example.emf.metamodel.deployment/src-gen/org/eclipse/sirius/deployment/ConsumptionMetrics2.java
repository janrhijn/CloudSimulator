/**
 */
package org.eclipse.sirius.deployment;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Consumption Metrics2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.deployment.ConsumptionMetrics2#getServerTime <em>Server Time</em>}</li>
 *   <li>{@link org.eclipse.sirius.deployment.ConsumptionMetrics2#getServerUnitTime <em>Server Unit Time</em>}</li>
 *   <li>{@link org.eclipse.sirius.deployment.ConsumptionMetrics2#getDataIn <em>Data In</em>}</li>
 *   <li>{@link org.eclipse.sirius.deployment.ConsumptionMetrics2#getDataOut <em>Data Out</em>}</li>
 *   <li>{@link org.eclipse.sirius.deployment.ConsumptionMetrics2#getStorageCapacity <em>Storage Capacity</em>}</li>
 *   <li>{@link org.eclipse.sirius.deployment.ConsumptionMetrics2#getRequest <em>Request</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.deployment.DeploymentPackage#getConsumptionMetrics2()
 * @model
 * @generated
 */
public interface ConsumptionMetrics2 extends EObject {
	/**
	 * Returns the value of the '<em><b>Server Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Time</em>' attribute.
	 * @see #setServerTime(int)
	 * @see org.eclipse.sirius.deployment.DeploymentPackage#getConsumptionMetrics2_ServerTime()
	 * @model
	 * @generated
	 */
	int getServerTime();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.deployment.ConsumptionMetrics2#getServerTime <em>Server Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Time</em>' attribute.
	 * @see #getServerTime()
	 * @generated
	 */
	void setServerTime(int value);

	/**
	 * Returns the value of the '<em><b>Server Unit Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server Unit Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Unit Time</em>' attribute.
	 * @see #setServerUnitTime(long)
	 * @see org.eclipse.sirius.deployment.DeploymentPackage#getConsumptionMetrics2_ServerUnitTime()
	 * @model
	 * @generated
	 */
	long getServerUnitTime();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.deployment.ConsumptionMetrics2#getServerUnitTime <em>Server Unit Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Unit Time</em>' attribute.
	 * @see #getServerUnitTime()
	 * @generated
	 */
	void setServerUnitTime(long value);

	/**
	 * Returns the value of the '<em><b>Data In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data In</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data In</em>' attribute.
	 * @see #setDataIn(long)
	 * @see org.eclipse.sirius.deployment.DeploymentPackage#getConsumptionMetrics2_DataIn()
	 * @model
	 * @generated
	 */
	long getDataIn();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.deployment.ConsumptionMetrics2#getDataIn <em>Data In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data In</em>' attribute.
	 * @see #getDataIn()
	 * @generated
	 */
	void setDataIn(long value);

	/**
	 * Returns the value of the '<em><b>Data Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Out</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Out</em>' attribute.
	 * @see #setDataOut(long)
	 * @see org.eclipse.sirius.deployment.DeploymentPackage#getConsumptionMetrics2_DataOut()
	 * @model
	 * @generated
	 */
	long getDataOut();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.deployment.ConsumptionMetrics2#getDataOut <em>Data Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Out</em>' attribute.
	 * @see #getDataOut()
	 * @generated
	 */
	void setDataOut(long value);

	/**
	 * Returns the value of the '<em><b>Storage Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Storage Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storage Capacity</em>' attribute.
	 * @see #setStorageCapacity(long)
	 * @see org.eclipse.sirius.deployment.DeploymentPackage#getConsumptionMetrics2_StorageCapacity()
	 * @model
	 * @generated
	 */
	long getStorageCapacity();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.deployment.ConsumptionMetrics2#getStorageCapacity <em>Storage Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage Capacity</em>' attribute.
	 * @see #getStorageCapacity()
	 * @generated
	 */
	void setStorageCapacity(long value);

	/**
	 * Returns the value of the '<em><b>Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request</em>' attribute.
	 * @see #setRequest(long)
	 * @see org.eclipse.sirius.deployment.DeploymentPackage#getConsumptionMetrics2_Request()
	 * @model
	 * @generated
	 */
	long getRequest();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.deployment.ConsumptionMetrics2#getRequest <em>Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request</em>' attribute.
	 * @see #getRequest()
	 * @generated
	 */
	void setRequest(long value);

} // ConsumptionMetrics2
