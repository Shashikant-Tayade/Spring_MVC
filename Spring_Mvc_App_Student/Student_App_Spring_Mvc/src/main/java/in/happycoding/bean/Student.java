package in.happycoding.bean;

public class Student {

	private int rollNumber;
	private String name;
	private String address;
	private String contact;
	
	public Student() {
		super();
	}

	public Student(int rollNumber, String name, String address, String contact) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.address = address;
		this.contact = contact;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", address=" + address + ", contact=" + contact
				+ "]";
	}
	
	
}
