/**
 */
package cloudiator.impl;

import cloudiator.Cloud;
import cloudiator.CloudiatorPackage;
import cloudiator.DiscoveryItemState;
import cloudiator.Hardware;

import cloudiator.Location;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hardware</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cloudiator.impl.HardwareImpl#getCores <em>Cores</em>}</li>
 *   <li>{@link cloudiator.impl.HardwareImpl#getName <em>Name</em>}</li>
 *   <li>{@link cloudiator.impl.HardwareImpl#getRam <em>Ram</em>}</li>
 *   <li>{@link cloudiator.impl.HardwareImpl#getDisk <em>Disk</em>}</li>
 *   <li>{@link cloudiator.impl.HardwareImpl#getId <em>Id</em>}</li>
 *   <li>{@link cloudiator.impl.HardwareImpl#getCloud <em>Cloud</em>}</li>
 *   <li>{@link cloudiator.impl.HardwareImpl#getProviderId <em>Provider Id</em>}</li>
 *   <li>{@link cloudiator.impl.HardwareImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link cloudiator.impl.HardwareImpl#getState <em>State</em>}</li>
 *   <li>{@link cloudiator.impl.HardwareImpl#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HardwareImpl extends MinimalEObjectImpl.Container implements Hardware {
	/**
	 * The default value of the '{@link #getCores() <em>Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCores()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CORES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCores() <em>Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCores()
	 * @generated
	 * @ordered
	 */
	protected Integer cores = CORES_EDEFAULT;

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
	 * The default value of the '{@link #getRam() <em>Ram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRam()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RAM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRam() <em>Ram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRam()
	 * @generated
	 * @ordered
	 */
	protected Integer ram = RAM_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisk() <em>Disk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisk()
	 * @generated
	 * @ordered
	 */
	protected static final Double DISK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisk() <em>Disk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisk()
	 * @generated
	 * @ordered
	 */
	protected Double disk = DISK_EDEFAULT;

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
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Location location;

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
	protected HardwareImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CloudiatorPackage.Literals.HARDWARE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getCores() {
		return cores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCores(Integer newCores) {
		Integer oldCores = cores;
		cores = newCores;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudiatorPackage.HARDWARE__CORES, oldCores, cores));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudiatorPackage.HARDWARE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getRam() {
		return ram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRam(Integer newRam) {
		Integer oldRam = ram;
		ram = newRam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudiatorPackage.HARDWARE__RAM, oldRam, ram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getDisk() {
		return disk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisk(Double newDisk) {
		Double oldDisk = disk;
		disk = newDisk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudiatorPackage.HARDWARE__DISK, oldDisk, disk));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudiatorPackage.HARDWARE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cloud getCloud() {
		if (eContainerFeatureID() != CloudiatorPackage.HARDWARE__CLOUD) return null;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudiatorPackage.HARDWARE__PROVIDER_ID, oldProviderId, providerId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getLocation() {
		if (location != null && location.eIsProxy()) {
			InternalEObject oldLocation = (InternalEObject)location;
			location = (Location)eResolveProxy(oldLocation);
			if (location != oldLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CloudiatorPackage.HARDWARE__LOCATION, oldLocation, location));
			}
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(Location newLocation) {
		Location oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudiatorPackage.HARDWARE__LOCATION, oldLocation, location));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudiatorPackage.HARDWARE__STATE, oldState, state));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudiatorPackage.HARDWARE__OWNER, oldOwner, owner));
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
			case CloudiatorPackage.HARDWARE__CLOUD:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, CloudiatorPackage.HARDWARE__CLOUD, msgs);
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
			case CloudiatorPackage.HARDWARE__CLOUD:
				return eBasicSetContainer(null, CloudiatorPackage.HARDWARE__CLOUD, msgs);
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
			case CloudiatorPackage.HARDWARE__CLOUD:
				return eInternalContainer().eInverseRemove(this, CloudiatorPackage.CLOUD__HARDWARE_LIST, Cloud.class, msgs);
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
			case CloudiatorPackage.HARDWARE__CORES:
				return getCores();
			case CloudiatorPackage.HARDWARE__NAME:
				return getName();
			case CloudiatorPackage.HARDWARE__RAM:
				return getRam();
			case CloudiatorPackage.HARDWARE__DISK:
				return getDisk();
			case CloudiatorPackage.HARDWARE__ID:
				return getId();
			case CloudiatorPackage.HARDWARE__CLOUD:
				return getCloud();
			case CloudiatorPackage.HARDWARE__PROVIDER_ID:
				return getProviderId();
			case CloudiatorPackage.HARDWARE__LOCATION:
				if (resolve) return getLocation();
				return basicGetLocation();
			case CloudiatorPackage.HARDWARE__STATE:
				return getState();
			case CloudiatorPackage.HARDWARE__OWNER:
				return getOwner();
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
			case CloudiatorPackage.HARDWARE__CORES:
				setCores((Integer)newValue);
				return;
			case CloudiatorPackage.HARDWARE__NAME:
				setName((String)newValue);
				return;
			case CloudiatorPackage.HARDWARE__RAM:
				setRam((Integer)newValue);
				return;
			case CloudiatorPackage.HARDWARE__DISK:
				setDisk((Double)newValue);
				return;
			case CloudiatorPackage.HARDWARE__ID:
				setId((String)newValue);
				return;
			case CloudiatorPackage.HARDWARE__PROVIDER_ID:
				setProviderId((String)newValue);
				return;
			case CloudiatorPackage.HARDWARE__LOCATION:
				setLocation((Location)newValue);
				return;
			case CloudiatorPackage.HARDWARE__STATE:
				setState((DiscoveryItemState)newValue);
				return;
			case CloudiatorPackage.HARDWARE__OWNER:
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
			case CloudiatorPackage.HARDWARE__CORES:
				setCores(CORES_EDEFAULT);
				return;
			case CloudiatorPackage.HARDWARE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CloudiatorPackage.HARDWARE__RAM:
				setRam(RAM_EDEFAULT);
				return;
			case CloudiatorPackage.HARDWARE__DISK:
				setDisk(DISK_EDEFAULT);
				return;
			case CloudiatorPackage.HARDWARE__ID:
				setId(ID_EDEFAULT);
				return;
			case CloudiatorPackage.HARDWARE__PROVIDER_ID:
				setProviderId(PROVIDER_ID_EDEFAULT);
				return;
			case CloudiatorPackage.HARDWARE__LOCATION:
				setLocation((Location)null);
				return;
			case CloudiatorPackage.HARDWARE__STATE:
				setState(STATE_EDEFAULT);
				return;
			case CloudiatorPackage.HARDWARE__OWNER:
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
			case CloudiatorPackage.HARDWARE__CORES:
				return CORES_EDEFAULT == null ? cores != null : !CORES_EDEFAULT.equals(cores);
			case CloudiatorPackage.HARDWARE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CloudiatorPackage.HARDWARE__RAM:
				return RAM_EDEFAULT == null ? ram != null : !RAM_EDEFAULT.equals(ram);
			case CloudiatorPackage.HARDWARE__DISK:
				return DISK_EDEFAULT == null ? disk != null : !DISK_EDEFAULT.equals(disk);
			case CloudiatorPackage.HARDWARE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CloudiatorPackage.HARDWARE__CLOUD:
				return getCloud() != null;
			case CloudiatorPackage.HARDWARE__PROVIDER_ID:
				return PROVIDER_ID_EDEFAULT == null ? providerId != null : !PROVIDER_ID_EDEFAULT.equals(providerId);
			case CloudiatorPackage.HARDWARE__LOCATION:
				return location != null;
			case CloudiatorPackage.HARDWARE__STATE:
				return state != STATE_EDEFAULT;
			case CloudiatorPackage.HARDWARE__OWNER:
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
		result.append(" (cores: ");
		result.append(cores);
		result.append(", name: ");
		result.append(name);
		result.append(", ram: ");
		result.append(ram);
		result.append(", disk: ");
		result.append(disk);
		result.append(", id: ");
		result.append(id);
		result.append(", providerId: ");
		result.append(providerId);
		result.append(", state: ");
		result.append(state);
		result.append(", owner: ");
		result.append(owner);
		result.append(')');
		return result.toString();
	}

} //HardwareImpl
