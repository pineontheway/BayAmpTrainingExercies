package com.pack.mainprograms;

import com.pack.program.FactorialApi;

public class FactorialMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactorialApi f = new FactorialApi(0);
		int factorial = f.factorail();
		System.out.println("Factorial: "+factorial);
	}

}
