package com.pack.mainprograms;

import com.pack.program.FibinocciApi;

public class FibinocciMain {

	public static void main(String[] args) {
		// TODO FibinocciApi Auto-generated method stub
		FibinocciApi f= new FibinocciApi();
		for(int i=1;i<=8;i++)
		System.out.println(f.fibinoci(i));
	}

}
