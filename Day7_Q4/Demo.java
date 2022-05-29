package com.Day7_Q4;

import java.util.Scanner;

public class Demo {

	public static Bank getBank(String bank) {
		
		if(bank.equals("axis"))
		{
			AxisBank b1 = new AxisBank();
			b1.branchName = "Vasundhara Enclave";
			b1.ifscCode = "AXIS0VASUND";
			b1.rateOfInterest = 6;
			return b1;
		}
		else if(bank.equals("icici")){
			ICICIBank b2 = new ICICIBank();
			b2.branchName = "Mayur Vihar Phase-3";
			b2.ifscCode = "ICICI0MV3";
			b2.rateOfInterest = 6.5;
			return b2;
		}
		else {
			return null;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Bank Name:");
		String bankName = input.next();
		
//		input.nextLine();
//		System.out.println("Enter Branch Name:");
//		String branchName = input.nextLine();
//		
//		System.out.println("Enter IFSC Code:");
//		String ifscCode = input.next();
//		
//		System.out.println("Enter Rate of Interest:");
//		int rate = input.nextInt();
		
		if(bankName.equals("icici"))
		{
			Bank b1 = Demo.getBank(bankName);
			b1.displayDetails();
		}
		else if(bankName.equals("axis"))
		{
			Bank b1 = Demo.getBank(bankName);
			b1.displayDetails();
	
			AxisBank a1 = (AxisBank)b1;
			
			a1.getCreditCard();
		}
		else {
			System.out.println("");
		}
		
		
	}
}
