package com.java.arraybasics;

import java.util.Scanner;

public class AddTwoMatrices {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the rows");
		int m=sc.nextInt();
		System.out.println("enter the col");
		int n=sc.nextInt();
		int a[][]=new int[m][n];
		int b[][]=new int[m][n];
		int sum[][]=new int[m][n];
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				b[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				sum[i][j]=a[i][j]+b[i][j];
			}
		}
		
		
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
}
