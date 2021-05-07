package com.java.arraybasics;

public class ZerosOnLeftSide {
	
	public static void main(String args[]) {
		int a[] = new int[] {0,1,0,1,1,0,1,1,0,0,1};
		int index=0;
		for(int i=1;i<a.length-1;i++) {
			if(a[i]==0) {
				a[index++]=a[i];
			
			}
		}
	   while(index<a.length) {
		   a[index++]=1;
	   }
	   
	   for(int k=0;k<a.length;k++) {
		   System.out.print(a[k]+" ");
	   }
	}

}
