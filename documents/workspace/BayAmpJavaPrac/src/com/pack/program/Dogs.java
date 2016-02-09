package com.pack.program;

public class Dogs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayPractice[] dog= new ArrayPractice[5];
		String[] names={"sabari","tommy","julie","phantom","bony"};
		String[] breed={"labrador","boxer","pomerian","sonthing","baddy"};
		for(int i=0;i<dog.length;i++){
			dog[i]=new ArrayPractice();
			dog[i].name=names[i];
			dog[i].breed=breed[i];
		}
		for(int i=0;i<dog.length;i++){
			System.out.println("name :"+dog[i].name+" breed: "+dog[i].breed);
		}
		String apple="Apple";
		String apple1="Apple";
		String apple2= new String("Apple");
		if(apple==apple1){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
		if(apple==apple2){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
		if(apple.equals(apple2)){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
	}

}
