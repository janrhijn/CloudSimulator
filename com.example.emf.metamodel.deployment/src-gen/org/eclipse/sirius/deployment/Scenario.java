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
 *   <li>{@link org.eclipse.sirius.deployment.Scenario#getInformationflow <em>Informationflow</em>}</li>
 *   <li>{@link org.eclipse.sirius.deployment.Scenario#getMeanSojournTime <em>Mean Sojourn Time</em>}</li>
 *   <li>{@link org.eclipse.sirius.deployment.Scenario#getMaxSojournTime <em>Max Sojourn Time</em>}</li>
 *   <li>{@link org.eclipse.sirius.deployment.Scenario#getColour <em>Colour</em>}</li>
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
	 * Returns the value of the '<em><b>Informationflow</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.deployment.InformationFlow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Informationflow</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Informationflow</em>' containment reference list.
	 * @see org.eclipse.sirius.deployment.DeploymentPackage#getScenario_Informationflow()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<InformationFlow> getInformationflow();

	/**
	 * Returns the value of the '<em><b>Mean Sojourn Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mean Sojourn Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mean Sojourn Time</em>' attribute.
	 * @see #setMeanSojournTime(double)
	 * @see org.eclipse.sirius.deployment.DeploymentPackage#getScenario_MeanSojournTime()
	 * @model
	 * @generated
	 */
	double getMeanSojournTime();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.deployment.Scenario#getMeanSojournTime <em>Mean Sojourn Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mean Sojourn Time</em>' attribute.
	 * @see #getMeanSojournTime()
	 * @generated
	 */
	void setMeanSojournTime(double value);

	/**
	 * Returns the value of the '<em><b>Max Sojourn Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Sojourn Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Sojourn Time</em>' attribute.
	 * @see #setMaxSojournTime(double)
	 * @see org.eclipse.sirius.deployment.DeploymentPackage#getScenario_MaxSojournTime()
	 * @model
	 * @generated
	 */
	double getMaxSojournTime();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.deployment.Scenario#getMaxSojournTime <em>Max Sojourn Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Sojourn Time</em>' attribute.
	 * @see #getMaxSojournTime()
	 * @generated
	 */
	void setMaxSojournTime(double value);

	/**
	 * Returns the value of the '<em><b>Colour</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.sirius.deployment.Colour}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Colour</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colour</em>' attribute.
	 * @see org.eclipse.sirius.deployment.Colour
	 * @see #setColour(Colour)
	 * @see org.eclipse.sirius.deployment.DeploymentPackage#getScenario_Colour()
	 * @model
	 * @generated
	 */
	Colour getColour();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.deployment.Scenario#getColour <em>Colour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Colour</em>' attribute.
	 * @see org.eclipse.sirius.deployment.Colour
	 * @see #getColour()
	 * @generated
	 */
	void setColour(Colour value);

} // Scenario
