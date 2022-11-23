package streamApi;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class StreamApi2 {

	public static void main(String[] args) {


		ArrayList<Integer> i = new ArrayList<>();

		i.add(10);
		i.add(15);
		i.add(20);
		i.add(25);
		
//		i.stream().forEach(i1-> System.out.println(i1));
//		i.stream().forEach(i1-> System.out.println(i.toString()));
		
		
		/////////////////////////////////////

		ArrayList<Student> students = new ArrayList<>();

		students.add(new Student("Nasir", 101));
		students.add(new Student("Amit", 102));
		students.add(new Student("Gupta", 103));
		students.add(new Student("Manoj", 104));
		students.add(new Student("Shahrukh", 105));

//		System.out.println(students);

		students.stream().forEach(s -> System.out.println(s.name + " " + s.id));
		students.stream().filter(s-> s.getId()>103).forEach(s->System.out.println(s.getName()));
		
		students.stream().filter(s->s.getId()>101).collect(Collectors.toList());

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	

}
