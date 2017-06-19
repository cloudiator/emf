/**
 */
package cloudiator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>OS Family</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see cloudiator.CloudiatorPackage#getOSFamily()
 * @model
 * @generated
 */
public enum OSFamily implements Enumerator {
	/**
	 * The '<em><b>UNKNOWN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(0, "UNKNOWN", "UNKNOWN"),

	/**
	 * The '<em><b>AIX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AIX_VALUE
	 * @generated
	 * @ordered
	 */
	AIX(1, "AIX", "AIX"),

	/**
	 * The '<em><b>ARCH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARCH_VALUE
	 * @generated
	 * @ordered
	 */
	ARCH(2, "ARCH", "ARCH"),

	/**
	 * The '<em><b>CENTOS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CENTOS_VALUE
	 * @generated
	 * @ordered
	 */
	CENTOS(3, "CENTOS", "CENTOS"),

	/**
	 * The '<em><b>DARWIN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DARWIN_VALUE
	 * @generated
	 * @ordered
	 */
	DARWIN(4, "DARWIN", "DARWIN"),

	/**
	 * The '<em><b>DEBIAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEBIAN_VALUE
	 * @generated
	 * @ordered
	 */
	DEBIAN(5, "DEBIAN", "DEBIAN"),

	/**
	 * The '<em><b>ESX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ESX_VALUE
	 * @generated
	 * @ordered
	 */
	ESX(6, "ESX", "ESX"),

	/**
	 * The '<em><b>FEDORA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FEDORA_VALUE
	 * @generated
	 * @ordered
	 */
	FEDORA(7, "FEDORA", "FEDORA"),

	/**
	 * The '<em><b>FREEBSD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FREEBSD_VALUE
	 * @generated
	 * @ordered
	 */
	FREEBSD(8, "FREEBSD", "FREEBSD"),

	/**
	 * The '<em><b>GENTOO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENTOO_VALUE
	 * @generated
	 * @ordered
	 */
	GENTOO(9, "GENTOO", "GENTOO"),

	/**
	 * The '<em><b>HPUX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPUX_VALUE
	 * @generated
	 * @ordered
	 */
	HPUX(10, "HPUX", "HPUX"),

	/**
	 * The '<em><b>COREOS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COREOS_VALUE
	 * @generated
	 * @ordered
	 */
	COREOS(11, "COREOS", "COREOS"),

	/**
	 * The '<em><b>AMZN LINUX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AMZN_LINUX_VALUE
	 * @generated
	 * @ordered
	 */
	AMZN_LINUX(12, "AMZN_LINUX", "AMZN_LINUX"),

	/**
	 * The '<em><b>MANDRIVA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANDRIVA_VALUE
	 * @generated
	 * @ordered
	 */
	MANDRIVA(13, "MANDRIVA", "MANDRIVA"),

	/**
	 * The '<em><b>NETBSD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NETBSD_VALUE
	 * @generated
	 * @ordered
	 */
	NETBSD(14, "NETBSD", "NETBSD"),

	/**
	 * The '<em><b>OEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OEL_VALUE
	 * @generated
	 * @ordered
	 */
	OEL(15, "OEL", "OEL"),

	/**
	 * The '<em><b>OPENBSD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPENBSD_VALUE
	 * @generated
	 * @ordered
	 */
	OPENBSD(16, "OPENBSD", "OPENBSD"),

	/**
	 * The '<em><b>RHEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RHEL_VALUE
	 * @generated
	 * @ordered
	 */
	RHEL(17, "RHEL", "RHEL"),

	/**
	 * The '<em><b>SCIENTIFIC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCIENTIFIC_VALUE
	 * @generated
	 * @ordered
	 */
	SCIENTIFIC(18, "SCIENTIFIC", "SCIENTIFIC"),

	/**
	 * The '<em><b>CEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CEL_VALUE
	 * @generated
	 * @ordered
	 */
	CEL(19, "CEL", "CEL"),

	/**
	 * The '<em><b>SLACKWARE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SLACKWARE_VALUE
	 * @generated
	 * @ordered
	 */
	SLACKWARE(20, "SLACKWARE", "SLACKWARE"),

	/**
	 * The '<em><b>SOLARIS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOLARIS_VALUE
	 * @generated
	 * @ordered
	 */
	SOLARIS(21, "SOLARIS", "SOLARIS"),

	/**
	 * The '<em><b>SUSE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUSE_VALUE
	 * @generated
	 * @ordered
	 */
	SUSE(22, "SUSE", "SUSE"),

	/**
	 * The '<em><b>TURBOLINUX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TURBOLINUX_VALUE
	 * @generated
	 * @ordered
	 */
	TURBOLINUX(23, "TURBOLINUX", "TURBOLINUX"),

	/**
	 * The '<em><b>CLOUD LINUX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOUD_LINUX_VALUE
	 * @generated
	 * @ordered
	 */
	CLOUD_LINUX(24, "CLOUD_LINUX", "CLOUD_LINUX"),

	/**
	 * The '<em><b>UBUNTU</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UBUNTU_VALUE
	 * @generated
	 * @ordered
	 */
	UBUNTU(25, "UBUNTU", "UBUNTU");

	/**
	 * The '<em><b>UNKNOWN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNKNOWN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = 0;

	/**
	 * The '<em><b>AIX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AIX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AIX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AIX_VALUE = 1;

	/**
	 * The '<em><b>ARCH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ARCH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ARCH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ARCH_VALUE = 2;

	/**
	 * The '<em><b>CENTOS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CENTOS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CENTOS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CENTOS_VALUE = 3;

	/**
	 * The '<em><b>DARWIN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DARWIN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DARWIN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DARWIN_VALUE = 4;

	/**
	 * The '<em><b>DEBIAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DEBIAN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEBIAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DEBIAN_VALUE = 5;

	/**
	 * The '<em><b>ESX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ESX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ESX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ESX_VALUE = 6;

	/**
	 * The '<em><b>FEDORA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FEDORA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FEDORA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FEDORA_VALUE = 7;

	/**
	 * The '<em><b>FREEBSD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FREEBSD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FREEBSD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FREEBSD_VALUE = 8;

	/**
	 * The '<em><b>GENTOO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GENTOO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GENTOO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GENTOO_VALUE = 9;

	/**
	 * The '<em><b>HPUX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HPUX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HPUX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HPUX_VALUE = 10;

	/**
	 * The '<em><b>COREOS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COREOS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COREOS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COREOS_VALUE = 11;

	/**
	 * The '<em><b>AMZN LINUX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AMZN LINUX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AMZN_LINUX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AMZN_LINUX_VALUE = 12;

	/**
	 * The '<em><b>MANDRIVA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MANDRIVA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MANDRIVA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MANDRIVA_VALUE = 13;

	/**
	 * The '<em><b>NETBSD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NETBSD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NETBSD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NETBSD_VALUE = 14;

	/**
	 * The '<em><b>OEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OEL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OEL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OEL_VALUE = 15;

	/**
	 * The '<em><b>OPENBSD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OPENBSD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPENBSD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OPENBSD_VALUE = 16;

	/**
	 * The '<em><b>RHEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RHEL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RHEL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RHEL_VALUE = 17;

	/**
	 * The '<em><b>SCIENTIFIC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SCIENTIFIC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SCIENTIFIC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SCIENTIFIC_VALUE = 18;

	/**
	 * The '<em><b>CEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CEL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CEL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CEL_VALUE = 19;

	/**
	 * The '<em><b>SLACKWARE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SLACKWARE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SLACKWARE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SLACKWARE_VALUE = 20;

	/**
	 * The '<em><b>SOLARIS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SOLARIS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOLARIS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SOLARIS_VALUE = 21;

	/**
	 * The '<em><b>SUSE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SUSE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUSE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SUSE_VALUE = 22;

	/**
	 * The '<em><b>TURBOLINUX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TURBOLINUX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TURBOLINUX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TURBOLINUX_VALUE = 23;

	/**
	 * The '<em><b>CLOUD LINUX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CLOUD LINUX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLOUD_LINUX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CLOUD_LINUX_VALUE = 24;

	/**
	 * The '<em><b>UBUNTU</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UBUNTU</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UBUNTU
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UBUNTU_VALUE = 25;

	/**
	 * An array of all the '<em><b>OS Family</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OSFamily[] VALUES_ARRAY =
		new OSFamily[] {
			UNKNOWN,
			AIX,
			ARCH,
			CENTOS,
			DARWIN,
			DEBIAN,
			ESX,
			FEDORA,
			FREEBSD,
			GENTOO,
			HPUX,
			COREOS,
			AMZN_LINUX,
			MANDRIVA,
			NETBSD,
			OEL,
			OPENBSD,
			RHEL,
			SCIENTIFIC,
			CEL,
			SLACKWARE,
			SOLARIS,
			SUSE,
			TURBOLINUX,
			CLOUD_LINUX,
			UBUNTU,
		};

	/**
	 * A public read-only list of all the '<em><b>OS Family</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OSFamily> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>OS Family</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OSFamily get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OSFamily result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>OS Family</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OSFamily getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OSFamily result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>OS Family</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OSFamily get(int value) {
		switch (value) {
			case UNKNOWN_VALUE: return UNKNOWN;
			case AIX_VALUE: return AIX;
			case ARCH_VALUE: return ARCH;
			case CENTOS_VALUE: return CENTOS;
			case DARWIN_VALUE: return DARWIN;
			case DEBIAN_VALUE: return DEBIAN;
			case ESX_VALUE: return ESX;
			case FEDORA_VALUE: return FEDORA;
			case FREEBSD_VALUE: return FREEBSD;
			case GENTOO_VALUE: return GENTOO;
			case HPUX_VALUE: return HPUX;
			case COREOS_VALUE: return COREOS;
			case AMZN_LINUX_VALUE: return AMZN_LINUX;
			case MANDRIVA_VALUE: return MANDRIVA;
			case NETBSD_VALUE: return NETBSD;
			case OEL_VALUE: return OEL;
			case OPENBSD_VALUE: return OPENBSD;
			case RHEL_VALUE: return RHEL;
			case SCIENTIFIC_VALUE: return SCIENTIFIC;
			case CEL_VALUE: return CEL;
			case SLACKWARE_VALUE: return SLACKWARE;
			case SOLARIS_VALUE: return SOLARIS;
			case SUSE_VALUE: return SUSE;
			case TURBOLINUX_VALUE: return TURBOLINUX;
			case CLOUD_LINUX_VALUE: return CLOUD_LINUX;
			case UBUNTU_VALUE: return UBUNTU;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private OSFamily(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //OSFamily
