package com.pack.program;

public class PrimeNumberOrNot {
	private int number;
	public PrimeNumberOrNot(int n){
		this.number=n;
	}
	public boolean checkPrime(){
		int count=0;
		
		for(int i=2;i<=Math.sqrt(number);i++){
			if(number%i==0)
				count++;
			i++;
		}
		if(count!=0){
			return false;
		}else{
			return true;
		} 
	}

}
