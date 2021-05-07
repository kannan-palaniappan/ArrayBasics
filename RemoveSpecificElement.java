package com.java.arraybasics;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveSpecificElement {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int remove=24;
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int position=0;
		for(int i=0;i<n;i++) {
			if(a[i]==remove) {
				position=i;
			}
		}
		
		for(int i=position;i<a.length-1;i++) {
			a[i]=a[i+1];
		}
		System.out.println(Arrays.toString(a));
	}
}
