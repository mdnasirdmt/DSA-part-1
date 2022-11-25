package streamApi;

import java.util.ArrayList;
import java.util.List;

public class StreamApi {

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		students.add(new Student(10,"Name1",850));
		students.add(new Student(12,"Name2",750));
		students.add(new Student(13,"Name3",650));
		students.add(new Student(14,"Name4",950));
		students.add(new Student(15,"Name5",750));
		
		students.stream().forEach(m-> System.out.println(m.marks));

	}

}

class Student{
	int roll;
	String name;
	int marks;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	
	
}
