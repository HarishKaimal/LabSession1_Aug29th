package com.greatlearning.service;

import java.util.Random;
import com.greatlearning.model.Employee;

public class CredentialService {
	
	public char[] generatePassword() {
		
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*()<>+_-~'{[}]?";
		String finalStr = capitalLetters + smallLetters + numbers + specialCharacters;
		
		char[] pwd = new char[8];
		System.out.println(" the new password is "+pwd.toString());
		
		Random rand = new Random();
		
		for (int i=0; i<8; i++) {
			pwd[i] = finalStr.charAt(rand.nextInt(finalStr.length()));
			System.out.println("The " + i + " element of password is "+pwd[i]);
		}
		System.out.println(" The generated password is " + pwd.toString());
		return pwd;
	}
	
	public String generateEmailAddress(String firstName, String lastName, String departmentName) {
		
		String emailId;
		emailId = firstName+lastName+"."+departmentName.substring(0,4)+"@abc.com";
		return emailId;
		
	}
	
	public void showCredentials(Employee employee, String emailId, char[] password) {
		
		System.out.println("Dear " + employee.getFirstName() + " your credentials are as follows");
		System.out.println("Email id is : "+ emailId);
		System.out.println("Password is : "+ password.toString());
		
	}
	
}
