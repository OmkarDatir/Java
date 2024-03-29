package inheritance;

public class Person {
//data members (state of a Person)
	private String firstName;
	private String lastName;

	public Person(String firstName, String lastName) {
		System.out.println("in person's ctor");
		this.firstName = firstName;
		this.lastName = lastName;
	}

	// overloaded def. ctor
//	public Person() {
//		// TODO Auto-generated constructor stub
//	}
	// override inherited method from Object class : to ret Person's details
	@Override
	public String toString() {
		return firstName + " " + lastName;
	}

	// add a getter : last name
	public String getLastName() {
		return lastName;
	}

	// add a getter : first name
	public String getFirstName() {
		return firstName;
	}

	// override equals from Object class :to replace ref equality by contents eq
	// (PK)
	@Override
	public boolean equals(Object anotherObject) {
		System.out.println("in person's equals");
		if (anotherObject instanceof Person) {
			Person p = (Person) anotherObject;
			return firstName.equals(p.firstName) && lastName.equals(p.lastName);
		}
		return false;
	}

}