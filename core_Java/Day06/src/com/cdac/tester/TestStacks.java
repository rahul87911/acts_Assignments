package com.cdac.tester;
import java.util.Scanner;

import com.cdac.core.*;
import com.cdac.impl.*;
import com.cdac.inter.Stack;

public class TestStacks {

	private static Stack chosenStack;
	public static void main(String[] args) {
		
	        Scanner scanner = new Scanner(System.in);
	        int choice;
	        boolean stackChosen = false;

	        do {
	            System.out.println("Menu:");
	            System.out.println("1 -- Choose Fixed Stack");
	            System.out.println("2 -- Choose Growable Stack");
	            System.out.println("3 -- Push data");
	            System.out.println("4 -- Pop data & display");
	            System.out.println("5 -- Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    chosenStack = new FixedStack();
	                    stackChosen = true;
	                    System.out.println("Fixed Stack chosen.");
	                    break;
	                case 2:
	                    chosenStack = new GrowableStack();
	                    stackChosen = true;
	                    System.out.println("Growable Stack chosen.");
	                    break;
	                case 3:
	                    if (!stackChosen) {
	                        System.out.println("No stack chosen! Please select a stack first.");
	                        break;
	                    }
	                    System.out.println("Enter customer details:");
	                    System.out.print("ID: ");
	                    int id = scanner.nextInt();
	                    scanner.nextLine(); // Consume newline
	                    System.out.print("Name: ");
	                    String name = scanner.nextLine();
	                    System.out.print("Address: ");
	                    String address = scanner.nextLine();
	                    chosenStack.push(new Customer(id, name, address));
	                    break;
	                case 4:
	                    if (!stackChosen) {
	                        System.out.println("No stack chosen! Please select a stack first.");
	                        break;
	                    }
	                    Customer poppedCustomer = chosenStack.pop();
	                    if (poppedCustomer != null) {
	                        System.out.println("Popped customer details: " + poppedCustomer);
	                    }
	                    break;
	                case 5:
	                    System.out.println("Exiting...");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please enter a valid option.");
	            }
	        } while (choice != 5);

	        scanner.close();

	}

}
