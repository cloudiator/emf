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
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
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
	 * The feature id for the '<em><b>Clouds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDIATOR_MODEL__CLOUDS = 2;

	/**
	 * The feature id for the '<em><b>Operatingsystem</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDIATOR_MODEL__OPERATINGSYSTEM = 3;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDIATOR_MODEL_FEATURE_COUNT = 4;

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
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PRICE = 4;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 5;

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
	 * The feature id for the '<em><b>Operating System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__OPERATING_SYSTEM = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__ID = 2;

	/**
	 * The feature id for the '<em><b>Cloud</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__CLOUD = 3;

	/**
	 * The feature id for the '<em><b>Provider Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__PROVIDER_ID = 4;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__LOCATION = 5;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = 6;

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
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE__ID = 4;

	/**
	 * The feature id for the '<em><b>Cloud</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE__CLOUD = 5;

	/**
	 * The feature id for the '<em><b>Provider Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE__PROVIDER_ID = 6;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE__LOCATION = 7;

	/**
	 * The number of structural features of the '<em>Hardware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_FEATURE_COUNT = 8;

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
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__ID = 1;

	/**
	 * The feature id for the '<em><b>Cloud</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__CLOUD = 2;

	/**
	 * The feature id for the '<em><b>Provider Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__PROVIDER_ID = 3;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__COUNTRY = 4;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__CITY = 5;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__LONGITUDE = 6;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__LATITUDE = 7;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = 8;

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
	 * The feature id for the '<em><b>Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD__LOCATIONS = 1;

	/**
	 * The feature id for the '<em><b>Hardware List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD__HARDWARE_LIST = 2;

	/**
	 * The feature id for the '<em><b>Images</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD__IMAGES = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD__ID = 4;

	/**
	 * The feature id for the '<em><b>Prices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD__PRICES = 5;

	/**
	 * The feature id for the '<em><b>Endpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD__ENDPOINT = 6;

	/**
	 * The feature id for the '<em><b>Api</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD__API = 7;

	/**
	 * The feature id for the '<em><b>Cloudcredential</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD__CLOUDCREDENTIAL = 8;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD__CONFIGURATION = 9;

	/**
	 * The number of structural features of the '<em>Cloud</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Cloud</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cloudiator.impl.OperatingSystemImpl <em>Operating System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudiator.impl.OperatingSystemImpl
	 * @see cloudiator.impl.CloudiatorPackageImpl#getOperatingSystem()
	 * @generated
	 */
	int OPERATING_SYSTEM = 7;

	/**
	 * The feature id for the '<em><b>Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM__FAMILY = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM__VERSION = 1;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM__ARCHITECTURE = 2;

	/**
	 * The number of structural features of the '<em>Operating System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Operating System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cloudiator.impl.PriceImpl <em>Price</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudiator.impl.PriceImpl
	 * @see cloudiator.impl.CloudiatorPackageImpl#getPrice()
	 * @generated
	 */
	int PRICE = 8;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICE__PRICE = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICE__LOCATION = 1;

	/**
	 * The feature id for the '<em><b>Image</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICE__IMAGE = 2;

	/**
	 * The feature id for the '<em><b>Hardware</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICE__HARDWARE = 3;

	/**
	 * The number of structural features of the '<em>Price</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Price</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cloudiator.impl.ApiImpl <em>Api</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudiator.impl.ApiImpl
	 * @see cloudiator.impl.CloudiatorPackageImpl#getApi()
	 * @generated
	 */
	int API = 9;

	/**
	 * The feature id for the '<em><b>Provider Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__PROVIDER_NAME = 0;

	/**
	 * The number of structural features of the '<em>Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cloudiator.impl.CloudCredentialImpl <em>Cloud Credential</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudiator.impl.CloudCredentialImpl
	 * @see cloudiator.impl.CloudiatorPackageImpl#getCloudCredential()
	 * @generated
	 */
	int CLOUD_CREDENTIAL = 10;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_CREDENTIAL__USER = 0;

	/**
	 * The feature id for the '<em><b>Secret</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_CREDENTIAL__SECRET = 1;

	/**
	 * The number of structural features of the '<em>Cloud Credential</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_CREDENTIAL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Cloud Credential</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_CREDENTIAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cloudiator.impl.CloudConfigurationImpl <em>Cloud Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudiator.impl.CloudConfigurationImpl
	 * @see cloudiator.impl.CloudiatorPackageImpl#getCloudConfiguration()
	 * @generated
	 */
	int CLOUD_CONFIGURATION = 11;

	/**
	 * The feature id for the '<em><b>Node Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_CONFIGURATION__NODE_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_CONFIGURATION__PROPERTIES = 1;

	/**
	 * The number of structural features of the '<em>Cloud Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_CONFIGURATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Cloud Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cloudiator.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudiator.impl.PropertyImpl
	 * @see cloudiator.impl.CloudiatorPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 12;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cloudiator.CloudType <em>Cloud Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudiator.CloudType
	 * @see cloudiator.impl.CloudiatorPackageImpl#getCloudType()
	 * @generated
	 */
	int CLOUD_TYPE = 13;


	/**
	 * The meta object id for the '{@link cloudiator.OSArchitecture <em>OS Architecture</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudiator.OSArchitecture
	 * @see cloudiator.impl.CloudiatorPackageImpl#getOSArchitecture()
	 * @generated
	 */
	int OS_ARCHITECTURE = 14;

	/**
	 * The meta object id for the '{@link cloudiator.OSFamily <em>OS Family</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudiator.OSFamily
	 * @see cloudiator.impl.CloudiatorPackageImpl#getOSFamily()
	 * @generated
	 */
	int OS_FAMILY = 15;


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
	 * Returns the meta object for the containment reference list '{@link cloudiator.CloudiatorModel#getOperatingsystem <em>Operatingsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operatingsystem</em>'.
	 * @see cloudiator.CloudiatorModel#getOperatingsystem()
	 * @see #getCloudiatorModel()
	 * @generated
	 */
	EReference getCloudiatorModel_Operatingsystem();

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
	 * Returns the meta object for the attribute '{@link cloudiator.Node#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see cloudiator.Node#getPrice()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Price();

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
	 * Returns the meta object for the reference '{@link cloudiator.Image#getOperatingSystem <em>Operating System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operating System</em>'.
	 * @see cloudiator.Image#getOperatingSystem()
	 * @see #getImage()
	 * @generated
	 */
	EReference getImage_OperatingSystem();

	/**
	 * Returns the meta object for the attribute '{@link cloudiator.Image#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see cloudiator.Image#getId()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Id();

	/**
	 * Returns the meta object for the container reference '{@link cloudiator.Image#getCloud <em>Cloud</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Cloud</em>'.
	 * @see cloudiator.Image#getCloud()
	 * @see #getImage()
	 * @generated
	 */
	EReference getImage_Cloud();

	/**
	 * Returns the meta object for the attribute '{@link cloudiator.Image#getProviderId <em>Provider Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider Id</em>'.
	 * @see cloudiator.Image#getProviderId()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_ProviderId();

	/**
	 * Returns the meta object for the reference '{@link cloudiator.Image#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see cloudiator.Image#getLocation()
	 * @see #getImage()
	 * @generated
	 */
	EReference getImage_Location();

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
	 * Returns the meta object for the attribute '{@link cloudiator.Hardware#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see cloudiator.Hardware#getId()
	 * @see #getHardware()
	 * @generated
	 */
	EAttribute getHardware_Id();

	/**
	 * Returns the meta object for the container reference '{@link cloudiator.Hardware#getCloud <em>Cloud</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Cloud</em>'.
	 * @see cloudiator.Hardware#getCloud()
	 * @see #getHardware()
	 * @generated
	 */
	EReference getHardware_Cloud();

	/**
	 * Returns the meta object for the attribute '{@link cloudiator.Hardware#getProviderId <em>Provider Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider Id</em>'.
	 * @see cloudiator.Hardware#getProviderId()
	 * @see #getHardware()
	 * @generated
	 */
	EAttribute getHardware_ProviderId();

	/**
	 * Returns the meta object for the reference '{@link cloudiator.Hardware#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see cloudiator.Hardware#getLocation()
	 * @see #getHardware()
	 * @generated
	 */
	EReference getHardware_Location();

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
	 * Returns the meta object for the attribute '{@link cloudiator.Location#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see cloudiator.Location#getId()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Id();

	/**
	 * Returns the meta object for the container reference '{@link cloudiator.Location#getCloud <em>Cloud</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Cloud</em>'.
	 * @see cloudiator.Location#getCloud()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_Cloud();

	/**
	 * Returns the meta object for the attribute '{@link cloudiator.Location#getProviderId <em>Provider Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider Id</em>'.
	 * @see cloudiator.Location#getProviderId()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_ProviderId();

	/**
	 * Returns the meta object for the attribute '{@link cloudiator.Location#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see cloudiator.Location#getCountry()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Country();

	/**
	 * Returns the meta object for the attribute '{@link cloudiator.Location#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see cloudiator.Location#getCity()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_City();

	/**
	 * Returns the meta object for the attribute '{@link cloudiator.Location#getLongitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longitude</em>'.
	 * @see cloudiator.Location#getLongitude()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Longitude();

	/**
	 * Returns the meta object for the attribute '{@link cloudiator.Location#getLatitude <em>Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latitude</em>'.
	 * @see cloudiator.Location#getLatitude()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Latitude();

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
	 * Returns the meta object for the attribute '{@link cloudiator.Cloud#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see cloudiator.Cloud#getId()
	 * @see #getCloud()
	 * @generated
	 */
	EAttribute getCloud_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudiator.Cloud#getPrices <em>Prices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prices</em>'.
	 * @see cloudiator.Cloud#getPrices()
	 * @see #getCloud()
	 * @generated
	 */
	EReference getCloud_Prices();

	/**
	 * Returns the meta object for the attribute '{@link cloudiator.Cloud#getEndpoint <em>Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endpoint</em>'.
	 * @see cloudiator.Cloud#getEndpoint()
	 * @see #getCloud()
	 * @generated
	 */
	EAttribute getCloud_Endpoint();

	/**
	 * Returns the meta object for the containment reference '{@link cloudiator.Cloud#getApi <em>Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Api</em>'.
	 * @see cloudiator.Cloud#getApi()
	 * @see #getCloud()
	 * @generated
	 */
	EReference getCloud_Api();

	/**
	 * Returns the meta object for the containment reference '{@link cloudiator.Cloud#getCloudcredential <em>Cloudcredential</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cloudcredential</em>'.
	 * @see cloudiator.Cloud#getCloudcredential()
	 * @see #getCloud()
	 * @generated
	 */
	EReference getCloud_Cloudcredential();

	/**
	 * Returns the meta object for the containment reference '{@link cloudiator.Cloud#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Configuration</em>'.
	 * @see cloudiator.Cloud#getConfiguration()
	 * @see #getCloud()
	 * @generated
	 */
	EReference getCloud_Configuration();

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
	 * Returns the meta object for class '{@link cloudiator.OperatingSystem <em>Operating System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operating System</em>'.
	 * @see cloudiator.OperatingSystem
	 * @generated
	 */
	EClass getOperatingSystem();

	/**
	 * Returns the meta object for the attribute '{@link cloudiator.OperatingSystem#getFamily <em>Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Family</em>'.
	 * @see cloudiator.OperatingSystem#getFamily()
	 * @see #getOperatingSystem()
	 * @generated
	 */
	EAttribute getOperatingSystem_Family();

	/**
	 * Returns the meta object for the attribute '{@link cloudiator.OperatingSystem#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see cloudiator.OperatingSystem#getVersion()
	 * @see #getOperatingSystem()
	 * @generated
	 */
	EAttribute getOperatingSystem_Version();

	/**
	 * Returns the meta object for the attribute '{@link cloudiator.OperatingSystem#getArchitecture <em>Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Architecture</em>'.
	 * @see cloudiator.OperatingSystem#getArchitecture()
	 * @see #getOperatingSystem()
	 * @generated
	 */
	EAttribute getOperatingSystem_Architecture();

	/**
	 * Returns the meta object for class '{@link cloudiator.Price <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Price</em>'.
	 * @see cloudiator.Price
	 * @generated
	 */
	EClass getPrice();

	/**
	 * Returns the meta object for the attribute '{@link cloudiator.Price#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see cloudiator.Price#getPrice()
	 * @see #getPrice()
	 * @generated
	 */
	EAttribute getPrice_Price();

	/**
	 * Returns the meta object for the reference '{@link cloudiator.Price#getHardware <em>Hardware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hardware</em>'.
	 * @see cloudiator.Price#getHardware()
	 * @see #getPrice()
	 * @generated
	 */
	EReference getPrice_Hardware();

	/**
	 * Returns the meta object for class '{@link cloudiator.Api <em>Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Api</em>'.
	 * @see cloudiator.Api
	 * @generated
	 */
	EClass getApi();

	/**
	 * Returns the meta object for the attribute '{@link cloudiator.Api#getProviderName <em>Provider Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider Name</em>'.
	 * @see cloudiator.Api#getProviderName()
	 * @see #getApi()
	 * @generated
	 */
	EAttribute getApi_ProviderName();

	/**
	 * Returns the meta object for class '{@link cloudiator.CloudCredential <em>Cloud Credential</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloud Credential</em>'.
	 * @see cloudiator.CloudCredential
	 * @generated
	 */
	EClass getCloudCredential();

	/**
	 * Returns the meta object for the attribute '{@link cloudiator.CloudCredential#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see cloudiator.CloudCredential#getUser()
	 * @see #getCloudCredential()
	 * @generated
	 */
	EAttribute getCloudCredential_User();

	/**
	 * Returns the meta object for the attribute '{@link cloudiator.CloudCredential#getSecret <em>Secret</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Secret</em>'.
	 * @see cloudiator.CloudCredential#getSecret()
	 * @see #getCloudCredential()
	 * @generated
	 */
	EAttribute getCloudCredential_Secret();

	/**
	 * Returns the meta object for class '{@link cloudiator.CloudConfiguration <em>Cloud Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloud Configuration</em>'.
	 * @see cloudiator.CloudConfiguration
	 * @generated
	 */
	EClass getCloudConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link cloudiator.CloudConfiguration#getNodeGroup <em>Node Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Group</em>'.
	 * @see cloudiator.CloudConfiguration#getNodeGroup()
	 * @see #getCloudConfiguration()
	 * @generated
	 */
	EAttribute getCloudConfiguration_NodeGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudiator.CloudConfiguration#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see cloudiator.CloudConfiguration#getProperties()
	 * @see #getCloudConfiguration()
	 * @generated
	 */
	EReference getCloudConfiguration_Properties();

	/**
	 * Returns the meta object for class '{@link cloudiator.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see cloudiator.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link cloudiator.Property#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see cloudiator.Property#getKey()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Key();

	/**
	 * Returns the meta object for the attribute '{@link cloudiator.Property#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see cloudiator.Property#getValue()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Value();

	/**
	 * Returns the meta object for the reference '{@link cloudiator.Price#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see cloudiator.Price#getLocation()
	 * @see #getPrice()
	 * @generated
	 */
	EReference getPrice_Location();

	/**
	 * Returns the meta object for the reference '{@link cloudiator.Price#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Image</em>'.
	 * @see cloudiator.Price#getImage()
	 * @see #getPrice()
	 * @generated
	 */
	EReference getPrice_Image();

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
	 * Returns the meta object for enum '{@link cloudiator.OSArchitecture <em>OS Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>OS Architecture</em>'.
	 * @see cloudiator.OSArchitecture
	 * @generated
	 */
	EEnum getOSArchitecture();

	/**
	 * Returns the meta object for enum '{@link cloudiator.OSFamily <em>OS Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>OS Family</em>'.
	 * @see cloudiator.OSFamily
	 * @generated
	 */
	EEnum getOSFamily();

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
		 * The meta object literal for the '<em><b>Clouds</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUDIATOR_MODEL__CLOUDS = eINSTANCE.getCloudiatorModel_Clouds();

		/**
		 * The meta object literal for the '<em><b>Operatingsystem</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUDIATOR_MODEL__OPERATINGSYSTEM = eINSTANCE.getCloudiatorModel_Operatingsystem();

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
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__PRICE = eINSTANCE.getNode_Price();

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
		 * The meta object literal for the '<em><b>Operating System</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGE__OPERATING_SYSTEM = eINSTANCE.getImage_OperatingSystem();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__ID = eINSTANCE.getImage_Id();

		/**
		 * The meta object literal for the '<em><b>Cloud</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGE__CLOUD = eINSTANCE.getImage_Cloud();

		/**
		 * The meta object literal for the '<em><b>Provider Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__PROVIDER_ID = eINSTANCE.getImage_ProviderId();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGE__LOCATION = eINSTANCE.getImage_Location();

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
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE__ID = eINSTANCE.getHardware_Id();

		/**
		 * The meta object literal for the '<em><b>Cloud</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE__CLOUD = eINSTANCE.getHardware_Cloud();

		/**
		 * The meta object literal for the '<em><b>Provider Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE__PROVIDER_ID = eINSTANCE.getHardware_ProviderId();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE__LOCATION = eINSTANCE.getHardware_Location();

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
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__ID = eINSTANCE.getLocation_Id();

		/**
		 * The meta object literal for the '<em><b>Cloud</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__CLOUD = eINSTANCE.getLocation_Cloud();

		/**
		 * The meta object literal for the '<em><b>Provider Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__PROVIDER_ID = eINSTANCE.getLocation_ProviderId();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__COUNTRY = eINSTANCE.getLocation_Country();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__CITY = eINSTANCE.getLocation_City();

		/**
		 * The meta object literal for the '<em><b>Longitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__LONGITUDE = eINSTANCE.getLocation_Longitude();

		/**
		 * The meta object literal for the '<em><b>Latitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__LATITUDE = eINSTANCE.getLocation_Latitude();

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
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD__ID = eINSTANCE.getCloud_Id();

		/**
		 * The meta object literal for the '<em><b>Prices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD__PRICES = eINSTANCE.getCloud_Prices();

		/**
		 * The meta object literal for the '<em><b>Endpoint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD__ENDPOINT = eINSTANCE.getCloud_Endpoint();

		/**
		 * The meta object literal for the '<em><b>Api</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD__API = eINSTANCE.getCloud_Api();

		/**
		 * The meta object literal for the '<em><b>Cloudcredential</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD__CLOUDCREDENTIAL = eINSTANCE.getCloud_Cloudcredential();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD__CONFIGURATION = eINSTANCE.getCloud_Configuration();

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
		 * The meta object literal for the '{@link cloudiator.impl.OperatingSystemImpl <em>Operating System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudiator.impl.OperatingSystemImpl
		 * @see cloudiator.impl.CloudiatorPackageImpl#getOperatingSystem()
		 * @generated
		 */
		EClass OPERATING_SYSTEM = eINSTANCE.getOperatingSystem();

		/**
		 * The meta object literal for the '<em><b>Family</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATING_SYSTEM__FAMILY = eINSTANCE.getOperatingSystem_Family();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATING_SYSTEM__VERSION = eINSTANCE.getOperatingSystem_Version();

		/**
		 * The meta object literal for the '<em><b>Architecture</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATING_SYSTEM__ARCHITECTURE = eINSTANCE.getOperatingSystem_Architecture();

		/**
		 * The meta object literal for the '{@link cloudiator.impl.PriceImpl <em>Price</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudiator.impl.PriceImpl
		 * @see cloudiator.impl.CloudiatorPackageImpl#getPrice()
		 * @generated
		 */
		EClass PRICE = eINSTANCE.getPrice();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRICE__PRICE = eINSTANCE.getPrice_Price();

		/**
		 * The meta object literal for the '<em><b>Hardware</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRICE__HARDWARE = eINSTANCE.getPrice_Hardware();

		/**
		 * The meta object literal for the '{@link cloudiator.impl.ApiImpl <em>Api</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudiator.impl.ApiImpl
		 * @see cloudiator.impl.CloudiatorPackageImpl#getApi()
		 * @generated
		 */
		EClass API = eINSTANCE.getApi();

		/**
		 * The meta object literal for the '<em><b>Provider Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API__PROVIDER_NAME = eINSTANCE.getApi_ProviderName();

		/**
		 * The meta object literal for the '{@link cloudiator.impl.CloudCredentialImpl <em>Cloud Credential</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudiator.impl.CloudCredentialImpl
		 * @see cloudiator.impl.CloudiatorPackageImpl#getCloudCredential()
		 * @generated
		 */
		EClass CLOUD_CREDENTIAL = eINSTANCE.getCloudCredential();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_CREDENTIAL__USER = eINSTANCE.getCloudCredential_User();

		/**
		 * The meta object literal for the '<em><b>Secret</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_CREDENTIAL__SECRET = eINSTANCE.getCloudCredential_Secret();

		/**
		 * The meta object literal for the '{@link cloudiator.impl.CloudConfigurationImpl <em>Cloud Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudiator.impl.CloudConfigurationImpl
		 * @see cloudiator.impl.CloudiatorPackageImpl#getCloudConfiguration()
		 * @generated
		 */
		EClass CLOUD_CONFIGURATION = eINSTANCE.getCloudConfiguration();

		/**
		 * The meta object literal for the '<em><b>Node Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_CONFIGURATION__NODE_GROUP = eINSTANCE.getCloudConfiguration_NodeGroup();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_CONFIGURATION__PROPERTIES = eINSTANCE.getCloudConfiguration_Properties();

		/**
		 * The meta object literal for the '{@link cloudiator.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudiator.impl.PropertyImpl
		 * @see cloudiator.impl.CloudiatorPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__KEY = eINSTANCE.getProperty_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__VALUE = eINSTANCE.getProperty_Value();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRICE__LOCATION = eINSTANCE.getPrice_Location();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRICE__IMAGE = eINSTANCE.getPrice_Image();

		/**
		 * The meta object literal for the '{@link cloudiator.CloudType <em>Cloud Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudiator.CloudType
		 * @see cloudiator.impl.CloudiatorPackageImpl#getCloudType()
		 * @generated
		 */
		EEnum CLOUD_TYPE = eINSTANCE.getCloudType();

		/**
		 * The meta object literal for the '{@link cloudiator.OSArchitecture <em>OS Architecture</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudiator.OSArchitecture
		 * @see cloudiator.impl.CloudiatorPackageImpl#getOSArchitecture()
		 * @generated
		 */
		EEnum OS_ARCHITECTURE = eINSTANCE.getOSArchitecture();

		/**
		 * The meta object literal for the '{@link cloudiator.OSFamily <em>OS Family</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudiator.OSFamily
		 * @see cloudiator.impl.CloudiatorPackageImpl#getOSFamily()
		 * @generated
		 */
		EEnum OS_FAMILY = eINSTANCE.getOSFamily();

	}

} //CloudiatorPackage
