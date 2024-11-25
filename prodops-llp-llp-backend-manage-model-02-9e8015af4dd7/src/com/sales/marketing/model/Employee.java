package com.sales.marketing.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * The persistent class for the "employee" database table.
 * 
 */
@Entity
@Table(name = "EMPLOYEE")
@NamedQuery(name = "Employee.findAll", query = "SELECT a FROM Employee a")
public class Employee extends AuditModel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "EMPLOYEE_ID_SEQ_GENERATOR", sequenceName = "EMPLOYEE_ID_SEQ", initialValue = 1, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EMPLOYEE_ID_SEQ_GENERATOR")
	@Column(name = "EMPLOYEE_ID", unique = true, nullable = false)
	private long employeeId;

	@Column(name="USER_PREFIX_C")
	private String userPrefixC;

	@Column(name="USER_ROLE_C")
	private String userRoleC;

	@Column(name = "FIRST_NAME", nullable = false, length = 40)
	private String firstName;

	@Column(name = "MIDDLE_NAME", length = 40)
	private String middleName;

	@Column(name = "LAST_NAME", nullable = false, length = 40)
	private String lastName;

	@ManyToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "ADDRESS_ID", nullable = false)
	private Address address;

	@ManyToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "DIGITAL_CONTACT_ID", nullable = false)
	private DigitalContactInfo digitalContactInfo;

	@ManyToOne
	@JoinColumn(name = "USER_ROLE_C", insertable = false, updatable = false)
	private DUserRole DUserRole;

	@ManyToOne
	@JoinColumn(name = "USER_PREFIX_C", insertable = false, updatable = false)
	private DUserPrefix DUserPrefix;
	
	@OneToMany(mappedBy = "employee",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JsonManagedReference
	private Set<EmpBusinessCoverageArea> empBusinessCoverageAreas= new HashSet<EmpBusinessCoverageArea>();

	@OneToMany(mappedBy = "employee",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<EmployeeAssignedGoal> employeeAssignedGoals= new HashSet<EmployeeAssignedGoal>();
		
	@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<UserRoles> userRoles = new ArrayList<>();

	private String apiStatusMessage;
	
	public Employee() {
	}

	public Long getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return this.middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public DigitalContactInfo getDigitalContactInfo() {
		return digitalContactInfo;
	}

	public void setDigitalContactInfo(DigitalContactInfo digitalContactInfo) {
		this.digitalContactInfo = digitalContactInfo;
	}

	public DUserRole getDUserRole() {
		return DUserRole;
	}

	public void setDUserRole(DUserRole dUserRole) {
		DUserRole = dUserRole;
	}

	public DUserPrefix getDUserPrefix() {
		return DUserPrefix;
	}

	public void setDUserPrefix(DUserPrefix dUserPrefix) {
		DUserPrefix = dUserPrefix;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public String getUserPrefixC() {
		return this.userPrefixC;
	}

	public void setUserPrefixC(String userPrefixC) {
		this.userPrefixC = userPrefixC;
	}

	public String getUserRoleC() {
		return this.userRoleC;
	}

	public void setUserRoleC(String userRoleC) {
		this.userRoleC = userRoleC;
	}

	public Set<EmpBusinessCoverageArea> getEmpBusinessCoverageAreas() {
		return empBusinessCoverageAreas;
	}

	public void setEmpBusinessCoverageAreas(Set<EmpBusinessCoverageArea> empBusinessCoverageAreas) {
		this.empBusinessCoverageAreas = empBusinessCoverageAreas;
	}
	  
	 
	public Set<EmployeeAssignedGoal> getEmployeeAssignedGoals() {
		return employeeAssignedGoals;
	}

	public void setEmployeeAssignedGoals(Set<EmployeeAssignedGoal> employeeAssignedGoals) {
		this.employeeAssignedGoals = employeeAssignedGoals;
	}
	
	public List<UserRoles> getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(List<UserRoles> userRoles) {
		this.userRoles = userRoles;
	}

	public String getApiStatusMessage() {
		return apiStatusMessage;
	}

	public void setApiStatusMessage(String apiStatusMessage) {
		this.apiStatusMessage = apiStatusMessage;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", userPrefixC=" + userPrefixC + ", userRoleC=" + userRoleC
				+ ", firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + ", address="
				+ address + ", digitalContactInfo=" + digitalContactInfo + ", DUserRole=" + DUserRole + ", DUserPrefix="
				+ DUserPrefix + "]";
	}
	
}