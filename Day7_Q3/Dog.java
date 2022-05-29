package com.Day7_Q3;

public class Dog extends Super_this_Animal{

	public Dog(int num) {
		super(num);
	}
	
	public static void main(String[] args) {
		
		int num = 10;
		Dog d1 = new Dog(num);
		
		System.out.println("Number is: " + d1.num);
	}	
}

/*
 * Here I have created a child class object d1 using parameterized constructor.
 * and passed the value of number.
 * this value of num will be passed to super class of class Dog which is Super_this_Animal
 * using "super" keyword.
 * 
 * In Super_this_Animal class this value will be taken as parameter and the constructor
 * will set this value to instance variable num using "this" keyword.
 * 
 * the value of num is set only for the current object d1 of Dog class.
 * there we can say, this refers to the current object.
*/