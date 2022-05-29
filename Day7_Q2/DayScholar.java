package com.Day7_Q2;

public class DayScholar extends Student {

	double transportFee;
	
	public DayScholar(String studName, int studId, double transportFee, double examFee) {
		
		super(studName, studId, examFee);
		this.transportFee = transportFee;
		
	}
	
	@Override
	public double payFee() {
		
		return examFee + transportFee;
		}
}
