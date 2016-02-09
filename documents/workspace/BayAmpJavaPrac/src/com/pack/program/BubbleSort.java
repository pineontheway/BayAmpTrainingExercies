package com.pack.program;

public class BubbleSort {
	private int j=0;
	private boolean swapped=true;
	private int temp;
	
	public void sort(int[] arr){
		while(swapped){
		swapped=false;
		j++;
		for(int i=0;i<arr.length-j;i++){
			if(arr[i]>arr[i+1]){
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
				swapped=true;
			}
		}
	}
	for(int x=0;x<arr.length;x++)
	System.out.println(arr[x]);
  }
	

}
