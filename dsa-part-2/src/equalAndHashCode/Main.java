package equalAndHashCode;

import java.util.LinkedHashMap;

import java.util.Map;

public class Main {

	public static void main(String[] args) {

		Map<Student, Integer> hm = new LinkedHashMap<>();


		hm.put(new Student(101, "Srk", 850), 1);
		hm.put(new Student(111, "Srk", 850), 2);
		hm.put(new Student(102, "Nasir", 750), 3);
		hm.put(new Student(103, "Amit", 650), 4);
		hm.put(new Student(104, "Gupta", 550), 5);
		hm.put(new Student(104, "Gupta", 550), 6);

		System.out.println(hm+" \ntotal student "+ hm.size());

	}

}
