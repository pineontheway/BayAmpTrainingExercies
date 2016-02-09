package com.pack.program;

public class ArraysPractice {
	private int size;
	private int count=0;
	private int[] array;
	private int i;
	public ArraysPractice(int size){
		this.size=size;
		array=new int[size];
	}
	public void addElement(int num){
		array[count]=num;
		count++;
	}
	public boolean searchElement(int searchnumber){
		for(int i=0;i<array.length;i++){
			if(array[i]==searchnumber) return true;
		}
		return false;
	}
	public void deleteElement(int number){
		for(int i=0;i<array.length;i++){
			if(array[i]==number) 
				break;
		}
		for(int k=i;k<array.length;k++)
			array[k]=array[k+1];
	}
	

}
