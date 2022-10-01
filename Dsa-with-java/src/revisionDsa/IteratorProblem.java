package revisionDsa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorProblem {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}

	}

}
