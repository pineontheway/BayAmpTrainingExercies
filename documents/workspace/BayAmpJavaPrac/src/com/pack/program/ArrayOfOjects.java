package com.pack.program;

public class ArrayOfOjects {
	private String streetname;
	private String city;
	private int pincode;

	public ArrayOfOjects(String streetname,String city,int pincode){	
		this.city=city;
		this.streetname=streetname;
		this.pincode=pincode;
	}
	public void print(){
		System.out.println("street: "+streetname+"city: "+city+" Pincode: "+pincode);
	}
}
