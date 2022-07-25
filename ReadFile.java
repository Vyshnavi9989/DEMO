package com.simplilearn.demo;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {
		 public static void main(String args[])throws IOException {
			 FileInputStream fin=new FileInputStream("my file.txt");
			 System.out.println("file content is:");
			 
			 
			 
			 int ch;
			 while((ch=fin.read())!= -1) {
				 System.out.println((char)ch);
		 }
			 fin.close();

	}
	
}
