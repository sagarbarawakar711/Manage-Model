package com.sales.marketing.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="v_task_list")
@NamedQuery(name="VTaskList.findAll", query="SELECT v FROM VTaskList v")
public class VTaskList {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="agent_task_id", unique = true, nullable = false)
	private int agentTaskId;

	@Column(name="activity_task_d")
	private String activityTaskD;

	@Column(name="activity_type")
	private String activityType;

	@Column(name="agent_task_notes")
	private String agentTaskNotes;

	@Column(name="business_full_name")
	private String businessFullName;

	@Column(name="business_title")
	private String businessTitle;

	@Column(name="contact_number")
	private String contactNumber;

	@Column(name = "dealer_id")
	private int dealerId;

	@Column(name="dealer_name")
	private String dealerName;

	@Column(name="dealer_support")
	private String dealerSupport;

	@Column(name="employee_id")
	private int employeeId;

	
	@JsonFormat(shape=JsonFormat.Shape.STRING)
	@Column(name="end_of_week")
	private Timestamp endOfWeek;

	@Column(name="event_category")
	private String eventCategory;

	@Column(name="event_type")
	private String eventType;

	@Column(name="short_notes", nullable=false)
	private String shortNotes;

	
	@JsonFormat(shape=JsonFormat.Shape.STRING)
	@Column(name="start_of_week")
	private Timestamp startOfWeek;

	@Column(name="task_completion_flag")
	private Character taskCompletionFlag;

	@Column(name="tracker_paper_work")
	private String trackerPaperWork;

	@Column(name="u_capture_all_contact_flg")
	private Character uCaptureAllContactFlg;

	@Column(name="u_capture_all_contacts_flg")
	private Character uCaptureAllContactsFlg;

	@Column(name="u_corporate_owner_flg")
	private Character uCorporateOwnerFlg;

	@Column(name="u_corporate_owner_name")
	private String uCorporateOwnerName;

	@Column(name="u_credit_relationship_details")
	private String uCreditRelationshipDetails;

	@Column(name="u_credit_relationship_flg")
	private Character uCreditRelationshipFlg;

	@Column(name="u_credit_relationship_response")
	private String uCreditRelationshipResponse;

	@Column(name="u_declines_cnt")
	private Integer uDeclinesCnt;

	@Column(name="u_declines_flg")
	private Character uDeclinesFlg;

	@Column(name="u_document_fill_status")
	private String uDocumentFillStatus;

	@Column(name="u_document_flg")
	private Character uDocumentFlg;

	@Column(name="u_identity_contact")
	private String uIdentityContact;

	@Column(name="u_inventory_details")
	private String uInventoryDetails;

	@Column(name="u_inventory_flg")
	private Character uInventoryFlg;

	@Column(name="u_spend_time_details")
	private String uSpendTimeDetails;

	@Column(name="u_spend_time_flg")
	private Character uSpendTimeFlg;

	@Column(name="u_spend_time_response")
	private String uSpendTimeResponse;

	@Column(name="u_vaig_contact")
	private String uVaigContact;

	@Column(name="u_vaig_flg")
	private Character uVaigFlg;
	
	@Column(name="activity_task_x")
	private String activityTaskX;
	
	@Column(name = "FIRST_NAME", nullable = false, length = 40)
	private String firstName;

	@Column(name = "MIDDLE_NAME", length = 40)
	private String middleName;

	@Column(name = "LAST_NAME", nullable = false, length = 40)
	private String lastName;
	
	@Column(name="last_updated_d")
	private Timestamp lastUpdatedD;

	public Timestamp getLastUpdatedD() {
		return lastUpdatedD;
	}

	public void setLastUpdatedD(Timestamp lastUpdatedD) {
		this.lastUpdatedD = lastUpdatedD;
	}
	public String getActivityTaskX() {
		return activityTaskX;
	}

	public void setActivityTaskX(String activityTaskX) {
		this.activityTaskX = activityTaskX;
	}

	@ManyToOne
	@JoinColumn(name="EMPLOYEE_ID", nullable=false, insertable=false, updatable=false)
	private Employee employee;

	public VTaskList() {
	}

	public int getAgentTaskId() {
		return this.agentTaskId;
	}

	public Character getuCaptureAllContactFlg() {
		return uCaptureAllContactFlg;
	}

	public void setuCaptureAllContactFlg(Character uCaptureAllContactFlg) {
		this.uCaptureAllContactFlg = uCaptureAllContactFlg;
	}

	public Character getuCaptureAllContactsFlg() {
		return uCaptureAllContactsFlg;
	}

	public void setuCaptureAllContactsFlg(Character uCaptureAllContactsFlg) {
		this.uCaptureAllContactsFlg = uCaptureAllContactsFlg;
	}

	public Character getuCorporateOwnerFlg() {
		return uCorporateOwnerFlg;
	}

	public void setuCorporateOwnerFlg(Character uCorporateOwnerFlg) {
		this.uCorporateOwnerFlg = uCorporateOwnerFlg;
	}

	public String getuCorporateOwnerName() {
		return uCorporateOwnerName;
	}

	public void setuCorporateOwnerName(String uCorporateOwnerName) {
		this.uCorporateOwnerName = uCorporateOwnerName;
	}

	public String getuCreditRelationshipDetails() {
		return uCreditRelationshipDetails;
	}

	public void setuCreditRelationshipDetails(String uCreditRelationshipDetails) {
		this.uCreditRelationshipDetails = uCreditRelationshipDetails;
	}

	public Character getuCreditRelationshipFlg() {
		return uCreditRelationshipFlg;
	}

	public void setuCreditRelationshipFlg(Character uCreditRelationshipFlg) {
		this.uCreditRelationshipFlg = uCreditRelationshipFlg;
	}

	public String getuCreditRelationshipResponse() {
		return uCreditRelationshipResponse;
	}

	public void setuCreditRelationshipResponse(String uCreditRelationshipResponse) {
		this.uCreditRelationshipResponse = uCreditRelationshipResponse;
	}

	public Integer getuDeclinesCnt() {
		return uDeclinesCnt;
	}

	public void setuDeclinesCnt(Integer uDeclinesCnt) {
		this.uDeclinesCnt = uDeclinesCnt;
	}

	public Character getuDeclinesFlg() {
		return uDeclinesFlg;
	}

	public void setuDeclinesFlg(Character uDeclinesFlg) {
		this.uDeclinesFlg = uDeclinesFlg;
	}

	public String getuDocumentFillStatus() {
		return uDocumentFillStatus;
	}

	public void setuDocumentFillStatus(String uDocumentFillStatus) {
		this.uDocumentFillStatus = uDocumentFillStatus;
	}

	public Character getuDocumentFlg() {
		return uDocumentFlg;
	}

	public void setuDocumentFlg(Character uDocumentFlg) {
		this.uDocumentFlg = uDocumentFlg;
	}

	public String getuIdentityContact() {
		return uIdentityContact;
	}

	public void setuIdentityContact(String uIdentityContact) {
		this.uIdentityContact = uIdentityContact;
	}

	public String getuInventoryDetails() {
		return uInventoryDetails;
	}

	public void setuInventoryDetails(String uInventoryDetails) {
		this.uInventoryDetails = uInventoryDetails;
	}

	public Character getuInventoryFlg() {
		return uInventoryFlg;
	}

	public void setuInventoryFlg(Character uInventoryFlg) {
		this.uInventoryFlg = uInventoryFlg;
	}

	public String getuSpendTimeDetails() {
		return uSpendTimeDetails;
	}

	public void setuSpendTimeDetails(String uSpendTimeDetails) {
		this.uSpendTimeDetails = uSpendTimeDetails;
	}

	public Character getuSpendTimeFlg() {
		return uSpendTimeFlg;
	}

	public void setuSpendTimeFlg(Character uSpendTimeFlg) {
		this.uSpendTimeFlg = uSpendTimeFlg;
	}

	public String getuSpendTimeResponse() {
		return uSpendTimeResponse;
	}

	public void setuSpendTimeResponse(String uSpendTimeResponse) {
		this.uSpendTimeResponse = uSpendTimeResponse;
	}

	public String getuVaigContact() {
		return uVaigContact;
	}

	public void setuVaigContact(String uVaigContact) {
		this.uVaigContact = uVaigContact;
	}

	public Character getuVaigFlg() {
		return uVaigFlg;
	}

	public void setuVaigFlg(Character uVaigFlg) {
		this.uVaigFlg = uVaigFlg;
	}





	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void setAgentTaskId(int agentTaskId) {
		this.agentTaskId = agentTaskId;
	}

	public String getActivityTaskD() {
		return this.activityTaskD;
	}

	public void setActivityTaskD(String activityTaskD) {
		this.activityTaskD = activityTaskD;
	}

	public String getActivityType() {
		return this.activityType;
	}

	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	public String getAgentTaskNotes() {
		return this.agentTaskNotes;
	}

	public void setAgentTaskNotes(String agentTaskNotes) {
		this.agentTaskNotes = agentTaskNotes;
	}

	public String getBusinessFullName() {
		return this.businessFullName;
	}

	public void setBusinessFullName(String businessFullName) {
		this.businessFullName = businessFullName;
	}

	public String getBusinessTitle() {
		return this.businessTitle;
	}

	public void setBusinessTitle(String businessTitle) {
		this.businessTitle = businessTitle;
	}

	public String getContactNumber() {
		return this.contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public int getDealerId() {
		return this.dealerId;
	}

	public void setDealerId(int dealerId) {
		this.dealerId = dealerId;
	}

	public String getDealerName() {
		return this.dealerName;
	}

	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}

	public String getDealerSupport() {
		return this.dealerSupport;
	}

	public void setDealerSupport(String dealerSupport) {
		this.dealerSupport = dealerSupport;
	}

	public int getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public Timestamp getEndOfWeek() {
		return this.endOfWeek;
	}

	public void setEndOfWeek(Timestamp endOfWeek) {
		this.endOfWeek = endOfWeek;
	}

	public String getEventCategory() {
		return this.eventCategory;
	}

	public void setEventCategory(String eventCategory) {
		this.eventCategory = eventCategory;
	}

	public String getEventType() {
		return this.eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getShortNotes() {
		return this.shortNotes;
	}

	public void setShortNotes(String shortNotes) {
		this.shortNotes = shortNotes;
	}

	public Timestamp getStartOfWeek() {
		return this.startOfWeek;
	}

	public void setStartOfWeek(Timestamp startOfWeek) {
		this.startOfWeek = startOfWeek;
	}

	public Character getTaskCompletionFlag() {
		return this.taskCompletionFlag;
	}

	public void setTaskCompletionFlag(Character taskCompletionFlag) {
		this.taskCompletionFlag = taskCompletionFlag;
	}

	public String getTrackerPaperWork() {
		return this.trackerPaperWork;
	}

	public void setTrackerPaperWork(String trackerPaperWork) {
		this.trackerPaperWork = trackerPaperWork;
	}

	public Character getUCaptureAllContactFlg() {
		return this.uCaptureAllContactFlg;
	}

	public void setUCaptureAllContactFlg(Character uCaptureAllContactFlg) {
		this.uCaptureAllContactFlg = uCaptureAllContactFlg;
	}

	public Character getUCaptureAllContactsFlg() {
		return this.uCaptureAllContactsFlg;
	}

	public void setUCaptureAllContactsFlg(Character uCaptureAllContactsFlg) {
		this.uCaptureAllContactsFlg = uCaptureAllContactsFlg;
	}

	public Character getUCorporateOwnerFlg() {
		return this.uCorporateOwnerFlg;
	}

	public void setUCorporateOwnerFlg(Character uCorporateOwnerFlg) {
		this.uCorporateOwnerFlg = uCorporateOwnerFlg;
	}

	public String getUCorporateOwnerName() {
		return this.uCorporateOwnerName;
	}

	public void setUCorporateOwnerName(String uCorporateOwnerName) {
		this.uCorporateOwnerName = uCorporateOwnerName;
	}

	public String getUCreditRelationshipDetails() {
		return this.uCreditRelationshipDetails;
	}

	public void setUCreditRelationshipDetails(String uCreditRelationshipDetails) {
		this.uCreditRelationshipDetails = uCreditRelationshipDetails;
	}

	public Character getUCreditRelationshipFlg() {
		return this.uCreditRelationshipFlg;
	}

	public void setUCreditRelationshipFlg(Character uCreditRelationshipFlg) {
		this.uCreditRelationshipFlg = uCreditRelationshipFlg;
	}

	public String getUCreditRelationshipResponse() {
		return this.uCreditRelationshipResponse;
	}

	public void setUCreditRelationshipResponse(String uCreditRelationshipResponse) {
		this.uCreditRelationshipResponse = uCreditRelationshipResponse;
	}

	public Integer getUDeclinesCnt() {
		return this.uDeclinesCnt;
	}

	public void setUDeclinesCnt(Integer uDeclinesCnt) {
		this.uDeclinesCnt = uDeclinesCnt;
	}

	public Character getUDeclinesFlg() {
		return this.uDeclinesFlg;
	}

	public void setUDeclinesFlg(Character uDeclinesFlg) {
		this.uDeclinesFlg = uDeclinesFlg;
	}

	public String getUDocumentFillStatus() {
		return this.uDocumentFillStatus;
	}

	public void setUDocumentFillStatus(String uDocumentFillStatus) {
		this.uDocumentFillStatus = uDocumentFillStatus;
	}

	public Character getUDocumentFlg() {
		return this.uDocumentFlg;
	}

	public void setUDocumentFlg(Character uDocumentFlg) {
		this.uDocumentFlg = uDocumentFlg;
	}

	public String getUIdentityContact() {
		return this.uIdentityContact;
	}

	public void setUIdentityContact(String uIdentityContact) {
		this.uIdentityContact = uIdentityContact;
	}

	public String getUInventoryDetails() {
		return this.uInventoryDetails;
	}

	public void setUInventoryDetails(String uInventoryDetails) {
		this.uInventoryDetails = uInventoryDetails;
	}

	public Character getUInventoryFlg() {
		return this.uInventoryFlg;
	}

	public void setUInventoryFlg(Character uInventoryFlg) {
		this.uInventoryFlg = uInventoryFlg;
	}

	public String getUSpendTimeDetails() {
		return this.uSpendTimeDetails;
	}

	public void setUSpendTimeDetails(String uSpendTimeDetails) {
		this.uSpendTimeDetails = uSpendTimeDetails;
	}

	public Character getUSpendTimeFlg() {
		return this.uSpendTimeFlg;
	}

	public void setUSpendTimeFlg(Character uSpendTimeFlg) {
		this.uSpendTimeFlg = uSpendTimeFlg;
	}

	public String getUSpendTimeResponse() {
		return this.uSpendTimeResponse;
	}

	public void setUSpendTimeResponse(String uSpendTimeResponse) {
		this.uSpendTimeResponse = uSpendTimeResponse;
	}

	public String getUVaigContact() {
		return this.uVaigContact;
	}

	public void setUVaigContact(String uVaigContact) {
		this.uVaigContact = uVaigContact;
	}

	public Character getUVaigFlg() {
		return this.uVaigFlg;
	}

	public void setUVaigFlg(Character uVaigFlg) {
		this.uVaigFlg = uVaigFlg;
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
	



}
