package com.Day7_Q2;

public class Main {

	public static void main(String[] args) {
		
		DayScholar ds1 = new DayScholar("Prem Sagar Gupta",1107, 2000.00, 3000.00);
		ds1.displayDetails();
		System.out.println("Transport fee is: " + ds1.transportFee);
		System.out.println("Exam fee is: " + ds1.examFee);
		
		double remainingFee1 = ds1.payFee();
		System.out.println("Remaining fee is: " + remainingFee1);
		
		System.out.println();
		System.out.println("========================");
		System.out.println();
		
		Hosteller h1 = new Hosteller("Harsh Vyas",1105, 5000.00, 3000);
		h1.displayDetails();
		System.out.println("Hostel fee is: " + h1.hostelFee);
		System.out.println("Exam fee is: " + h1.examFee);
		double remainingFee2 = h1.payFee();
		System.out.println("Remaining fee is: " + remainingFee2);
	}
	

}
