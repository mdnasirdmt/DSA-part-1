package generalProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class RemoveDuplicateArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1, 2, 4, 2, 4, 3, 5, 5));

//		System.out.println(al);

		ArrayList<Integer> rem = new ArrayList<>();

		for (int i = 0; i < al.size(); i++) {

			if (!rem.contains(al.get(i))) {

				rem.add(al.get(i));
			}

		}

		System.out.println(rem);

	}

}
