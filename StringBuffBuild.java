package com.simplilearn.demo;

public class StringBuffBuild {
	
	public static void main(String[] args) {
	
		String sa="Vyshna and Ranga both are best friends";
		System.out.println(sa.length());
		//sub string
		System.out.println(sa.substring(0,15));
		//equals
		String str1="Hello";
		String str2="hello";
		System.out.println(str1.equals(str2));
		//lower case
		String str3="HELLO";
		System.out.println(str3.toLowerCase());
		//replace
		String str4="Kalyan";
		System.out.println(str4.replace("v", "r"));
		
		
		//String builder
		StringBuilder sr=new StringBuilder(sa);
		sr.append(" And also a good behaviour.....!");
		System.out.println(sr);
		
		//string buffer
		StringBuffer rs=new StringBuffer(sa);
		rs.reverse();
		System.out.println(rs);
		
		

	}


}
