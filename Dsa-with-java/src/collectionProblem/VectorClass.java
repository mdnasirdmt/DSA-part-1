package collectionProblem;

import java.util.*;

public class VectorClass {

	public static void main(String[] args) {

		List<Integer> vec = new Vector<>(3);
		List<Integer> vec1 = new Vector<>();
		List<Integer> ar = new ArrayList<>();

		for (int i = 0; i < 10; i++)
			vec1.add(i);

		for (int i = 0; i <= 5; i++)
			ar.add(i);
		System.out.println("arrlist " + ar);

		vec1.addAll(0, ar);
		vec1.set(0, null);

		vec.addAll(0, vec1);

		System.out.println("vector1 " + vec1);

		vec.add(0, 789);
		vec.add(1, 456);
		vec.add(2, 123);
		vec.add(11);
		vec.add(12);
		vec.add(10);
		System.out.println("vector " + vec);

		vec.remove(0);
		System.out.println(vec);

		System.out.println(vec.get(2));
		System.out.println(vec.getClass());
	}

}
