package com.greatlearning.service;

import java.util.Scanner;
import com.greatlearning.model.Employee;

public class DriverClass {
	public static void main(String[] args) {
		
		Employee employee = new Employee("John","Travolta");
		CredentialService cs = new CredentialService();
		
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		char [] generatedPwd = new char[8];
		
		String generatedEmailId;
		
		switch(input) {
			case 1: {
				generatedPwd = cs.generatePassword();
				generatedEmailId = cs.generateEmailAddress(employee.getFirstName(), employee.getLastName(), "technical");
				cs.showCredentials(employee, generatedEmailId, generatedPwd);
				break;
			}
			case 2: {
				generatedPwd = cs.generatePassword();
				generatedEmailId = cs.generateEmailAddress(employee.getFirstName(), employee.getLastName(), "admin");
				cs.showCredentials(employee, generatedEmailId, generatedPwd);	
				break;
			}
			case 3:{
				generatedPwd = cs.generatePassword();
				generatedEmailId = cs.generateEmailAddress(employee.getFirstName(), employee.getLastName(), "human resource");
				cs.showCredentials(employee, generatedEmailId, generatedPwd);
				break;
			}
			case 4:{
				generatedPwd = cs.generatePassword();
				generatedEmailId = cs.generateEmailAddress(employee.getFirstName(), employee.getLastName(), "legal");
				cs.showCredentials(employee, generatedEmailId, generatedPwd);
				break;
			}
			default: System.out.println("Please choose one of the 4 options");
		}
		sc.close();
	}
}