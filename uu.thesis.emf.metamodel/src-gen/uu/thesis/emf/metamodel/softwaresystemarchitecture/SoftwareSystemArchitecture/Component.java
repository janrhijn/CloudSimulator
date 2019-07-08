/**
 */
package uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture;

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
 *   <li>{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Component#getName <em>Name</em>}</li>
 *   <li>{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Component#getContains <em>Contains</em>}</li>
 *   <li>{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Component#isPart_of_vpc <em>Part of vpc</em>}</li>
 *   <li>{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Component#getServer_duration <em>Server duration</em>}</li>
 *   <li>{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Component#getServer_unit <em>Server unit</em>}</li>
 *   <li>{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Component#getData_in <em>Data in</em>}</li>
 *   <li>{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Component#getData_out <em>Data out</em>}</li>
 *   <li>{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Component#getStorage_capacity <em>Storage capacity</em>}</li>
 *   <li>{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Component#getRequest <em>Request</em>}</li>
 *   <li>{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Component#getOperational_component_cost <em>Operational component cost</em>}</li>
 *   <li>{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Component#getMax_waiting_time <em>Max waiting time</em>}</li>
 *   <li>{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Component#getData_processed <em>Data processed</em>}</li>
 *   <li>{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Component#getCapability <em>Capability</em>}</li>
 * </ul>
 *
 * @see uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.SoftwareSystemArchitecturePackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.SoftwareSystemArchitecturePackage#getComponent_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Component#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Contains</b></em>' reference list.
	 * The list contents are of type {@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Feature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' reference list.
	 * @see uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.SoftwareSystemArchitecturePackage#getComponent_Contains()
	 * @model
	 * @generated
	 */
	EList<Feature> getContains();

	/**
	 * Returns the value of the '<em><b>Part of vpc</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part of vpc</em>' attribute.
	 * @see #setPart_of_vpc(boolean)
	 * @see uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.SoftwareSystemArchitecturePackage#getComponent_Part_of_vpc()
	 * @model default="true"
	 * @generated
	 */
	boolean isPart_of_vpc();

	/**
	 * Sets the value of the '{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Component#isPart_of_vpc <em>Part of vpc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part of vpc</em>' attribute.
	 * @see #isPart_of_vpc()
	 * @generated
	 */
	void setPart_of_vpc(boolean value);

	/**
	 * Returns the value of the '<em><b>Server duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server duration</em>' attribute.
	 * @see #setServer_duration(int)
	 * @see uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.SoftwareSystemArchitecturePackage#getComponent_Server_duration()
	 * @model
	 * @generated
	 */
	int getServer_duration();

	/**
	 * Sets the value of the '{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Component#getServer_duration <em>Server duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server duration</em>' attribute.
	 * @see #getServer_duration()
	 * @generated
	 */
	void setServer_duration(int value);

	/**
	 * Returns the value of the '<em><b>Server unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server unit</em>' attribute.
	 * @see #setServer_unit(int)
	 * @see uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.SoftwareSystemArchitecturePackage#getComponent_Server_unit()
	 * @model
	 * @generated
	 */
	int getServer_unit();

	/**
	 * Sets the value of the '{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Component#getServer_unit <em>Server unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server unit</em>' attribute.
	 * @see #getServer_unit()
	 * @generated
	 */
	void setServer_unit(int value);

	/**
	 * Returns the value of the '<em><b>Data in</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data in</em>' attribute.
	 * @see #setData_in(long)
	 * @see uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.SoftwareSystemArchitecturePackage#getComponent_Data_in()
	 * @model
	 * @generated
	 */
	long getData_in();

	/**
	 * Sets the value of the '{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Component#getData_in <em>Data in</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data in</em>' attribute.
	 * @see #getData_in()
	 * @generated
	 */
	void setData_in(long value);

	/**
	 * Returns the value of the '<em><b>Data out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data out</em>' attribute.
	 * @see #setData_out(long)
	 * @see uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.SoftwareSystemArchitecturePackage#getComponent_Data_out()
	 * @model
	 * @generated
	 */
	long getData_out();

	/**
	 * Sets the value of the '{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Component#getData_out <em>Data out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data out</em>' attribute.
	 * @see #getData_out()
	 * @generated
	 */
	void setData_out(long value);

	/**
	 * Returns the value of the '<em><b>Storage capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storage capacity</em>' attribute.
	 * @see #setStorage_capacity(long)
	 * @see uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.SoftwareSystemArchitecturePackage#getComponent_Storage_capacity()
	 * @model
	 * @generated
	 */
	long getStorage_capacity();

	/**
	 * Sets the value of the '{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Component#getStorage_capacity <em>Storage capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage capacity</em>' attribute.
	 * @see #getStorage_capacity()
	 * @generated
	 */
	void setStorage_capacity(long value);

	/**
	 * Returns the value of the '<em><b>Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request</em>' attribute.
	 * @see #setRequest(long)
	 * @see uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.SoftwareSystemArchitecturePackage#getComponent_Request()
	 * @model
	 * @generated
	 */
	long getRequest();

	/**
	 * Sets the value of the '{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Component#getRequest <em>Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request</em>' attribute.
	 * @see #getRequest()
	 * @generated
	 */
	void setRequest(long value);

	/**
	 * Returns the value of the '<em><b>Operational component cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operational component cost</em>' attribute.
	 * @see #setOperational_component_cost(double)
	 * @see uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.SoftwareSystemArchitecturePackage#getComponent_Operational_component_cost()
	 * @model
	 * @generated
	 */
	double getOperational_component_cost();

	/**
	 * Sets the value of the '{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Component#getOperational_component_cost <em>Operational component cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operational component cost</em>' attribute.
	 * @see #getOperational_component_cost()
	 * @generated
	 */
	void setOperational_component_cost(double value);

	/**
	 * Returns the value of the '<em><b>Max waiting time</b></em>' attribute.
	 * The default value is <code>"100"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max waiting time</em>' attribute.
	 * @see #setMax_waiting_time(int)
	 * @see uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.SoftwareSystemArchitecturePackage#getComponent_Max_waiting_time()
	 * @model default="100"
	 * @generated
	 */
	int getMax_waiting_time();

	/**
	 * Sets the value of the '{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Component#getMax_waiting_time <em>Max waiting time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max waiting time</em>' attribute.
	 * @see #getMax_waiting_time()
	 * @generated
	 */
	void setMax_waiting_time(int value);

	/**
	 * Returns the value of the '<em><b>Data processed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data processed</em>' attribute.
	 * @see #setData_processed(long)
	 * @see uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.SoftwareSystemArchitecturePackage#getComponent_Data_processed()
	 * @model
	 * @generated
	 */
	long getData_processed();

	/**
	 * Sets the value of the '{@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Component#getData_processed <em>Data processed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data processed</em>' attribute.
	 * @see #getData_processed()
	 * @generated
	 */
	void setData_processed(long value);

	/**
	 * Returns the value of the '<em><b>Capability</b></em>' containment reference list.
	 * The list contents are of type {@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Capability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capability</em>' containment reference list.
	 * @see uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.SoftwareSystemArchitecturePackage#getComponent_Capability()
	 * @model containment="true"
	 * @generated
	 */
	EList<Capability> getCapability();

} // Component
