//Author: Thomas Fiske
//Date: 11/16/2022

package App;

import java.util.Vector;


public class TaskService {
	
	static Vector<Task> TaskPool;

	
	public static void addTask(Task task, String addID) {
		
		for (int i = 0; i < TaskPool.size(); ++i) {
			if (addID == ((TaskPool).elementAt(i).getTaskID())) {
				System.out.println("Task ID already in use. This Task ID Cannot be added at this time");
			}
			else {
				TaskPool.add(task);
				System.out.println("Task added sucessfully");
			}
		}
		
	}
	
	public static void deleteTask(Task task, String deleteID) {
		System.out.println("Please input the task ID that you would like to delete");
		
		
		for (int i = 0; i < TaskPool.size(); ++i) {
			if (deleteID == TaskPool.elementAt(i).getTaskID());
			TaskPool.remove(task);
		}
	}
	
	public static void changeTaskInfo(Task task, String name, String desription) {
		
		task.setTaskName(name);
		task.setTaskDescription(desription);
	}
	
}
