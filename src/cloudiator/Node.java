/**
 */
package cloudiator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloudiator.Node#getCloud <em>Cloud</em>}</li>
 *   <li>{@link cloudiator.Node#getImage <em>Image</em>}</li>
 *   <li>{@link cloudiator.Node#getHardware <em>Hardware</em>}</li>
 *   <li>{@link cloudiator.Node#getLocation <em>Location</em>}</li>
 *   <li>{@link cloudiator.Node#getPrice <em>Price</em>}</li>
 *   <li>{@link cloudiator.Node#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link cloudiator.Node#getPricePerInvocation <em>Price Per Invocation</em>}</li>
 *   <li>{@link cloudiator.Node#getMemoryPrice <em>Memory Price</em>}</li>
 *   <li>{@link cloudiator.Node#getType <em>Type</em>}</li>
 *   <li>{@link cloudiator.Node#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see cloudiator.CloudiatorPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends EObject {
	/**
	 * Returns the value of the '<em><b>Cloud</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cloud</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cloud</em>' reference.
	 * @see #setCloud(Cloud)
	 * @see cloudiator.CloudiatorPackage#getNode_Cloud()
	 * @model
	 * @generated
	 */
	Cloud getCloud();

	/**
	 * Sets the value of the '{@link cloudiator.Node#getCloud <em>Cloud</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cloud</em>' reference.
	 * @see #getCloud()
	 * @generated
	 */
	void setCloud(Cloud value);

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
	 * @see cloudiator.CloudiatorPackage#getNode_Image()
	 * @model
	 * @generated
	 */
	Image getImage();

	/**
	 * Sets the value of the '{@link cloudiator.Node#getImage <em>Image</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' reference.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(Image value);

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
	 * @see cloudiator.CloudiatorPackage#getNode_Hardware()
	 * @model
	 * @generated
	 */
	Hardware getHardware();

	/**
	 * Sets the value of the '{@link cloudiator.Node#getHardware <em>Hardware</em>}' reference.
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
	 * @see cloudiator.CloudiatorPackage#getNode_Location()
	 * @model
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link cloudiator.Node#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

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
	 * @see cloudiator.CloudiatorPackage#getNode_Price()
	 * @model unique="false"
	 * @generated
	 */
	Double getPrice();

	/**
	 * Sets the value of the '{@link cloudiator.Node#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(Double value);

	/**
	 * Returns the value of the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Environment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' reference.
	 * @see #setEnvironment(Environment)
	 * @see cloudiator.CloudiatorPackage#getNode_Environment()
	 * @model
	 * @generated
	 */
	Environment getEnvironment();

	/**
	 * Sets the value of the '{@link cloudiator.Node#getEnvironment <em>Environment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' reference.
	 * @see #getEnvironment()
	 * @generated
	 */
	void setEnvironment(Environment value);

	/**
	 * Returns the value of the '<em><b>Price Per Invocation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price Per Invocation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price Per Invocation</em>' attribute.
	 * @see #setPricePerInvocation(Double)
	 * @see cloudiator.CloudiatorPackage#getNode_PricePerInvocation()
	 * @model
	 * @generated
	 */
	Double getPricePerInvocation();

	/**
	 * Sets the value of the '{@link cloudiator.Node#getPricePerInvocation <em>Price Per Invocation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price Per Invocation</em>' attribute.
	 * @see #getPricePerInvocation()
	 * @generated
	 */
	void setPricePerInvocation(Double value);

	/**
	 * Returns the value of the '<em><b>Memory Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory Price</em>' attribute.
	 * @see #setMemoryPrice(Double)
	 * @see cloudiator.CloudiatorPackage#getNode_MemoryPrice()
	 * @model
	 * @generated
	 */
	Double getMemoryPrice();

	/**
	 * Sets the value of the '{@link cloudiator.Node#getMemoryPrice <em>Memory Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Price</em>' attribute.
	 * @see #getMemoryPrice()
	 * @generated
	 */
	void setMemoryPrice(Double value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link cloudiator.NodeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see cloudiator.NodeType
	 * @see #setType(NodeType)
	 * @see cloudiator.CloudiatorPackage#getNode_Type()
	 * @model
	 * @generated
	 */
	NodeType getType();

	/**
	 * Sets the value of the '{@link cloudiator.Node#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see cloudiator.NodeType
	 * @see #getType()
	 * @generated
	 */
	void setType(NodeType value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see cloudiator.CloudiatorPackage#getNode_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.String" changeable="false"
	 * @generated
	 */
	String getId();

} // Node
