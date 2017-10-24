/**
 */
package cloudiator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Price</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloudiator.Price#getPrice <em>Price</em>}</li>
 *   <li>{@link cloudiator.Price#getLocation <em>Location</em>}</li>
 *   <li>{@link cloudiator.Price#getImage <em>Image</em>}</li>
 *   <li>{@link cloudiator.Price#getHardware <em>Hardware</em>}</li>
 * </ul>
 *
 * @see cloudiator.CloudiatorPackage#getPrice()
 * @model
 * @generated
 */
public interface Price extends EObject {
	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #setPrice(Double)
	 * @see cloudiator.CloudiatorPackage#getPrice_Price()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DoubleObject"
	 * @generated
	 */
	Double getPrice();

	/**
	 * Sets the value of the '{@link cloudiator.Price#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(Double value);

	/**
	 * Returns the value of the '<em><b>Hardware</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hardware</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hardware</em>' reference.
	 * @see #setHardware(Hardware)
	 * @see cloudiator.CloudiatorPackage#getPrice_Hardware()
	 * @model required="true"
	 * @generated
	 */
	Hardware getHardware();

	/**
	 * Sets the value of the '{@link cloudiator.Price#getHardware <em>Hardware</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hardware</em>' reference.
	 * @see #getHardware()
	 * @generated
	 */
	void setHardware(Hardware value);

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
	 * @see cloudiator.CloudiatorPackage#getPrice_Location()
	 * @model required="true"
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link cloudiator.Price#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

	/**
	 * Returns the value of the '<em><b>Image</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' reference.
	 * @see #setImage(Image)
	 * @see cloudiator.CloudiatorPackage#getPrice_Image()
	 * @model required="true"
	 * @generated
	 */
	Image getImage();

	/**
	 * Sets the value of the '{@link cloudiator.Price#getImage <em>Image</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' reference.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(Image value);

} // Price
