package com.java.arraybasics;

import java.util.Arrays;

public class AverageValue {
	
	public static void main(String args[]) {
		int a[]=new int[] {5,7,2,4,9};
		Arrays.sort(a);
		int sum=0;
		int count=0;
		for(int i=1;i<a.length-1;i++) {
			sum=sum+a[i];
			count++;
		}
		double average=(double)sum/count;
		System.out.println(average);
	}

}
