package practice;

public class practice {

	public static void main(String[] args) {
//		System.out.println(Byte.MIN_VALUE + "----->" + Byte.MAX_VALUE);
//
//		System.out.println(Short.MIN_VALUE + "---->" + Short.MAX_VALUE);
//		System.out.println(Integer.MIN_VALUE + "----->" + Integer.MAX_VALUE);
//		System.out.println(Long.MIN_VALUE + "----->" + Long.MAX_VALUE);
//		System.out.println(Float.MIN_VALUE + "----->" + Float.MAX_VALUE);
//		System.out.println(Double.MIN_VALUE + "----->" + Double.MAX_VALUE);
//		System.out.println(Character.MIN_VALUE + "----->" + Character.MAX_VALUE);
////		System.out.println(Boolean.MIN_VALUE+"----->"+Boolean.MAX_VALUE); //Error
//
//		int x = Integer.MIN_VALUE;
//		double s = Double.MIN_VALUE;
//
//		int x1 = Integer.MAX_VALUE;
//		double s1 = Double.MAX_VALUE;
//		System.out.println(x);
//		System.out.println(s);
//
//		System.out.println(x1);
//		System.out.println(s1);
//
//		int[] arr = { 1, 23, 4, 5, 6 };
//
//		int m = Integer.MIN_VALUE;
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] > m) {
//				m = arr[i];
//			}
//		}
//		System.out.println(m);
//
//		byte b1 = 60;
//		byte b2 = 70;
//		int b = b1 + b2;
//		System.out.println(b);
//
//		int i = 10;
//		int j;
//		if (i == 10) {
//			j = 20;
//		}
////		System.out.println(j);// error
//
//		/*
//		 * Reason: In java applications, only class level variables are having default
//		 * values, local variables are not having default values. If we declare local
//		 * variables in java applications then we must provide initializations for that
//		 * local variables explicitly, if we access any local variable with out having
//		 * initialization explicitly then compiler will rise an error like
//		 * "Variable x might not have been initialized".
//		 */
//		
//		
//		int i1=1;
//		do
//		{
//		System.out.println(i1);
//		i1=i1+2;
//		}
//		while (i1<10);
//		
//		
//		System.out.println("Before Loop");
//		do
//		{
//		System.out.println("Inside Loop");
//		}
//		while (true);
////		System.out.println("After Loop");

		System.out.println("Hello World");
		int limit = 25;
		int sum = 60;
		double randomValue = 2.77;

		int c = 0;
		for (int var = 1; var < limit; var = var + 3) {
			c++;
			System.out.println(c);
			System.out.println("randomValue: " + randomValue);
			for (int j = 1; j < limit; j = j + 2) {
				sum++;
			}
			System.out.println("Sum = " + sum);
		}

	}

}
