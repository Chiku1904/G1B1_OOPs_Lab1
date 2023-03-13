package com.greatlearning.services;

import com.greatlearning.model.Employee;

public interface EmailPassCredService {

	String generateEmailAddress(String firstName, String lastName, String dept);

	String generatePassword();

	void showCredentials(Employee emp);
}
