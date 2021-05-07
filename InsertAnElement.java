package com.java.arraybasics;

import java.util.Arrays;
import java.util.Scanner;

public class InsertAnElement {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		int insert=35;
		int position=2;
		
		for(int i=a.length-1;i>position;i--) {
			a[i]=a[i-1];
		}
		a[position]=insert;
		
		System.out.println(Arrays.toString(a));
	}

}
