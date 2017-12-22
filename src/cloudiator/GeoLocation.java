/**
 */
package cloudiator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geo Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloudiator.GeoLocation#getCountry <em>Country</em>}</li>
 *   <li>{@link cloudiator.GeoLocation#getCity <em>City</em>}</li>
 *   <li>{@link cloudiator.GeoLocation#getLongitude <em>Longitude</em>}</li>
 *   <li>{@link cloudiator.GeoLocation#getLatitude <em>Latitude</em>}</li>
 * </ul>
 *
 * @see cloudiator.CloudiatorPackage#getGeoLocation()
 * @model
 * @generated
 */
public interface GeoLocation extends EObject {
	/**
	 * Returns the value of the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' attribute.
	 * @see #setCountry(String)
	 * @see cloudiator.CloudiatorPackage#getGeoLocation_Country()
	 * @model unique="false"
	 * @generated
	 */
	String getCountry();

	/**
	 * Sets the value of the '{@link cloudiator.GeoLocation#getCountry <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' attribute.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(String value);

	/**
	 * Returns the value of the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>City</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City</em>' attribute.
	 * @see #setCity(String)
	 * @see cloudiator.CloudiatorPackage#getGeoLocation_City()
	 * @model unique="false"
	 * @generated
	 */
	String getCity();

	/**
	 * Sets the value of the '{@link cloudiator.GeoLocation#getCity <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' attribute.
	 * @see #getCity()
	 * @generated
	 */
	void setCity(String value);

	/**
	 * Returns the value of the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Longitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Longitude</em>' attribute.
	 * @see #setLongitude(Double)
	 * @see cloudiator.CloudiatorPackage#getGeoLocation_Longitude()
	 * @model unique="false"
	 * @generated
	 */
	Double getLongitude();

	/**
	 * Sets the value of the '{@link cloudiator.GeoLocation#getLongitude <em>Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longitude</em>' attribute.
	 * @see #getLongitude()
	 * @generated
	 */
	void setLongitude(Double value);

	/**
	 * Returns the value of the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Latitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latitude</em>' attribute.
	 * @see #setLatitude(Double)
	 * @see cloudiator.CloudiatorPackage#getGeoLocation_Latitude()
	 * @model unique="false"
	 * @generated
	 */
	Double getLatitude();

	/**
	 * Sets the value of the '{@link cloudiator.GeoLocation#getLatitude <em>Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latitude</em>' attribute.
	 * @see #getLatitude()
	 * @generated
	 */
	void setLatitude(Double value);

} // GeoLocation
