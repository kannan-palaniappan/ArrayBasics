package com.java.arraybasics;

import java.util.Scanner;

public class EqualityOfTwoArrays {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int array1[]=new int[n];
		int array2[]=new int[n];
		
		for(int i=0;i<n;i++) {
			array1[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			array2[i]=sc.nextInt();
		}
		
		boolean isTrue=false;
         for(int i=0;i<n;i++) {
        	 if(array1[i]==array2[i]) {
        		 isTrue=true;
        	 }
         }
         if(isTrue) {
        	 System.out.println("two arrays are equal");
         }
         else {
        	 System.out.println("not equal");
         }
		
	}

}
