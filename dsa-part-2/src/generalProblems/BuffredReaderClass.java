package generalProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BuffredReaderClass {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter value ");
		
		int n= Integer.parseInt(br.readLine());
		System.out.println("num is "+ n);

	}

}
