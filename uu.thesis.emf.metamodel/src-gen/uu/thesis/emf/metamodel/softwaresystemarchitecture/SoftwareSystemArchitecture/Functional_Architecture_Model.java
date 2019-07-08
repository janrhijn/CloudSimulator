/**
 */
package uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Functional_Architecture_Model#getScenario_overlay <em>Scenario overlay</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Scenario overlay</b></em>' containment reference list.
	 * The list contents are of type {@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Scenario}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario overlay</em>' containment reference list.
	 * @see uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.SoftwareSystemArchitecturePackage#getFunctional_Architecture_Model_Scenario_overlay()
	 * @model containment="true"
	 * @generated
	 */
	EList<Scenario> getScenario_overlay();

} // Functional_Architecture_Model
