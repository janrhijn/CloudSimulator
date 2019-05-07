/**
 */
package org.eclipse.sirius.deployment;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Consumption Metric</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.sirius.deployment.DeploymentPackage#getConsumptionMetric()
 * @model
 * @generated
 */
public enum ConsumptionMetric implements Enumerator {
	/**
	 * The '<em><b>Server Duration</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVER_DURATION_VALUE
	 * @generated
	 * @ordered
	 */
	SERVER_DURATION(0, "serverDuration", "serverDuration"),

	/**
	 * The '<em><b>Server Unit Time</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVER_UNIT_TIME_VALUE
	 * @generated
	 * @ordered
	 */
	SERVER_UNIT_TIME(1, "serverUnitTime", "serverUnitTime"),

	/**
	 * The '<em><b>Data In</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_IN_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_IN(2, "dataIn", "dataIn"),

	/**
	 * The '<em><b>Data Out</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_OUT_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_OUT(3, "dataOut", "dataOut"),

	/**
	 * The '<em><b>Storage Capacity</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STORAGE_CAPACITY_VALUE
	 * @generated
	 * @ordered
	 */
	STORAGE_CAPACITY(4, "storageCapacity", "storageCapacity"),

	/**
	 * The '<em><b>Request</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUEST_VALUE
	 * @generated
	 * @ordered
	 */
	REQUEST(5, "request", "request"),

	/**
	 * The '<em><b>Data Processed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_PROCESSED_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_PROCESSED(6, "dataProcessed", "dataProcessed");

	/**
	 * The '<em><b>Server Duration</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Server Duration</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SERVER_DURATION
	 * @model name="serverDuration"
	 * @generated
	 * @ordered
	 */
	public static final int SERVER_DURATION_VALUE = 0;

	/**
	 * The '<em><b>Server Unit Time</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Server Unit Time</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SERVER_UNIT_TIME
	 * @model name="serverUnitTime"
	 * @generated
	 * @ordered
	 */
	public static final int SERVER_UNIT_TIME_VALUE = 1;

	/**
	 * The '<em><b>Data In</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Data In</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATA_IN
	 * @model name="dataIn"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_IN_VALUE = 2;

	/**
	 * The '<em><b>Data Out</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Data Out</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATA_OUT
	 * @model name="dataOut"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_OUT_VALUE = 3;

	/**
	 * The '<em><b>Storage Capacity</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Storage Capacity</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STORAGE_CAPACITY
	 * @model name="storageCapacity"
	 * @generated
	 * @ordered
	 */
	public static final int STORAGE_CAPACITY_VALUE = 4;

	/**
	 * The '<em><b>Request</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Request</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REQUEST
	 * @model name="request"
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST_VALUE = 5;

	/**
	 * The '<em><b>Data Processed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Data Processed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATA_PROCESSED
	 * @model name="dataProcessed"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_PROCESSED_VALUE = 6;

	/**
	 * An array of all the '<em><b>Consumption Metric</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ConsumptionMetric[] VALUES_ARRAY = new ConsumptionMetric[] { SERVER_DURATION, SERVER_UNIT_TIME,
			DATA_IN, DATA_OUT, STORAGE_CAPACITY, REQUEST, DATA_PROCESSED, };

	/**
	 * A public read-only list of all the '<em><b>Consumption Metric</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ConsumptionMetric> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Consumption Metric</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConsumptionMetric get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConsumptionMetric result = VALUES_ARRAY[i];
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
	public static ConsumptionMetric getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConsumptionMetric result = VALUES_ARRAY[i];
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
	public static ConsumptionMetric get(int value) {
		switch (value) {
		case SERVER_DURATION_VALUE:
			return SERVER_DURATION;
		case SERVER_UNIT_TIME_VALUE:
			return SERVER_UNIT_TIME;
		case DATA_IN_VALUE:
			return DATA_IN;
		case DATA_OUT_VALUE:
			return DATA_OUT;
		case STORAGE_CAPACITY_VALUE:
			return STORAGE_CAPACITY;
		case REQUEST_VALUE:
			return REQUEST;
		case DATA_PROCESSED_VALUE:
			return DATA_PROCESSED;
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
	private ConsumptionMetric(int value, String name, String literal) {
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

} //ConsumptionMetric
