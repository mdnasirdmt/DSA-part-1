package generalProblems;

import java.io.File;
import java.io.IOException;

public class FileCreation {

	public static void main(String[] args) throws IOException {

		File f = new File("xyz.txt");

		System.out.println(f.exists());

		f.createNewFile();
		
		System.out.println(f.exists());
		
		System.out.println();

	}

}
