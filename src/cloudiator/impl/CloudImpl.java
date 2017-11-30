/**
 */
package cloudiator.impl;

import cloudiator.Api;
import cloudiator.Cloud;
import cloudiator.CloudConfiguration;
import cloudiator.CloudCredential;
import cloudiator.CloudType;
import cloudiator.CloudiatorPackage;
import cloudiator.Hardware;
import cloudiator.Image;
import cloudiator.Location;

import cloudiator.Price;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cloud</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cloudiator.impl.CloudImpl#getType <em>Type</em>}</li>
 *   <li>{@link cloudiator.impl.CloudImpl#getLocations <em>Locations</em>}</li>
 *   <li>{@link cloudiator.impl.CloudImpl#getHardwareList <em>Hardware List</em>}</li>
 *   <li>{@link cloudiator.impl.CloudImpl#getImages <em>Images</em>}</li>
 *   <li>{@link cloudiator.impl.CloudImpl#getId <em>Id</em>}</li>
 *   <li>{@link cloudiator.impl.CloudImpl#getPrices <em>Prices</em>}</li>
 *   <li>{@link cloudiator.impl.CloudImpl#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link cloudiator.impl.CloudImpl#getApi <em>Api</em>}</li>
 *   <li>{@link cloudiator.impl.CloudImpl#getCloudcredential <em>Cloudcredential</em>}</li>
 *   <li>{@link cloudiator.impl.CloudImpl#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CloudImpl extends MinimalEObjectImpl.Container implements Cloud {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final CloudType TYPE_EDEFAULT = CloudType.PUBLIC;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CloudType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLocations() <em>Locations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<Location> locations;

	/**
	 * The cached value of the '{@link #getHardwareList() <em>Hardware List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardwareList()
	 * @generated
	 * @ordered
	 */
	protected EList<Hardware> hardwareList;

	/**
	 * The cached value of the '{@link #getImages() <em>Images</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImages()
	 * @generated
	 * @ordered
	 */
	protected EList<Image> images;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPrices() <em>Prices</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrices()
	 * @generated
	 * @ordered
	 */
	protected EList<Price> prices;

	/**
	 * The default value of the '{@link #getEndpoint() <em>Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpoint()
	 * @generated
	 * @ordered
	 */
	protected static final String ENDPOINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndpoint() <em>Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpoint()
	 * @generated
	 * @ordered
	 */
	protected String endpoint = ENDPOINT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getApi() <em>Api</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApi()
	 * @generated
	 * @ordered
	 */
	protected Api api;

	/**
	 * The cached value of the '{@link #getCloudcredential() <em>Cloudcredential</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudcredential()
	 * @generated
	 * @ordered
	 */
	protected CloudCredential cloudcredential;

	/**
	 * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected CloudConfiguration configuration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CloudImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CloudiatorPackage.Literals.CLOUD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CloudType newType) {
		CloudType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudiatorPackage.CLOUD__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Image> getImages() {
		if (images == null) {
			images = new EObjectContainmentWithInverseEList<Image>(Image.class, this, CloudiatorPackage.CLOUD__IMAGES, CloudiatorPackage.IMAGE__CLOUD);
		}
		return images;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudiatorPackage.CLOUD__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Price> getPrices() {
		if (prices == null) {
			prices = new EObjectContainmentEList<Price>(Price.class, this, CloudiatorPackage.CLOUD__PRICES);
		}
		return prices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndpoint() {
		return endpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndpoint(String newEndpoint) {
		String oldEndpoint = endpoint;
		endpoint = newEndpoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudiatorPackage.CLOUD__ENDPOINT, oldEndpoint, endpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Api getApi() {
		return api;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApi(Api newApi, NotificationChain msgs) {
		Api oldApi = api;
		api = newApi;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CloudiatorPackage.CLOUD__API, oldApi, newApi);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApi(Api newApi) {
		if (newApi != api) {
			NotificationChain msgs = null;
			if (api != null)
				msgs = ((InternalEObject)api).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CloudiatorPackage.CLOUD__API, null, msgs);
			if (newApi != null)
				msgs = ((InternalEObject)newApi).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CloudiatorPackage.CLOUD__API, null, msgs);
			msgs = basicSetApi(newApi, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudiatorPackage.CLOUD__API, newApi, newApi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudCredential getCloudcredential() {
		return cloudcredential;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCloudcredential(CloudCredential newCloudcredential, NotificationChain msgs) {
		CloudCredential oldCloudcredential = cloudcredential;
		cloudcredential = newCloudcredential;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CloudiatorPackage.CLOUD__CLOUDCREDENTIAL, oldCloudcredential, newCloudcredential);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCloudcredential(CloudCredential newCloudcredential) {
		if (newCloudcredential != cloudcredential) {
			NotificationChain msgs = null;
			if (cloudcredential != null)
				msgs = ((InternalEObject)cloudcredential).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CloudiatorPackage.CLOUD__CLOUDCREDENTIAL, null, msgs);
			if (newCloudcredential != null)
				msgs = ((InternalEObject)newCloudcredential).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CloudiatorPackage.CLOUD__CLOUDCREDENTIAL, null, msgs);
			msgs = basicSetCloudcredential(newCloudcredential, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudiatorPackage.CLOUD__CLOUDCREDENTIAL, newCloudcredential, newCloudcredential));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudConfiguration getConfiguration() {
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfiguration(CloudConfiguration newConfiguration, NotificationChain msgs) {
		CloudConfiguration oldConfiguration = configuration;
		configuration = newConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CloudiatorPackage.CLOUD__CONFIGURATION, oldConfiguration, newConfiguration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfiguration(CloudConfiguration newConfiguration) {
		if (newConfiguration != configuration) {
			NotificationChain msgs = null;
			if (configuration != null)
				msgs = ((InternalEObject)configuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CloudiatorPackage.CLOUD__CONFIGURATION, null, msgs);
			if (newConfiguration != null)
				msgs = ((InternalEObject)newConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CloudiatorPackage.CLOUD__CONFIGURATION, null, msgs);
			msgs = basicSetConfiguration(newConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudiatorPackage.CLOUD__CONFIGURATION, newConfiguration, newConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CloudiatorPackage.CLOUD__LOCATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLocations()).basicAdd(otherEnd, msgs);
			case CloudiatorPackage.CLOUD__HARDWARE_LIST:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHardwareList()).basicAdd(otherEnd, msgs);
			case CloudiatorPackage.CLOUD__IMAGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getImages()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Hardware> getHardwareList() {
		if (hardwareList == null) {
			hardwareList = new EObjectContainmentWithInverseEList<Hardware>(Hardware.class, this, CloudiatorPackage.CLOUD__HARDWARE_LIST, CloudiatorPackage.HARDWARE__CLOUD);
		}
		return hardwareList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Location> getLocations() {
		if (locations == null) {
			locations = new EObjectContainmentWithInverseEList<Location>(Location.class, this, CloudiatorPackage.CLOUD__LOCATIONS, CloudiatorPackage.LOCATION__CLOUD);
		}
		return locations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CloudiatorPackage.CLOUD__LOCATIONS:
				return ((InternalEList<?>)getLocations()).basicRemove(otherEnd, msgs);
			case CloudiatorPackage.CLOUD__HARDWARE_LIST:
				return ((InternalEList<?>)getHardwareList()).basicRemove(otherEnd, msgs);
			case CloudiatorPackage.CLOUD__IMAGES:
				return ((InternalEList<?>)getImages()).basicRemove(otherEnd, msgs);
			case CloudiatorPackage.CLOUD__PRICES:
				return ((InternalEList<?>)getPrices()).basicRemove(otherEnd, msgs);
			case CloudiatorPackage.CLOUD__API:
				return basicSetApi(null, msgs);
			case CloudiatorPackage.CLOUD__CLOUDCREDENTIAL:
				return basicSetCloudcredential(null, msgs);
			case CloudiatorPackage.CLOUD__CONFIGURATION:
				return basicSetConfiguration(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CloudiatorPackage.CLOUD__TYPE:
				return getType();
			case CloudiatorPackage.CLOUD__LOCATIONS:
				return getLocations();
			case CloudiatorPackage.CLOUD__HARDWARE_LIST:
				return getHardwareList();
			case CloudiatorPackage.CLOUD__IMAGES:
				return getImages();
			case CloudiatorPackage.CLOUD__ID:
				return getId();
			case CloudiatorPackage.CLOUD__PRICES:
				return getPrices();
			case CloudiatorPackage.CLOUD__ENDPOINT:
				return getEndpoint();
			case CloudiatorPackage.CLOUD__API:
				return getApi();
			case CloudiatorPackage.CLOUD__CLOUDCREDENTIAL:
				return getCloudcredential();
			case CloudiatorPackage.CLOUD__CONFIGURATION:
				return getConfiguration();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CloudiatorPackage.CLOUD__TYPE:
				setType((CloudType)newValue);
				return;
			case CloudiatorPackage.CLOUD__LOCATIONS:
				getLocations().clear();
				getLocations().addAll((Collection<? extends Location>)newValue);
				return;
			case CloudiatorPackage.CLOUD__HARDWARE_LIST:
				getHardwareList().clear();
				getHardwareList().addAll((Collection<? extends Hardware>)newValue);
				return;
			case CloudiatorPackage.CLOUD__IMAGES:
				getImages().clear();
				getImages().addAll((Collection<? extends Image>)newValue);
				return;
			case CloudiatorPackage.CLOUD__ID:
				setId((String)newValue);
				return;
			case CloudiatorPackage.CLOUD__PRICES:
				getPrices().clear();
				getPrices().addAll((Collection<? extends Price>)newValue);
				return;
			case CloudiatorPackage.CLOUD__ENDPOINT:
				setEndpoint((String)newValue);
				return;
			case CloudiatorPackage.CLOUD__API:
				setApi((Api)newValue);
				return;
			case CloudiatorPackage.CLOUD__CLOUDCREDENTIAL:
				setCloudcredential((CloudCredential)newValue);
				return;
			case CloudiatorPackage.CLOUD__CONFIGURATION:
				setConfiguration((CloudConfiguration)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CloudiatorPackage.CLOUD__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case CloudiatorPackage.CLOUD__LOCATIONS:
				getLocations().clear();
				return;
			case CloudiatorPackage.CLOUD__HARDWARE_LIST:
				getHardwareList().clear();
				return;
			case CloudiatorPackage.CLOUD__IMAGES:
				getImages().clear();
				return;
			case CloudiatorPackage.CLOUD__ID:
				setId(ID_EDEFAULT);
				return;
			case CloudiatorPackage.CLOUD__PRICES:
				getPrices().clear();
				return;
			case CloudiatorPackage.CLOUD__ENDPOINT:
				setEndpoint(ENDPOINT_EDEFAULT);
				return;
			case CloudiatorPackage.CLOUD__API:
				setApi((Api)null);
				return;
			case CloudiatorPackage.CLOUD__CLOUDCREDENTIAL:
				setCloudcredential((CloudCredential)null);
				return;
			case CloudiatorPackage.CLOUD__CONFIGURATION:
				setConfiguration((CloudConfiguration)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CloudiatorPackage.CLOUD__TYPE:
				return type != TYPE_EDEFAULT;
			case CloudiatorPackage.CLOUD__LOCATIONS:
				return locations != null && !locations.isEmpty();
			case CloudiatorPackage.CLOUD__HARDWARE_LIST:
				return hardwareList != null && !hardwareList.isEmpty();
			case CloudiatorPackage.CLOUD__IMAGES:
				return images != null && !images.isEmpty();
			case CloudiatorPackage.CLOUD__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CloudiatorPackage.CLOUD__PRICES:
				return prices != null && !prices.isEmpty();
			case CloudiatorPackage.CLOUD__ENDPOINT:
				return ENDPOINT_EDEFAULT == null ? endpoint != null : !ENDPOINT_EDEFAULT.equals(endpoint);
			case CloudiatorPackage.CLOUD__API:
				return api != null;
			case CloudiatorPackage.CLOUD__CLOUDCREDENTIAL:
				return cloudcredential != null;
			case CloudiatorPackage.CLOUD__CONFIGURATION:
				return configuration != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(", id: ");
		result.append(id);
		result.append(", endpoint: ");
		result.append(endpoint);
		result.append(')');
		return result.toString();
	}

} //CloudImpl
