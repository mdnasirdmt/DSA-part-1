package streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi1 {
public static void main(String[] args) {
		
		List<Student1> students = new ArrayList<>();
		students.add(new Student1(10,"Name1",850));
		students.add(new Student1(12,"Name2",750));
		students.add(new Student1(13,"Name3",650));
		students.add(new Student1(14,"Name4",950));
		students.add(new Student1(15,"Name5",750));
		
//		students.stream().forEach(m-> System.out.println(m.marks));
		
		students.stream().filter(m-> m.marks>800).forEach(m-> System.out.println(m.name));
		
		students.stream().filter(m-> m.marks>800).collect(Collectors.toList());

	}

}

class Student1{
	int roll;
	String name;
	int marks;
	public Student1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student1(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	
	
}
