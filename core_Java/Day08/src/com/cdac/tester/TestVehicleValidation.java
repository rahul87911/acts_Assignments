package com.cdac.tester;

import java.time.LocalDate;
import java.util.Scanner;

import static com.cdac.utils.VehicleValidationRules.validateSpeed;
import static com.cdac.utils.VehicleValidationRules.validateLisence;
import static com.cdac.utils.VehicleValidationRules.validateFueltype;

public class TestVehicleValidation  {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){
			boolean exit=false;
			int choice;
			
			do {
			System.out.println("Welcome to Speed, Lisense and Engine Validator: ");			
			System.out.println("1: Validate Speed \n2: Validate Lisence \n3: Validate Engine \n4: Exit");
			choice=sc.nextInt();
			sc.nextLine();
			
			switch (choice) {
			case 1:
				   System.out.println("Enter Speed in Kmph:");
				   validateSpeed(sc.nextInt());
				break;
            
			case 2:
				   System.out.println("Enter Expiry Date on Lisence in YYYY-MM-DD :");
				   String date= sc.nextLine();
				   LocalDate parsedDate = LocalDate.parse(date);
				   validateLisence(parsedDate);
				break;
			
			case 3:
				   System.out.println("Enter Engine Fueltype:");
				   validateFueltype(sc.nextLine());
				break;
			case 4:
				   System.out.println("Exiting...");
				   exit=true;
				break;
			default:
				System.out.println("Invalid Input !");
				break;
			}
			}while(!exit);
		} catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
}

