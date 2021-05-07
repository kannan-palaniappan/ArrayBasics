package com.java.arraybasics;

import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallest {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			
		}
		
		Arrays.sort(a);
		
		int min=a[0];
		
		for(int j=1;j<n;j++) {
			if(a[j]>min) {
				min=a[j];
				break;
			}
		}
		
		System.out.println(min);
	}
}
