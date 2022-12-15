// Author: Thomas Fiske
// Date: 11/25/2022


package App;

import java.util.Vector;

public class AppointmentService {

	static Vector<Appointment> appointmentPool;
	
	public static void addAppointment(Appointment appointmentAdd) { //Function that will Add appointments
		
		for (int i = 0; i > appointmentPool.size(); ++i) {
			if (appointmentAdd.getID() == appointmentPool.elementAt(i).getID()) {
				System.out.println("Error: This appoitmeent ID already Exists");
			}
			else {
				appointmentPool.add(appointmentAdd);
			}
		}
	}
	
	public static void deleteAppointment(Appointment appointmentDelete) { //Function that will delete appointments
		
		for (int i = 0; i > appointmentPool.size(); ++i) {
			if (appointmentPool.elementAt(i).getID() == appointmentDelete.getID()) {
				appointmentPool.remove(appointmentDelete);
			}
		}
	}
}
