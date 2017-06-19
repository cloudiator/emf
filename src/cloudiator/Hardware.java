/**
 */
package cloudiator;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;
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
 *   <li>{@link cloudiator.Hardware#getPrices <em>Prices</em>}</li>
 *   <li>{@link cloudiator.Hardware#getCloud <em>Cloud</em>}</li>
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
	 * @see #setCores(BigInteger)
	 * @see cloudiator.CloudiatorPackage#getHardware_Cores()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getCores();

	/**
	 * Sets the value of the '{@link cloudiator.Hardware#getCores <em>Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cores</em>' attribute.
	 * @see #getCores()
	 * @generated
	 */
	void setCores(BigInteger value);

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
	 * @model
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
	 * @see #setRam(BigInteger)
	 * @see cloudiator.CloudiatorPackage#getHardware_Ram()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getRam();

	/**
	 * Sets the value of the '{@link cloudiator.Hardware#getRam <em>Ram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ram</em>' attribute.
	 * @see #getRam()
	 * @generated
	 */
	void setRam(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Disk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disk</em>' attribute.
	 * @see #setDisk(BigInteger)
	 * @see cloudiator.CloudiatorPackage#getHardware_Disk()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getDisk();

	/**
	 * Sets the value of the '{@link cloudiator.Hardware#getDisk <em>Disk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disk</em>' attribute.
	 * @see #getDisk()
	 * @generated
	 */
	void setDisk(BigInteger value);

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
	 * @model
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
	 * Returns the value of the '<em><b>Prices</b></em>' reference list.
	 * The list contents are of type {@link cloudiator.Price}.
	 * It is bidirectional and its opposite is '{@link cloudiator.Price#getHardware <em>Hardware</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prices</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prices</em>' reference list.
	 * @see cloudiator.CloudiatorPackage#getHardware_Prices()
	 * @see cloudiator.Price#getHardware
	 * @model opposite="hardware" required="true"
	 * @generated
	 */
	EList<Price> getPrices();

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

} // Hardware
