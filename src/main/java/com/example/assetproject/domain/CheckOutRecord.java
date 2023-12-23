package com.example.assetproject.domain;
import jakarta.persistence.*;

import java.util.Date;
import java.util.Objects;
@Entity
public class CheckOutRecord {
	@Id
	@GeneratedValue
	private Long id;

	@Column
	@Enumerated
	private Status assetStatus;

	@ManyToOne
	private Asset asset;

	@ManyToOne
	private Profile profile;

	@Column
	private Date checkOutDate;

	@Column
	private Date returnDate;



	// constructors
	public CheckOutRecord(Status assetStatus) {
		this.assetStatus = assetStatus;
	}
	public CheckOutRecord(Status assetStatus, Asset asset, Profile profile) {
		this.assetStatus = assetStatus;
		this.asset = asset;
		this.profile = profile;
	}
	public CheckOutRecord(Status assetStatus, Asset asset, Profile profile, Date checkOutDate, Date returnDate) {
		this.assetStatus = assetStatus;
		this.asset = asset;
		this.profile = profile;
		this.checkOutDate = checkOutDate;
		this.returnDate = returnDate;
	}

	public CheckOutRecord(Long id, Status assetStatus, Asset asset, Profile profile, Date checkOutDate, Date returnDate) {
		this.id = id;
		this.assetStatus = assetStatus;
		this.asset = asset;
		this.profile = profile;
		this.checkOutDate = checkOutDate;
		this.returnDate = returnDate;
	}
	protected CheckOutRecord(){}

	// getters and setters

	public Status getAssetStatus() {
		return assetStatus;
	}
	public void setAssetStatus(Status assetStatus) {
		this.assetStatus = assetStatus;
	}
	public Asset getAsset() {
		return asset;
	}
	public void setAsset(Asset asset) {
		this.asset = asset;
	}
	public Profile getProfile() {
		return profile;
	}
	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	public Date getCheckOutDate() {
		return checkOutDate;
	}
	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
	public Date getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}


	// overrides

	@Override
	public String toString() {
		return "CheckOutRecord {" +
				"id=" + id +
				", assetStatus=" + assetStatus +
				", asset=" + asset +
				", profile" + profile +
				", checkOutDate=" + checkOutDate +
				", returnDate=" + returnDate +
				"}";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		CheckOutRecord checkOutRecord = (CheckOutRecord) o;

		return Objects.equals(id, checkOutRecord.id) &&
				assetStatus == checkOutRecord.assetStatus &&
				Objects.equals(asset, checkOutRecord.asset) &&
				Objects.equals(profile, checkOutRecord.profile) &&
				Objects.equals(checkOutDate, checkOutRecord.checkOutDate) &&
				Objects.equals(returnDate, checkOutRecord.returnDate);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, assetStatus, asset, profile, checkOutDate, returnDate);
	}
}
