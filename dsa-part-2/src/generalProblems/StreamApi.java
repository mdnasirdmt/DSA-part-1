package generalProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamApi {

	public static void main(String[] args) {
		
		ArrayList<Stud> al = new ArrayList<>();

		al.add(new Stud(1, "Amit", 850));
		al.add(new Stud(2, "Srk", 750));
		al.add(new Stud(5, "Nasir", 450));
		al.add(new Stud(3, "Gupta", 650));
		al.add(new Stud(4, "Manoj", 550));

//		System.out.println(al.toString());
		
		System.out.println(al.stream().filter(s-> s.marks>550).map(s-> s.marks).collect(Collectors.toList()));
		
		System.out.println(al.stream().map(s->s.marks).reduce(0,(sum,b)-> sum+b));
		
		
		Integer max= al.stream().map(m->m.marks).max(Integer::compare).get();
		
		System.out.println(max);
		
		Integer min= al.stream().map(m->m.marks).min(Integer::compare).get();
		System.out.println(min);

	}

}

class Stud1 {
	int roll;
	String name;
	int marks;

	public Stud1(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}

	public Stud1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Stud [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}


}