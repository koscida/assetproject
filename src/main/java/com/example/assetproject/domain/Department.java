package com.example.assetproject.domain;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Objects;
@Entity
public class Department {
	@Id
	@GeneratedValue
	private Long id;

	@Column
	private String code;

	@Column
	private String name;

	// constructors

	public Department(String code, String name) {
		this.code = code;
		this.name = name;
	}
	public Department(){}

	// getters and setters


	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	// overrides

	@Override
	public String toString() {
		return "Department{" +
				"id=" + id +
				", code='" + code + '\'' +
				", name='" + name + '\'' +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Department)) return false;
		Department that = (Department) o;
		return id.equals(that.id) && code.equals(that.code) && name.equals(that.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, code, name);
	}
}
