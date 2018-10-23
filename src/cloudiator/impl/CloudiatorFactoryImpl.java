/**
 */
package cloudiator.impl;

import cloudiator.Api;
import cloudiator.Cloud;
import cloudiator.CloudConfiguration;
import cloudiator.CloudCredential;
import cloudiator.CloudType;
import cloudiator.CloudiatorFactory;
import cloudiator.CloudiatorModel;
import cloudiator.CloudiatorPackage;
import cloudiator.Component;
import cloudiator.Environment;
import cloudiator.GeoLocation;
import cloudiator.Hardware;
import cloudiator.Image;
import cloudiator.Location;
import cloudiator.LocationScope;
import cloudiator.Node;
import cloudiator.NodeType;
import cloudiator.OSArchitecture;
import cloudiator.OSFamily;
import cloudiator.OperatingSystem;
import cloudiator.Price;
import cloudiator.Property;
import cloudiator.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CloudiatorFactoryImpl extends EFactoryImpl implements CloudiatorFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CloudiatorFactory init() {
		try {
			CloudiatorFactory theCloudiatorFactory = (CloudiatorFactory)EPackage.Registry.INSTANCE.getEFactory(CloudiatorPackage.eNS_URI);
			if (theCloudiatorFactory != null) {
				return theCloudiatorFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CloudiatorFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudiatorFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CloudiatorPackage.CLOUDIATOR_MODEL: return createCloudiatorModel();
			case CloudiatorPackage.COMPONENT: return createComponent();
			case CloudiatorPackage.NODE: return createNode();
			case CloudiatorPackage.IMAGE: return createImage();
			case CloudiatorPackage.HARDWARE: return createHardware();
			case CloudiatorPackage.LOCATION: return createLocation();
			case CloudiatorPackage.CLOUD: return createCloud();
			case CloudiatorPackage.OPERATING_SYSTEM: return createOperatingSystem();
			case CloudiatorPackage.PRICE: return createPrice();
			case CloudiatorPackage.API: return createApi();
			case CloudiatorPackage.CLOUD_CREDENTIAL: return createCloudCredential();
			case CloudiatorPackage.CLOUD_CONFIGURATION: return createCloudConfiguration();
			case CloudiatorPackage.PROPERTY: return createProperty();
			case CloudiatorPackage.GEO_LOCATION: return createGeoLocation();
			case CloudiatorPackage.ENVIRONMENT: return createEnvironment();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CloudiatorPackage.CLOUD_TYPE:
				return createCloudTypeFromString(eDataType, initialValue);
			case CloudiatorPackage.OS_ARCHITECTURE:
				return createOSArchitectureFromString(eDataType, initialValue);
			case CloudiatorPackage.OS_FAMILY:
				return createOSFamilyFromString(eDataType, initialValue);
			case CloudiatorPackage.LOCATION_SCOPE:
				return createLocationScopeFromString(eDataType, initialValue);
			case CloudiatorPackage.RUNTIME:
				return createRuntimeFromString(eDataType, initialValue);
			case CloudiatorPackage.NODE_TYPE:
				return createNodeTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CloudiatorPackage.CLOUD_TYPE:
				return convertCloudTypeToString(eDataType, instanceValue);
			case CloudiatorPackage.OS_ARCHITECTURE:
				return convertOSArchitectureToString(eDataType, instanceValue);
			case CloudiatorPackage.OS_FAMILY:
				return convertOSFamilyToString(eDataType, instanceValue);
			case CloudiatorPackage.LOCATION_SCOPE:
				return convertLocationScopeToString(eDataType, instanceValue);
			case CloudiatorPackage.RUNTIME:
				return convertRuntimeToString(eDataType, instanceValue);
			case CloudiatorPackage.NODE_TYPE:
				return convertNodeTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudiatorModel createCloudiatorModel() {
		CloudiatorModelImpl cloudiatorModel = new CloudiatorModelImpl();
		return cloudiatorModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image createImage() {
		ImageImpl image = new ImageImpl();
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hardware createHardware() {
		HardwareImpl hardware = new HardwareImpl();
		return hardware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cloud createCloud() {
		CloudImpl cloud = new CloudImpl();
		return cloud;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatingSystem createOperatingSystem() {
		OperatingSystemImpl operatingSystem = new OperatingSystemImpl();
		return operatingSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Price createPrice() {
		PriceImpl price = new PriceImpl();
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Api createApi() {
		ApiImpl api = new ApiImpl();
		return api;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudCredential createCloudCredential() {
		CloudCredentialImpl cloudCredential = new CloudCredentialImpl();
		return cloudCredential;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudConfiguration createCloudConfiguration() {
		CloudConfigurationImpl cloudConfiguration = new CloudConfigurationImpl();
		return cloudConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeoLocation createGeoLocation() {
		GeoLocationImpl geoLocation = new GeoLocationImpl();
		return geoLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Environment createEnvironment() {
		EnvironmentImpl environment = new EnvironmentImpl();
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudType createCloudTypeFromString(EDataType eDataType, String initialValue) {
		CloudType result = CloudType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCloudTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSArchitecture createOSArchitectureFromString(EDataType eDataType, String initialValue) {
		OSArchitecture result = OSArchitecture.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOSArchitectureToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSFamily createOSFamilyFromString(EDataType eDataType, String initialValue) {
		OSFamily result = OSFamily.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOSFamilyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationScope createLocationScopeFromString(EDataType eDataType, String initialValue) {
		LocationScope result = LocationScope.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLocationScopeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public cloudiator.Runtime createRuntimeFromString(EDataType eDataType, String initialValue) {
		cloudiator.Runtime result = cloudiator.Runtime.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRuntimeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeType createNodeTypeFromString(EDataType eDataType, String initialValue) {
		NodeType result = NodeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNodeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudiatorPackage getCloudiatorPackage() {
		return (CloudiatorPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CloudiatorPackage getPackage() {
		return CloudiatorPackage.eINSTANCE;
	}

} //CloudiatorFactoryImpl
