package com.java.arraybasics;

public class SumOf10 {
	
	public static void main(String args[]) {
		int a[]=new int[] {10,77,10,54,-11,10};
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==10) {
				count++;
			}
		}
		
		if(count*10==30) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}

}
