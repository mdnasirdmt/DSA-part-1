package collectionProblem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListProb {

	public static void main(String[] args) {

		int[] arr = { 52, 51, 50, 10, 5, 3, 4, 11, 7, 0 };
		List<Integer> list = new ArrayList<>();

		for (int i : arr)
			list.add(i);
		list.add(Integer.valueOf('a'));
		list.add(Integer.valueOf('b'));
		list.add(Integer.valueOf('c'));
		list.add(Integer.valueOf('d'));

		System.out.println(list);
		Collections.sort(list);

		System.out.println(list.contains(100));
		System.out.println(list.subList(2, arr.length - 1));
		System.out.println(list.subList(0, 3));
		System.out.println(list.get(10));
		System.out.println(list.remove(7));
		System.out.println(list.remove(0));
		System.out.println(list);
		int in=Collections.binarySearch(list, 51); // it works when list is sorted 
		System.out.println(in);
		
		int index = Collections.binarySearch(list, 52, Collections.reverseOrder());
		System.out.println(index);

	}

}
