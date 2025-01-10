package com.polymorphism;

public class MainApp {
	public static void main(String[] args) {
		Employee emp=new Employee();
		System.out.println("Salary from Employee class =" +emp.calculateSalary());
		
		Manager mgr=new Manager();
		double sal=mgr.calculateSalary();
		System.out.println("total salary of manager =" +sal);
	} 

}
