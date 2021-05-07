package com.java.arraybasics;

public class FourElementSum {
	
	public static void main(String args[]) {
		
		int a[]=new int[] {10,20,30,40,1,2};
		int s=53;
		int n=a.length;
		
		for(int i=0;i<n-3;i++) {
			for(int j=i+1;j<n-2;j++) {
				for(int k=j+1;k<n-1;k++) {
					for(int l=k+1;l<n;l++) {
						if(a[i]+a[j]+a[k]+a[l]==s) {
							System.out.println(a[i]+" + "+a[j]+" + "+a[k]+" + "+a[l]+" = "+s);
						}
					}
				}
			}
		}
	}

}
