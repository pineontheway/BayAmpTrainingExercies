package com.pack.program;

public class College {
	public String collegeName;
	public String id;
	public College(String collegeName,String id){
		this.collegeName=collegeName;
		this.id=id;
	}
	public String getClgName(){
		return collegeName;
	}
	public String getClgId(){
		return id;
	}

}
