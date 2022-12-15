package App;
//Author: Thomas Fiske
//Date: 11/23/22


import java.util.Date;

public class Appointment {
	
	
	private String id;
	public Date date = new Date();
	public String description;
	
	
	private Date currentDate = new Date();
	
	public Appointment(String tempID, Date tempDate, String tempDescription) { //Constructor for the appointment class
		if (tempID.length() > 10 || tempID == null) {
			throw new IllegalArgumentException("Invalid ID: ID too long or equals null"); // This checks to make sure the ID requirements are followed
		}
		if (tempDate.before(currentDate)) {
			throw new IllegalArgumentException("Invalid Date: This date is in the past"); // This checks to make sure the date requirements are followed
		}
		if (tempDescription.length() > 50 || tempDescription == null) {
			throw new IllegalArgumentException("Invalid Description: This description is too long or equals null"); // This checks to make sure the description requirements are followed
		}
		this.id = tempID;
		this.date = tempDate;
		this.description = tempDescription;
	}
	
	//Setters and getters
	public String getID() {
		return id;
	}
	public Date getDate() {
		return date;
	}
	public String getDescription() {
		return description;
	}
	public void setID(String tempID2) {
		id = tempID2;
	}
	public void setDate(Date tempDate2) {
		date = tempDate2;
	}
	public void setDescription(String tempDescription2) {
		description = tempDescription2;
	}
}
