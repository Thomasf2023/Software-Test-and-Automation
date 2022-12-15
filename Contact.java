//Author : Thomas Fiske
// Date : 11/8/2022


package App;

public class Contact { 
	
	//Variables
	private String firstName;
	private String lastName;
	private String id;
	private String phone;
	private String address;
	
	// This method will check the length of each variable before it can be added to the contact
	public Contact(String firstName, String lastName, String id, String phone, String address) {
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid first name");
		}
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid last name");
		}
		if (id == null || id.length() > 10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		if (phone == null || phone.length() != 10) {
			throw new IllegalArgumentException("Invalid phone #");
		}
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid address");
		}
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.phone = phone;
		this.address = address;
	}
	public String getFirstName() { //Start of accessors
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getID() {
		return id;
	}
	public String getPhone() {
		return phone;
	}
	public String getAddress() {
		return address;
	}
	public void setFirstName(String newFirstName) { //start of constructors 
		firstName = newFirstName;
	}
	public void setLastName(String newLastName) {
		lastName = newLastName;
	}
	public void setID(String newID) {
		id = newID;
	}
	public void setPhone(String newPhone) {
		phone = newPhone;
	}
	public void setAddress(String newAddress) {
		address = newAddress;
	}
}	
