package com.java.arraybasics;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumAndMinimum {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		
		System.out.println("Maximum "+a[a.length-1]);
		System.out.println("Minimum "+a[0]);
	}
	
}
