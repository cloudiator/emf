/**
 */
package cloudiator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Discovery Item State</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see cloudiator.CloudiatorPackage#getDiscoveryItemState()
 * @model
 * @generated
 */
public enum DiscoveryItemState implements Enumerator {
	/**
	 * The '<em><b>NEW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEW_VALUE
	 * @generated
	 * @ordered
	 */
	NEW(0, "NEW", "NEW"),

	/**
	 * The '<em><b>OK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OK_VALUE
	 * @generated
	 * @ordered
	 */
	OK(1, "OK", "OK"),

	/**
	 * The '<em><b>REMOTELY DELETED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMOTELY_DELETED_VALUE
	 * @generated
	 * @ordered
	 */
	REMOTELY_DELETED(2, "REMOTELY_DELETED", "REMOTELY_DELETED"),

	/**
	 * The '<em><b>LOCALLY DELETED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCALLY_DELETED_VALUE
	 * @generated
	 * @ordered
	 */
	LOCALLY_DELETED(3, "LOCALLY_DELETED", "LOCALLY_DELETED"),

	/**
	 * The '<em><b>DISABLED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISABLED_VALUE
	 * @generated
	 * @ordered
	 */
	DISABLED(4, "DISABLED", "DISABLED"),

	/**
	 * The '<em><b>DELETED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELETED_VALUE
	 * @generated
	 * @ordered
	 */
	DELETED(5, "DELETED", "DELETED"),

	/**
	 * The '<em><b>UNKOWN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKOWN(6, "UNKOWN", "UNKOWN");

	/**
	 * The '<em><b>NEW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NEW</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NEW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NEW_VALUE = 0;

	/**
	 * The '<em><b>OK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OK_VALUE = 1;

	/**
	 * The '<em><b>REMOTELY DELETED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REMOTELY DELETED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REMOTELY_DELETED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REMOTELY_DELETED_VALUE = 2;

	/**
	 * The '<em><b>LOCALLY DELETED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LOCALLY DELETED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOCALLY_DELETED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOCALLY_DELETED_VALUE = 3;

	/**
	 * The '<em><b>DISABLED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DISABLED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISABLED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DISABLED_VALUE = 4;

	/**
	 * The '<em><b>DELETED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DELETED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DELETED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DELETED_VALUE = 5;

	/**
	 * The '<em><b>UNKOWN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNKOWN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNKOWN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNKOWN_VALUE = 6;

	/**
	 * An array of all the '<em><b>Discovery Item State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DiscoveryItemState[] VALUES_ARRAY =
		new DiscoveryItemState[] {
			NEW,
			OK,
			REMOTELY_DELETED,
			LOCALLY_DELETED,
			DISABLED,
			DELETED,
			UNKOWN,
		};

	/**
	 * A public read-only list of all the '<em><b>Discovery Item State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DiscoveryItemState> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Discovery Item State</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DiscoveryItemState get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DiscoveryItemState result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Discovery Item State</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DiscoveryItemState getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DiscoveryItemState result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Discovery Item State</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DiscoveryItemState get(int value) {
		switch (value) {
			case NEW_VALUE: return NEW;
			case OK_VALUE: return OK;
			case REMOTELY_DELETED_VALUE: return REMOTELY_DELETED;
			case LOCALLY_DELETED_VALUE: return LOCALLY_DELETED;
			case DISABLED_VALUE: return DISABLED;
			case DELETED_VALUE: return DELETED;
			case UNKOWN_VALUE: return UNKOWN;
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
	private DiscoveryItemState(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	
} //DiscoveryItemState
