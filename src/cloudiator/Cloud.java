/**
 */
package cloudiator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cloud</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloudiator.Cloud#getType <em>Type</em>}</li>
 *   <li>{@link cloudiator.Cloud#getImages <em>Images</em>}</li>
 *   <li>{@link cloudiator.Cloud#getHardwareList <em>Hardware List</em>}</li>
 *   <li>{@link cloudiator.Cloud#getLocations <em>Locations</em>}</li>
 *   <li>{@link cloudiator.Cloud#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see cloudiator.CloudiatorPackage#getCloud()
 * @model
 * @generated
 */
public interface Cloud extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link cloudiator.CloudType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see cloudiator.CloudType
	 * @see #setType(CloudType)
	 * @see cloudiator.CloudiatorPackage#getCloud_Type()
	 * @model
	 * @generated
	 */
	CloudType getType();

	/**
	 * Sets the value of the '{@link cloudiator.Cloud#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see cloudiator.CloudType
	 * @see #getType()
	 * @generated
	 */
	void setType(CloudType value);

	/**
	 * Returns the value of the '<em><b>Images</b></em>' containment reference list.
	 * The list contents are of type {@link cloudiator.Image}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Images</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Images</em>' containment reference list.
	 * @see cloudiator.CloudiatorPackage#getCloud_Images()
	 * @model containment="true"
	 * @generated
	 */
	EList<Image> getImages();

	/**
	 * Returns the value of the '<em><b>Hardware List</b></em>' containment reference list.
	 * The list contents are of type {@link cloudiator.Hardware}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hardware List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hardware List</em>' containment reference list.
	 * @see cloudiator.CloudiatorPackage#getCloud_HardwareList()
	 * @model containment="true"
	 * @generated
	 */
	EList<Hardware> getHardwareList();

	/**
	 * Returns the value of the '<em><b>Locations</b></em>' containment reference list.
	 * The list contents are of type {@link cloudiator.Location}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locations</em>' containment reference list.
	 * @see cloudiator.CloudiatorPackage#getCloud_Locations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Location> getLocations();

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
	 * @see cloudiator.CloudiatorPackage#getCloud_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cloudiator.Cloud#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Cloud
