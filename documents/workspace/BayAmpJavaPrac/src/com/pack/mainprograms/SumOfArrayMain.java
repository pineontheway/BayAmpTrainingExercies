package com.pack.mainprograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.pack.program.SumOfAnyTwoNumbersinArrayEqualtoGivenNumber;

public class SumOfArrayMain {

	public static void main(String[] args) {
		SumOfAnyTwoNumbersinArrayEqualtoGivenNumber s = new SumOfAnyTwoNumbersinArrayEqualtoGivenNumber();
		int[] a = { 2, 3, 4, 5, 6 };
		boolean result = s.sum(a, 11);
		if (result == true)
			System.out.println("found");
		else
			System.out.println("not found");

		Map<City, String> mapa = new HashMap<>();
		City c1 = new City("abc");
		City c2 = new City("abc");
		City c3 = new City("abcddd");
		mapa.put(c1, "k");
		mapa.put(c2, "k  ");
		mapa.put(c3, "k");

		System.out.println(mapa.size());

		String name = "abcd";

//		new Thread(run() -> System.out.println("New thread executed")).start();
		Set<Integer> se = new HashSet<>();
		se.add(new Integer(72));
		int j = 0;
		for(int i=0; i<100; i++) j = j++;
		System.out.println(j);
		
	}
	// public static enum Selection{
	// X(true),
	// Y(false),
	// Z(true);
	//
	// Selection() {
	// }
	//
	// private boolean correct;
	//
	// public void setCorrect(boolean correct){
	// this.correct = correct;
	// }
	// }

}

class City {
	String name;

	City(String n) {
		name = n;
	}

	public boolean equals(Object o) {
		return ((City) o).name == this.name;
	}

	public int hashCode() {
		return -1;
	}
}
