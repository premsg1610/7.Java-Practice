package com.Day7_Q4;

public class ICICIBank extends Bank {

	double rateOfInterest;
	
	@Override
	public void displayDetails() {
		
		System.out.println("Branch Name is: " + branchName);
		System.out.println("IFSC code is: " + ifscCode);
		System.out.println("Rate of interest is: " + rateOfInterest);
	}
}