/**
 */
package cloudiator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cloud Credential</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloudiator.CloudCredential#getUser <em>User</em>}</li>
 *   <li>{@link cloudiator.CloudCredential#getSecret <em>Secret</em>}</li>
 * </ul>
 *
 * @see cloudiator.CloudiatorPackage#getCloudCredential()
 * @model
 * @generated
 */
public interface CloudCredential extends EObject {
	/**
	 * Returns the value of the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' attribute.
	 * @see #setUser(String)
	 * @see cloudiator.CloudiatorPackage#getCloudCredential_User()
	 * @model unique="false"
	 * @generated
	 */
	String getUser();

	/**
	 * Sets the value of the '{@link cloudiator.CloudCredential#getUser <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' attribute.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(String value);

	/**
	 * Returns the value of the '<em><b>Secret</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Secret</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secret</em>' attribute.
	 * @see #setSecret(String)
	 * @see cloudiator.CloudiatorPackage#getCloudCredential_Secret()
	 * @model unique="false"
	 * @generated
	 */
	String getSecret();

	/**
	 * Sets the value of the '{@link cloudiator.CloudCredential#getSecret <em>Secret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secret</em>' attribute.
	 * @see #getSecret()
	 * @generated
	 */
	void setSecret(String value);

} // CloudCredential
