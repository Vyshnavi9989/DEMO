package com.simplilearn.demo;

public class trycatch {
	public int[] arr = new int[10];

	  public void writeList() {

	    try {
	      arr[10] = 11;
	    }
	    
	    catch (NumberFormatException e1) {
	      System.out.println("ram moahn------> " + e1.getMessage());
	    }
	    
	    catch (IndexOutOfBoundsException e2) {
	      System.out.println("siri---------------> " + e2.getMessage());
	    }

	  }
}

class Main {
	  public static void main(String[] args) {
	    trycatch list = new trycatch();
	    list.writeList();
	  }
}
