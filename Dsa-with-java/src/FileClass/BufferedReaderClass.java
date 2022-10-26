package FileClass;
import java.io.*;
public class BufferedReaderClass {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br= new BufferedReader(new FileReader("abc.txt"));
	String s=	br.readLine();
		while(s!=null) {
			
			System.out.println(s);
			br.close();
		}
	}

}
