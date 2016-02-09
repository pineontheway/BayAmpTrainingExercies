package com.pack.program;

public class Student {
	private String name;
	private String id;
	private String college;
	private String degree;
	
	public Student(String a,String b,String c,String d){
		name=a;
		id=b;
		college=c;
		degree=d;
	}
	public String toString(){
		return "name: "+name+" id: "+"id"+" college: "+college+" degree: "+degree;
	}
	
}
