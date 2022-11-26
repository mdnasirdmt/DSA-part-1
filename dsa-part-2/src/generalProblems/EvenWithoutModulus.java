package generalProblems;

public class EvenWithoutModulus {

	public static void main(String[] args) {
		
		int x=11;
		
		// 1st method
//		int i= x&1;
//		
//		System.out.println(i);
//		if(i == 0) {
//			System.out.println("even");
//		}else {
//			System.out.println("odd");
//		}
		/////
		
		
		
		
//		2nd method
//		boolean f=true;
//		for(int i=0;i<x;i++) {
//			f=!f;
//			System.out.println(f);
//		}
//		if(f)
//			System.out.println("even");
//		else
//			System.out.println("odd");
		
///
		
//		3rd method
		if((x/2)*2==x){
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
	}

}
