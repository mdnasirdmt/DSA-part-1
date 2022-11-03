package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderClass {

	public static void main(String[] args) throws Exception {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter n value ");
		int n = Integer.parseInt(bf.readLine());
		System.out.println("n value " + n);

		System.out.println("enter string value ");
		String s = bf.readLine();
		System.out.println("string value " + s);
	}

}
