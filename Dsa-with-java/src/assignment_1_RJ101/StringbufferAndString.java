package assignment_1_RJ101;

import java.time.Duration;
import java.time.Instant;

public class StringbufferAndString {

	public static void main(String[] args) {

//		StringTimer();
//		StringBufferTimer();

		// in nano sec
//		long start1 = System.nanoTime();
//
//		StringTimer();
//
//		long end1 = System.nanoTime();
//
//		System.out.println("Elapsed Time in nano seconds: " + (end1 - start1));

		// in mili sec
//		long start2 = System.currentTimeMillis();
//		StringTimer();
//		long end2 = System.currentTimeMillis();
//		System.out.println("Elapsed Time in milli seconds: " + (end2 - start2));

		Instant inst1 = Instant.now();
		StringTimer();
		Instant inst2 = Instant.now();

		String time1 = Duration.between(inst1, inst2).toString();

		System.out.println("Elapsed by string Time: " + time1);

		/////////////////

		Instant inst11 = Instant.now();
		StringTimer();
		Instant inst21 = Instant.now();

		String time2 = Duration.between(inst11, inst21).toString();

		System.out.println("Elapsed by stringBuffer Time: " + time2);

	}

	private static void StringBufferTimer() {

		StringBuffer s3 = new StringBuffer("Value1");
		String s2 = "Value2";

		for (int i = 0; i < 100000; ++i) {
			s3.append(s2);
		}

	}

	private static void StringTimer() {

		String s3 = "Value1";
		String s2 = "Value2";

		for (int i = 0; i < 100000; ++i) {
			s3 = s3 + s2;
		}

	}

}

/*
 * 
 * ### Problem 3
 * 
 * Execute the following code and compare the time :
 * 
 * ```java String s3 = "Value1"; String s2 = "Value2";
 * 
 * for (int i = 0; i < 100000; ++i) { s3 = s3 + s2; } ```
 * 
 * ```jsx StringBuffer s3 = new StringBuffer("Value1"); String s2 = "Value2";
 * 
 * for (int i = 0; i < 100000; ++i) { s3.append(s2); } ```
 * 
 * 
 */