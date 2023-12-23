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

	protected Asset() {

	}
	public Asset(Status status, Make make, Model model, String serialNumber, String macAddress, String code ) {
		this.status = status;
		this.make = make;
		this.model = model;
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

	// overrides

	@Override
	public String toString() {
		return "Asset{" +
				"id=" + id +
				", status=" + status +
				", make=" + make +
				", model=" + model +
				", serialNumber=" + serialNumber +
				", macAddress=" + macAddress +
				", code=" + code +
		"}";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Asset asset = (Asset) o;

		return Objects.equals(id, asset.id) &&
				status == asset.status &&
				Objects.equals(make, asset.make) &&
				Objects.equals(model, asset.model) &&
				Objects.equals(serialNumber, asset.serialNumber) &&
				Objects.equals(macAddress, asset.macAddress) &&
				Objects.equals(code, asset.code)
				;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, status, make, model, serialNumber, macAddress, code);
	}
}
