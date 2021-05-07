package com.java.arraybasics;

import java.util.Scanner;

public class RemoveDuplicateElement {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int a[]=new int[] {20,20,30,40,50,50,50};
		
		int count=1;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]!=a[i+1]) {
				count++;
			}
		}
		System.out.println(count);
		
		
		
	}

}
