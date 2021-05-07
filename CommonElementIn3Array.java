package com.java.arraybasics;

public class CommonElementIn3Array {
	
	public static void main(String args[]) {
		int array1[]=new int[] {2,4,8};
		int array2[]=new int[] {2,3,4,8,10,16};
		int array3[]=new int[] {4,8,14,40};
		int array4[]=new int[2];
		
		for(int i=0;i<array1.length;i++) {
			for(int j=0;j<array2.length;j++) {
				for(int k=0;k<array3.length;k++) {
					if(array1[i]==array2[j]&&array2[j]==array3[k]) {
						array4[k]=array3[k];
					}
				}
			}
		}
		
		for(int i=0;i<array4.length;i++) {
			System.out.println(array4[i]);
		}
		
	}

}
