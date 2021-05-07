package com.java.arraybasics;

public class MissingNumber {
	
	public static void main(String args[]) {
		int number[]=new int[] {1,2,3,4,6,7};
		
		int totalnumber=7;
		int expectNumber=totalnumber*((totalnumber+1)/2);
		int sum=0;
		for(int i:number) {
			sum+=i;
		}
		System.out.println(expectNumber-sum);
	}

}
