package com.java.arraybasics;

import java.util.Scanner;

public class FindDuplicateElement {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if((a[i]==a[j])&&(i!=j)) {
					System.out.println(a[j]);
				}
			}
		}
	}

}
