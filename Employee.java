package com.polymorphism;

public class Employee {
	
	private int basicSal=23000;
	private double hra=5600;
	private double da=3400;
			
    public double calculateSalary() {
    	return basicSal+hra+da;
    }
}
