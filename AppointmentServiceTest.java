//Author: Thomas Fiske
//Date: 11/26/2022

package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;
import java.util.Vector;

import org.junit.jupiter.api.Test;

import App.Appointment;
import App.AppointmentService;

class AppointmentServiceTest {
	
	Vector<Appointment> appointmentPool;
	
	Date tempDate = new Date();

	@Test 
	void addAppointmentTest() { // This test will test add appointment in appointment service
		Appointment tempAppointment = new Appointment("121212", tempDate, "This is described");
		Appointment tempAppointment2 = new Appointment("121212", tempDate, "Described is this");
		
		AppointmentService.addAppointment(tempAppointment);
		AppointmentService.addAppointment(tempAppointment2);
		
		for (int i = 0; i > appointmentPool.size(); ++i) {
			if (appointmentPool.elementAt(i).getID() == tempAppointment2.getID()) {
				throw new IllegalArgumentException("ID already exists in vector");
			}
		}
	}
	
	@Test
	void deleteAppointmentTest() { // This test will test delete appointment in appointment service
		
		Appointment tempAppointment3 = new Appointment("121212", tempDate, "This is described");
		
		AppointmentService.addAppointment(tempAppointment3);
		AppointmentService.deleteAppointment(tempAppointment3);
		
		for(int i = 0; i > appointmentPool.size(); ++i) {
			if (appointmentPool.elementAt(i).getID() == tempAppointment3.getID()) {
				throw new IllegalArgumentException("Appointment not deleted");
			}
		}
		}
	}
