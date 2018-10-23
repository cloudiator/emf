/**
 */
package cloudiator.impl;

import cloudiator.Cloud;
import cloudiator.CloudiatorPackage;
import cloudiator.Environment;
import cloudiator.Hardware;
import cloudiator.Image;
import cloudiator.Location;
import cloudiator.Node;

import cloudiator.NodeType;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cloudiator.impl.NodeImpl#getCloud <em>Cloud</em>}</li>
 *   <li>{@link cloudiator.impl.NodeImpl#getImage <em>Image</em>}</li>
 *   <li>{@link cloudiator.impl.NodeImpl#getHardware <em>Hardware</em>}</li>
 *   <li>{@link cloudiator.impl.NodeImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link cloudiator.impl.NodeImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link cloudiator.impl.NodeImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link cloudiator.impl.NodeImpl#getPricePerInvocation <em>Price Per Invocation</em>}</li>
 *   <li>{@link cloudiator.impl.NodeImpl#getMemoryPrice <em>Memory Price</em>}</li>
 *   <li>{@link cloudiator.impl.NodeImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeImpl extends MinimalEObjectImpl.Container implements Node {
	/**
	 * The cached value of the '{@link #getCloud() <em>Cloud</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloud()
	 * @generated
	 * @ordered
	 */
	protected Cloud cloud;

	/**
	 * The cached value of the '{@link #getImage() <em>Image</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected Image image;

	/**
	 * The cached value of the '{@link #getHardware() <em>Hardware</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardware()
	 * @generated
	 * @ordered
	 */
	protected Hardware hardware;

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
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final Double PRICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected Double price = PRICE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEnvironment() <em>Environment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironment()
	 * @generated
	 * @ordered
	 */
	protected Environment environment;

	/**
	 * The default value of the '{@link #getPricePerInvocation() <em>Price Per Invocation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPricePerInvocation()
	 * @generated
	 * @ordered
	 */
	protected static final Double PRICE_PER_INVOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPricePerInvocation() <em>Price Per Invocation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPricePerInvocation()
	 * @generated
	 * @ordered
	 */
	protected Double pricePerInvocation = PRICE_PER_INVOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMemoryPrice() <em>Memory Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryPrice()
	 * @generated
	 * @ordered
	 */
	protected static final Double MEMORY_PRICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMemoryPrice() <em>Memory Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryPrice()
	 * @generated
	 * @ordered
	 */
	protected Double memoryPrice = MEMORY_PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final NodeType TYPE_EDEFAULT = NodeType.IAAS;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected NodeType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CloudiatorPackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cloud getCloud() {
		if (cloud != null && cloud.eIsProxy()) {
			InternalEObject oldCloud = (InternalEObject)cloud;
			cloud = (Cloud)eResolveProxy(oldCloud);
			if (cloud != oldCloud) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CloudiatorPackage.NODE__CLOUD, oldCloud, cloud));
			}
		}
		return cloud;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cloud basicGetCloud() {
		return cloud;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCloud(Cloud newCloud) {
		Cloud oldCloud = cloud;
		cloud = newCloud;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudiatorPackage.NODE__CLOUD, oldCloud, cloud));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image getImage() {
		if (image != null && image.eIsProxy()) {
			InternalEObject oldImage = (InternalEObject)image;
			image = (Image)eResolveProxy(oldImage);
			if (image != oldImage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CloudiatorPackage.NODE__IMAGE, oldImage, image));
			}
		}
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image basicGetImage() {
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImage(Image newImage) {
		Image oldImage = image;
		image = newImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudiatorPackage.NODE__IMAGE, oldImage, image));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hardware getHardware() {
		if (hardware != null && hardware.eIsProxy()) {
			InternalEObject oldHardware = (InternalEObject)hardware;
			hardware = (Hardware)eResolveProxy(oldHardware);
			if (hardware != oldHardware) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CloudiatorPackage.NODE__HARDWARE, oldHardware, hardware));
			}
		}
		return hardware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hardware basicGetHardware() {
		return hardware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHardware(Hardware newHardware) {
		Hardware oldHardware = hardware;
		hardware = newHardware;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudiatorPackage.NODE__HARDWARE, oldHardware, hardware));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CloudiatorPackage.NODE__LOCATION, oldLocation, location));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CloudiatorPackage.NODE__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrice(Double newPrice) {
		Double oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudiatorPackage.NODE__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Environment getEnvironment() {
		if (environment != null && environment.eIsProxy()) {
			InternalEObject oldEnvironment = (InternalEObject)environment;
			environment = (Environment)eResolveProxy(oldEnvironment);
			if (environment != oldEnvironment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CloudiatorPackage.NODE__ENVIRONMENT, oldEnvironment, environment));
			}
		}
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Environment basicGetEnvironment() {
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvironment(Environment newEnvironment) {
		Environment oldEnvironment = environment;
		environment = newEnvironment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudiatorPackage.NODE__ENVIRONMENT, oldEnvironment, environment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getPricePerInvocation() {
		return pricePerInvocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPricePerInvocation(Double newPricePerInvocation) {
		Double oldPricePerInvocation = pricePerInvocation;
		pricePerInvocation = newPricePerInvocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudiatorPackage.NODE__PRICE_PER_INVOCATION, oldPricePerInvocation, pricePerInvocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMemoryPrice() {
		return memoryPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemoryPrice(Double newMemoryPrice) {
		Double oldMemoryPrice = memoryPrice;
		memoryPrice = newMemoryPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudiatorPackage.NODE__MEMORY_PRICE, oldMemoryPrice, memoryPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(NodeType newType) {
		NodeType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudiatorPackage.NODE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CloudiatorPackage.NODE__CLOUD:
				if (resolve) return getCloud();
				return basicGetCloud();
			case CloudiatorPackage.NODE__IMAGE:
				if (resolve) return getImage();
				return basicGetImage();
			case CloudiatorPackage.NODE__HARDWARE:
				if (resolve) return getHardware();
				return basicGetHardware();
			case CloudiatorPackage.NODE__LOCATION:
				if (resolve) return getLocation();
				return basicGetLocation();
			case CloudiatorPackage.NODE__PRICE:
				return getPrice();
			case CloudiatorPackage.NODE__ENVIRONMENT:
				if (resolve) return getEnvironment();
				return basicGetEnvironment();
			case CloudiatorPackage.NODE__PRICE_PER_INVOCATION:
				return getPricePerInvocation();
			case CloudiatorPackage.NODE__MEMORY_PRICE:
				return getMemoryPrice();
			case CloudiatorPackage.NODE__TYPE:
				return getType();
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
			case CloudiatorPackage.NODE__CLOUD:
				setCloud((Cloud)newValue);
				return;
			case CloudiatorPackage.NODE__IMAGE:
				setImage((Image)newValue);
				return;
			case CloudiatorPackage.NODE__HARDWARE:
				setHardware((Hardware)newValue);
				return;
			case CloudiatorPackage.NODE__LOCATION:
				setLocation((Location)newValue);
				return;
			case CloudiatorPackage.NODE__PRICE:
				setPrice((Double)newValue);
				return;
			case CloudiatorPackage.NODE__ENVIRONMENT:
				setEnvironment((Environment)newValue);
				return;
			case CloudiatorPackage.NODE__PRICE_PER_INVOCATION:
				setPricePerInvocation((Double)newValue);
				return;
			case CloudiatorPackage.NODE__MEMORY_PRICE:
				setMemoryPrice((Double)newValue);
				return;
			case CloudiatorPackage.NODE__TYPE:
				setType((NodeType)newValue);
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
			case CloudiatorPackage.NODE__CLOUD:
				setCloud((Cloud)null);
				return;
			case CloudiatorPackage.NODE__IMAGE:
				setImage((Image)null);
				return;
			case CloudiatorPackage.NODE__HARDWARE:
				setHardware((Hardware)null);
				return;
			case CloudiatorPackage.NODE__LOCATION:
				setLocation((Location)null);
				return;
			case CloudiatorPackage.NODE__PRICE:
				setPrice(PRICE_EDEFAULT);
				return;
			case CloudiatorPackage.NODE__ENVIRONMENT:
				setEnvironment((Environment)null);
				return;
			case CloudiatorPackage.NODE__PRICE_PER_INVOCATION:
				setPricePerInvocation(PRICE_PER_INVOCATION_EDEFAULT);
				return;
			case CloudiatorPackage.NODE__MEMORY_PRICE:
				setMemoryPrice(MEMORY_PRICE_EDEFAULT);
				return;
			case CloudiatorPackage.NODE__TYPE:
				setType(TYPE_EDEFAULT);
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
			case CloudiatorPackage.NODE__CLOUD:
				return cloud != null;
			case CloudiatorPackage.NODE__IMAGE:
				return image != null;
			case CloudiatorPackage.NODE__HARDWARE:
				return hardware != null;
			case CloudiatorPackage.NODE__LOCATION:
				return location != null;
			case CloudiatorPackage.NODE__PRICE:
				return PRICE_EDEFAULT == null ? price != null : !PRICE_EDEFAULT.equals(price);
			case CloudiatorPackage.NODE__ENVIRONMENT:
				return environment != null;
			case CloudiatorPackage.NODE__PRICE_PER_INVOCATION:
				return PRICE_PER_INVOCATION_EDEFAULT == null ? pricePerInvocation != null : !PRICE_PER_INVOCATION_EDEFAULT.equals(pricePerInvocation);
			case CloudiatorPackage.NODE__MEMORY_PRICE:
				return MEMORY_PRICE_EDEFAULT == null ? memoryPrice != null : !MEMORY_PRICE_EDEFAULT.equals(memoryPrice);
			case CloudiatorPackage.NODE__TYPE:
				return type != TYPE_EDEFAULT;
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
		result.append(" (price: ");
		result.append(price);
		result.append(", pricePerInvocation: ");
		result.append(pricePerInvocation);
		result.append(", memoryPrice: ");
		result.append(memoryPrice);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //NodeImpl
