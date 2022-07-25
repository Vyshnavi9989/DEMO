package com.simplilearn.demo;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Scanner;
	public class filehandling {	  
		public static void mian(String args[]) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Choose option to perform mode operations: \nw-->For write mode \nr--->for read mode  \n a--->for append mode ");
			String s=sc.nextLine();
			if(s.equals("r"))
			{
				new FReading();
			}
			else if(s.equals("w")||s.equals("a"))
			{
				fwrite(s);
			}
			else
				System.out.println("sorry ,better luck next time");
			sc.close();
		}

		public static void fwrite(String s) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			try 
			{
				String rs="";
				File f= new File("ram.txt");
				BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
				FileWriter f0 =null;
				if(s.equals("w")) 
				{
					f0=new FileWriter(f,false);
					System.out.println("Write 'stop' when you finish writing file ................");
					while(!(rs=bf.readLine()).equalsIgnoreCase("stop")){
	                    f0.write(rs + System.getProperty("line.separator"));
	                    
	                }
					sc.close();
				}
				else {
					f0 = new FileWriter(f,true);
	                System.out.println("Write 'stop' when you finish appending file........ ");
	                while(!(rs=bf.readLine()).equalsIgnoreCase("stop")){
	                    f0.append(rs+ System.getProperty("line.separator"));
	                }
	            }
	            f0.close();
					
			}
			catch(Exception e){
	            System.out.println("Error : " );
	            e.printStackTrace();
		}

	}
	}
	class FReading {
	    public static String str="";
	    
	    public FReading() {
	        
	        try{
	            File file=new File("ram.txt");
	            if(! file.exists())
	            file.createNewFile();
	            FileReader fl=new FileReader(file);
	            BufferedReader bf=new BufferedReader(fl);
	            while((str=bf.readLine())!=null){
	                System.out.println(str);
	            }
	            fl.close();
	            }catch(Exception e){
	            System.out.println("Error : " );
	            e.printStackTrace();
	        }
	    }
	}



