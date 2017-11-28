package com.ibm.cip.common.dao;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="OPPORTUNITIES_USERS")
public class OpportunitiesUsers {

	private int id;
	private String opportunityId;
	private String userCnum;
	private String userRole;
	private Timestamp dateEntered;
	private Timestamp dateModified;
	private int deleted;
	
	@Id
	@Column(name="ID", columnDefinition="char(36)")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name="OPPORTUNITY_ID", length=36)
	public String getOpportunityId() {
		return opportunityId;
	}
	public void setOpportunityId(String opportunityId) {
		this.opportunityId = opportunityId;
	}
	
	@Column(name="USER_CNUM", columnDefinition="String(36)")
	public String getUserCnum() {
		return userCnum;
	}
	public void setUserCnum(String userCnum) {
		this.userCnum = userCnum;
	}
	
	@Column(name="USER_ROLE", length=100)
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
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
	
	@Column(name="DELETED", columnDefinition="SMALLINT")
	public int getDeleted() {
		return deleted;
	}
	public void setDeleted(int deleted) {
		this.deleted = deleted;
	}

	
	
	
	//sample constructor
	public OpportunitiesUsers(String opportunityId, String userCnum, String userRole, Timestamp dateEntered, Timestamp dateModified
			//,int deleted
			) {
		// TODO Auto-generated constructor stub
		
		this.opportunityId = opportunityId;
		this.userCnum = userCnum;
		this.userRole = userRole;
		this.dateEntered=dateEntered;
		this.dateModified = dateModified;
		//this.deleted = deleted;
	}	
	
	
	
	
	
}

