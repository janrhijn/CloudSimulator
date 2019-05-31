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
 *   <li>{@link org.eclipse.sirius.deployment.PricingFunction#getPrice <em>Price</em>}</li>
 *   <li>{@link org.eclipse.sirius.deployment.PricingFunction#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.sirius.deployment.PricingFunction#getMetric <em>Metric</em>}</li>
 *   <li>{@link org.eclipse.sirius.deployment.PricingFunction#getBillingType <em>Billing Type</em>}</li>
 *   <li>{@link org.eclipse.sirius.deployment.PricingFunction#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.eclipse.sirius.deployment.PricingFunction#getRequestType <em>Request Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.deployment.DeploymentPackage#getPricingFunction()
 * @model
 * @generated
 */
public interface PricingFunction extends EObject {
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
	 * @see org.eclipse.sirius.deployment.DeploymentPackage#getPricingFunction_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.deployment.PricingFunction#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Metric</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.sirius.deployment.ConsumptionMetric}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metric</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric</em>' attribute.
	 * @see org.eclipse.sirius.deployment.ConsumptionMetric
	 * @see #setMetric(ConsumptionMetric)
	 * @see org.eclipse.sirius.deployment.DeploymentPackage#getPricingFunction_Metric()
	 * @model
	 * @generated
	 */
	ConsumptionMetric getMetric();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.deployment.PricingFunction#getMetric <em>Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metric</em>' attribute.
	 * @see org.eclipse.sirius.deployment.ConsumptionMetric
	 * @see #getMetric()
	 * @generated
	 */
	void setMetric(ConsumptionMetric value);

	/**
	 * Returns the value of the '<em><b>Billing Type</b></em>' attribute.
	 * The default value is <code>"NONE"</code>.
	 * The literals are from the enumeration {@link org.eclipse.sirius.deployment.BillingType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Billing Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Billing Type</em>' attribute.
	 * @see org.eclipse.sirius.deployment.BillingType
	 * @see #setBillingType(BillingType)
	 * @see org.eclipse.sirius.deployment.DeploymentPackage#getPricingFunction_BillingType()
	 * @model default="NONE"
	 * @generated
	 */
	BillingType getBillingType();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.deployment.PricingFunction#getBillingType <em>Billing Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Billing Type</em>' attribute.
	 * @see org.eclipse.sirius.deployment.BillingType
	 * @see #getBillingType()
	 * @generated
	 */
	void setBillingType(BillingType value);

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' attribute.
	 * The default value is <code>"NONE"</code>.
	 * The literals are from the enumeration {@link org.eclipse.sirius.deployment.DataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' attribute.
	 * @see org.eclipse.sirius.deployment.DataType
	 * @see #setDataType(DataType)
	 * @see org.eclipse.sirius.deployment.DeploymentPackage#getPricingFunction_DataType()
	 * @model default="NONE"
	 * @generated
	 */
	DataType getDataType();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.deployment.PricingFunction#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' attribute.
	 * @see org.eclipse.sirius.deployment.DataType
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(DataType value);

	/**
	 * Returns the value of the '<em><b>Request Type</b></em>' attribute.
	 * The default value is <code>"NONE"</code>.
	 * The literals are from the enumeration {@link org.eclipse.sirius.deployment.RequestType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Type</em>' attribute.
	 * @see org.eclipse.sirius.deployment.RequestType
	 * @see #setRequestType(RequestType)
	 * @see org.eclipse.sirius.deployment.DeploymentPackage#getPricingFunction_RequestType()
	 * @model default="NONE"
	 * @generated
	 */
	RequestType getRequestType();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.deployment.PricingFunction#getRequestType <em>Request Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Type</em>' attribute.
	 * @see org.eclipse.sirius.deployment.RequestType
	 * @see #getRequestType()
	 * @generated
	 */
	void setRequestType(RequestType value);

} // PricingFunction
