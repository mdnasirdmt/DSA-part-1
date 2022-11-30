package generalProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class JavaComparable {

	public static void main(String[] args) {

		ArrayList<Stud> al = new ArrayList<>();

		al.add(new Stud(1, "Amit", 850));
		al.add(new Stud(2, "Srk", 750));
		al.add(new Stud(5, "Nasir", 450));
		al.add(new Stud(3, "Gupta", 650));
		al.add(new Stud(4, "Manoj", 550));

		Collections.sort(al);
		System.out.println(al.toString());

	}

}

class Stud implements Comparable<Stud> {
	int roll;
	String name;
	int marks;

	public Stud(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}

	public Stud() {
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

	@Override
	public int compareTo(Stud o) {

		if (o.marks > this.marks)
			return 1;
		else if (o.marks < this.marks)
			return -1;
		else
			return 0;
	}

}