package com.pack.program;

public class SumOfAnyTwoNumbersinArrayEqualtoGivenNumber {
	public boolean sum(int[] arr,int key){
		for(int i=0;i<arr.length-1;i++){
			for(int j=i;j<arr.length-1;j++){
				if(arr[j]+arr[j+1]==key)
					return true;
			}
		}
		return false;
	}

}
