package in.happycoding.bean;

public class Person {

	private int id;
	private String firstName;
	private String lastName;
	private String laptop_id;

	public Person() {
		super();
	}

	public Person(int id, String firstName, String lastName, String laptop_id) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.laptop_id = laptop_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLaptop_id() {
		return laptop_id;
	}

	public void setLaptop_id(String laptop_id) {
		this.laptop_id = laptop_id;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", laptop_id=" + laptop_id
				+ "]";
	}

}
