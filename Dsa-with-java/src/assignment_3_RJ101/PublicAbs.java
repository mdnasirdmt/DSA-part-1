package assignment_3_RJ101;

public class PublicAbs {
	public static void main(String[] args) {

		
		Book book1=new Book("Rich dad And poor dad");
		Book book2=new Book("secret of millenior mind");
		Book book3=new Book("5 rules");
		
		System.out.println(book1.toString());
		System.out.println(book2.toString());
		System.out.println(book3.toString());
		
		Journal journal=new Journal(121);
		Journal journa2=new Journal(111);
		
		System.out.println(journal.toString());
		System.out.println(journa2.toString());
		
		
	}

}

abstract class Publication {

	int noOfPages;
	int price;
	String publisherName;

}

class Book extends Publication {

	String bookName;

	public Book() {
		super();

	}

	public Book(String bookName) {
		super();
		this.bookName = bookName;
	}

	@Override
	public String toString() {
		return "Book [bookName=" + bookName + "]";
	}
	

}

class Journal extends Book {

	int journalNum;

	public Journal() {
		super();

	}

	public Journal(int journalNum) {
		super();
		this.journalNum = journalNum;
	}

	@Override
	public String toString() {
		return "journal [journalNum=" + journalNum + "]";
	}

	
}

class Library1 extends Journal {

	int serialNum;

	public Library1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Library1(int journalNum) {
		super(journalNum);
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public String toString() {
		return "Library1 [serialNum=" + serialNum + "]";
	}

}

/*
 * 
 * 
 * 
 * ### Problem 3 :
 * 
 * Create an abstract class “Publication” with data members ‘noOfPages’,
 * ‘price’, ‘publisherName’ etc. with their accessor/modifier functions. Now
 * create two sub-classes “Book” and “Journal”. Create a class Library that
 * contains a list of Publications. Write a main() function and create three
 * Books and two Journals, add them to library and print the details of all
 * publications.
 */