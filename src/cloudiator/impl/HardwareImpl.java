/**
 */
package cloudiator.impl;

import cloudiator.Cloud;
import cloudiator.CloudiatorPackage;
import cloudiator.Hardware;

import cloudiator.Price;
import java.math.BigInteger;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

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
 *   <li>{@link cloudiator.impl.HardwareImpl#getPrices <em>Prices</em>}</li>
 *   <li>{@link cloudiator.impl.HardwareImpl#getCloud <em>Cloud</em>}</li>
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
	protected static final BigInteger CORES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCores() <em>Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCores()
	 * @generated
	 * @ordered
	 */
	protected BigInteger cores = CORES_EDEFAULT;

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
	protected static final BigInteger RAM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRam() <em>Ram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRam()
	 * @generated
	 * @ordered
	 */
	protected BigInteger ram = RAM_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisk() <em>Disk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisk()
	 * @generated
	 * @ordered
	 */
	protected static final Float DISK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisk() <em>Disk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisk()
	 * @generated
	 * @ordered
	 */
	protected Float disk = DISK_EDEFAULT;

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
	 * The cached value of the '{@link #getPrices() <em>Prices</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrices()
	 * @generated
	 * @ordered
	 */
	protected EList<Price> prices;

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
	public BigInteger getCores() {
		return cores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCores(BigInteger newCores) {
		BigInteger oldCores = cores;
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
	public BigInteger getRam() {
		return ram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRam(BigInteger newRam) {
		BigInteger oldRam = ram;
		ram = newRam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudiatorPackage.HARDWARE__RAM, oldRam, ram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float getDisk() {
		return disk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisk(Float newDisk) {
		Float oldDisk = disk;
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
	public EList<Price> getPrices() {
		if (prices == null) {
			prices = new EObjectWithInverseResolvingEList<Price>(Price.class, this, CloudiatorPackage.HARDWARE__PRICES, CloudiatorPackage.PRICE__HARDWARE);
		}
		return prices;
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CloudiatorPackage.HARDWARE__PRICES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPrices()).basicAdd(otherEnd, msgs);
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
			case CloudiatorPackage.HARDWARE__PRICES:
				return ((InternalEList<?>)getPrices()).basicRemove(otherEnd, msgs);
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
			case CloudiatorPackage.HARDWARE__PRICES:
				return getPrices();
			case CloudiatorPackage.HARDWARE__CLOUD:
				return getCloud();
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
				setCores((BigInteger)newValue);
				return;
			case CloudiatorPackage.HARDWARE__NAME:
				setName((String)newValue);
				return;
			case CloudiatorPackage.HARDWARE__RAM:
				setRam((BigInteger)newValue);
				return;
			case CloudiatorPackage.HARDWARE__DISK:
				setDisk((Float)newValue);
				return;
			case CloudiatorPackage.HARDWARE__ID:
				setId((String)newValue);
				return;
			case CloudiatorPackage.HARDWARE__PRICES:
				getPrices().clear();
				getPrices().addAll((Collection<? extends Price>)newValue);
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
			case CloudiatorPackage.HARDWARE__PRICES:
				getPrices().clear();
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
			case CloudiatorPackage.HARDWARE__PRICES:
				return prices != null && !prices.isEmpty();
			case CloudiatorPackage.HARDWARE__CLOUD:
				return getCloud() != null;
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
		result.append(')');
		return result.toString();
	}

} //HardwareImpl
