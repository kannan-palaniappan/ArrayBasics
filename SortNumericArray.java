package com.java.arraybasics;

import java.util.Arrays;
import java.util.Scanner;

public class SortNumericArray {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		
		
			System.out.println(Arrays.toString(a));
		
	}

}
