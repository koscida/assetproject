package com.example.assetproject.domain;
import jakarta.persistence.*;

import java.util.Objects;
@Entity
public class Asset {
	@Id
	@GeneratedValue
	private Long id;

	@Column
	@Enumerated
	private Status status;

	@Column
	@Enumerated
	private Condition condition;

	@ManyToOne
	private Department department;

	@ManyToOne
	private Project project;

	@ManyToOne
	private Make make;

	@ManyToOne
	private Model model;

	@Column
	private String serialNumber;

	@Column
	private String macAddress;

	@Column
	private String code;



	// constructors

	protected Asset() {}

	public Asset(Status status, String code) {
		this.status = status;
		this.code = code;
	}

	public Asset(Status status, String serialNumber, String code) {
		this.status = status;
		this.serialNumber = serialNumber;
		this.code = code;
	}

	public Asset(Status status, Department department, Project project, Make make, Model model, Condition condition, String serialNumber, String macAddress, String code) {
		this.status = status;
		this.department = department;
		this.project = project;
		this.make = make;
		this.model = model;
		this.condition = condition;
		this.serialNumber = serialNumber;
		this.macAddress = macAddress;
		this.code = code;
	}


	// getters and setters

	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	public Make getMake() {
		return make;
	}
	public void setMake(Make make) {
		this.make = make;
	}
	public Model getModel() {
		return model;
	}
	public void setModel(Model model) {
		this.model = model;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMacAddress() {
		return macAddress;
	}
	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}

	public Condition getCondition() {
		return condition;
	}

	public void setCondition(Condition condition) {
		this.condition = condition;
	}
	// overrides

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Asset)) return false;
		Asset asset = (Asset) o;
		return id.equals(asset.id) && status == asset.status && condition == asset.condition && Objects.equals(department, asset.department) && Objects.equals(project, asset.project) && Objects.equals(make, asset.make) && Objects.equals(model, asset.model) && Objects.equals(serialNumber, asset.serialNumber) && Objects.equals(macAddress, asset.macAddress) && code.equals(asset.code);
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, condition, status, department, project, make, model, serialNumber, macAddress, code);
	}

	@Override
	public String toString() {
		return "Asset{" +
				"id=" + id +
				", status=" + status +
				", condition=" + condition +
				", department=" + department +
				", project=" + project +
				", make=" + make +
				", model=" + model +
				", serialNumber='" + serialNumber + '\'' +
				", macAddress='" + macAddress + '\'' +
				", code='" + code + '\'' +
				'}';
	}
}
