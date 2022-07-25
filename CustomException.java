package com.simplilearn.demo;

public class CustomException {
 
	 static void vyshna() throws ArithmeticException
	  {  
	    System.out.println("Inside vyshna function");
	    throw new ArithmeticException("hi hello how are you.............!");
	  }

	  public static void main(String args[])
	  {
	    try
	    {
	      vyshna();
	    }
	    catch(ArithmeticException e){
	      System.out.println("caught" + e);
	    }
	    finally
	    {
	      System.out.println("finally block is  executed.");
	    }
	  }
}
