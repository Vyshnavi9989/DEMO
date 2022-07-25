package com.simplilearn.demo;

	class overloding{
		public void vyshna(int a,int b) {
			int kal=a-b;
			System.out.println("subtraction  of two number:"+kal);
		}
		public void vyshna(int c,double d) {
			double kal=c*d;
			System.out.println("multiplication of two number"+kal);
		}
		
	}
	
	public class MethodOverloading {
		public static void main(String[] args) {
		
			overloding ol=new overloding();
	
			ol.vyshna(8, 3);
			ol.vyshna(6, 10.5);

		

	}

}
