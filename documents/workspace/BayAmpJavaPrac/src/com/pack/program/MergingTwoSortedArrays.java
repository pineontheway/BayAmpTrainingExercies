package com.pack.program;

public class MergingTwoSortedArrays {
	  public void merge(int[] arrayA, int sizeA, int[] arrayB, int sizeB, int[] arrayC) {
		    int arrayAIndex = 0, arrayBIndex = 0, arrayCIndex = 0;

		    while (arrayAIndex < sizeA && arrayBIndex < sizeB)
		      if (arrayA[arrayAIndex] < arrayB[arrayBIndex])
		        arrayC[arrayCIndex++] = arrayA[arrayAIndex++];
		      else
		        arrayC[arrayCIndex++] = arrayB[arrayBIndex++];

		    while (arrayAIndex < sizeA)
		      arrayC[arrayCIndex++] = arrayA[arrayAIndex++];

		    while (arrayBIndex < sizeB)
		      arrayC[arrayCIndex++] = arrayB[arrayBIndex++];
		  }
		}