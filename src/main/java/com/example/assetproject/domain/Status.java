package com.example.assetproject.domain;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public enum Status {
	Available("Available"), Reserved("Reserved"), CheckedOut("Checked-Out"), Returned("Returned"), Repairs("Repairs"), Missing("Missing");

	private String label;

	private Status(String label) {
		this.label = label;
	}

	public static Status findByLabel(String byLabel) {
		for(Status r: Status.values()) {
			if (r.label.equalsIgnoreCase(byLabel))
				return r;
		}
		return null;
	}
}
