package com.example.assetproject.web;

public class ProfileDTO {
	private String firstName;
	private String lastName;
	private String email;
	private Long departmentId;
	private Long projectId;

	// constructor

	public ProfileDTO(String firstName, String lastName, String email, Long departmentId, Long projectId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.departmentId = departmentId;
		this.projectId = projectId;
	}

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

	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	@Override
	public String toString() {
		return "ProfileDTO{" +
				"firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", email='" + email + '\'' +
				", departmentId=" + departmentId +
				", projectId=" + projectId +
				'}';
	}
}
