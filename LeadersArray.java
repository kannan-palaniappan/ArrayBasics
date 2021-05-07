package com.java.arraybasics;

public class LeadersArray {
	
	public static void main(String args[]) {
		int a[] = new int[] {10,9,14,23,15,0,9};
		int size=a.length;
		
		for(int i=0;i<size;i++) {
			int j;
			for( j=i+1;j<size;j++) {
				if(a[i]<=a[j]) {
					break;
				}
				
			}
			if(j==size) {
				System.out.print(a[i]+" ");
			}		
		}
	}

}
