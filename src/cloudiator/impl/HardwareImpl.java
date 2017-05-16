/**
 */
package cloudiator.impl;

import cloudiator.CloudiatorPackage;
import cloudiator.Hardware;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

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
	protected static final BigInteger DISK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisk() <em>Disk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisk()
	 * @generated
	 * @ordered
	 */
	protected BigInteger disk = DISK_EDEFAULT;

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
	public BigInteger getDisk() {
		return disk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisk(BigInteger newDisk) {
		BigInteger oldDisk = disk;
		disk = newDisk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudiatorPackage.HARDWARE__DISK, oldDisk, disk));
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
				setDisk((BigInteger)newValue);
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
		result.append(')');
		return result.toString();
	}

} //HardwareImpl
