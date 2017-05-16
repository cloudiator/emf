/**
 */
package cloudiator.impl;

import cloudiator.Cloud;
import cloudiator.CloudType;
import cloudiator.CloudiatorPackage;
import cloudiator.Hardware;
import cloudiator.Image;
import cloudiator.Location;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
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
 *   <li>{@link cloudiator.impl.CloudImpl#getImages <em>Images</em>}</li>
 *   <li>{@link cloudiator.impl.CloudImpl#getHardwareList <em>Hardware List</em>}</li>
 *   <li>{@link cloudiator.impl.CloudImpl#getLocations <em>Locations</em>}</li>
 *   <li>{@link cloudiator.impl.CloudImpl#getName <em>Name</em>}</li>
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
	 * The cached value of the '{@link #getImages() <em>Images</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImages()
	 * @generated
	 * @ordered
	 */
	protected EList<Image> images;

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
	 * The cached value of the '{@link #getLocations() <em>Locations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<Location> locations;

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
			images = new EObjectContainmentEList<Image>(Image.class, this, CloudiatorPackage.CLOUD__IMAGES);
		}
		return images;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Hardware> getHardwareList() {
		if (hardwareList == null) {
			hardwareList = new EObjectContainmentEList<Hardware>(Hardware.class, this, CloudiatorPackage.CLOUD__HARDWARE_LIST);
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
			locations = new EObjectContainmentEList<Location>(Location.class, this, CloudiatorPackage.CLOUD__LOCATIONS);
		}
		return locations;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudiatorPackage.CLOUD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CloudiatorPackage.CLOUD__IMAGES:
				return ((InternalEList<?>)getImages()).basicRemove(otherEnd, msgs);
			case CloudiatorPackage.CLOUD__HARDWARE_LIST:
				return ((InternalEList<?>)getHardwareList()).basicRemove(otherEnd, msgs);
			case CloudiatorPackage.CLOUD__LOCATIONS:
				return ((InternalEList<?>)getLocations()).basicRemove(otherEnd, msgs);
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
			case CloudiatorPackage.CLOUD__IMAGES:
				return getImages();
			case CloudiatorPackage.CLOUD__HARDWARE_LIST:
				return getHardwareList();
			case CloudiatorPackage.CLOUD__LOCATIONS:
				return getLocations();
			case CloudiatorPackage.CLOUD__NAME:
				return getName();
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
			case CloudiatorPackage.CLOUD__IMAGES:
				getImages().clear();
				getImages().addAll((Collection<? extends Image>)newValue);
				return;
			case CloudiatorPackage.CLOUD__HARDWARE_LIST:
				getHardwareList().clear();
				getHardwareList().addAll((Collection<? extends Hardware>)newValue);
				return;
			case CloudiatorPackage.CLOUD__LOCATIONS:
				getLocations().clear();
				getLocations().addAll((Collection<? extends Location>)newValue);
				return;
			case CloudiatorPackage.CLOUD__NAME:
				setName((String)newValue);
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
			case CloudiatorPackage.CLOUD__IMAGES:
				getImages().clear();
				return;
			case CloudiatorPackage.CLOUD__HARDWARE_LIST:
				getHardwareList().clear();
				return;
			case CloudiatorPackage.CLOUD__LOCATIONS:
				getLocations().clear();
				return;
			case CloudiatorPackage.CLOUD__NAME:
				setName(NAME_EDEFAULT);
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
			case CloudiatorPackage.CLOUD__IMAGES:
				return images != null && !images.isEmpty();
			case CloudiatorPackage.CLOUD__HARDWARE_LIST:
				return hardwareList != null && !hardwareList.isEmpty();
			case CloudiatorPackage.CLOUD__LOCATIONS:
				return locations != null && !locations.isEmpty();
			case CloudiatorPackage.CLOUD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //CloudImpl
