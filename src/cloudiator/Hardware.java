/**
 */
package cloudiator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hardware</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloudiator.Hardware#getCores <em>Cores</em>}</li>
 *   <li>{@link cloudiator.Hardware#getName <em>Name</em>}</li>
 *   <li>{@link cloudiator.Hardware#getRam <em>Ram</em>}</li>
 *   <li>{@link cloudiator.Hardware#getDisk <em>Disk</em>}</li>
 *   <li>{@link cloudiator.Hardware#getId <em>Id</em>}</li>
 *   <li>{@link cloudiator.Hardware#getCloud <em>Cloud</em>}</li>
 *   <li>{@link cloudiator.Hardware#getProviderId <em>Provider Id</em>}</li>
 *   <li>{@link cloudiator.Hardware#getLocation <em>Location</em>}</li>
 *   <li>{@link cloudiator.Hardware#getState <em>State</em>}</li>
 * </ul>
 *
 * @see cloudiator.CloudiatorPackage#getHardware()
 * @model
 * @generated
 */
public interface Hardware extends EObject {
	/**
	 * Returns the value of the '<em><b>Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cores</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cores</em>' attribute.
	 * @see #setCores(Integer)
	 * @see cloudiator.CloudiatorPackage#getHardware_Cores()
	 * @model unique="false" required="true"
	 * @generated
	 */
	Integer getCores();

	/**
	 * Sets the value of the '{@link cloudiator.Hardware#getCores <em>Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cores</em>' attribute.
	 * @see #getCores()
	 * @generated
	 */
	void setCores(Integer value);

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
	 * @see cloudiator.CloudiatorPackage#getHardware_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cloudiator.Hardware#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Ram</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ram</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ram</em>' attribute.
	 * @see #setRam(Integer)
	 * @see cloudiator.CloudiatorPackage#getHardware_Ram()
	 * @model unique="false" required="true"
	 * @generated
	 */
	Integer getRam();

	/**
	 * Sets the value of the '{@link cloudiator.Hardware#getRam <em>Ram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ram</em>' attribute.
	 * @see #getRam()
	 * @generated
	 */
	void setRam(Integer value);

	/**
	 * Returns the value of the '<em><b>Disk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disk</em>' attribute.
	 * @see #setDisk(Double)
	 * @see cloudiator.CloudiatorPackage#getHardware_Disk()
	 * @model unique="false" required="true"
	 * @generated
	 */
	Double getDisk();

	/**
	 * Sets the value of the '{@link cloudiator.Hardware#getDisk <em>Disk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disk</em>' attribute.
	 * @see #getDisk()
	 * @generated
	 */
	void setDisk(Double value);

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
	 * @see cloudiator.CloudiatorPackage#getHardware_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link cloudiator.Hardware#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Cloud</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link cloudiator.Cloud#getHardwareList <em>Hardware List</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cloud</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cloud</em>' container reference.
	 * @see cloudiator.CloudiatorPackage#getHardware_Cloud()
	 * @see cloudiator.Cloud#getHardwareList
	 * @model opposite="hardwareList" required="true" transient="false" changeable="false"
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
	 * @see cloudiator.CloudiatorPackage#getHardware_ProviderId()
	 * @model
	 * @generated
	 */
	String getProviderId();

	/**
	 * Sets the value of the '{@link cloudiator.Hardware#getProviderId <em>Provider Id</em>}' attribute.
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
	 * @see cloudiator.CloudiatorPackage#getHardware_Location()
	 * @model
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link cloudiator.Hardware#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

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
	 * @see cloudiator.CloudiatorPackage#getHardware_State()
	 * @model default="OK"
	 * @generated
	 */
	DiscoveryItemState getState();

	/**
	 * Sets the value of the '{@link cloudiator.Hardware#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see cloudiator.DiscoveryItemState
	 * @see #getState()
	 * @generated
	 */
	void setState(DiscoveryItemState value);

} // Hardware
