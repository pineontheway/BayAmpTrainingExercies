package com.pack.program;

public class FactorialApi {
	private int number;
	public FactorialApi(int number){
		this.number=number;
	}
	public int factorail(){
		int facto=1;
		if(number==0){
			return 1;
		}else{
		for(int i=number;i>0;i--){
			facto=facto*i;
		}
		return facto;
		}
	}

}
