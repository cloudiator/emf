/**
 */
package cloudiator.impl;

import cloudiator.CloudConfiguration;
import cloudiator.CloudiatorPackage;
import cloudiator.Property;

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
 * An implementation of the model object '<em><b>Cloud Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cloudiator.impl.CloudConfigurationImpl#getNodeGroup <em>Node Group</em>}</li>
 *   <li>{@link cloudiator.impl.CloudConfigurationImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CloudConfigurationImpl extends MinimalEObjectImpl.Container implements CloudConfiguration {
	/**
	 * The default value of the '{@link #getNodeGroup() <em>Node Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeGroup()
	 * @generated
	 * @ordered
	 */
	protected static final String NODE_GROUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNodeGroup() <em>Node Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeGroup()
	 * @generated
	 * @ordered
	 */
	protected String nodeGroup = NODE_GROUP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> properties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CloudConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CloudiatorPackage.Literals.CLOUD_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNodeGroup() {
		return nodeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeGroup(String newNodeGroup) {
		String oldNodeGroup = nodeGroup;
		nodeGroup = newNodeGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudiatorPackage.CLOUD_CONFIGURATION__NODE_GROUP, oldNodeGroup, nodeGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<Property>(Property.class, this, CloudiatorPackage.CLOUD_CONFIGURATION__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CloudiatorPackage.CLOUD_CONFIGURATION__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
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
			case CloudiatorPackage.CLOUD_CONFIGURATION__NODE_GROUP:
				return getNodeGroup();
			case CloudiatorPackage.CLOUD_CONFIGURATION__PROPERTIES:
				return getProperties();
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
			case CloudiatorPackage.CLOUD_CONFIGURATION__NODE_GROUP:
				setNodeGroup((String)newValue);
				return;
			case CloudiatorPackage.CLOUD_CONFIGURATION__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends Property>)newValue);
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
			case CloudiatorPackage.CLOUD_CONFIGURATION__NODE_GROUP:
				setNodeGroup(NODE_GROUP_EDEFAULT);
				return;
			case CloudiatorPackage.CLOUD_CONFIGURATION__PROPERTIES:
				getProperties().clear();
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
			case CloudiatorPackage.CLOUD_CONFIGURATION__NODE_GROUP:
				return NODE_GROUP_EDEFAULT == null ? nodeGroup != null : !NODE_GROUP_EDEFAULT.equals(nodeGroup);
			case CloudiatorPackage.CLOUD_CONFIGURATION__PROPERTIES:
				return properties != null && !properties.isEmpty();
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
		result.append(" (nodeGroup: ");
		result.append(nodeGroup);
		result.append(')');
		return result.toString();
	}

} //CloudConfigurationImpl
