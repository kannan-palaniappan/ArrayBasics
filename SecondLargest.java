package com.java.arraybasics;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			
		}
		
		Arrays.sort(a);
		
		int max=a[a.length-1];
		
		for(int j=a.length-2;j>=0;j--) {
			if(a[j]<max) {
				max=a[j];
				break;
			}
		}
		System.out.println(max);
		
	}

}
