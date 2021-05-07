package com.java.arraybasics;

public class Without0AndMinus1 {
	
	public static void main(String args[]) {
		int a[]=new int[] {1,2,3,4,5,6,};
		boolean isTrue=true;
		for(int i:a) {
			if(i==0||i==-1) {
				isTrue=false;
			}
		}
		System.out.println(isTrue);
	}

}
