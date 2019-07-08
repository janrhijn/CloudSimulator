/**
 */
package uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Feature#getName <em>Name</em>}</li>
 *   <li>{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Feature#getFlow <em>Flow</em>}</li>
 *   <li>{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Feature#getFeature_type <em>Feature type</em>}</li>
 *   <li>{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Feature#getServicerate <em>Servicerate</em>}</li>
 * </ul>
 *
 * @see uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.SoftwareSystemArchitecturePackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.SoftwareSystemArchitecturePackage#getFeature_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Feature#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Flow</b></em>' containment reference list.
	 * The list contents are of type {@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Informationflow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow</em>' containment reference list.
	 * @see uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.SoftwareSystemArchitecturePackage#getFeature_Flow()
	 * @model containment="true"
	 * @generated
	 */
	EList<Informationflow> getFlow();

	/**
	 * Returns the value of the '<em><b>Feature type</b></em>' attribute.
	 * The literals are from the enumeration {@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Feature_Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature type</em>' attribute.
	 * @see uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Feature_Type
	 * @see #setFeature_type(Feature_Type)
	 * @see uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.SoftwareSystemArchitecturePackage#getFeature_Feature_type()
	 * @model
	 * @generated
	 */
	Feature_Type getFeature_type();

	/**
	 * Sets the value of the '{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Feature#getFeature_type <em>Feature type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature type</em>' attribute.
	 * @see uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Feature_Type
	 * @see #getFeature_type()
	 * @generated
	 */
	void setFeature_type(Feature_Type value);

	/**
	 * Returns the value of the '<em><b>Servicerate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servicerate</em>' attribute.
	 * @see #setServicerate(double)
	 * @see uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.SoftwareSystemArchitecturePackage#getFeature_Servicerate()
	 * @model
	 * @generated
	 */
	double getServicerate();

	/**
	 * Sets the value of the '{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Feature#getServicerate <em>Servicerate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Servicerate</em>' attribute.
	 * @see #getServicerate()
	 * @generated
	 */
	void setServicerate(double value);

} // Feature
