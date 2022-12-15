//Author: Thomas Fiske
//Date: 11/26/2022


package test;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import App.Appointment;

class AppointmentTest {
	
	private Date testDate = new Date();

	@Test
	void appointmentVariableTest() { //This test will test if all of the attributes are being properly assigned
		Appointment tempAppointment4 = new Appointment("565656", testDate, "This is described");
		assertTrue(tempAppointment4.getID() == "565656");
		assertTrue(tempAppointment4.getDate() == testDate);
		assertTrue(tempAppointment4.getDescription() == "This is described");
	}
	
	void appointmentIDTest() {//This test will test the ID of the appointment to make sure that it picks up on the ID being too long
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("22323232323232323232", testDate, "this is described");
		});
	}
	void appointmentDateTest() throws ParseException {//This test will test the Date of the appointment to make sure that it is picking up that the date is in the past
		
		String date_string = "2-11-2000";
	       
	       SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");      
	       
	       testDate = formatter.parse(date_string);      
	       System.out.println("Date value: " + testDate);
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("565656", testDate, "this is described");
		});
	}
	void appointmentDescriptionTest() {//This test will test the description of the appointment to pick up on the description being too long
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("565656", testDate, "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
		});
	}
	

}
