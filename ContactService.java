//Author : Thomas Fiske
// Date : 11/10/2022


package App;

import java.util.Vector;
import java.util.Scanner;

public class ContactService {
	
	static Vector<Contact> IDPool;//Vector to store contacts in 
	static Scanner scan = new Scanner(System.in);
	
	public static void addContact(Contact contact) { //Add contact function
		System.out.println("Please enter the ID of the contact you would like to add");
		String id = scan.nextLine();
		
		for (int i = 0; i < IDPool.size(); ++i){
			if (id == ((IDPool).elementAt(i).getID())){
				System.out.println("ID Already in use");
			}
			else {
				IDPool.add(contact);
				System.out.println("Contact Added");
			}
		}
	}
	
	public static void deleteContact(Vector<Contact> IDPool, Contact contact) { //Delete contact function
		System.out.println("Please enter the ID of the contact you want to delete");
		String id = scan.nextLine();
		
		for (int i = 0; i < IDPool.size(); ++i) {
			if (id == ((IDPool).elementAt(i).getID())){
				IDPool.remove(contact);
			}
		}
	}
	//Change contact function
	public static void changeContact(Contact contact, String firstName, String lastName, String phone, String address) {
		
		contact.setFirstName(firstName);
		contact.setLastName(lastName);
		contact.setPhone(phone);
		contact.setAddress(address);
	}
}
