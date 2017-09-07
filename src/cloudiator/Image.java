/**
 */
package cloudiator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloudiator.Image#getName <em>Name</em>}</li>
 *   <li>{@link cloudiator.Image#getOperatingSystem <em>Operating System</em>}</li>
 *   <li>{@link cloudiator.Image#getId <em>Id</em>}</li>
 *   <li>{@link cloudiator.Image#getCloud <em>Cloud</em>}</li>
 *   <li>{@link cloudiator.Image#getProviderId <em>Provider Id</em>}</li>
 *   <li>{@link cloudiator.Image#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see cloudiator.CloudiatorPackage#getImage()
 * @model
 * @generated
 */
public interface Image extends EObject {
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
	 * @see cloudiator.CloudiatorPackage#getImage_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cloudiator.Image#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Operating System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operating System</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operating System</em>' reference.
	 * @see #setOperatingSystem(OperatingSystem)
	 * @see cloudiator.CloudiatorPackage#getImage_OperatingSystem()
	 * @model
	 * @generated
	 */
	OperatingSystem getOperatingSystem();

	/**
	 * Sets the value of the '{@link cloudiator.Image#getOperatingSystem <em>Operating System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operating System</em>' reference.
	 * @see #getOperatingSystem()
	 * @generated
	 */
	void setOperatingSystem(OperatingSystem value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see cloudiator.CloudiatorPackage#getImage_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link cloudiator.Image#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Cloud</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link cloudiator.Cloud#getImages <em>Images</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cloud</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cloud</em>' container reference.
	 * @see cloudiator.CloudiatorPackage#getImage_Cloud()
	 * @see cloudiator.Cloud#getImages
	 * @model opposite="images" required="true" transient="false" changeable="false"
	 * @generated
	 */
	Cloud getCloud();

	/**
	 * Returns the value of the '<em><b>Provider Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provider Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider Id</em>' attribute.
	 * @see #setProviderId(String)
	 * @see cloudiator.CloudiatorPackage#getImage_ProviderId()
	 * @model
	 * @generated
	 */
	String getProviderId();

	/**
	 * Sets the value of the '{@link cloudiator.Image#getProviderId <em>Provider Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider Id</em>' attribute.
	 * @see #getProviderId()
	 * @generated
	 */
	void setProviderId(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(Location)
	 * @see cloudiator.CloudiatorPackage#getImage_Location()
	 * @model
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link cloudiator.Image#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

} // Image
