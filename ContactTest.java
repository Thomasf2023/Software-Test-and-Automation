//Author : Thomas Fiske
// Date : 11/9/2022


package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import App.Contact;

class ContactTest {

	@Test 
	void contactLengthTest() { //This test will test will test whether the class is being properly assigned values
		Contact contact = new Contact("Greg", "Knights", "675234", "6038889000", "161 Wilson Ave");
		assertTrue(contact.getFirstName().equals("Greg"));
		assertTrue(contact.getLastName().equals("Knights"));
		assertTrue(contact.getID().equals("675234"));
		assertTrue(contact.getPhone().equals("6038889000"));
		assertTrue(contact.getAddress().equals("161 Wilson Ave"));
	}
	
	@Test
	void contactFirstNameTest() { //This test will test the first name of the contact to make sure that it is not too long
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("thisnameistoolong","Knights", "675234", "6038889000", "161 Wilson Ave");
		});
	}
	@Test
	void contactLastNameTest() {//This test will test the last name of the contact to make sure that it is not too long
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("Greg","thisnameistoolong", "675234", "6038889000", "161 Wilson Ave");
		});
	}
	@Test
	void contactIDTest() {//This test will test the ID of the contact to make sure that it is not too long
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("Greg","Knights", "thisnumberistoolong", "6038889000", "161 Wilson Ave");
		});
	}
	@Test
	void contactPhoneTest() {//This test will test the number of the contact to make sure that it is not too long
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("Greg","Knights", "675234", "thisnumberistoolong", "161 Wilson Ave");
		});
	}
	@Test
	void contactAddressTest() {//This test will test the address of the contact to make sure that it is not too long
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("Greg","Knights", "675234", "6038889000", "This address is way to long to exist as an address");
		});
	}
}
	
