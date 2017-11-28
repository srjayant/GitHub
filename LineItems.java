package com.ibm.cip.common.dao;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LINEITEMS")
public class LineItems {

	private String id;
	private String opportunityId;
	private String salesStage;
	private String assignedUserCnum;
	private String assignedBpId;
	private String level10;
	private String level15;
	private String level20;
	private String level30;
	private String level40;
	private String level17;
	private String roadMapStatus;
	private double revenueAmount;//decimal
	private String currency;
	private Date expectedCloseDate;
	private int duration;
	private String probability;
	private Date expirationDate;
	private Date renewDate;
	private String contractType;
	private String bookingType;
	private int expiringContractDuration;
	private String competitor;
	private String createdByCnum;
	private String modifiedUserCnum;
	private Timestamp dateEntered;
	private Timestamp dateModified;
	private int deleted;
	private String spokeSource;
	private String cipMapId;

	@Id
//	@GeneratedValue(strategy=GenerationType.SEQUENCE)
//	@Column(name="ID" ,columnDefinition="char(36)")
	@Column(name="ID" ,length=36)
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
//	@Column(name="OPPORTUNITY_ID" ,columnDefinition="char(36)")
	@Column(name="OPPORTUNITY_ID" ,length=36)
	public String getOpportunityId() {
		return opportunityId;
	}
	public void setOpportunityId(String opportunityId) {
		this.opportunityId = opportunityId;
	}
	
	@Column(name="SALES_STAGE", length=2)
	public String getSalesStage() {
		return salesStage;
	}
	public void setSalesStage(String salesStage) {
		this.salesStage = salesStage;
	}
	
	@Column(name="ASSIGNED_USER_CNUM" ,columnDefinition="String(36)")
	public String getAssignedUserCnum() {
		return assignedUserCnum;
	}
	public void setAssignedUserCnum(String assignedUserCnum) {
		this.assignedUserCnum = assignedUserCnum;
	}
	
	@Column(name="ASSIGNED_BP_ID", length=30)
	public String getAssignedBpId() {
		return assignedBpId;
	}
	public void setAssignedBpId(String assignedBpId) {
		this.assignedBpId = assignedBpId;
	}
	
	@Column(name="LEVEL10" ,columnDefinition="String(36)")
	public String getLevel10() {
		return level10;
	}
	public void setLevel10(String level10) {
		this.level10 = level10;
	}
	
	@Column(name="LEVEL15" ,columnDefinition="String(36)")
	public String getLevel15() {
		return level15;
	}
	public void setLevel15(String level15) {
		this.level15 = level15;
	}
	
	@Column(name="LEVEL20" ,columnDefinition="String(36)")
	public String getLevel20() {
		return level20;
	}
	public void setLevel20(String level20) {
		this.level20 = level20;
	}
	
	@Column(name="LEVEL30" ,columnDefinition="String(36)")
	public String getLevel30() {
		return level30;
	}
	public void setLevel30(String level30) {
		this.level30 = level30;
	}
	
	@Column(name="LEVEL40" ,columnDefinition="String(36)")
	public String getLevel40() {
		return level40;
	}
	public void setLevel40(String level40) {
		this.level40 = level40;
	}
	
	@Column(name="LEVEL17" ,columnDefinition="String(36)")
	public String getLevel17() {
		return level17;
	}
	public void setLevel17(String level17) {
		this.level17 = level17;
	}
	
	@Column(name="ROADMAP_STATUS", length=100)
	public String getRoadMapStatus() {
		return roadMapStatus;
	}
	public void setRoadMapStatus(String roadMapStatus) {
		this.roadMapStatus = roadMapStatus;
	}
	
	@Column(name="REVENUE_AMOUNT",precision=26,scale=6)
	public double getRevenueAmount() {
		return revenueAmount;
	}
	public void setRevenueAmount(double revenueAmount) {
		this.revenueAmount = revenueAmount;
	}
	
	@Column(name="CURRENCY", length=3)
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	@Column(name="EXPECTED_CLOSE_DATE")
	public Date getExpectedCloseDate() {
		return expectedCloseDate;
	}
	public void setExpectedCloseDate(Date expectedCloseDate) {
		this.expectedCloseDate = expectedCloseDate;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	@Column(name="PROBABILITY", length=100)
	public String getProbability() {
		return probability;
	}
	public void setProbability(String probability) {
		this.probability = probability;
	}
	
	@Column(name="EXPIRATION_DATE")
	public Date getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}
	
	@Column(name="RENEW_DATE")
	public Date getRenewDate() {
		return renewDate;
	}
	public void setRenewDate(Date renewDate) {
		this.renewDate = renewDate;
	}
	
	@Column(name="CONTRACT_TYPE", length=30)
	public String getContractType() {
		return contractType;
	}
	public void setContractType(String contractType) {
		this.contractType = contractType;
	}
	
	@Column(name="BOOKING_TYPE", length=30)
	public String getBookingType() {
		return bookingType;
	}
	public void setBookingType(String bookingType) {
		this.bookingType = bookingType;
	}
	
	@Column(name="EXPIRING_CONTRACT_DURATION")
	public int getExpiringContractDuration() {
		return expiringContractDuration;
	}
	public void setExpiringContractDuration(int expiringContractDuration) {
		this.expiringContractDuration = expiringContractDuration;
	}
	
	@Column(name="COMPETITIOR", length=640)
	public String getCompetitor() {
		return competitor;
	}
	public void setCompetitor(String competitor) {
		this.competitor = competitor;
	}
	
	@Column(name="CREATED_BY_CNUM" ,columnDefinition="String(36)")
	public String getCreatedByCnum() {
		return createdByCnum;
	}
	public void setCreatedByCnum(String createdByCnum) {
		this.createdByCnum = createdByCnum;
	}
	
	@Column(name="MODIFIED_USER_CNUM" ,columnDefinition="String(36)")
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
	
	@Column(name="SPOKE_SOURCE" ,columnDefinition="String(10)")
	public String getSpokeSource() {
		return spokeSource;
	}
	public void setSpokeSource(String spokeSource) {
		this.spokeSource = spokeSource;
	}
	
	@Column(name="CIP_MAPID" ,columnDefinition="String(36)")
	public String getCipMapId() {
		return cipMapId;
	}
	public void setCipMapId(String cipMapId) {
		this.cipMapId = cipMapId;
	}
	

	public LineItems() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public LineItems(String opportunityId, String salesStage, String assignedUserCnum, String assignedBpId, String level10,
			String level15, String level20, String level30, String level40, String level17, String roadMapStatus,
			double revenueAmount, String currency, Date expectedCloseDate, int duration, String probability,
			Date expirationDate, Date renewDate, String contractType, String bookingType, int expiringContractDuration,
			String competitor, String createdByCnum, String modifiedUserCnum, Timestamp dateEntered,
			Timestamp dateModified, int deleted, String spokeSource, String cipMapId) {
		// TODO Auto-generated constructor stub
		this.opportunityId = opportunityId;
		this.salesStage = salesStage;
		this.assignedUserCnum = assignedUserCnum;
		this.assignedBpId = assignedBpId;
		this.level10 = level10;
		this.level15 = level15;
		this.level20 = level20;
		this.level30 = level30;
		this.level40 = level40;
		this.level17 = level17;
		this.roadMapStatus = roadMapStatus;
		this.revenueAmount = revenueAmount;
		this.currency = currency;
		this.expectedCloseDate = expectedCloseDate;
		this.duration = duration;
		this.probability = probability;
		this.expirationDate = expirationDate;
		this.renewDate = renewDate;
		this.contractType = contractType;
		this.bookingType = bookingType;
		this.expiringContractDuration = expiringContractDuration;
		this.competitor = competitor;
		this.createdByCnum = createdByCnum;
		this.modifiedUserCnum = modifiedUserCnum;
		this.dateEntered = dateEntered;
		this.dateModified = dateModified;
		this.deleted = deleted;
		this.spokeSource = spokeSource;
		this.cipMapId = cipMapId;
	}
	
	
	//sample constructor
	public LineItems(String id,String salesStage, String roadMapStatus,String opportunityId) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.salesStage = salesStage;
		this.roadMapStatus = roadMapStatus;
		this.opportunityId = opportunityId;	
	}
		
}
