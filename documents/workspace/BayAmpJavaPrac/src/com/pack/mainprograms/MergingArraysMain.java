package com.pack.mainprograms;

import com.pack.program.MergingTwoSortedArrays;

public class MergingArraysMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergingTwoSortedArrays a = new MergingTwoSortedArrays();
		int[] arrayA = { 23, 47, 81, 95 };
	    int[] arrayB = { 7, 14, 39, 55, 62, 74 };
	    int[] arrayC = new int[10];

	    a.merge(arrayA, arrayA.length, arrayB, arrayB.length, arrayC);
	    for (int i : arrayC) {
	      System.out.println(i);

	    }

	}

}
