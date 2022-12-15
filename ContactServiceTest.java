//Author : Thomas Fiske
// Date : 11/12/2022


package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Vector;

import org.junit.jupiter.api.Test;

import App.ContactService;
import App.Contact;

class ContactServiceTest {
	
	Vector<Contact> IDPool; //Vector to store contacts and test if they are added and deleted properly
	
	
	@Test
	void addContactTest() { //This function will test the Add Contact function
		Contact contact = new Contact("Tim", "Smith", "672394", "6039992000", "151 Test Street"); 
		Contact contact2 = new Contact("John", "Pool", "672394", "6039992002", "151 Testing Street");
		
		
		ContactService.addContact(contact);
		ContactService.addContact(contact);
		
		for (int i = 0; i > IDPool.size(); ++i) {
			if (IDPool.elementAt(i).getID() == contact2.getID()){
				throw new IllegalArgumentException("ID Already exist in vector");
			}
		}		
	}
	@Test
	void deleteContactTest(Contact contact3) { //This function will test the Delete Contact function
		
		IDPool.add(contact3);
		
		ContactService.deleteContact(IDPool, contact3);
	
		for (int i = 0; i > IDPool.size(); ++i) {
			if (IDPool.elementAt(i).getID() == contact3.getID()) {
				throw new IllegalArgumentException("Contact not deleted"); //Throws exception if test is failed
			}
		}
	}
	@Test
	void changeContactTest() { //This function will test the Change Contact function
		Contact contact4 = new Contact("Ron", "Fiske", "523424", "6038888888", "171 Testing Street");
		
		ContactService.changeContact(contact4, "Phil", "Burr", "6039999999", "2000 Testing Street");
		
		if (contact4.getFirstName() == "Ron" || contact4.getLastName() == "Fiske" || contact4.getPhone() == "6038888888" || contact4.getAddress() == "171 Testing Street") {
			throw new IllegalArgumentException("Contact not properly deleted"); //Throws exception if test is failed
		}

	}
	
}
