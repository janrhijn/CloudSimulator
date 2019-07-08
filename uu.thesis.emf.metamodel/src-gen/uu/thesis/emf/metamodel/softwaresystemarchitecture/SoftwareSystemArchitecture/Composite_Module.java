/**
 */
package uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Composite_Module#getSub_module <em>Sub module</em>}</li>
 * </ul>
 *
 * @see uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.SoftwareSystemArchitecturePackage#getComposite_Module()
 * @model
 * @generated
 */
public interface Composite_Module
		extends uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Module {
	/**
	 * Returns the value of the '<em><b>Sub module</b></em>' containment reference list.
	 * The list contents are of type {@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Module}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub module</em>' containment reference list.
	 * @see uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.SoftwareSystemArchitecturePackage#getComposite_Module_Sub_module()
	 * @model containment="true"
	 * @generated
	 */
	EList<uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Module> getSub_module();

} // Composite_Module
