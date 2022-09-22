package collectionProblem;

import java.util.ArrayList;
import java.util.List;

public class ContainsAll {

	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList<>();
		
		list.add("Welcome");
        list.add("To");
        list.add("Geeks");
        list.add("4");
        list.add("Geeks");
        list.add("Geeks4geegs");
        
        
        // Displaying the List
        System.out.println("List: " + list);
        
        
        List<String> list2 = new ArrayList<>();
        
        list2.add("nasir");
        
        list2.addAll(list);
        
        // Displaying the List
        System.out.println("List2: " + list2);

        System.out.println(list2.containsAll(list));
        System.out.println(list.containsAll(list2));

	}

}
