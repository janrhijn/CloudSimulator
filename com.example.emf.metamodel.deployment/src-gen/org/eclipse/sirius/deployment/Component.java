/**
 */
package org.eclipse.sirius.deployment;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.deployment.Component#getContains <em>Contains</em>}</li>
 *   <li>{@link org.eclipse.sirius.deployment.Component#getPricingscheme <em>Pricingscheme</em>}</li>
 *   <li>{@link org.eclipse.sirius.deployment.Component#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.sirius.deployment.Component#getServiceLevel <em>Service Level</em>}</li>
 *   <li>{@link org.eclipse.sirius.deployment.Component#getServerDuration <em>Server Duration</em>}</li>
 *   <li>{@link org.eclipse.sirius.deployment.Component#getServerUnitTime <em>Server Unit Time</em>}</li>
 *   <li>{@link org.eclipse.sirius.deployment.Component#getDataIn <em>Data In</em>}</li>
 *   <li>{@link org.eclipse.sirius.deployment.Component#getDataOut <em>Data Out</em>}</li>
 *   <li>{@link org.eclipse.sirius.deployment.Component#getStorageCapacity <em>Storage Capacity</em>}</li>
 *   <li>{@link org.eclipse.sirius.deployment.Component#getRequest <em>Request</em>}</li>
 *   <li>{@link org.eclipse.sirius.deployment.Component#getOperationalComponentCost <em>Operational Component Cost</em>}</li>
 *   <li>{@link org.eclipse.sirius.deployment.Component#getDeployedUnits <em>Deployed Units</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.deployment.DeploymentPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends EObject {
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
	 * @see org.eclipse.sirius.deployment.DeploymentPackage#getComponent_Contains()
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
	 * @see org.eclipse.sirius.deployment.DeploymentPackage#getComponent_Pricingscheme()
	 * @model containment="true"
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
	 * @see org.eclipse.sirius.deployment.DeploymentPackage#getComponent_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.deployment.Component#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Service Level</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.sirius.deployment.ServiceLevel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Level</em>' attribute.
	 * @see org.eclipse.sirius.deployment.ServiceLevel
	 * @see #setServiceLevel(ServiceLevel)
	 * @see org.eclipse.sirius.deployment.DeploymentPackage#getComponent_ServiceLevel()
	 * @model
	 * @generated
	 */
	ServiceLevel getServiceLevel();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.deployment.Component#getServiceLevel <em>Service Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Level</em>' attribute.
	 * @see org.eclipse.sirius.deployment.ServiceLevel
	 * @see #getServiceLevel()
	 * @generated
	 */
	void setServiceLevel(ServiceLevel value);

	/**
	 * Returns the value of the '<em><b>Server Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Duration</em>' attribute.
	 * @see #setServerDuration(int)
	 * @see org.eclipse.sirius.deployment.DeploymentPackage#getComponent_ServerDuration()
	 * @model
	 * @generated
	 */
	int getServerDuration();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.deployment.Component#getServerDuration <em>Server Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Duration</em>' attribute.
	 * @see #getServerDuration()
	 * @generated
	 */
	void setServerDuration(int value);

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
	 * @see org.eclipse.sirius.deployment.DeploymentPackage#getComponent_ServerUnitTime()
	 * @model
	 * @generated
	 */
	long getServerUnitTime();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.deployment.Component#getServerUnitTime <em>Server Unit Time</em>}' attribute.
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
	 * @see org.eclipse.sirius.deployment.DeploymentPackage#getComponent_DataIn()
	 * @model
	 * @generated
	 */
	long getDataIn();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.deployment.Component#getDataIn <em>Data In</em>}' attribute.
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
	 * @see org.eclipse.sirius.deployment.DeploymentPackage#getComponent_DataOut()
	 * @model
	 * @generated
	 */
	long getDataOut();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.deployment.Component#getDataOut <em>Data Out</em>}' attribute.
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
	 * @see org.eclipse.sirius.deployment.DeploymentPackage#getComponent_StorageCapacity()
	 * @model
	 * @generated
	 */
	long getStorageCapacity();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.deployment.Component#getStorageCapacity <em>Storage Capacity</em>}' attribute.
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
	 * @see org.eclipse.sirius.deployment.DeploymentPackage#getComponent_Request()
	 * @model
	 * @generated
	 */
	long getRequest();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.deployment.Component#getRequest <em>Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request</em>' attribute.
	 * @see #getRequest()
	 * @generated
	 */
	void setRequest(long value);

	/**
	 * Returns the value of the '<em><b>Operational Component Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operational Component Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operational Component Cost</em>' attribute.
	 * @see #setOperationalComponentCost(double)
	 * @see org.eclipse.sirius.deployment.DeploymentPackage#getComponent_OperationalComponentCost()
	 * @model
	 * @generated
	 */
	double getOperationalComponentCost();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.deployment.Component#getOperationalComponentCost <em>Operational Component Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operational Component Cost</em>' attribute.
	 * @see #getOperationalComponentCost()
	 * @generated
	 */
	void setOperationalComponentCost(double value);

	/**
	 * Returns the value of the '<em><b>Deployed Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployed Units</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployed Units</em>' attribute.
	 * @see #setDeployedUnits(int)
	 * @see org.eclipse.sirius.deployment.DeploymentPackage#getComponent_DeployedUnits()
	 * @model
	 * @generated
	 */
	int getDeployedUnits();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.deployment.Component#getDeployedUnits <em>Deployed Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployed Units</em>' attribute.
	 * @see #getDeployedUnits()
	 * @generated
	 */
	void setDeployedUnits(int value);

} // Component
