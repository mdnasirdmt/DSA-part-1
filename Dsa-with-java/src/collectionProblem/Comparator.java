package collectionProblem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparator {
	
	public static void main(String[] args) {
		
		List<Students> list= new ArrayList<>();
		
		list.add(new Students(12, "khan", "bihar"));
		list.add(new Students(10, "sharma", "delhi"));
		list.add(new Students(20, "singh", "panjab"));
		list.add(new Students(3, "abcd", "patna"));
		list.add(new Students(2, "lkaj", "haranaya"));
		
		Collections.sort(list, new SortByRoll());
		Collections.sort(list, new SortByName());
		System.out.println(list.toString());
		
	}

}


class Students{
	
	int roll;
	String name;
	String address;
	public Students(int roll, String name, String address) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Students [roll=" + roll + ", name=" + name + ", address=" + address + "]";
	}
	
	
}

class SortByName implements java.util.Comparator<Students>{

	@Override
	public int compare(Students o1, Students o2) {
		
		return o1.name.compareTo(o2.name);
	}
	
}

class SortByRoll implements java.util.Comparator<Students>{

	@Override
	public int compare(Students o1, Students o2) {
		
		return o1.roll- o2.roll;
	}
	
}