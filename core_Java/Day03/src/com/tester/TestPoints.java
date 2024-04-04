package com.tester;
import java.util.Scanner;

import com.developers.geometry.*;

public class TestPoints {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("How many Points you want to enter:");
		Point2D[] points = new Point2D[sc.nextInt()];
		
		 int i=0;
		
		do
		{
		
			System.out.println("Enter the X & Y Co-ordinates of "+" "+(i+1)+" "+"point");
			points[i] = new Point2D(sc.nextDouble(),sc.nextDouble());
		
			i++;
		}while(i<points.length);
	
	
		
		
		for(Point2D p:points)
		{
			System.out.println(p.show());
		}

	}

}
