package com.greatlearning.model;

public class Employee {

	private String firstName;
	private String laststName;
	private String emailId;
	private String password;

	public Employee() {
	}

	public Employee(String firstName, String laststName) {
		super();
		this.firstName = firstName;
		this.laststName = laststName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLaststName() {
		return laststName;
	}

	public void setLaststName(String laststName) {
		this.laststName = laststName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
