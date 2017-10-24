/**
 */
package cloudiator.impl;

import cloudiator.Cloud;
import cloudiator.CloudiatorModel;
import cloudiator.CloudiatorPackage;
import cloudiator.Component;
import cloudiator.Node;

import cloudiator.OperatingSystem;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cloudiator.impl.CloudiatorModelImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link cloudiator.impl.CloudiatorModelImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link cloudiator.impl.CloudiatorModelImpl#getClouds <em>Clouds</em>}</li>
 *   <li>{@link cloudiator.impl.CloudiatorModelImpl#getOperatingsystem <em>Operatingsystem</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CloudiatorModelImpl extends MinimalEObjectImpl.Container implements CloudiatorModel {
	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> components;

	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> nodes;

	/**
	 * The cached value of the '{@link #getClouds() <em>Clouds</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClouds()
	 * @generated
	 * @ordered
	 */
	protected EList<Cloud> clouds;

	/**
	 * The cached value of the '{@link #getOperatingsystem() <em>Operatingsystem</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatingsystem()
	 * @generated
	 * @ordered
	 */
	protected EList<OperatingSystem> operatingsystem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CloudiatorModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CloudiatorPackage.Literals.CLOUDIATOR_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<Component>(Component.class, this, CloudiatorPackage.CLOUDIATOR_MODEL__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentEList<Node>(Node.class, this, CloudiatorPackage.CLOUDIATOR_MODEL__NODES);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cloud> getClouds() {
		if (clouds == null) {
			clouds = new EObjectContainmentEList<Cloud>(Cloud.class, this, CloudiatorPackage.CLOUDIATOR_MODEL__CLOUDS);
		}
		return clouds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperatingSystem> getOperatingsystem() {
		if (operatingsystem == null) {
			operatingsystem = new EObjectContainmentEList<OperatingSystem>(OperatingSystem.class, this, CloudiatorPackage.CLOUDIATOR_MODEL__OPERATINGSYSTEM);
		}
		return operatingsystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CloudiatorPackage.CLOUDIATOR_MODEL__COMPONENTS:
				return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
			case CloudiatorPackage.CLOUDIATOR_MODEL__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
			case CloudiatorPackage.CLOUDIATOR_MODEL__CLOUDS:
				return ((InternalEList<?>)getClouds()).basicRemove(otherEnd, msgs);
			case CloudiatorPackage.CLOUDIATOR_MODEL__OPERATINGSYSTEM:
				return ((InternalEList<?>)getOperatingsystem()).basicRemove(otherEnd, msgs);
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
			case CloudiatorPackage.CLOUDIATOR_MODEL__COMPONENTS:
				return getComponents();
			case CloudiatorPackage.CLOUDIATOR_MODEL__NODES:
				return getNodes();
			case CloudiatorPackage.CLOUDIATOR_MODEL__CLOUDS:
				return getClouds();
			case CloudiatorPackage.CLOUDIATOR_MODEL__OPERATINGSYSTEM:
				return getOperatingsystem();
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
			case CloudiatorPackage.CLOUDIATOR_MODEL__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection<? extends Component>)newValue);
				return;
			case CloudiatorPackage.CLOUDIATOR_MODEL__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends Node>)newValue);
				return;
			case CloudiatorPackage.CLOUDIATOR_MODEL__CLOUDS:
				getClouds().clear();
				getClouds().addAll((Collection<? extends Cloud>)newValue);
				return;
			case CloudiatorPackage.CLOUDIATOR_MODEL__OPERATINGSYSTEM:
				getOperatingsystem().clear();
				getOperatingsystem().addAll((Collection<? extends OperatingSystem>)newValue);
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
			case CloudiatorPackage.CLOUDIATOR_MODEL__COMPONENTS:
				getComponents().clear();
				return;
			case CloudiatorPackage.CLOUDIATOR_MODEL__NODES:
				getNodes().clear();
				return;
			case CloudiatorPackage.CLOUDIATOR_MODEL__CLOUDS:
				getClouds().clear();
				return;
			case CloudiatorPackage.CLOUDIATOR_MODEL__OPERATINGSYSTEM:
				getOperatingsystem().clear();
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
			case CloudiatorPackage.CLOUDIATOR_MODEL__COMPONENTS:
				return components != null && !components.isEmpty();
			case CloudiatorPackage.CLOUDIATOR_MODEL__NODES:
				return nodes != null && !nodes.isEmpty();
			case CloudiatorPackage.CLOUDIATOR_MODEL__CLOUDS:
				return clouds != null && !clouds.isEmpty();
			case CloudiatorPackage.CLOUDIATOR_MODEL__OPERATINGSYSTEM:
				return operatingsystem != null && !operatingsystem.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CloudiatorModelImpl
