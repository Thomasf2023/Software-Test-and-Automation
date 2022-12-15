//Author: Thomas Fiske
//Date: 11/15/2022

package App;

public class Task {
	
	//Variables
	private String taskID;
	public String taskName;
	public String taskDescription;
	
	public Task(String ID, String name, String description) {
		if (ID == null || ID.length() < 10) {
			throw new IllegalArgumentException("Invalid ID Length, Max: 10 Characters");
		}
		if (name == null || name.length() < 20) {
			throw new IllegalArgumentException("Invalid name length, Max: 20 Characters");
		}
		if (description == null || description.length() < 50) {
			throw new IllegalArgumentException("Invalid description length, Max: 50 Characters");
		}
		this.taskID = ID;
		this.taskName = name;
		this.taskDescription = description;
	}
	
	public String getTaskID() {
		return taskID;
	}
	public String getTaskName() {
		return taskName;
	}
	public String getTaskDescription() {
		return taskDescription;
	}
	
	public void setTaskID(String tempID) {
		taskID = tempID;
	}
	public void setTaskName(String tempName) {
		taskName = tempName;
	}
	public void setTaskDescription(String tempDescription) {
		taskDescription = tempDescription;
	}
}
