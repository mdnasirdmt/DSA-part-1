package collectionProblem;

import java.util.*;

public class StackClass {

	public static void main(String[] args) {

		List<Integer> s = new Stack<>();
		Stack<Integer> s1 = new Stack<>();
		s1.add(null);
		s.add(null);

		for (int i = 0; i < 10; i++) {
			s.add(i);
			s1.add(i);
		}
		System.out.println("toString " + s.toString());
		s.add(20);
		s.remove(1);

		((Stack<Integer>) s).push(12);
		s1.push(13);

		((Stack<Integer>) s).pop();
		s1.pop();

		System.out.println("peek s " + ((Stack<Integer>) s).peek());
		System.out.println("peek s1 " + s1.peek());

		System.out.println(s1.search(8));

		s1.addAll(0, s);
		s1.addAll(s);

		System.out.println("toArray " + Arrays.toString(s.toArray()));
		System.out.println("toString " + s.toString());
		System.out.println("aslist " + Arrays.asList(s1));
		s1.trimToSize();
		System.out.println("trim s1" + s1);

		System.out.println(((Vector<Integer>) s).capacity());

		System.out.println("stack " + s);
		System.out.println("stack1 " + s1);

	}
}
