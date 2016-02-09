package com.pack.mainprograms;

import java.util.ArrayList;
import java.util.Iterator;

import com.pack.program.Student;

public class GenricePractice {

	public static void main(String[] args) {
		ArrayList<Student> stu= new ArrayList<Student>();
		Student stu1= new Student("vijay", "010119993", "sjsu", "masters");
		Student stu2= new Student("vinay", "010110000", "stanford", "masters");
		Student stu3= new Student("murali", "11111111", "mjsu", "masters");
		Student stu4= new Student("ajay", "22222222", "nlanda", "masters");
		stu.add(stu4);
		stu.add(stu3);
		stu.add(stu2);
		stu.add(stu1);
		//stu.addAll(stu);
		Iterator it=stu.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		int i= stu.indexOf(stu4);
		System.out.println("i"+i);
	}
}
