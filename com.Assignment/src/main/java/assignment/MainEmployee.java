package assignment;

import java.util.Scanner;

public class MainEmployee {

	public static void main(String[] args) {
		FullTimeEmployee fe=new FullTimeEmployee();
		PartTimeEmployee pe=new PartTimeEmployee();
		Scanner scan=new Scanner(System.in);
		
		System.out.println("|----------------------------|");
		System.out.println("|    EMPLOYMENT TYPE         |");
		System.out.println("|----------------------------|");
		System.out.println("|    1. FULLTIME             |");
		System.out.println("|    2.PART TIME             |");
		System.out.println("|----------------------------|");
		System.out.println("Please Enter your Employment type: ");
		int empstatus=scan.nextInt();
		if (empstatus==1) {
			System.out.println("you are a Full time Employee");
			System.out.println("---------------------------");
			System.out.println("Enter Employee ID: ");
			fe.setEmpId(scan.nextInt());
			System.out.println("Enter Employee First Name: ");
			fe.setFirstName(scan.next());
			System.out.println("Enter Employee Last Name: ");
			fe.setLastName(scan.next());
			System.out.println("Enter Employee Address: ");
			fe.setAddress(scan.next());
			System.out.println("Enter Employee Pincode: ");
			fe.setPincode(scan.next());
			System.out.println("Enter Employee Basic Salary: ");
			fe.setBasic(scan.nextDouble());
			System.out.println("Enter Employee Allowance: ");
			fe.setAllowance(scan.nextDouble());
			System.out.println("Enter Employee Deductions: ");
			fe.setDeductions(scan.nextDouble());
			double Sal=fe.calcSalary(fe);
			
			System.out.println("--------Result---------------");
			System.out.println("Employees' ID               : "+fe.getEmpId());
			System.out.println("Employees' First Name       : "+fe.getFirstName());
			System.out.println("Employees' Last Name        : "+fe.getLastName());
			System.out.println("Employees' Address          : "+fe.getAddress());
			System.out.println("Employees' Pincode          : "+fe.getPincode());
			System.out.println("Employees' Basic Salary     : "+fe.getBasic());
			System.out.println("Employees' Allowence        : "+fe.getAllowance());
			System.out.println("Employees' Deductions       : "+fe.getDeductions());
			System.out.println("Wmployees' Net Salary is    : "+ Sal);
			
			
			
			
			
		}
		else if (empstatus==2) {
			System.out.println("you are a Part time Employee");
			System.out.println("---------------------------");
			System.out.println("Enter Employee ID: ");
			pe.setEmpId(scan.nextInt());
			System.out.println("Enter Employee First Name: ");
			pe.setFirstName(scan.next());
			System.out.println("Enter Employee Last Name: ");
			pe.setLastName(scan.next());
			System.out.println("Enter Employee Address: ");
			pe.setAddress(scan.next());
			System.out.println("Enter Employee Pincode: ");
			pe.setPincode(scan.next());
			System.out.println("Enter Employee Basic Salary: ");
			pe.setBasic(scan.nextDouble());
			System.out.println("Enter Employee Allowance: ");
			pe.setAllowance(scan.nextDouble());
			System.out.println("Enter Employee Deductions: ");
			pe.setDeductions(scan.nextDouble());
			double Sal=pe.calcSalary(pe);
			System.out.println("---------Result------------");
			System.out.println("Employee ID          : "+pe.getEmpId());
			System.out.println("Employee First Name  : "+pe.getFirstName());
			System.out.println("Employee Last Name   : "+pe.getLastName() );
			System.out.println("Employee Address     : "+pe.getAddress());
			System.out.println("Employee Pincode     : "+pe.getPincode());
			System.out.println("Employee Basic Salary: "+pe.getBasic());
			System.out.println("Employee Allowence   : "+pe.getAllowance());
			System.out.println("Employee Deductions  : "+pe.getDeductions());
			System.out.println("your Net Salary is    : "+Sal);
			
	}
	}
}