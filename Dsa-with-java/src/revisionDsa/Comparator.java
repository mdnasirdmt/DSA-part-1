package revisionDsa;

import java.util.*;

public class Comparator {
	
	public static void main(String[] args) {
		
		List<Employee> emp= new ArrayList<>();
		
		emp.add(new Employee(123, "Amit", "up"));
		emp.add(new Employee(54321, "Nasir", "bihar"));
		emp.add(new Employee(1234321, "Gupta ji", "Bihar"));
		
		Collections.sort(emp, new SortByName());
		System.out.println(Arrays.asList(emp));
		
		Collections.sort(emp, new SortById());
		System.out.println(Arrays.asList(emp));
	}

}


class Employee{
	
	Integer empId;
	String name;
	String address;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(Integer empId, String name, String address) {
		super();
		this.empId = empId;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", address=" + address + "]";
	}
	
	
	
}


class SortByName implements java.util.Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.name.compareTo(o2.name);
	}
	
}


class SortById implements java.util.Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.empId- o2.empId;
	}
	
}



