package com.example.assetproject.domain;
import jakarta.persistence.*;

import java.util.Date;
import java.util.Objects;
@Entity
public class EquipmentRecord {
	@Id
	@GeneratedValue
	private Long id;

	@Column
	@Enumerated
	private Status assetStatus;

	@ManyToOne
	private Profile profile;

	@ManyToOne
	private Department profileDepartment;

	@ManyToOne
	private Project profileProject;

	@ManyToOne
	private Asset asset;

	@ManyToOne
	private Department assetDepartment;

	@ManyToOne
	private Project assetProject;

	@Column
	private Date checkOutDate;

	@Column
	private String checkOutLocation;

	@Column
	private String checkOutStaff;

	@Column
	@Enumerated
	private Condition checkOutCondition;

	@Column(length = 2000)
	private String checkOutNotes;

	@Column
	private Date returnDate;

	@Column
	private String returnLocation;

	@Column
	private String returnStaff;

	@Column
	@Enumerated
	private Condition returnCondition;

	@Column(length = 2000)
	private String returnNotes;



	// constructors

	/**
	 * Constructor for requesting equipment
	 * - include profile
	 *
	 * @param assetStatus
	 * @param profile
	 */
	public EquipmentRecord(Status assetStatus, Profile profile) {
		this.assetStatus = assetStatus;
		this.profile = profile;
		// store a copy of the profile's department and project
		this.profileDepartment = profile.getDepartment();
		this.profileProject = profile.getProject();
	}

	/**
	 * Constructor for requesting specific asset
	 *
	 * @param assetStatus
	 * @param asset
	 * @param profile
	 */
	public EquipmentRecord(Status assetStatus, Profile profile, Asset asset) {
		this.assetStatus = assetStatus;
		this.profile = profile;
		// store a copy of the profile's department and project
		this.profileDepartment = profile.getDepartment();
		this.profileProject = profile.getProject();
		//
		this.asset = asset;
		// store a copy of the asset's department and project
		this.assetDepartment = asset.getDepartment();
		this.assetProject = asset.getProject();
	}



	protected EquipmentRecord(){}

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

	public Department getAssetDepartment() {
		return assetDepartment;
	}

	public void setAssetDepartment(Department assetDepartment) {
		this.assetDepartment = assetDepartment;
	}

	public Project getAssetProject() {
		return assetProject;
	}

	public void setAssetProject(Project assetProject) {
		this.assetProject = assetProject;
	}

	public Department getProfileDepartment() {
		return profileDepartment;
	}

	public void setProfileDepartment(Department profileDepartment) {
		this.profileDepartment = profileDepartment;
	}

	public Project getProfileProject() {
		return profileProject;
	}

	public void setProfileProject(Project profileProject) {
		this.profileProject = profileProject;
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

	public String getReturnLocation() {
		return returnLocation;
	}

	public void setReturnLocation(String returnLocation) {
		this.returnLocation = returnLocation;
	}

	public String getReturnStaff() {
		return returnStaff;
	}

	public void setReturnStaff(String returnStaff) {
		this.returnStaff = returnStaff;
	}

	public Condition getReturnCondition() {
		return returnCondition;
	}

	public void setReturnCondition(Condition returnCondition) {
		this.returnCondition = returnCondition;
	}

	public String getReturnNotes() {
		return returnNotes;
	}

	public void setReturnNotes(String returnNotes) {
		this.returnNotes = returnNotes;
	}

	// overrides

	@Override
	public String toString() {
		return "EquipmentRecord{" +
				"id=" + id +
				", assetStatus=" + assetStatus +
				", asset=" + asset +
				", assetDepartment=" + assetDepartment +
				", assetProject=" + assetProject +
				", profile=" + profile +
				", profileDepartment=" + profileDepartment +
				", profileProject=" + profileProject +
				", checkOutDate=" + checkOutDate +
				", checkOutLocation='" + checkOutLocation + '\'' +
				", checkOutStaff='" + checkOutStaff + '\'' +
				", checkOutCondition=" + checkOutCondition +
				", checkOutNotes='" + checkOutNotes + '\'' +
				", returnDate=" + returnDate +
				", returnLocation='" + returnLocation + '\'' +
				", returnStaff='" + returnStaff + '\'' +
				", returnCondition=" + returnCondition +
				", returnNotes='" + returnNotes + '\'' +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof EquipmentRecord)) return false;
		EquipmentRecord that = (EquipmentRecord) o;
		return id.equals(that.id) && assetStatus == that.assetStatus && Objects.equals(asset, that.asset) && Objects.equals(assetDepartment, that.assetDepartment) && Objects.equals(assetProject, that.assetProject) && profile.equals(that.profile) && Objects.equals(profileDepartment, that.profileDepartment) && Objects.equals(profileProject, that.profileProject) && Objects.equals(checkOutDate, that.checkOutDate) && Objects.equals(checkOutLocation, that.checkOutLocation) && Objects.equals(checkOutStaff, that.checkOutStaff) && checkOutCondition == that.checkOutCondition && Objects.equals(checkOutNotes, that.checkOutNotes) && Objects.equals(returnDate, that.returnDate) && Objects.equals(returnLocation, that.returnLocation) && Objects.equals(returnStaff, that.returnStaff) && returnCondition == that.returnCondition && Objects.equals(returnNotes, that.returnNotes);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, assetStatus, asset, assetDepartment, assetProject, profile, profileDepartment, profileProject, checkOutDate, checkOutLocation, checkOutStaff, checkOutCondition, checkOutNotes, returnDate, returnLocation, returnStaff, returnCondition, returnNotes);
	}
}
