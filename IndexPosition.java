package com.java.arraybasics;

import java.util.Scanner;

public class IndexPosition {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int find=24;
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int position=0;
		for(int i=0;i<n;i++) {
			if(a[i]==find) {
				position=i;
			}
		}
		System.out.println("index position is:"+position);
		
		
	}
}
