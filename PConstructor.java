package com.simplilearn.demo;


	
	class vyshu{
		
		vyshu(){
			System.out.println("zero argument passed");
		}
		vyshu(String v,String r){
			String a=v;
			String b=r;
			System.out.println("i love "+a+" and "+b);
		}
		
	}
	public class PConstructor {
		public static void main(String args[]) {
			vyshu v=new vyshu();
			v = new vyshu("myfather","mymother");
		}

	

}
