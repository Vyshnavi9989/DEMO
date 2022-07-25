package com.simplilearn.demo;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class createfile {

	public static void main(String []args) throws IOException {
		DataInputStream dis=new DataInputStream(System.in);
		FileOutputStream fout=new FileOutputStream("my file.txt", true);
		BufferedOutputStream bout=new BufferedOutputStream(fout,1024);
		System.out.println("enter text");
		char ch;
		while((ch=(char)dis.read())!='@') {
			
		}
		bout.write(ch);
	
		
		bout.close();			
	}

}
