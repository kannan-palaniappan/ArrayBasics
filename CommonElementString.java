package com.java.arraybasics;

import java.util.Scanner;

public class CommonElementString {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s1[]=new String[n];
		String s2[]=new String[n];
		
		
		for(int i=0;i<n;i++) {
			s1[i]=sc.nextLine();	
		}
		System.out.println("break");
		for(int i=0;i<n;i++) {
			s2[i]=sc.nextLine();	
		}
		
		for(int i=0;i<s1.length;i++) {
			for(int j=i+1;j<s2.length;j++) {
				if(s1[i].equals(s2[j])) {
					System.out.println(s2[j]);
				}
			}
		}
	}

}
