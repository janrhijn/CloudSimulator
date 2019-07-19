/**
 */
package uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functional Architecture Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Functional_Architecture_Model#getProduct_context <em>Product context</em>}</li>
 * </ul>
 *
 * @see uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.SoftwareSystemArchitecturePackage#getFunctional_Architecture_Model()
 * @model
 * @generated
 */
public interface Functional_Architecture_Model extends Viewpoint {
	/**
	 * Returns the value of the '<em><b>Product context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product context</em>' containment reference.
	 * @see #setProduct_context(uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Module)
	 * @see uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.SoftwareSystemArchitecturePackage#getFunctional_Architecture_Model_Product_context()
	 * @model containment="true" required="true"
	 * @generated
	 */
	uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Module getProduct_context();

	/**
	 * Sets the value of the '{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Functional_Architecture_Model#getProduct_context <em>Product context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product context</em>' containment reference.
	 * @see #getProduct_context()
	 * @generated
	 */
	void setProduct_context(uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Module value);

} // Functional_Architecture_Model
