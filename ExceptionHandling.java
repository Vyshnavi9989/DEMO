package com.simplilearn.demo;

import java.util.Scanner;

public class ExceptionHandling {
	public static void main(String[] args) {
		 
		  float num1, num2, num3;
		 
		  Scanner input = new Scanner(System.in);
		  System.out.println("Enter the first element:");
		 
		  num1 = input.nextFloat();
		  
		  System.out.println("Enter the second element:");
		  num2 = input.nextFloat();
		 
		  // try block
		 
		  try {
		    num3  = num1 / num2;
		    System.out.println("num3 = " + num3);
		  }
		 
		  // catch block
		 
		  catch (ArithmeticException e) {
		    System.out.println("Exception caught: Division by zero."+e);
		  }
	}

}
