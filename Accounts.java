package com.ibm.cip.common.dao;

import java.sql.Timestamp;

import javax.persistence.*;



@Entity
@Table(name="Accounts")
public class Accounts{

	private int id;
	private String cmrNumber;
	private String country;
	private String mppNumber;
	private int deleted;
	private Timestamp dateEntered;
	private Timestamp dateModified;
	
	@Id
    @GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="ID", columnDefinition="char(36)")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name="CMR_NUMBER",  nullable = false, length = 10)
	public String getCmrNumber() {
		return cmrNumber;
	}
	public void setCmrNumber(String cmrNumber) {
		this.cmrNumber = cmrNumber;
	}
	
	@Column(name="COUNTRY",  nullable = false, length = 3)
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	@Column(name="MPP_NUM",  nullable = false, length = 10)
	public String getMppNumber() {
		return mppNumber;
	}
	public void setMppNumber(String mppNumber) {
		this.mppNumber = mppNumber;
	}
	
	@Column(name="DELETED",columnDefinition="SMALLINT")
	public int getDeleted() {
		return deleted;
	}
	public void setDeleted(int deleted) {
		this.deleted = deleted;
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
	
	
	public Accounts(String cmrNumber, String country, String mppNumber, int deleted, Timestamp dateEntered,
			Timestamp dateModified) {
		// TODO Auto-generated constructor stub
		this.cmrNumber = cmrNumber;
		this.country = country;
		this.mppNumber = mppNumber;
		this.deleted = deleted;
		this.dateEntered = dateEntered;
		this.dateModified = dateModified;
	}
	
	public Accounts() {
		// TODO Auto-generated constructor stub
	}
	
}
