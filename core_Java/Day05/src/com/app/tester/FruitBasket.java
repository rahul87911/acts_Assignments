package com.app.tester;

import java.util.Scanner;

import com.app.fruits.*;

public class FruitBasket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Basket Size for fruits :");
		
		Fruits[] fruit=new Fruits[sc.nextInt()];
		
		int counter =0;
		boolean exit = false;
		
		while(!exit)
		{
			 System.out.println("Choose fruit to add:");
	            System.out.println("1. Mango");
	            System.out.println("2. Orange");
	            System.out.println("3. Apple");
	            System.out.println("4. Display all Fruits in Basket");
	            System.out.println("5. Display Name, Color, Weight & Taste of all fresh fruits , in the Basket");
	            System.out.println("6. Mark a fruit in a basket , as stale");
	            System.out.println("7. Mark all sour fruits stale");
	            System.out.println("8. Want Specific functionality of fruit");
	            System.out.println("9. Exit");
	            
	            int choice = sc.nextInt();
	            
	            switch(choice) {
	            
	            case 1:
	            	   if(counter<fruit.length) {
	            	   String name="Mango";
	            	   System.out.println("Enter color of Mango :");
	            	   String color=sc.nextLine();
	            	   sc.nextLine();
	            	   System.out.println("Enter the weight of Mango :");
	            	   double weight=sc.nextDouble();
	            	   
	            	   fruit[counter]=new Mango(color,weight,name,true);
	            	   counter++;
	            	   System.out.println("Mango added in Basket !");
	            	   } else {
						System.out.println("Basket is full !");
					}
	                   break;            
	            case 2:
	            	   if(counter<fruit.length) {
	            	   String name1="Orange";
	            	   System.out.println("Enter color of Orange :");
	            	   String color1=sc.nextLine();
	            	   sc.nextLine();
	            	   System.out.println("Enter the weight of Orange :");
	            	   double weight1=sc.nextDouble();
	            	   
	            	   fruit[counter]=new Orange(color1,weight1,name1,true);
	            	   counter++;
	            	   System.out.println("Orange added in Basket !");
	            	   }else {
	            		   System.out.println("Basket is full !");
	            		   }
	                   break;
	            case 3:
	            	   if(counter<fruit.length) {
	            	   String name2="Apple";
	            	   System.out.println("Enter color of Apple :");
	            	   String color2=sc.nextLine();
	            	   sc.nextLine();
	            	   System.out.println("Enter the weight of Apple :");
	            	   double weight2=sc.nextDouble();
	            	   
	            	   fruit[counter]=new Apple(color2,weight2,name2,true);
	            	   counter++;
	            	   System.out.println("Apple added in Basket !");
	            	   }else {
	            		   System.out.println("Basket is full !");
	            	   }
	                   break;
	            case 4:
	            	   System.out.println("Fruits in the basket:");
	                   for (Fruits f : fruit) {
	                    System.out.println(f.getName());
	                }
	            	   break;
	            case 5:
	            	   System.out.println("Details of fresh fruits in the basket:");
	                   for (Fruits f : fruit) {
	                     if (f.getFresh()) {
	                    	 if(f instanceof Mango )
	                         System.out.println("Name: " + f.getName() + ", Color: " + f.getColor() + ", Weight: " + f.getWeight() + ", Taste: " +  ((Mango)f).taste());
	                    	 else if(f instanceof Apple)
	                    	 System.out.println("Name: " + f.getName() + ", Color: " + f.getColor() + ", Weight: " + f.getWeight() + ", Taste: " +  ((Apple)f).taste());
	                    	 else
	                    	 System.out.println("Name: " + f.getName() + ", Color: " + f.getColor() + ", Weight: " + f.getWeight() + ", Taste: " +  ((Orange)f).taste());
	                     }
	                 }
	            	   break;
	            case 6:
	            	   System.out.print("Enter index to mark a fruit as stale: ");
	                   int index = sc.nextInt();
	                   if (index >= 0 && index < fruit.length) {
	                      fruit[index].setFresh(false);
	                   } else {
	                      System.out.println("Invalid index!");
	                   }
	            	   break;
	            case 7:
	            	   for (Fruits f : fruit) {
	                    if (f instanceof Orange) {
	                        f.setFresh(false);
	                    }
	                }
	            	   break;
	            case 8:
	            	 System.out.println("Enter index to invoke specific functionality (pulp / juice / jam): ");
	                 index = sc.nextInt();
	                 if (index >= 0 && index < fruit.length) {
	                     if (fruit[index] instanceof Mango) {
	                         ((Mango) fruit[index]).pulp();
	                     } else if (fruit[index] instanceof Orange) {
	                         ((Orange) fruit[index]).juice();
	                     } else if (fruit[index] instanceof Apple) {
	                         ((Apple) fruit[index]).jam();
	                     }
	                 } else {
	                     System.out.println("Invalid index!");
	                 }
	            	   break;
	            case 9:
	            	   System.out.println("Exiting Application...");
	            	   exit=true;
	            	   break;
	            default:
	            	System.out.println("Invalid Input");
	         	
	            }
	            
		}
		
		
		sc.close();
	}

}
