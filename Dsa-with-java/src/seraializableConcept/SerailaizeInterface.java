package seraializableConcept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class SerailaizeInterface implements Serializable {

	int i = 10;

	void fun1() {
		System.out.println("inside fun1 ");
	}

	public static void main(String[] args) throws Exception {
		
		SerailaizeInterface si= new SerailaizeInterface();
		
		FileOutputStream fis= new FileOutputStream("abc1.txt");
		
		ObjectOutputStream oos= new ObjectOutputStream(fis);
		
		oos.writeObject(si);
		
		oos.close();
		System.out.println("si object is serailized");
	}
}
