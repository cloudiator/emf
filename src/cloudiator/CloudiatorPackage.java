/**
 */
package cloudiator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see cloudiator.CloudiatorFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore' ecore.xml.type='http://www.eclipse.org/emf/2003/XMLType'"
 * @generated
 */
public interface CloudiatorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cloudiator";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/cloudiator";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cloudiator";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CloudiatorPackage eINSTANCE = cloudiator.impl.CloudiatorPackageImpl.init();

	/**
	 * The meta object id for the '{@link cloudiator.impl.CloudiatorModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudiator.impl.CloudiatorModelImpl
	 * @see cloudiator.impl.CloudiatorPackageImpl#getCloudiatorModel()
	 * @generated
	 */
	int CLOUDIATOR_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDIATOR_MODEL__COMPONENTS = 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDIATOR_MODEL__NODES = 1;

	/**
	 * The feature id for the '<em><b>Images</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDIATOR_MODEL__IMAGES = 2;

	/**
	 * The feature id for the '<em><b>Hardware List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDIATOR_MODEL__HARDWARE_LIST = 3;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDIATOR_MODEL__LOCATIONS = 4;

	/**
	 * The feature id for the '<em><b>Clouds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDIATOR_MODEL__CLOUDS = 5;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDIATOR_MODEL_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDIATOR_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cloudiator.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudiator.impl.ComponentImpl
	 * @see cloudiator.impl.CloudiatorPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NODES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cloudiator.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudiator.impl.NodeImpl
	 * @see cloudiator.impl.CloudiatorPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 2;

	/**
	 * The feature id for the '<em><b>Cloud</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__CLOUD = 0;

	/**
	 * The feature id for the '<em><b>Image</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__IMAGE = 1;

	/**
	 * The feature id for the '<em><b>Hardware</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__HARDWARE = 2;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__LOCATION = 3;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cloudiator.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudiator.impl.ImageImpl
	 * @see cloudiator.impl.CloudiatorPackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cloudiator.impl.HardwareImpl <em>Hardware</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudiator.impl.HardwareImpl
	 * @see cloudiator.impl.CloudiatorPackageImpl#getHardware()
	 * @generated
	 */
	int HARDWARE = 4;

	/**
	 * The feature id for the '<em><b>Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE__CORES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Ram</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE__RAM = 2;

	/**
	 * The feature id for the '<em><b>Disk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE__DISK = 3;

	/**
	 * The number of structural features of the '<em>Hardware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Hardware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cloudiator.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudiator.impl.LocationImpl
	 * @see cloudiator.impl.CloudiatorPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link cloudiator.impl.CloudImpl <em>Cloud</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudiator.impl.CloudImpl
	 * @see cloudiator.impl.CloudiatorPackageImpl#getCloud()
	 * @generated
	 */
	int CLOUD = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Images</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD__IMAGES = 1;

	/**
	 * The feature id for the '<em><b>Hardware List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD__HARDWARE_LIST = 2;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD__LOCATIONS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD__NAME = 4;

	/**
	 * The number of structural features of the '<em>Cloud</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Cloud</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cloudiator.CloudType <em>Cloud Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudiator.CloudType
	 * @see cloudiator.impl.CloudiatorPackageImpl#getCloudType()
	 * @generated
	 */
	int CLOUD_TYPE = 7;


	/**
	 * Returns the meta object for class '{@link cloudiator.CloudiatorModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see cloudiator.CloudiatorModel
	 * @generated
	 */
	EClass getCloudiatorModel();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudiator.CloudiatorModel#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see cloudiator.CloudiatorModel#getComponents()
	 * @see #getCloudiatorModel()
	 * @generated
	 */
	EReference getCloudiatorModel_Components();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudiator.CloudiatorModel#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see cloudiator.CloudiatorModel#getNodes()
	 * @see #getCloudiatorModel()
	 * @generated
	 */
	EReference getCloudiatorModel_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudiator.CloudiatorModel#getImages <em>Images</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Images</em>'.
	 * @see cloudiator.CloudiatorModel#getImages()
	 * @see #getCloudiatorModel()
	 * @generated
	 */
	EReference getCloudiatorModel_Images();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudiator.CloudiatorModel#getHardwareList <em>Hardware List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hardware List</em>'.
	 * @see cloudiator.CloudiatorModel#getHardwareList()
	 * @see #getCloudiatorModel()
	 * @generated
	 */
	EReference getCloudiatorModel_HardwareList();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudiator.CloudiatorModel#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Locations</em>'.
	 * @see cloudiator.CloudiatorModel#getLocations()
	 * @see #getCloudiatorModel()
	 * @generated
	 */
	EReference getCloudiatorModel_Locations();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudiator.CloudiatorModel#getClouds <em>Clouds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clouds</em>'.
	 * @see cloudiator.CloudiatorModel#getClouds()
	 * @see #getCloudiatorModel()
	 * @generated
	 */
	EReference getCloudiatorModel_Clouds();

	/**
	 * Returns the meta object for class '{@link cloudiator.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see cloudiator.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the reference list '{@link cloudiator.Component#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Nodes</em>'.
	 * @see cloudiator.Component#getNodes()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Nodes();

	/**
	 * Returns the meta object for the attribute '{@link cloudiator.Component#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cloudiator.Component#getName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Name();

	/**
	 * Returns the meta object for class '{@link cloudiator.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see cloudiator.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the reference '{@link cloudiator.Node#getCloud <em>Cloud</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cloud</em>'.
	 * @see cloudiator.Node#getCloud()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Cloud();

	/**
	 * Returns the meta object for the reference '{@link cloudiator.Node#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Image</em>'.
	 * @see cloudiator.Node#getImage()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Image();

	/**
	 * Returns the meta object for the reference '{@link cloudiator.Node#getHardware <em>Hardware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hardware</em>'.
	 * @see cloudiator.Node#getHardware()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Hardware();

	/**
	 * Returns the meta object for the reference '{@link cloudiator.Node#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see cloudiator.Node#getLocation()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Location();

	/**
	 * Returns the meta object for class '{@link cloudiator.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see cloudiator.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for the attribute '{@link cloudiator.Image#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cloudiator.Image#getName()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Name();

	/**
	 * Returns the meta object for class '{@link cloudiator.Hardware <em>Hardware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware</em>'.
	 * @see cloudiator.Hardware
	 * @generated
	 */
	EClass getHardware();

	/**
	 * Returns the meta object for the attribute '{@link cloudiator.Hardware#getCores <em>Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cores</em>'.
	 * @see cloudiator.Hardware#getCores()
	 * @see #getHardware()
	 * @generated
	 */
	EAttribute getHardware_Cores();

	/**
	 * Returns the meta object for the attribute '{@link cloudiator.Hardware#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cloudiator.Hardware#getName()
	 * @see #getHardware()
	 * @generated
	 */
	EAttribute getHardware_Name();

	/**
	 * Returns the meta object for the attribute '{@link cloudiator.Hardware#getRam <em>Ram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ram</em>'.
	 * @see cloudiator.Hardware#getRam()
	 * @see #getHardware()
	 * @generated
	 */
	EAttribute getHardware_Ram();

	/**
	 * Returns the meta object for the attribute '{@link cloudiator.Hardware#getDisk <em>Disk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disk</em>'.
	 * @see cloudiator.Hardware#getDisk()
	 * @see #getHardware()
	 * @generated
	 */
	EAttribute getHardware_Disk();

	/**
	 * Returns the meta object for class '{@link cloudiator.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see cloudiator.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the attribute '{@link cloudiator.Location#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cloudiator.Location#getName()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Name();

	/**
	 * Returns the meta object for class '{@link cloudiator.Cloud <em>Cloud</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloud</em>'.
	 * @see cloudiator.Cloud
	 * @generated
	 */
	EClass getCloud();

	/**
	 * Returns the meta object for the attribute '{@link cloudiator.Cloud#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see cloudiator.Cloud#getType()
	 * @see #getCloud()
	 * @generated
	 */
	EAttribute getCloud_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudiator.Cloud#getImages <em>Images</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Images</em>'.
	 * @see cloudiator.Cloud#getImages()
	 * @see #getCloud()
	 * @generated
	 */
	EReference getCloud_Images();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudiator.Cloud#getHardwareList <em>Hardware List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hardware List</em>'.
	 * @see cloudiator.Cloud#getHardwareList()
	 * @see #getCloud()
	 * @generated
	 */
	EReference getCloud_HardwareList();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudiator.Cloud#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Locations</em>'.
	 * @see cloudiator.Cloud#getLocations()
	 * @see #getCloud()
	 * @generated
	 */
	EReference getCloud_Locations();

	/**
	 * Returns the meta object for the attribute '{@link cloudiator.Cloud#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cloudiator.Cloud#getName()
	 * @see #getCloud()
	 * @generated
	 */
	EAttribute getCloud_Name();

	/**
	 * Returns the meta object for enum '{@link cloudiator.CloudType <em>Cloud Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cloud Type</em>'.
	 * @see cloudiator.CloudType
	 * @generated
	 */
	EEnum getCloudType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CloudiatorFactory getCloudiatorFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link cloudiator.impl.CloudiatorModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudiator.impl.CloudiatorModelImpl
		 * @see cloudiator.impl.CloudiatorPackageImpl#getCloudiatorModel()
		 * @generated
		 */
		EClass CLOUDIATOR_MODEL = eINSTANCE.getCloudiatorModel();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUDIATOR_MODEL__COMPONENTS = eINSTANCE.getCloudiatorModel_Components();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUDIATOR_MODEL__NODES = eINSTANCE.getCloudiatorModel_Nodes();

		/**
		 * The meta object literal for the '<em><b>Images</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUDIATOR_MODEL__IMAGES = eINSTANCE.getCloudiatorModel_Images();

		/**
		 * The meta object literal for the '<em><b>Hardware List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUDIATOR_MODEL__HARDWARE_LIST = eINSTANCE.getCloudiatorModel_HardwareList();

		/**
		 * The meta object literal for the '<em><b>Locations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUDIATOR_MODEL__LOCATIONS = eINSTANCE.getCloudiatorModel_Locations();

		/**
		 * The meta object literal for the '<em><b>Clouds</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUDIATOR_MODEL__CLOUDS = eINSTANCE.getCloudiatorModel_Clouds();

		/**
		 * The meta object literal for the '{@link cloudiator.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudiator.impl.ComponentImpl
		 * @see cloudiator.impl.CloudiatorPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__NODES = eINSTANCE.getComponent_Nodes();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

		/**
		 * The meta object literal for the '{@link cloudiator.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudiator.impl.NodeImpl
		 * @see cloudiator.impl.CloudiatorPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Cloud</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__CLOUD = eINSTANCE.getNode_Cloud();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__IMAGE = eINSTANCE.getNode_Image();

		/**
		 * The meta object literal for the '<em><b>Hardware</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__HARDWARE = eINSTANCE.getNode_Hardware();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__LOCATION = eINSTANCE.getNode_Location();

		/**
		 * The meta object literal for the '{@link cloudiator.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudiator.impl.ImageImpl
		 * @see cloudiator.impl.CloudiatorPackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__NAME = eINSTANCE.getImage_Name();

		/**
		 * The meta object literal for the '{@link cloudiator.impl.HardwareImpl <em>Hardware</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudiator.impl.HardwareImpl
		 * @see cloudiator.impl.CloudiatorPackageImpl#getHardware()
		 * @generated
		 */
		EClass HARDWARE = eINSTANCE.getHardware();

		/**
		 * The meta object literal for the '<em><b>Cores</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE__CORES = eINSTANCE.getHardware_Cores();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE__NAME = eINSTANCE.getHardware_Name();

		/**
		 * The meta object literal for the '<em><b>Ram</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE__RAM = eINSTANCE.getHardware_Ram();

		/**
		 * The meta object literal for the '<em><b>Disk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE__DISK = eINSTANCE.getHardware_Disk();

		/**
		 * The meta object literal for the '{@link cloudiator.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudiator.impl.LocationImpl
		 * @see cloudiator.impl.CloudiatorPackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__NAME = eINSTANCE.getLocation_Name();

		/**
		 * The meta object literal for the '{@link cloudiator.impl.CloudImpl <em>Cloud</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudiator.impl.CloudImpl
		 * @see cloudiator.impl.CloudiatorPackageImpl#getCloud()
		 * @generated
		 */
		EClass CLOUD = eINSTANCE.getCloud();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD__TYPE = eINSTANCE.getCloud_Type();

		/**
		 * The meta object literal for the '<em><b>Images</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD__IMAGES = eINSTANCE.getCloud_Images();

		/**
		 * The meta object literal for the '<em><b>Hardware List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD__HARDWARE_LIST = eINSTANCE.getCloud_HardwareList();

		/**
		 * The meta object literal for the '<em><b>Locations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD__LOCATIONS = eINSTANCE.getCloud_Locations();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD__NAME = eINSTANCE.getCloud_Name();

		/**
		 * The meta object literal for the '{@link cloudiator.CloudType <em>Cloud Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudiator.CloudType
		 * @see cloudiator.impl.CloudiatorPackageImpl#getCloudType()
		 * @generated
		 */
		EEnum CLOUD_TYPE = eINSTANCE.getCloudType();

	}

} //CloudiatorPackage
