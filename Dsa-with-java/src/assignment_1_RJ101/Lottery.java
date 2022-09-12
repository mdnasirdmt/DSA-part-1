package assignment_1_RJ101;

import java.util.*;

public class Lottery {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int lotteryNum = (int) (Math.random() * 1000);

		System.out.println("enter the number of  three digits only");

		int guessNum = s.nextInt();
		System.out.println("your gusses number is " + guessNum);

		// get digits from lottery
		int lotteryDigit1 = lotteryNum % 100;
		int lotteryDigit2 = lotteryNum % 100 / 10;
		int lotteryDigit3 = lotteryNum / 100;

		// get digits from guess
		int guessDigit1 = guessNum % 100;
		int guessDigit2 = guessNum % 100 / 10;
		int guessDigit3 = guessNum / 100;

		System.out.println("lottery number is " + lotteryNum);

//		System.out.println(lotteryDigit1);
//		System.out.println(lotteryDigit2);
//		System.out.println(lotteryDigit3);

		if (lotteryNum == guessNum) {
			System.out.println("Exact Match!!! 10,000$ Prize!");
		} else if (guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2 && guessDigit3 == lotteryDigit3) {

			System.out.println("Matched all numbers!!! 3,000$ Prize!!!");
		}

		else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit1 == lotteryDigit3
				|| guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit3
				|| guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2 || guessDigit3 == lotteryDigit3) {
			System.out.println("Mathed one number!!! 1,000$ Prize!!!");
		}

		else {
			System.out.println("No Match Better luck Next Time !!");
		}

	}

}

/*
 * 
 * 
 * Problem 2
 * 
 * (Game: lottery) Lottery.java, to generate a lottery of a threedigit number.
 * The program prompts the user to enter a three-digit number and determines
 * whether the user wins according to the following rules:
 * 
 * 1. If the user input matches the lottery number in the exact order, the award
 * is $10,000.
 * 
 * 2. If all digits in the user input match all digits in the lottery number,
 * the award is $3,000.
 * 
 * 3. If one digit in the user input matches a digit in the lottery number, the
 * award is $1,000.
 * 
 * 
 * 
 * public class Lottery { public static void main(String[] args) {
 * 
 * } }
 * 
 */