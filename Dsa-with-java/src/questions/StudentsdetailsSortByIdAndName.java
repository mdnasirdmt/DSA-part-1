package questions;

import java.util.Comparator;

class StudentsDetails implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {

//		if (o1.sid > o2.sid)
//			return 1;
//		else if (o1.sid < o2.sid)
//			return -1;
//		else
//			return 0;
		return o1.sid - o2.sid;

	}

}

class StudentssortingByName implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {

		return o1.sname.compareTo(o2.sname);
	}

}
