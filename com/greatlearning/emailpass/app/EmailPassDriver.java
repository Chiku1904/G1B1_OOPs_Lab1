package com.greatlearning.emailpass.app;

import com.greatlearning.model.Employee;
import com.greatlearning.services.EmailPassCredServiceImpl;

import java.util.Scanner;

public class EmailPassDriver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your First Name");
		String firstName = sc.next();

		System.out.println("Enter your Last Name");
		String lastName = sc.next();

		Employee emp = new Employee(firstName, lastName);

		EmailPassCredServiceImpl epcs = new EmailPassCredServiceImpl();

		System.out.println();

		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resources");
		System.out.println("4. Legal");
		System.out.println(
				"Choose any option according to your department to create your auto-generated email id & password.\n");
		int option = sc.nextInt();
		String genEmail = "";
		String genPasswrd = "";

		switch (option) {
		case 1:
			genEmail = epcs.generateEmailAddress(firstName, lastName, "tech");
			break;
		case 2:
			genEmail = epcs.generateEmailAddress(firstName, lastName, "admin");
			break;
		case 3:
			genEmail = epcs.generateEmailAddress(firstName, lastName, "hr");
			break;
		case 4:
			genEmail = epcs.generateEmailAddress(firstName, lastName, "legal");
			break;
		default:
			System.out.println("Enter a valid option from the above");
		}

		genPasswrd = epcs.generatePassword();
		emp.setEmailId(genEmail);
		emp.setPassword(genPasswrd);
		epcs.showCredentials(emp);
	}
}