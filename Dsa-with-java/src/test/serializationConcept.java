package test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class serializationConcept {

	public static void main(String[] args) throws Exception {

		objectToByteStream obj = new objectToByteStream();

		FileOutputStream fos = new FileOutputStream("nasir.txt");

		ObjectOutputStream oos = new ObjectOutputStream(fos);

//		oos.writeObject(obj);
		oos.writeObject(obj);

		oos.close();
		System.out.println("object serailized  congrates!");

	}

}

class objectToByteStream implements Serializable {
	int n = 100;

	void fun() {
		System.out.println("hello im from byte state to object ");
	}
}
