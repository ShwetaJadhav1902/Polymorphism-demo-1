package com.polymorphism;

public class Manager extends Employee {
	private double inc=3400;
	
	
	public double calculateSalary() {
		return super.calculateSalary()+inc;
				
	}
	

}
