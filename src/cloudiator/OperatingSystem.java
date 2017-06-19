/**
 */
package cloudiator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operating System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloudiator.OperatingSystem#getFamily <em>Family</em>}</li>
 *   <li>{@link cloudiator.OperatingSystem#getVersion <em>Version</em>}</li>
 *   <li>{@link cloudiator.OperatingSystem#getArchitecture <em>Architecture</em>}</li>
 * </ul>
 *
 * @see cloudiator.CloudiatorPackage#getOperatingSystem()
 * @model
 * @generated
 */
public interface OperatingSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Family</b></em>' attribute.
	 * The literals are from the enumeration {@link cloudiator.OSFamily}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Family</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Family</em>' attribute.
	 * @see cloudiator.OSFamily
	 * @see #setFamily(OSFamily)
	 * @see cloudiator.CloudiatorPackage#getOperatingSystem_Family()
	 * @model
	 * @generated
	 */
	OSFamily getFamily();

	/**
	 * Sets the value of the '{@link cloudiator.OperatingSystem#getFamily <em>Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Family</em>' attribute.
	 * @see cloudiator.OSFamily
	 * @see #getFamily()
	 * @generated
	 */
	void setFamily(OSFamily value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see cloudiator.CloudiatorPackage#getOperatingSystem_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link cloudiator.OperatingSystem#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Architecture</b></em>' attribute.
	 * The literals are from the enumeration {@link cloudiator.OSArchitecture}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Architecture</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Architecture</em>' attribute.
	 * @see cloudiator.OSArchitecture
	 * @see #setArchitecture(OSArchitecture)
	 * @see cloudiator.CloudiatorPackage#getOperatingSystem_Architecture()
	 * @model
	 * @generated
	 */
	OSArchitecture getArchitecture();

	/**
	 * Sets the value of the '{@link cloudiator.OperatingSystem#getArchitecture <em>Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Architecture</em>' attribute.
	 * @see cloudiator.OSArchitecture
	 * @see #getArchitecture()
	 * @generated
	 */
	void setArchitecture(OSArchitecture value);

} // OperatingSystem
