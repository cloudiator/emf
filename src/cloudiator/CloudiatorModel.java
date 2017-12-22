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
 *   <li>{@link cloudiator.CloudiatorModel#getClouds <em>Clouds</em>}</li>
 *   <li>{@link cloudiator.CloudiatorModel#getOperatingsystems <em>Operatingsystems</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Operatingsystems</b></em>' containment reference list.
	 * The list contents are of type {@link cloudiator.OperatingSystem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operatingsystems</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operatingsystems</em>' containment reference list.
	 * @see cloudiator.CloudiatorPackage#getCloudiatorModel_Operatingsystems()
	 * @model containment="true"
	 * @generated
	 */
	EList<OperatingSystem> getOperatingsystems();

} // CloudiatorModel
