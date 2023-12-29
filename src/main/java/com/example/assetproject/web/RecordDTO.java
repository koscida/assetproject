package com.example.assetproject.web;

import com.example.assetproject.domain.Condition;
import com.example.assetproject.domain.Status;

import java.util.Date;

public class RecordDTO {

	private Status status;

	private Long profileId;

	private Long assetId;

	private Date checkOutDate;
	private String checkOutLocation;
	private String checkOutStaff;
	private Condition checkOutCondition;
	private String checkOutNotes;


	// constructors


	/**
	 * Constructor for requesting an asset, just including the profile
	 *
	 * @param status
	 * @param profileId
	 */
	public RecordDTO(Status status, Long profileId) {
		this.status = status;
		this.profileId = profileId;
	}

	/**
	 * Constructor for requesting a specific asset
	 *
	 * @param status
	 * @param assetId
	 * @param profileId
	 */
	public RecordDTO(Status status, Long profileId, Long assetId) {
		this.status = status;
		this.profileId = profileId;
		this.assetId = assetId;
	}

	/**
	 * Constructor for checking-out/returning an asset
	 *
	 * @param status
	 * @param profileId
	 * @param assetId
	 * @param checkOutDate
	 * @param checkOutLocation
	 * @param checkOutStaff
	 * @param checkOutCondition
	 * @param checkOutNotes
	 */
	public RecordDTO(Status status, Long profileId, Long assetId, Date checkOutDate, String checkOutLocation, String checkOutStaff, Condition checkOutCondition, String checkOutNotes) {
		this.status = status;
		this.profileId = profileId;
		this.assetId = assetId;
		this.checkOutDate = checkOutDate;
		this.checkOutLocation = checkOutLocation;
		this.checkOutStaff = checkOutStaff;
		this.checkOutCondition = checkOutCondition;
		this.checkOutNotes = checkOutNotes;
	}



	// getters and setters

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Long getAssetId() {
		return assetId;
	}

	public void setAssetId(Long assetId) {
		this.assetId = assetId;
	}

	public Long getProfileId() {
		return profileId;
	}

	public void setProfileId(Long profileId) {
		this.profileId = profileId;
	}



	public Date getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	public String getCheckOutLocation() {
		return checkOutLocation;
	}

	public void setCheckOutLocation(String checkOutLocation) {
		this.checkOutLocation = checkOutLocation;
	}

	public String getCheckOutStaff() {
		return checkOutStaff;
	}

	public void setCheckOutStaff(String checkOutStaff) {
		this.checkOutStaff = checkOutStaff;
	}

	public Condition getCheckOutCondition() {
		return checkOutCondition;
	}

	public void setCheckOutCondition(Condition checkOutCondition) {
		this.checkOutCondition = checkOutCondition;
	}

	public String getCheckOutNotes() {
		return checkOutNotes;
	}

	public void setCheckOutNotes(String checkOutNotes) {
		this.checkOutNotes = checkOutNotes;
	}
}
