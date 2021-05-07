package com.java.arraybasics;

public class MoveAllZeros {
	
	public static void main(String args[]) {
		int a[]=new int[] {1,2,0,3,0,4,0,6,5,0,7};
		
		int count=0;
		int len=a.length;
		
		for(int i=0;i<len;i++) {
			if(a[i]!=0) {
				a[count++]=a[i];
			}
		}
		
		while(count<len) {
			a[count++]=0;
		}
		
		for(int j=0;j<len;j++) {
			System.out.print(a[j]+" ");
		}
	}

}
