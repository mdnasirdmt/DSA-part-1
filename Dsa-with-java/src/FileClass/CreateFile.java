package FileClass;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class CreateFile {
	
	public static void main(String[] args) throws IOException {
		
		
		File f= new File("c://hi//abc.txt");
		File f1= new File("abc.txt");
		System.out.println(f);
		f.createNewFile();
		
		System.out.println(f.exists());
		System.out.println(f1.exists());

		File f2 = new File("c://nasir");
		File f3 = new File("c://nasir//nasir.txt");
		f3.createNewFile();
		f2.mkdir();
		System.out.println(f2.exists());
	
	}
	
	

}
