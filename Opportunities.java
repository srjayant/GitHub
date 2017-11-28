package com.ibm.cip.common.dao;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="OPPORTUNITIES")
public class Opportunities {

	private String id;
	private String opportunityNumber;
	private String description;
	private String assignedUserCnum;
	private String leadSource;
	private String ibmReportingCodes;
	private Date dateClosed;
	private String primaryIdmId;
	private String accountId;
	private String createdByCnum;
	private String modifiedUserCnum;
	private Timestamp dateEntered;
	private Timestamp dateModified;
	private int deleted;
	private String spokeSource;
	private String cipMapId;

	
	@Id
	//@GeneratedValue(strategy=GenerationType.SEQUENCE)
	//@Column(name="ID" ,columnDefinition="char(36)")
	@Column(name="ID" ,length=36)
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	@Column(name="OPPORTUNITY_NUMBER",length=15)
	public String getOpportunityNumber() {
		return opportunityNumber;
	}
	public void setOpportunityNumber(String opportunityNumber) {
		this.opportunityNumber = opportunityNumber;
	}
	
	@Column(name="DESCRIPTION", length=1024)
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Column(name="ASSIGNED_USER_CNUM", columnDefinition="char(36)")	
	public String getAssignedUserCnum() {
		return assignedUserCnum;
	}
	public void setAssignedUserCnum(String assignedUserCnum) {
		this.assignedUserCnum = assignedUserCnum;
	}
	
	@Column(name="LEAD_SOURCE",length=100)
	public String getLeadSource() {
		return leadSource;
	}
	public void setLeadSource(String leadSource) {
		this.leadSource = leadSource;
	}

	@Column(name="IBM_REPORTING_CODES", length=4530)
	public String getIbmReportingCodes() {
		return ibmReportingCodes;
	}
	public void setIbmReportingCodes(String ibmReportingCodes) {
		this.ibmReportingCodes = ibmReportingCodes;
	}
	
	@Column(name="DATE_CLOSED")
	public Date getDateClosed() {
		return dateClosed;
	}
	public void setDateClosed(Date dateClosed) {
		this.dateClosed = dateClosed;
	}
	
	@Column(name="PRIMARY_IDM_ID", length=100)
	public String getPrimaryIdmId() {
		return primaryIdmId;
	}
	public void setPrimaryIdmId(String primaryIdmId) {
		this.primaryIdmId = primaryIdmId;
	}
	
	@Column(name="ACCOUNT_ID", columnDefinition="char(36)")
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	
	@Column(name="CREATED_BY_CNUM", columnDefinition="char(36)")
	public String getCreatedByCnum() {
		return createdByCnum;
	}
	public void setCreatedByCnum(String createdByCnum) {
		this.createdByCnum = createdByCnum;
	}
	
	@Column(name="MODIFIED_USER_CNUM", columnDefinition="char(36)")
	public String getModifiedUserCnum() {
		return modifiedUserCnum;
	}
	public void setModifiedUserCnum(String modifiedUserCnum) {
		this.modifiedUserCnum = modifiedUserCnum;
	}
	
	@Column(name="DATE_ENTERED")
	public Timestamp getDateEntered() {
		return dateEntered;
	}
	public void setDateEntered(Timestamp dateEntered) {
		this.dateEntered = dateEntered;
	}
	
	@Column(name="DATE_MODIFIED")
	public Timestamp getDateModified() {
		return dateModified;
	}
	public void setDateModified(Timestamp dateModified) {
		this.dateModified = dateModified;
	}
	
	@Column(name="DELETED",columnDefinition="SMALLINT")
	public int getDeleted() {
		return deleted;
	}
	public void setDeleted(int deleted) {
		this.deleted = deleted;
	}
	
	@Column(name="SPOKE_SOURCE", columnDefinition="char(10)")
	public String getSpokeSource() {
		return spokeSource;
	}
	public void setSpokeSource(String spokeSource) {
		this.spokeSource = spokeSource;
	}
	
	@Column(name="CIP_MAPID", columnDefinition="char(36)")
	public String getCipMapId() {
		return cipMapId;
	}
	public void setCipMapId(String cipMapId) {
		this.cipMapId = cipMapId;
	}
	
	
	public Opportunities(String opptyId,String acctId,String description) {
		// TODO Auto-generated constructor stub
		this.id=opptyId;
		this.accountId=acctId;
		this.description=description;
		
	}
	
	
	
	public Opportunities(String id, String opportunityNumber, String description, String assignedUserCnum,
			String leadSource, String ibmReportingCodes, Date dateClosed, String primaryIdmId, String accountId,
			String createdByCnum, String modifiedUserCnum, Timestamp dateEntered, Timestamp dateModified, int deleted,
			String spokeSource, String cipMapId) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.opportunityNumber = opportunityNumber;
		this.description = description;
		this.assignedUserCnum = assignedUserCnum;
		this.leadSource = leadSource;
		this.ibmReportingCodes = ibmReportingCodes;
		this.dateClosed = dateClosed;
		this.primaryIdmId = primaryIdmId;
		this.accountId = accountId;
		this.createdByCnum = createdByCnum;
		this.modifiedUserCnum = modifiedUserCnum;
		this.dateEntered = dateEntered;
		this.dateModified = dateModified;
		this.deleted = deleted;
		this.spokeSource = spokeSource;
		this.cipMapId = cipMapId;
	}
	public Opportunities(String opportunityNumber, String description, String assignedUserCnum, String leadSource,
			String ibmReportingCodes, Date dateClosed, String primaryIdmId, String accountId, String createdByCnum,
			String modifiedUserCnum, Timestamp dateEntered, Timestamp dateModified, int deleted, String spokeSource,
			String cipMapId) {
		// TODO Auto-generated constructor stub
		this.opportunityNumber = opportunityNumber;
		this.description = description;
		this.assignedUserCnum = assignedUserCnum;
		this.leadSource = leadSource;
		this.ibmReportingCodes = ibmReportingCodes;
		this.dateClosed = dateClosed;
		this.primaryIdmId = primaryIdmId;
		this.accountId = accountId;
		this.createdByCnum = createdByCnum;
		this.modifiedUserCnum = modifiedUserCnum;
		this.dateEntered = dateEntered;
		this.dateModified = dateModified;
		this.deleted = deleted;
		this.spokeSource = spokeSource;
		this.cipMapId = cipMapId;
	}
	
	
	public Opportunities() {
		// TODO Auto-generated constructor stub
		
	}
	
}
