package com.pack.program;

public class SwappingTwoNumbers {
	private int c;
	private int d;
	public String swapNumbers(int a,int b){
	c=a;
	d=b;
	c=c+d;
	d=c-d;
	c=c-d;
		return c+" "+d;
	}

}
