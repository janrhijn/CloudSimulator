/**
 */
package uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Interaction#getInformationflow <em>Informationflow</em>}</li>
 *   <li>{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Interaction#getData <em>Data</em>}</li>
 *   <li>{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Interaction#isForce_receiver_as_connector <em>Force receiver as connector</em>}</li>
 * </ul>
 *
 * @see uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.SoftwareSystemArchitecturePackage#getInteraction()
 * @model
 * @generated
 */
public interface Interaction extends EObject {
	/**
	 * Returns the value of the '<em><b>Informationflow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Informationflow</em>' reference.
	 * @see #setInformationflow(Informationflow)
	 * @see uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.SoftwareSystemArchitecturePackage#getInteraction_Informationflow()
	 * @model required="true"
	 * @generated
	 */
	Informationflow getInformationflow();

	/**
	 * Sets the value of the '{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Interaction#getInformationflow <em>Informationflow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Informationflow</em>' reference.
	 * @see #getInformationflow()
	 * @generated
	 */
	void setInformationflow(Informationflow value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' attribute.
	 * @see #setData(int)
	 * @see uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.SoftwareSystemArchitecturePackage#getInteraction_Data()
	 * @model
	 * @generated
	 */
	int getData();

	/**
	 * Sets the value of the '{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Interaction#getData <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' attribute.
	 * @see #getData()
	 * @generated
	 */
	void setData(int value);

	/**
	 * Returns the value of the '<em><b>Force receiver as connector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Force receiver as connector</em>' attribute.
	 * @see #setForce_receiver_as_connector(boolean)
	 * @see uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.SoftwareSystemArchitecturePackage#getInteraction_Force_receiver_as_connector()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isForce_receiver_as_connector();

	/**
	 * Sets the value of the '{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Interaction#isForce_receiver_as_connector <em>Force receiver as connector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Force receiver as connector</em>' attribute.
	 * @see #isForce_receiver_as_connector()
	 * @generated
	 */
	void setForce_receiver_as_connector(boolean value);

} // Interaction
