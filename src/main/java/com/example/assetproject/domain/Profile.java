package com.example.assetproject.domain;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

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

	// constructors

	public Profile(String firstName, String lastName, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	protected Profile(){}

	// getters and setters

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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

	// overrides

	@Override
	public String toString() {
		return "Profile {" +
				"id=" + id +
				", firstName=" + firstName +
				", lastName=" + lastName +
				", email=" + email +
				"}";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Profile profile = (Profile) o;
		return Objects.equals(id, profile.id) &&
				Objects.equals(firstName, profile.firstName) &&
				Objects.equals(lastName, profile.lastName) &&
				Objects.equals(email, profile.email);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, firstName, lastName, email);
	}

}
