package buferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderClass {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter number ");

		int n = Integer.parseInt(br.readLine());

		System.out.println("number is " + n);

	}

}
