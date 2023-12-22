package com.example.assetproject.domain;
import jakarta.persistence.*;
@Entity
public class Model {
	@Id
	@GeneratedValue
	private Long id;

	@Column
	private String name;

	@ManyToOne
	private Make make;

	// constructors

	public Model(Long id, String name, Make make) {
		this.id = id;
		this.name = name;
		this.make = make;
	}
	public Model() {
	}

	// getters and setters

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Make getMake() {
		return make;
	}
	public void setMake(Make make) {
		this.make = make;
	}
}
