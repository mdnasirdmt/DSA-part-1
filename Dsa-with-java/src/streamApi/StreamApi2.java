package streamApi;

import java.util.ArrayList;

public class StreamApi2 {

	public static void main(String[] args) {


		ArrayList<Integer> i = new ArrayList<>();

		i.add(10);
		i.add(15);
		i.add(20);
		i.add(25);
		
		i.stream().forEach(i1-> System.out.println(i1));
		i.stream().forEach(i1-> System.out.println(i.toString()));
		
		
		/////////////////////////////////////

		ArrayList<Student> students = new ArrayList<>();

		students.add(new Student("Nasir", 101));
		students.add(new Student("Amit", 102));
		students.add(new Student("Gupta", 103));
		students.add(new Student("Manoj", 104));
		students.add(new Student("Shahrukh", 105));

//		System.out.println(students);

		students.stream().forEach(s -> System.out.println(s.name + " " + s.id));

	}



}

class Student {

	String name;
	Integer id;

	public Student() {

	}

	public Student(String name, Integer id) {
		super();
		this.name = name;
		this.id = id;
	}

}
