package com.java.arraybasics;

import java.util.Arrays;

public class DiffOfLargestAndSmallest {
	
	public static void main(String args[]) {
        int a[]=new int[] {4,7,8,2,9,3};
        
        Arrays.sort(a);
        
        System.out.println(a[a.length-1]-a[0]);
	}

}
