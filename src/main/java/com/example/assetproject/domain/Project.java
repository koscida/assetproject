package com.example.assetproject.domain;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Objects;
@Entity
public class Project {
	@Id
	@GeneratedValue
	private Long id;

	@Column
	private String code;

	@Column
	private String name;

	// constructors

	public Project(String code, String name) {
		this.code = code;
		this.name = name;
	}
	public Project(){}

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
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Project)) return false;
		Project project = (Project) o;
		return id.equals(project.id) && code.equals(project.code) && name.equals(project.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, code, name);
	}

	@Override
	public String toString() {
		return "Project{" +
				"id=" + id +
				", code='" + code + '\'' +
				", name='" + name + '\'' +
				'}';
	}

}
