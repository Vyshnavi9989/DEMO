package com.simplilearn.demo;

public class typeCasting {
public static void main(String args[]) {
		
		System.out.println("Implicit Type Conversion:");
		char c='V';
		System.out.println("char = "+c);
		int c1=c;
		System.out.println("integer ="+c1);
		float c2=c;
		System.out.println("float ="+c2);
		double c3=c;
		System.out.println("double ="+c3);
		System.out.println();
		
		//explicit type converstion
		System.out.println("Explicit Conversion");
		double d=86.0;
		System.out.println("double value:"+d);
		float f=(float)d;
		System.out.println("float value="+f);
		long l=(long)d;
		System.out.println("long value="+l);
		int i=(int)d;
		System.out.println("int value="+i);
		short s=(short)d;
		System.out.println("short value="+s);
		byte b=(byte)d;
		System.out.println("byte:"+b);
		char ch=(char)d;
		System.out.println("char="+ch);
		
	}


}
