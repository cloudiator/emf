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
 *   <li>{@link cloudiator.Cloud#getLocations <em>Locations</em>}</li>
 *   <li>{@link cloudiator.Cloud#getHardwareList <em>Hardware List</em>}</li>
 *   <li>{@link cloudiator.Cloud#getImages <em>Images</em>}</li>
 *   <li>{@link cloudiator.Cloud#getId <em>Id</em>}</li>
 *   <li>{@link cloudiator.Cloud#getPrices <em>Prices</em>}</li>
 *   <li>{@link cloudiator.Cloud#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link cloudiator.Cloud#getApi <em>Api</em>}</li>
 *   <li>{@link cloudiator.Cloud#getCloudcredential <em>Cloudcredential</em>}</li>
 *   <li>{@link cloudiator.Cloud#getConfiguration <em>Configuration</em>}</li>
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
	 * It is bidirectional and its opposite is '{@link cloudiator.Image#getCloud <em>Cloud</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Images</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Images</em>' containment reference list.
	 * @see cloudiator.CloudiatorPackage#getCloud_Images()
	 * @see cloudiator.Image#getCloud
	 * @model opposite="cloud" containment="true"
	 * @generated
	 */
	EList<Image> getImages();

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
	 * @see cloudiator.CloudiatorPackage#getCloud_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link cloudiator.Cloud#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Prices</b></em>' containment reference list.
	 * The list contents are of type {@link cloudiator.Price}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prices</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prices</em>' containment reference list.
	 * @see cloudiator.CloudiatorPackage#getCloud_Prices()
	 * @model containment="true"
	 * @generated
	 */
	EList<Price> getPrices();

	/**
	 * Returns the value of the '<em><b>Endpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endpoint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint</em>' attribute.
	 * @see #setEndpoint(String)
	 * @see cloudiator.CloudiatorPackage#getCloud_Endpoint()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getEndpoint();

	/**
	 * Sets the value of the '{@link cloudiator.Cloud#getEndpoint <em>Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint</em>' attribute.
	 * @see #getEndpoint()
	 * @generated
	 */
	void setEndpoint(String value);

	/**
	 * Returns the value of the '<em><b>Api</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api</em>' containment reference.
	 * @see #setApi(Api)
	 * @see cloudiator.CloudiatorPackage#getCloud_Api()
	 * @model containment="true"
	 * @generated
	 */
	Api getApi();

	/**
	 * Sets the value of the '{@link cloudiator.Cloud#getApi <em>Api</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api</em>' containment reference.
	 * @see #getApi()
	 * @generated
	 */
	void setApi(Api value);

	/**
	 * Returns the value of the '<em><b>Cloudcredential</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cloudcredential</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cloudcredential</em>' containment reference.
	 * @see #setCloudcredential(CloudCredential)
	 * @see cloudiator.CloudiatorPackage#getCloud_Cloudcredential()
	 * @model containment="true"
	 * @generated
	 */
	CloudCredential getCloudcredential();

	/**
	 * Sets the value of the '{@link cloudiator.Cloud#getCloudcredential <em>Cloudcredential</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cloudcredential</em>' containment reference.
	 * @see #getCloudcredential()
	 * @generated
	 */
	void setCloudcredential(CloudCredential value);

	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' containment reference.
	 * @see #setConfiguration(CloudConfiguration)
	 * @see cloudiator.CloudiatorPackage#getCloud_Configuration()
	 * @model containment="true"
	 * @generated
	 */
	CloudConfiguration getConfiguration();

	/**
	 * Sets the value of the '{@link cloudiator.Cloud#getConfiguration <em>Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' containment reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(CloudConfiguration value);

	/**
	 * Returns the value of the '<em><b>Hardware List</b></em>' containment reference list.
	 * The list contents are of type {@link cloudiator.Hardware}.
	 * It is bidirectional and its opposite is '{@link cloudiator.Hardware#getCloud <em>Cloud</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hardware List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hardware List</em>' containment reference list.
	 * @see cloudiator.CloudiatorPackage#getCloud_HardwareList()
	 * @see cloudiator.Hardware#getCloud
	 * @model opposite="cloud" containment="true"
	 * @generated
	 */
	EList<Hardware> getHardwareList();

	/**
	 * Returns the value of the '<em><b>Locations</b></em>' containment reference list.
	 * The list contents are of type {@link cloudiator.Location}.
	 * It is bidirectional and its opposite is '{@link cloudiator.Location#getCloud <em>Cloud</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locations</em>' containment reference list.
	 * @see cloudiator.CloudiatorPackage#getCloud_Locations()
	 * @see cloudiator.Location#getCloud
	 * @model opposite="cloud" containment="true"
	 * @generated
	 */
	EList<Location> getLocations();

} // Cloud
