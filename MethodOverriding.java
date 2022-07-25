package com.simplilearn.demo;


	class fruit{

		public void vyshna() {
			System.out.println("Hii this is Vyshna ");
		}
	}
	class mango extends fruit{
		public void vyshna() {
			super.vyshna();
			System.out.println("I am buying a mango");
		}
	}
	class apple extends fruit{
		public void vyshna() {
			super.vyshna();
			System.out.println("I am buying a apple");
		}
	}

	public class MethodOverriding {
		public static void main(String[] args) {
			mango h=new mango();
			apple b=new apple();
			h.vyshna();
			b.vyshna();
			
		

	}


}
