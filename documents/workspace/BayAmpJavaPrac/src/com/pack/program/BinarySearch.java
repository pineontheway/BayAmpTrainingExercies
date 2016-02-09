package com.pack.program;

public class BinarySearch {
	private int position;
	public void binarysearch(int array[],int lb,int ub,int key){
		position=(lb+ub)/2;
		while((array[position]!=key)&&(lb<=ub)){
			if(array[position]>key)
				ub=position-1;
			else
				lb=position+1;
			position=(lb+ub)/2;
		}
		if(lb<=ub)
			System.out.println("Key found");
		else
			System.out.println("element not found");
	}
	

}
