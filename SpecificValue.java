package com.java.arraybasics;

import java.util.Scanner;

public class SpecificValue {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int find=24;
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		boolean isTrue=false;
		
		for(int i=0;i<n;i++) {
			if(a[i]==find) {
				isTrue=true;
			}
		}
		System.out.println(isTrue);
		
	}

}
