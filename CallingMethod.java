package com.simplilearn.demo;

	class methodstatic{
		static void vyshna() {
			System.out.println("I am inside the vyshna() method and i am going to call kalyan method");
			kalyan();
		}
		static void kalyan() {
			System.out.println("I am inside the kalyan() method i am going to call happy method");
			happy();
		}
		static void happy() {
			System.out.println("I am calling happy() method");
		}
	}
	public class CallingMethod {
		public static void main(String[] args) {
			methodstatic s=new methodstatic();
			s.vyshna();

		}

}
