package com.java.arraybasics;

public class NumberOfEvenAndOdd {
	
	public static void main(String args[]) {
		
		int a[]=new int[] {5,7,2,4,9};
		int len=a.length;
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				count++;
			}
		}
		
		System.out.println("even count "+count);
		System.out.println("odd count "+(len-count));
	}

}
