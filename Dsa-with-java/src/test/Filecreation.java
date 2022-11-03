package test;

import java.io.File;
import java.io.IOException;

public class Filecreation {

	public static void main(String[] args) throws IOException {

		File f = new File("nasir.txt");
		f.createNewFile();
		
		f.mkdir();
		System.out.println(f.exists());
//		System.out.println(f.delete());
		
		System.out.println(f.exists());

	}

}
