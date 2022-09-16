package assignment_4_RJ101;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		ArrayList<Contact> list = new ArrayList<>();

		list.add(new Contact("tyagi", "132443"));
		list.add(new Contact("srk", "09876"));
		list.add(new Contact("raju", "5678"));
		list.add(new Contact("amit", "1234321"));
		list.add(new Contact("nasir", "826355"));

		MobilePhone mob1 = new MobilePhone("qqq", "132345", list);
	}

}

class Contact {

	String name;
	String phoneNumber;

	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contact(String name, String phoneNumber) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public String getContactName() {
		return name;

	}

	public String getPhoneNumber() {
		return name;

	}

	public static Contact createContact(String name, String phoneNumber) {

		Contact c1 = new Contact(name, phoneNumber);

		return c1;

	}

}

class MobilePhone extends Contact {

	ArrayList<Contact> myContacts;

	public MobilePhone(String name, String phoneNumber, ArrayList<Contact> myContacts) {
		super(name, phoneNumber);
		this.myContacts = myContacts;
	}

	public void addNewContact() {

	}

	public void updateContact() {

	}

	public void removeContact() {

	}

	public void findContact(Contact c) {

	}

	public Contact findContact(String Name) {
		return null;

	}

	public void queryContact() {

	}

	public void printContacts() {

	}

	@Override
	public String toString() {
		return "MobilePhone [myContacts=" + myContacts + "]";
	}

}
