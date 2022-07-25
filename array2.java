package com.simplilearn.demo;

public class array2 {
	static void vyshna( int a[]) {
		int min=a[0];
		for(int i=1;i<a.length;i++) {
			if(min>a[i])
				min=a[i];
				System.out.println("min value:"+min);
		}
	}
	public static void main(String args[]) {
		int arr[]= {19,64,100,95};
		vyshna(arr);
	}

}
