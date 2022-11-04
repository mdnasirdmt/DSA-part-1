package questions;

import java.util.ArrayList;
import java.util.Collections;


public class Student {

	String sname;
	Integer sid;
	String semail;

	public Student() {
		super();

	}

	public Student(String sname, Integer sid, String semail) {
		super();
		this.sname = sname;
		this.sid = sid;
		this.semail = semail;
	}

	@Override
	public String toString() {
		return "Student [sname=" + sname + ", sid=" + sid + ", semail=" + semail + "]";
	}

	public static void main(String[] args) {
		ArrayList<Student> s1 = new ArrayList<>();
		Student st1 = new Student("Nasir", 123, "nasir@gmail.com");
		Student st2 = new Student("Amit", 543, "amit@gmail.com");
		Student st3 = new Student("Shahrukh", 321, "srk@gmail.com");
		s1.add(st1);
		s1.add(st2);
		s1.add(st3);
		
		

		System.out.println(s1);
//		Collections.sort(s1, new StudentsDetails());
		Collections.sort(s1, new StudentssortingByName());
		
		System.out.println(s1);
	}

}
