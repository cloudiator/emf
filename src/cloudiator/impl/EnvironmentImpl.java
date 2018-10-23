/**
 */
package cloudiator.impl;

import cloudiator.CloudiatorPackage;
import cloudiator.Environment;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Environment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cloudiator.impl.EnvironmentImpl#getRuntime <em>Runtime</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnvironmentImpl extends MinimalEObjectImpl.Container implements Environment {
	/**
	 * The default value of the '{@link #getRuntime() <em>Runtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntime()
	 * @generated
	 * @ordered
	 */
	protected static final cloudiator.Runtime RUNTIME_EDEFAULT = cloudiator.Runtime.NODEJS;

	/**
	 * The cached value of the '{@link #getRuntime() <em>Runtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntime()
	 * @generated
	 * @ordered
	 */
	protected cloudiator.Runtime runtime = RUNTIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnvironmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CloudiatorPackage.Literals.ENVIRONMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public cloudiator.Runtime getRuntime() {
		return runtime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuntime(cloudiator.Runtime newRuntime) {
		cloudiator.Runtime oldRuntime = runtime;
		runtime = newRuntime == null ? RUNTIME_EDEFAULT : newRuntime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudiatorPackage.ENVIRONMENT__RUNTIME, oldRuntime, runtime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CloudiatorPackage.ENVIRONMENT__RUNTIME:
				return getRuntime();
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
			case CloudiatorPackage.ENVIRONMENT__RUNTIME:
				setRuntime((cloudiator.Runtime)newValue);
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
			case CloudiatorPackage.ENVIRONMENT__RUNTIME:
				setRuntime(RUNTIME_EDEFAULT);
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
			case CloudiatorPackage.ENVIRONMENT__RUNTIME:
				return runtime != RUNTIME_EDEFAULT;
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
		result.append(" (runtime: ");
		result.append(runtime);
		result.append(')');
		return result.toString();
	}

} //EnvironmentImpl
