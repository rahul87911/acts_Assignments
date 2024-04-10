package com.cdac.tester;
import java.util.Scanner;

import com.cdac.staff.*;
import com.cdac.utility.*;


public class EmpTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number of Employees:");
        Scanner sc= new Scanner(System.in);
		Employee emp[]=new Employee[sc.nextInt()];
		boolean exit=false;
		int counter=0;
		while(!exit)
		{
			System.out.println("1: Add Administrator");
			System.out.println("2: Add Sales Manager");
			System.out.println("3: Add Programmer");
			System.out.println("4: Calculate Total Salary");
			System.out.println("5: Exit");
			
			int choice=sc.nextInt();
			
			switch (choice) {
			case 1: {
			         if(counter<emp.length)
			         {
			        	System.out.println("(Enter Allowance, ID, Basic Salary, Name, DD-MM-YY"); 
			        	emp[counter]=new Administrator(sc.nextDouble(),sc.nextInt(),sc.nextDouble(),sc.nextLine(),sc.nextInt(),sc.nextInt(),sc.nextInt());
			        	System.out.println("Administrator Added");
			        	counter++;
			         }
			         else
			        	 System.out.println("Seats are full !");
			         
			          break ;
			}
			case 2: {
				if(counter<emp.length)
		         {
					System.out.println("(Enter Sales Target, Per Commission, EID, Basic Salary, Name, DD-MM-YY"); 
		        	emp[counter]=new SalesManager(sc.nextDouble(),sc.nextDouble(),sc.nextInt(),sc.nextDouble(),sc.nextLine(),sc.nextInt(),sc.nextInt(),sc.nextInt());
		        	System.out.println("Sales Manager Added");
		        	counter++;
		         }
		         else
		        	 System.out.println("Seats are full !");
		         
				
				break ;
			}
			case 3: {
				if(counter<emp.length)
		         {
					System.out.println("(Enter Extra Hours, Project Title, Charges Per Extra Hours, EID, Basic Salary, Name, DD-MM-YY"); 
		        	emp[counter]=new Programmer(sc.nextInt(),sc.nextLine(),sc.nextDouble(),sc.nextInt(),sc.nextDouble(),sc.nextLine(),sc.nextInt(),sc.nextInt(),sc.nextInt());
		        	System.out.println("Sales Programmer Added");
		        	counter++;
		         }
		         else
		        	 System.out.println("Seats are full !");
				break ;
				
			}
			case 4: {
				     double totalSalary=0;
				     double AdmSal=0;
				     double SaleSal=0;
				     double ProSal=0;
				     
				for(int i=0;i<emp.length;i++)
				{
					if(emp[i] instanceof Administrator)
					{
						AdmSal += ((Administrator) emp[i]).calculateSalary();
					 i++;
					}else if(emp[i] instanceof SalesManager)
					{
						 SaleSal+= ((SalesManager)emp[i]).calculateSalary();
						 i++;
					} else
					{
						 ProSal+= ((Programmer)emp[i]).calculateSalary();
						 i++;
					}
					
				}
				totalSalary=AdmSal+SaleSal+ProSal;
				System.out.println("Total Salary Amount : "+totalSalary);
				break ;
			}
			case 5: {
				System.out.println("Exiting Application...");
				exit=true;
				break ;
			}
			default:
			  System.out.println("Invalid Input"); 
			
			}
		}
		
		sc.close();
		
	}

}
