package assignment_1_RJ101;

import java.util.Scanner;

public class InsideCircle {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("enter two  cordinates  ");

		double c1 = s.nextDouble();
		double c2 = s.nextDouble();

		System.out.println("cordinates 1 = " + c1);
		System.out.println("cordinates 2 = " + c2);

		checkInsideOrNot(c1, c2);

	}

	private static void checkInsideOrNot(double c1, double c2) {

		double d = 0.5;

		if (Math.pow(c1 * c1 + c2 * c2, d) <= 10.0) {
			System.out.println("Point (" + c1 + ", " + c2 + ") is in the circle");
		} else {
			System.out.println("Point (" + c1 + ", " + c2 + ") is not in the circle");
		}

	}

}

/*
 * 
 * ### Problem 1
 * 
 * 
 * 3_22 : (Geometry: point in a circle?) Write a program that prompts the user
 * to enter a point (x, y) and checks whether the point is within the circle
 * centered at (0, 0) with radius 10. For example, (4, 5) is inside the circle
 * and (9, 9) is outside the circle ```
 * 
 * 
 * public class InsideCircle { public static void main(String[] args) {
 * 
 * } }
 */
