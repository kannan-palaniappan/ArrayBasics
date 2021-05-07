package com.java.arraybasics;

public class SumOfTwoElements {
	
	public static void main(String args[]) {
		int a[] = new int[] {1,2,4,5,6};
		int target=6;
		
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]+a[j]==target) {
					System.out.println(a[i]+" + "+a[j]+" = "+target);
				}
			}
		}
	}

}
