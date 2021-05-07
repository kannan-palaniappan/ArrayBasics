package com.java.arraybasics;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
			
		}
		
	}

}
