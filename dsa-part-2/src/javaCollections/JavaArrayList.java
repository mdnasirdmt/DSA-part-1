package javaCollections;
import java.util.*;
public class JavaArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer>list=new ArrayList<>();
		
		for (int i = 0; i <=10; i++) {
			list.add(i);
		}
		list.add(15);
		list.add(13);
		System.out.println(list);
		Collections.sort(list);
//		System.out.println(Collections.binarySearch(list, 13, Collections.reverseOrder()));
//		System.out.println(list.contains(12));
//		System.out.println(list.subList(1, 5));
		System.out.println(list.subList(0, 6));
		list.sort(null);
		

	}

}
