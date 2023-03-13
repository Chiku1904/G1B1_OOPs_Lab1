package com.greatlearning.services;

import java.util.Random;

import com.greatlearning.model.Employee;

public class EmailPassCredServiceImpl implements EmailPassCredService {

	@Override
	public String generateEmailAddress(String firstName, String lastName, String dept) {

		return firstName.toLowerCase() + lastName.toLowerCase() + "@" + dept + ".gl.com";
	}

	@Override
	public String generatePassword() {

		String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String SplChar = "!@#$%^&*()_-+";

		String combined = upperCaseLetters + lowerCaseLetters + numbers + SplChar;

		String myPassword = "";
		Random random = new Random();
		for (int i = 0; i < 8; i++) {
			myPassword = myPassword + String.valueOf(combined.charAt(random.nextInt(combined.length())));
		}
		return myPassword;
	}

	@Override
	public void showCredentials(Employee emp) {

		System.out.println("Your First Name ==> " + emp.getFirstName());
		System.out.println("Your last Name ==> " + emp.getLaststName());
		System.out.println("Your Email Id ==> " + emp.getEmailId());
		System.out.println("Your password ==> " + emp.getPassword());
	}
}
