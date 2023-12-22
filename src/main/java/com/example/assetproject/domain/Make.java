package com.example.assetproject.domain;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
@Entity
public class Make {
	@Id
	@GeneratedValue
	private Long id;

	@Column
	private String name;

	// constructors

	public Make(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	public Make() {
	}

	// getters and setters

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
