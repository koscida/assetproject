package com.example.assetproject.domain;
import jakarta.persistence.*;

import java.util.Objects;
@Entity
public class Profile {
	@Id
	@GeneratedValue
	private Long id;

	@Column
	private String firstName;

	@Column
	private String lastName;

	@Column
	private String email;

	@ManyToOne
	private Department department;

	@ManyToOne
	private Project project;

	// constructors


	public Profile(String firstName, String lastName, String email, Department department, Project project) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.department = department;
		this.project = project;
	}
	public Profile(String firstName, String lastName, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	protected Profile(){}

	// getters and setters

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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

	// overrides

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Profile)) return false;
		Profile profile = (Profile) o;
		return id.equals(profile.id) && firstName.equals(profile.firstName) && lastName.equals(profile.lastName) && email.equals(profile.email) && department.equals(profile.department) && project.equals(profile.project);
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, firstName, lastName, email, department, project);
	}

	@Override
	public String toString() {
		return "Profile{" +
				"id=" + id +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", email='" + email + '\'' +
				", department=" + department +
				", project=" + project +
				'}';
	}
}
