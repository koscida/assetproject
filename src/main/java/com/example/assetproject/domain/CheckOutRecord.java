package com.example.assetproject.domain;
import jakarta.persistence.*;

import java.util.Date;
import java.util.Objects;
@Entity
public class CheckOutRecord {
	@Id
	@GeneratedValue
	private Long id;

	@ManyToOne
	private Asset asset;

	@ManyToOne
	private Profile profile;

	@Column
	private Date checkOutDate;

	@Column
	private Date returnDate;

	@Column
	@Enumerated
	private Status finalAssetStatus;



	// constructors

	public CheckOutRecord(Asset asset, Profile profile, Date checkOutDate, Date returnDate, Status finalAssetStatus) {
		this.asset = asset;
		this.profile = profile;
		this.checkOutDate = checkOutDate;
		this.returnDate = returnDate;
		this.finalAssetStatus = finalAssetStatus;
	}
	public CheckOutRecord(Asset asset, Profile profile) {
		this.asset = asset;
		this.profile = profile;
	}
	protected CheckOutRecord(){}

	// getters and setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public Status getFinalAssetStatus() {
		return finalAssetStatus;
	}
	public void setFinalAssetStatus(Status finalAssetStatus) {
		this.finalAssetStatus = finalAssetStatus;
	}

	// overrides

	@Override
	public String toString() {
		return "CheckOutRecord {" +
				"id=" + id +
				", asset=" + asset +
				", profile" + profile +
				", checkOutDate=" + checkOutDate +
				", returnDate=" + returnDate +
				", finalAssetStatus=" + finalAssetStatus +
				"}";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		CheckOutRecord checkOutRecord = (CheckOutRecord) o;

		return Objects.equals(id, checkOutRecord.id) &&
				Objects.equals(asset, checkOutRecord.asset) &&
				Objects.equals(profile, checkOutRecord.profile) &&
				Objects.equals(checkOutDate, checkOutRecord.checkOutDate) &&
				Objects.equals(returnDate, checkOutRecord.returnDate) &&
				finalAssetStatus == checkOutRecord.finalAssetStatus;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, asset, profile, checkOutDate, returnDate, finalAssetStatus);
	}
}
