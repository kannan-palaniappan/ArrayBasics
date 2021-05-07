package com.java.arraybasics;

import java.util.Arrays;

public class SmallestAndSecondSmallest {

	public static void main(String args[]) {
		int a[] = new int[] {5,7,-8,5,14,1};
		
		Arrays.sort(a);
		
		System.out.println("the smallest element is"+a[0]+" and second smallest element is "+a[1]);
	}
}
