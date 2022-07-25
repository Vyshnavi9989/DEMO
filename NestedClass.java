package com.simplilearn.demo;



	class vyshna{
		String a="Vyshnavi";
		public void display() {
			System.out.println("I am in the outer class");
			
		}
		class ranga{
			String b= "Kalyan";
			public void dis() {
				System.out.println("I am in the inner class");
			}
			
		}
		
		
	}

	public class NestedClass {
		public static void main(String args[]) {
			vyshna v=new vyshna();
			vyshna.ranga vr=new vyshna().new ranga();
			v.display();
			vr.dis();

			System.out.println(v.a+" and "+vr.b+" both are good frinds.......!");
			
			

	}
}
