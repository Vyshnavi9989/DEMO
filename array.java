package com.simplilearn.demo;

public class array {
	public static void main(String args[]) {
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("MULTIDIMENTIONAL ARRAY:");
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++)
				//System.out.println("MULTIDIMENTIONAL ARRAY:");
				System.out.println(arr[i][j]+"");

			System.out.println();
		}
	}


}
