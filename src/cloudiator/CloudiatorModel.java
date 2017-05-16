/**
 */
package cloudiator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloudiator.CloudiatorModel#getComponents <em>Components</em>}</li>
 *   <li>{@link cloudiator.CloudiatorModel#getNodes <em>Nodes</em>}</li>
 *   <li>{@link cloudiator.CloudiatorModel#getImages <em>Images</em>}</li>
 *   <li>{@link cloudiator.CloudiatorModel#getHardwareList <em>Hardware List</em>}</li>
 *   <li>{@link cloudiator.CloudiatorModel#getLocations <em>Locations</em>}</li>
 *   <li>{@link cloudiator.CloudiatorModel#getClouds <em>Clouds</em>}</li>
 * </ul>
 *
 * @see cloudiator.CloudiatorPackage#getCloudiatorModel()
 * @model
 * @generated
 */
public interface CloudiatorModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link cloudiator.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see cloudiator.CloudiatorPackage#getCloudiatorModel_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component> getComponents();

	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link cloudiator.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see cloudiator.CloudiatorPackage#getCloudiatorModel_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getNodes();

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
	 * @see cloudiator.CloudiatorPackage#getCloudiatorModel_Images()
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
	 * @see cloudiator.CloudiatorPackage#getCloudiatorModel_HardwareList()
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
	 * @see cloudiator.CloudiatorPackage#getCloudiatorModel_Locations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Location> getLocations();

	/**
	 * Returns the value of the '<em><b>Clouds</b></em>' containment reference list.
	 * The list contents are of type {@link cloudiator.Cloud}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clouds</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clouds</em>' containment reference list.
	 * @see cloudiator.CloudiatorPackage#getCloudiatorModel_Clouds()
	 * @model containment="true"
	 * @generated
	 */
	EList<Cloud> getClouds();

} // CloudiatorModel
