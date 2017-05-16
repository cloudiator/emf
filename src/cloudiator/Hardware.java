/**
 */
package cloudiator;

import java.math.BigInteger;

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

} // Hardware
