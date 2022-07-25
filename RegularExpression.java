package com.simplilearn.demo;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
	public class RegularExpression {
		public static void main(String args[]) {
			// print only the uppercse letter in the string
			String regex = "\\b\\p{javaUpperCase}+\\b";
			String s="VYSHNA and RANGA both are good FRIENDS AND we have good FRIENDSHIP";
			 Pattern pattern = Pattern.compile(regex);
			 Matcher matcher = pattern.matcher(s);
			 while (matcher.find()) {            
			        System.out.println(matcher.group());
			    }
			 
			
		}

	
}
