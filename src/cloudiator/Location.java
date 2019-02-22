/**
 */
package cloudiator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloudiator.Location#getName <em>Name</em>}</li>
 *   <li>{@link cloudiator.Location#getId <em>Id</em>}</li>
 *   <li>{@link cloudiator.Location#getCloud <em>Cloud</em>}</li>
 *   <li>{@link cloudiator.Location#getProviderId <em>Provider Id</em>}</li>
 *   <li>{@link cloudiator.Location#getGeoLocation <em>Geo Location</em>}</li>
 *   <li>{@link cloudiator.Location#isAssignable <em>Assignable</em>}</li>
 *   <li>{@link cloudiator.Location#getParent <em>Parent</em>}</li>
 *   <li>{@link cloudiator.Location#getLocationScope <em>Location Scope</em>}</li>
 *   <li>{@link cloudiator.Location#getState <em>State</em>}</li>
 * </ul>
 *
 * @see cloudiator.CloudiatorPackage#getLocation()
 * @model
 * @generated
 */
public interface Location extends EObject {
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
	 * @see cloudiator.CloudiatorPackage#getLocation_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cloudiator.Location#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see cloudiator.CloudiatorPackage#getLocation_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link cloudiator.Location#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Cloud</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link cloudiator.Cloud#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cloud</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cloud</em>' container reference.
	 * @see cloudiator.CloudiatorPackage#getLocation_Cloud()
	 * @see cloudiator.Cloud#getLocations
	 * @model opposite="locations" required="true" transient="false" changeable="false"
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
	 * @see cloudiator.CloudiatorPackage#getLocation_ProviderId()
	 * @model unique="false"
	 * @generated
	 */
	String getProviderId();

	/**
	 * Sets the value of the '{@link cloudiator.Location#getProviderId <em>Provider Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider Id</em>' attribute.
	 * @see #getProviderId()
	 * @generated
	 */
	void setProviderId(String value);

	/**
	 * Returns the value of the '<em><b>Geo Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geo Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geo Location</em>' containment reference.
	 * @see #setGeoLocation(GeoLocation)
	 * @see cloudiator.CloudiatorPackage#getLocation_GeoLocation()
	 * @model containment="true"
	 * @generated
	 */
	GeoLocation getGeoLocation();

	/**
	 * Sets the value of the '{@link cloudiator.Location#getGeoLocation <em>Geo Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geo Location</em>' containment reference.
	 * @see #getGeoLocation()
	 * @generated
	 */
	void setGeoLocation(GeoLocation value);

	/**
	 * Returns the value of the '<em><b>Assignable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assignable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignable</em>' attribute.
	 * @see #setAssignable(boolean)
	 * @see cloudiator.CloudiatorPackage#getLocation_Assignable()
	 * @model unique="false"
	 * @generated
	 */
	boolean isAssignable();

	/**
	 * Sets the value of the '{@link cloudiator.Location#isAssignable <em>Assignable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assignable</em>' attribute.
	 * @see #isAssignable()
	 * @generated
	 */
	void setAssignable(boolean value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(Location)
	 * @see cloudiator.CloudiatorPackage#getLocation_Parent()
	 * @model
	 * @generated
	 */
	Location getParent();

	/**
	 * Sets the value of the '{@link cloudiator.Location#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Location value);

	/**
	 * Returns the value of the '<em><b>Location Scope</b></em>' attribute.
	 * The default value is <code>"UNKOWN"</code>.
	 * The literals are from the enumeration {@link cloudiator.LocationScope}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location Scope</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location Scope</em>' attribute.
	 * @see cloudiator.LocationScope
	 * @see #setLocationScope(LocationScope)
	 * @see cloudiator.CloudiatorPackage#getLocation_LocationScope()
	 * @model default="UNKOWN"
	 * @generated
	 */
	LocationScope getLocationScope();

	/**
	 * Sets the value of the '{@link cloudiator.Location#getLocationScope <em>Location Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Scope</em>' attribute.
	 * @see cloudiator.LocationScope
	 * @see #getLocationScope()
	 * @generated
	 */
	void setLocationScope(LocationScope value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The default value is <code>"OK"</code>.
	 * The literals are from the enumeration {@link cloudiator.DiscoveryItemState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see cloudiator.DiscoveryItemState
	 * @see #setState(DiscoveryItemState)
	 * @see cloudiator.CloudiatorPackage#getLocation_State()
	 * @model default="OK"
	 * @generated
	 */
	DiscoveryItemState getState();

	/**
	 * Sets the value of the '{@link cloudiator.Location#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see cloudiator.DiscoveryItemState
	 * @see #getState()
	 * @generated
	 */
	void setState(DiscoveryItemState value);

} // Location
