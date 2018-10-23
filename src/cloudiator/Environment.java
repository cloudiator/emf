/**
 */
package cloudiator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloudiator.Environment#getRuntime <em>Runtime</em>}</li>
 * </ul>
 *
 * @see cloudiator.CloudiatorPackage#getEnvironment()
 * @model
 * @generated
 */
public interface Environment extends EObject {
	/**
	 * Returns the value of the '<em><b>Runtime</b></em>' attribute.
	 * The literals are from the enumeration {@link cloudiator.Runtime}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runtime</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtime</em>' attribute.
	 * @see cloudiator.Runtime
	 * @see #setRuntime(cloudiator.Runtime)
	 * @see cloudiator.CloudiatorPackage#getEnvironment_Runtime()
	 * @model
	 * @generated
	 */
	cloudiator.Runtime getRuntime();

	/**
	 * Sets the value of the '{@link cloudiator.Environment#getRuntime <em>Runtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runtime</em>' attribute.
	 * @see cloudiator.Runtime
	 * @see #getRuntime()
	 * @generated
	 */
	void setRuntime(cloudiator.Runtime value);

} // Environment
