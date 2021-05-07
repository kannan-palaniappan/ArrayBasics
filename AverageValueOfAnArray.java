package com.java.arraybasics;

import java.util.Arrays;
import java.util.Scanner;

public class AverageValueOfAnArray {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int sum=0;
		
		for(int i=0;i<n;i++) {
			sum+=a[i];
		}
		System.out.println(sum);
		double avg=sum/a.length;
		System.out.println(avg);
		
	}

}
