package javaCollections.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class JavaComparator {

	public static void main(String[] args) {

		ArrayList<Student> list = new ArrayList<>();

		list.add(new Student(201, "Nasir", 450));
		list.add(new Student(201, "Nasir", 450));
		list.add(new Student(101, "Amit", 550));
		list.add(new Student(401, "Nasir", 450));
		list.add(new Student(201, "shahrukh", 600));
		list.add(new Student(301, "vaibhab", 650));
		list.add(new Student(102, "gupta ji", 500));
//		Collections.sort(list, new SortByName());
//		System.out.print(list);

		Collections.sort(list, new SortByMark());
		System.out.println(list.toString());
	}

}

class SortByName implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {

		return o1.getName().compareTo(o2.getName());
	}

}

class SortByMark implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {

		return o1.getMarks() - o2.getMarks();

	}

}

