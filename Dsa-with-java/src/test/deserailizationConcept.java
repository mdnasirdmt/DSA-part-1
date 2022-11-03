package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class deserailizationConcept {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream("nasir.txt");

		ObjectInputStream ois = new ObjectInputStream(fis);

		Object o = ois.readObject();

		objectToByteStream otb = (objectToByteStream) o;
		System.out.println(otb.n);
		otb.fun();

	}

}
