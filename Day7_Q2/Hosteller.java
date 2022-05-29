package com.Day7_Q2;

public class Hosteller extends Student {

	double hostelFee;
	
	public Hosteller(String studName, int studId, double hostelFee, double examFee) {
		super(studName, studId, examFee);
		this.hostelFee = hostelFee;
	}
	
	@Override
	public double payFee() {
		
		return examFee + hostelFee;
		}	
}
