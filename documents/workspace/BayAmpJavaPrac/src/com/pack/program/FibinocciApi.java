package com.pack.program;

public class FibinocciApi {
	
	public int fibinoci(int number){
		if(number==1) return 0;
		if(number<=3) return 1;
		int fibi= fibinoci(number-1)+fibinoci(number-2);
		return fibi;
	}
}
