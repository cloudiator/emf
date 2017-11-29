/**
 */
package cloudiator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cloud Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloudiator.CloudConfiguration#getNodeGroup <em>Node Group</em>}</li>
 *   <li>{@link cloudiator.CloudConfiguration#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see cloudiator.CloudiatorPackage#getCloudConfiguration()
 * @model
 * @generated
 */
public interface CloudConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Node Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Group</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Group</em>' attribute.
	 * @see #setNodeGroup(String)
	 * @see cloudiator.CloudiatorPackage#getCloudConfiguration_NodeGroup()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getNodeGroup();

	/**
	 * Sets the value of the '{@link cloudiator.CloudConfiguration#getNodeGroup <em>Node Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Group</em>' attribute.
	 * @see #getNodeGroup()
	 * @generated
	 */
	void setNodeGroup(String value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' reference list.
	 * The list contents are of type {@link cloudiator.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' reference list.
	 * @see cloudiator.CloudiatorPackage#getCloudConfiguration_Properties()
	 * @model
	 * @generated
	 */
	EList<Property> getProperties();

} // CloudConfiguration
