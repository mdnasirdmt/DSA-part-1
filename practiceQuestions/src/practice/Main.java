package practice;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		
		
		String s="apple apple apple ball ball";
		
		String[] str= s.split(" ");
		
		// apple=3, ball=2
		HashMap<String,Integer> hm= new HashMap<>();
		
		int c=0;
		
//		String bag="";
		
	
		
//		
		for (int i = 0; i < str.length; i++) {
			
//			
			if(hm.get(str[i])==null) {
//				
				hm.put(str[i], 1);
//				
			}else {
//				
				int j= hm.get(str[i]);
//				
				hm.put(str[i], ++j);
			}
			
		}
		
		System.out.println(hm);
		
		
	}

}
