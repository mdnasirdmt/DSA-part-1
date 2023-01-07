package equalAndHashCode;

import java.util.Objects;

public class Student {
	
	private Integer roll;
	private String name;
	private Integer marks;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(Integer roll, String name, Integer marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	public Integer getRoll() {
		return roll;
	}
	public void setRoll(Integer roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getMarks() {
		return marks;
	}
	public void setMarks(Integer marks) {
		this.marks = marks;
	}
	@Override
	public int hashCode() {
		return Objects.hash(marks, name, roll);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(marks, other.marks) && Objects.equals(name, other.name)
				&& Objects.equals(roll, other.roll);
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}
	
	

}
