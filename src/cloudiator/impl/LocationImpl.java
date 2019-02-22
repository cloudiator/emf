/**
 */
package cloudiator.impl;

import cloudiator.Cloud;
import cloudiator.CloudiatorPackage;
import cloudiator.DiscoveryItemState;
import cloudiator.GeoLocation;
import cloudiator.Location;

import cloudiator.LocationScope;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cloudiator.impl.LocationImpl#getName <em>Name</em>}</li>
 *   <li>{@link cloudiator.impl.LocationImpl#getId <em>Id</em>}</li>
 *   <li>{@link cloudiator.impl.LocationImpl#getCloud <em>Cloud</em>}</li>
 *   <li>{@link cloudiator.impl.LocationImpl#getProviderId <em>Provider Id</em>}</li>
 *   <li>{@link cloudiator.impl.LocationImpl#getGeoLocation <em>Geo Location</em>}</li>
 *   <li>{@link cloudiator.impl.LocationImpl#isAssignable <em>Assignable</em>}</li>
 *   <li>{@link cloudiator.impl.LocationImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link cloudiator.impl.LocationImpl#getLocationScope <em>Location Scope</em>}</li>
 *   <li>{@link cloudiator.impl.LocationImpl#getState <em>State</em>}</li>
 *   <li>{@link cloudiator.impl.LocationImpl#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocationImpl extends MinimalEObjectImpl.Container implements Location {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * The default value of the '{@link #getProviderId() <em>Provider Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderId()
	 * @generated
	 * @ordered
	 */
	protected static final String PROVIDER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProviderId() <em>Provider Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderId()
	 * @generated
	 * @ordered
	 */
	protected String providerId = PROVIDER_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGeoLocation() <em>Geo Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeoLocation()
	 * @generated
	 * @ordered
	 */
	protected GeoLocation geoLocation;

	/**
	 * The default value of the '{@link #isAssignable() <em>Assignable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAssignable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ASSIGNABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAssignable() <em>Assignable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAssignable()
	 * @generated
	 * @ordered
	 */
	protected boolean assignable = ASSIGNABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected Location parent;

	/**
	 * The default value of the '{@link #getLocationScope() <em>Location Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationScope()
	 * @generated
	 * @ordered
	 */
	protected static final LocationScope LOCATION_SCOPE_EDEFAULT = LocationScope.UNKOWN;

	/**
	 * The cached value of the '{@link #getLocationScope() <em>Location Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationScope()
	 * @generated
	 * @ordered
	 */
	protected LocationScope locationScope = LOCATION_SCOPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final DiscoveryItemState STATE_EDEFAULT = DiscoveryItemState.OK;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected DiscoveryItemState state = STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOwner() <em>Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected static final String OWNER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected String owner = OWNER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CloudiatorPackage.Literals.LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudiatorPackage.LOCATION__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudiatorPackage.LOCATION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cloud getCloud() {
		if (eContainerFeatureID() != CloudiatorPackage.LOCATION__CLOUD) return null;
		return (Cloud)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProviderId() {
		return providerId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProviderId(String newProviderId) {
		String oldProviderId = providerId;
		providerId = newProviderId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudiatorPackage.LOCATION__PROVIDER_ID, oldProviderId, providerId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeoLocation getGeoLocation() {
		return geoLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeoLocation(GeoLocation newGeoLocation, NotificationChain msgs) {
		GeoLocation oldGeoLocation = geoLocation;
		geoLocation = newGeoLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CloudiatorPackage.LOCATION__GEO_LOCATION, oldGeoLocation, newGeoLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeoLocation(GeoLocation newGeoLocation) {
		if (newGeoLocation != geoLocation) {
			NotificationChain msgs = null;
			if (geoLocation != null)
				msgs = ((InternalEObject)geoLocation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CloudiatorPackage.LOCATION__GEO_LOCATION, null, msgs);
			if (newGeoLocation != null)
				msgs = ((InternalEObject)newGeoLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CloudiatorPackage.LOCATION__GEO_LOCATION, null, msgs);
			msgs = basicSetGeoLocation(newGeoLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudiatorPackage.LOCATION__GEO_LOCATION, newGeoLocation, newGeoLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAssignable() {
		return assignable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssignable(boolean newAssignable) {
		boolean oldAssignable = assignable;
		assignable = newAssignable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudiatorPackage.LOCATION__ASSIGNABLE, oldAssignable, assignable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getParent() {
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject)parent;
			parent = (Location)eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CloudiatorPackage.LOCATION__PARENT, oldParent, parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Location newParent) {
		Location oldParent = parent;
		parent = newParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudiatorPackage.LOCATION__PARENT, oldParent, parent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationScope getLocationScope() {
		return locationScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocationScope(LocationScope newLocationScope) {
		LocationScope oldLocationScope = locationScope;
		locationScope = newLocationScope == null ? LOCATION_SCOPE_EDEFAULT : newLocationScope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudiatorPackage.LOCATION__LOCATION_SCOPE, oldLocationScope, locationScope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscoveryItemState getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(DiscoveryItemState newState) {
		DiscoveryItemState oldState = state;
		state = newState == null ? STATE_EDEFAULT : newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudiatorPackage.LOCATION__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(String newOwner) {
		String oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudiatorPackage.LOCATION__OWNER, oldOwner, owner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CloudiatorPackage.LOCATION__CLOUD:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, CloudiatorPackage.LOCATION__CLOUD, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CloudiatorPackage.LOCATION__CLOUD:
				return eBasicSetContainer(null, CloudiatorPackage.LOCATION__CLOUD, msgs);
			case CloudiatorPackage.LOCATION__GEO_LOCATION:
				return basicSetGeoLocation(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case CloudiatorPackage.LOCATION__CLOUD:
				return eInternalContainer().eInverseRemove(this, CloudiatorPackage.CLOUD__LOCATIONS, Cloud.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CloudiatorPackage.LOCATION__NAME:
				return getName();
			case CloudiatorPackage.LOCATION__ID:
				return getId();
			case CloudiatorPackage.LOCATION__CLOUD:
				return getCloud();
			case CloudiatorPackage.LOCATION__PROVIDER_ID:
				return getProviderId();
			case CloudiatorPackage.LOCATION__GEO_LOCATION:
				return getGeoLocation();
			case CloudiatorPackage.LOCATION__ASSIGNABLE:
				return isAssignable();
			case CloudiatorPackage.LOCATION__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case CloudiatorPackage.LOCATION__LOCATION_SCOPE:
				return getLocationScope();
			case CloudiatorPackage.LOCATION__STATE:
				return getState();
			case CloudiatorPackage.LOCATION__OWNER:
				return getOwner();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CloudiatorPackage.LOCATION__NAME:
				setName((String)newValue);
				return;
			case CloudiatorPackage.LOCATION__ID:
				setId((String)newValue);
				return;
			case CloudiatorPackage.LOCATION__PROVIDER_ID:
				setProviderId((String)newValue);
				return;
			case CloudiatorPackage.LOCATION__GEO_LOCATION:
				setGeoLocation((GeoLocation)newValue);
				return;
			case CloudiatorPackage.LOCATION__ASSIGNABLE:
				setAssignable((Boolean)newValue);
				return;
			case CloudiatorPackage.LOCATION__PARENT:
				setParent((Location)newValue);
				return;
			case CloudiatorPackage.LOCATION__LOCATION_SCOPE:
				setLocationScope((LocationScope)newValue);
				return;
			case CloudiatorPackage.LOCATION__STATE:
				setState((DiscoveryItemState)newValue);
				return;
			case CloudiatorPackage.LOCATION__OWNER:
				setOwner((String)newValue);
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
			case CloudiatorPackage.LOCATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CloudiatorPackage.LOCATION__ID:
				setId(ID_EDEFAULT);
				return;
			case CloudiatorPackage.LOCATION__PROVIDER_ID:
				setProviderId(PROVIDER_ID_EDEFAULT);
				return;
			case CloudiatorPackage.LOCATION__GEO_LOCATION:
				setGeoLocation((GeoLocation)null);
				return;
			case CloudiatorPackage.LOCATION__ASSIGNABLE:
				setAssignable(ASSIGNABLE_EDEFAULT);
				return;
			case CloudiatorPackage.LOCATION__PARENT:
				setParent((Location)null);
				return;
			case CloudiatorPackage.LOCATION__LOCATION_SCOPE:
				setLocationScope(LOCATION_SCOPE_EDEFAULT);
				return;
			case CloudiatorPackage.LOCATION__STATE:
				setState(STATE_EDEFAULT);
				return;
			case CloudiatorPackage.LOCATION__OWNER:
				setOwner(OWNER_EDEFAULT);
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
			case CloudiatorPackage.LOCATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CloudiatorPackage.LOCATION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CloudiatorPackage.LOCATION__CLOUD:
				return getCloud() != null;
			case CloudiatorPackage.LOCATION__PROVIDER_ID:
				return PROVIDER_ID_EDEFAULT == null ? providerId != null : !PROVIDER_ID_EDEFAULT.equals(providerId);
			case CloudiatorPackage.LOCATION__GEO_LOCATION:
				return geoLocation != null;
			case CloudiatorPackage.LOCATION__ASSIGNABLE:
				return assignable != ASSIGNABLE_EDEFAULT;
			case CloudiatorPackage.LOCATION__PARENT:
				return parent != null;
			case CloudiatorPackage.LOCATION__LOCATION_SCOPE:
				return locationScope != LOCATION_SCOPE_EDEFAULT;
			case CloudiatorPackage.LOCATION__STATE:
				return state != STATE_EDEFAULT;
			case CloudiatorPackage.LOCATION__OWNER:
				return OWNER_EDEFAULT == null ? owner != null : !OWNER_EDEFAULT.equals(owner);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(", providerId: ");
		result.append(providerId);
		result.append(", assignable: ");
		result.append(assignable);
		result.append(", locationScope: ");
		result.append(locationScope);
		result.append(", state: ");
		result.append(state);
		result.append(", owner: ");
		result.append(owner);
		result.append(')');
		return result.toString();
	}

} //LocationImpl
