package com.tester;
import java.util.Scanner;

import com.developers.geometry.*;

public class TestPoints {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("How many Points you want to enter:");
		Point2D[] points = new Point2D[sc.nextInt()];
		
		 int i=0;
		 int option;
		 	 
		do
		{
			 System.out.println("Options:");
	            System.out.println("1. Plot a point");
	            System.out.println("2. Display x,y coordinates of all points");
	            System.out.println("3. Exit");
	            System.out.print("Enter your choice: ");
	            option = sc.nextInt();
                   if(i==points.length && option==1)
                   {
                	   System.out.println("You have already entered "+points.length+" points !!");
                	   continue;
                   }
                	          	   
	            switch (option) {
                case 1:
                	System.out.println("Enter the X & Y Co-ordinates of "+" "+(i+1)+" "+"point");
        			points[i] = new Point2D(sc.nextDouble(),sc.nextDouble());
        			
        			if(i!=0)
        			{
        				if(points[i].isEqual(points[i-1]))
        				{
        					System.out.println("Point Already Exists !!");
        					option=3;
        				}
        				
        			}
        				
        			i++;
                    break;
                case 2:
            		for(Point2D p:points)
            		{
            			System.out.println(p.show());
            		}

                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }		
			
		}while( option !=3);
	
	
       sc.close();
	}

}
