package com.java.arraybasics;

public class SpecifiedElement {
	
	public static void main(String args[]) {
		int a[]=new int[] {77,77,65,65,65,77};
		
		boolean isTrue=true;
		
		for(int i:a) {
			if(i!=77&&i!=65) {
				isTrue=false;
			}
		}
		if(isTrue) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}

}
