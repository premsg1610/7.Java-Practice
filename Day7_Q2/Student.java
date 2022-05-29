package com.Day7_Q2;

public class Student {

	int studId;
	String studName;
	double examFee;
	
	public void displayDetails() {
		
		System.out.println("Student name is: " + studName);
		System.out.println("Student id is: " + studId);
	}
		
	public double payFee() {
			
		return examFee;
		}
	
	public Student(String studName, int studId, double examFee) {
		this.studName = studName;
		this.studId = studId;
		this.examFee = examFee;
		
	}
}
