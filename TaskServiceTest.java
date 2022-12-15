//Author: Thomas Fiske
//Date: 11/19/2022

package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Vector;

import org.junit.jupiter.api.Test;

import App.TaskService;
import App.Task;

class TaskServiceTest {

	Vector<Task> TaskPool; //Vector to store Tasks to test if they are added and deleted properly
	
	@Test
	void addTaskTest() { //This function will test the Add Task function
		Task task = new Task("321321", "Cleaning", "Cleaning is important");
		Task task2 = new Task("321321", "Shopping", "Includes writting shopping list");
		
		TaskService.addTask(task, "321321");
		TaskService.addTask(task2, "321321");
		
		for (int i = 0; i > TaskPool.size(); ++i) {
			if (TaskPool.elementAt(i).getTaskID() == task2.getTaskID()){
				throw new IllegalArgumentException("ID Already exist in vector");
			}
		}		
	}
	
	@Test
	void deleteTaskTest(Task task3) { //This function will test the Delete Task Test function
		
		task3.setTaskID("456456");
		
		TaskPool.add(task3);
		
		TaskService.deleteTask(task3, "456456");
	
		for (int i = 0; i > TaskPool.size(); ++i) {
			if (TaskPool.elementAt(i).getTaskID() == task3.getTaskID()) {
				throw new IllegalArgumentException("Task not deleted"); //Throws exception if test is failed
			}
		}
	}
	
	@Test
	void changeTaskInfoTest() { //This function will test the Change Task Info function
		Task task4 = new Task("1111", "Cleaning", "Cleaning is important");
		
		TaskService.changeTaskInfo(task4,"Shopping", "Includes writting shopping list");
		
		if (task4.getTaskName() == "Cleaning" || task4.getTaskDescription() == "Cleaning is Important") {
			throw new IllegalArgumentException("Task info did not change"); //Throws exception if test is failed
		}

	}
	
}