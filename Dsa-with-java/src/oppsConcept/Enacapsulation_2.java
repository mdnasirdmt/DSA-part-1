package oppsConcept;

public class Enacapsulation_2 {

	public static void main(String[] args) {

		// creating instance of Account class
		Account acc = new Account();
		// setting values through setter methods
		acc.setAcc_no(7310805450L);
		acc.setName("MD FAIZ");
		acc.setEmail("mdfaiz689@gmail.com");
		acc.setAmount(100000f);
		// getting values through getter methods
		System.out.println(acc.getAcc_no() + " " + acc.getName() + " " + acc.getEmail() + " " + acc.getAmount());

		System.out.println(acc.toString());
	}

}

////
class Account {
	// private data members to hide the data
	private long acc_no;
	private String name, email;
	private float amount;

	// public getter and setter methods
	public long getAcc_no() {
		return acc_no;
	}

	public void setAcc_no(long acc_no) {
		this.acc_no = acc_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Account [acc_no=" + acc_no + ", name=" + name + ", email=" + email + ", amount=" + amount + "]";
	}

}

/*
 * 
 * Encapsulation is defined as the wrapping up of data under a single unit. It
 * is the mechanism that binds together code and the data it manipulates.
 * Another way to think about encapsulation is, that it is a protective shield
 * that prevents the data from being accessed by the code outside this shield.
 * 
 * Technically in encapsulation, the variables or data of a class is hidden from
 * any other class and can be accessed only through any member function of its
 * own class in which it is declared. As in encapsulation, the data in a class
 * is hidden from other classes using the data hiding concept which is achieved
 * by making the members or methods of a class private, and the class is exposed
 * to the end-user or the world without providing any details behind
 * implementation using the abstraction concept, so it is also known as a
 * combination of data-hiding and abstraction. Encapsulation can be achieved by
 * Declaring all the variables in the class as private and writing public
 * methods in the class to set and get the values of variables. It is more
 * defined with the setter and getter method. Advantages of Encapsulation:
 * 
 * Data Hiding: it is a way of restricting the access of our data members by
 * hiding the implementation details. Encapsulation also provides a way for data
 * hiding. The user will have no idea about the inner implementation of the
 * class. It will not be visible to the user how the class is storing values in
 * the variables. The user will only know that we are passing the values to a
 * setter method and variables are getting initialized with that value.
 * Increased Flexibility: We can make the variables of the class read-only or
 * write-only depending on our requirement. If we wish to make the variables
 * read-only then we have to omit the setter methods like setName(), setAge(),
 * etc. from the above program or if we wish to make the variables write-only
 * then we have to omit the get methods like getName(), getAge(), etc. from the
 * above program Reusability: Encapsulation also improves the re-usability and
 * is easy to change with new requirements. Testing code is easy: Encapsulated
 * code is easy to test for unit testing.
 * 
 * 
 * 
 * 
 * 
 */