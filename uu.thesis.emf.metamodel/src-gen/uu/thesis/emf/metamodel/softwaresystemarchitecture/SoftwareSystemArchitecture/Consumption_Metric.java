/**
 */
package uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Consumption Metric</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.SoftwareSystemArchitecturePackage#getConsumption_Metric()
 * @model
 * @generated
 */
public enum Consumption_Metric implements Enumerator {
	/**
	 * The '<em><b>SERVER DURATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVER_DURATION_VALUE
	 * @generated
	 * @ordered
	 */
	SERVER_DURATION(0, "SERVER_DURATION", "SERVER_DURATION"),

	/**
	 * The '<em><b>SERVER UNIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVER_UNIT_VALUE
	 * @generated
	 * @ordered
	 */
	SERVER_UNIT(1, "SERVER_UNIT", "SERVER_UNIT"),

	/**
	 * The '<em><b>DATA IN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_IN_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_IN(2, "DATA_IN", "DATA_IN"),

	/**
	 * The '<em><b>DATA OUT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_OUT_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_OUT(3, "DATA_OUT", "DATA_OUT"),

	/**
	 * The '<em><b>DATA PROCESSED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_PROCESSED_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_PROCESSED(4, "DATA_PROCESSED", "DATA_PROCESSED"),

	/**
	 * The '<em><b>STORAGE CAPACITY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STORAGE_CAPACITY_VALUE
	 * @generated
	 * @ordered
	 */
	STORAGE_CAPACITY(5, "STORAGE_CAPACITY", "STORAGE_CAPACITY"),

	/**
	 * The '<em><b>REQUEST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUEST_VALUE
	 * @generated
	 * @ordered
	 */
	REQUEST(6, "REQUEST", "REQUEST");

	/**
	 * The '<em><b>SERVER DURATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVER_DURATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SERVER_DURATION_VALUE = 0;

	/**
	 * The '<em><b>SERVER UNIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVER_UNIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SERVER_UNIT_VALUE = 1;

	/**
	 * The '<em><b>DATA IN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_IN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATA_IN_VALUE = 2;

	/**
	 * The '<em><b>DATA OUT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_OUT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATA_OUT_VALUE = 3;

	/**
	 * The '<em><b>DATA PROCESSED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_PROCESSED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATA_PROCESSED_VALUE = 4;

	/**
	 * The '<em><b>STORAGE CAPACITY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STORAGE_CAPACITY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STORAGE_CAPACITY_VALUE = 5;

	/**
	 * The '<em><b>REQUEST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUEST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST_VALUE = 6;

	/**
	 * An array of all the '<em><b>Consumption Metric</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Consumption_Metric[] VALUES_ARRAY = new Consumption_Metric[] { SERVER_DURATION, SERVER_UNIT,
			DATA_IN, DATA_OUT, DATA_PROCESSED, STORAGE_CAPACITY, REQUEST, };

	/**
	 * A public read-only list of all the '<em><b>Consumption Metric</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Consumption_Metric> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Consumption Metric</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Consumption_Metric get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Consumption_Metric result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Consumption Metric</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Consumption_Metric getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Consumption_Metric result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Consumption Metric</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Consumption_Metric get(int value) {
		switch (value) {
		case SERVER_DURATION_VALUE:
			return SERVER_DURATION;
		case SERVER_UNIT_VALUE:
			return SERVER_UNIT;
		case DATA_IN_VALUE:
			return DATA_IN;
		case DATA_OUT_VALUE:
			return DATA_OUT;
		case DATA_PROCESSED_VALUE:
			return DATA_PROCESSED;
		case STORAGE_CAPACITY_VALUE:
			return STORAGE_CAPACITY;
		case REQUEST_VALUE:
			return REQUEST;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Consumption_Metric(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //Consumption_Metric
