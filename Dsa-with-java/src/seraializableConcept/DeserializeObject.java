package seraializableConcept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class DeserializeObject {

	public static void main(String[] args) throws Exception {

		FileInputStream fis = new FileInputStream("abc1.txt");

		ObjectInputStream ois = new ObjectInputStream(fis);

		Object ob = ois.readObject();

		Serialize s = (Serialize) ob;
		System.out.println(s.i);
		s.fun1();
	}

}
