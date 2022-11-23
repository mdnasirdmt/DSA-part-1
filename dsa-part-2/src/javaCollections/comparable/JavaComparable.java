package javaCollections.comparable;

import java.util.ArrayList;
import java.util.Collections;


public class JavaComparable {

	public static void main(String[] args) {

		ArrayList<Student> list = new ArrayList<>();

		list.add(new Student(201, "Nasir", 450));
		list.add(new Student(101, "Amit", 550));
		list.add(new Student(401, "Nasir", 450));
		list.add(new Student(201, "shahrukh", 600));
		list.add(new Student(301, "vaibhab", 650));
		list.add(new Student(102, "gupta ji", 500));
		Collections.sort(list);
		System.out.println(list);

	}

}
