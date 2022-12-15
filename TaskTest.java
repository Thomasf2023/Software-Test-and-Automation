//Author: Thomas Fiske'
//Date: 11/18/2022

package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import App.Task;

class TaskTest {

	@Test
	void taskLengthTest() {
		
		Task task = new Task("231313", "Clean", "Cleaning is important");
		
		assertTrue(task.getTaskID().equals("231313"));
		assertTrue(task.getTaskName().equals("Clean"));
		assertTrue(task.getTaskDescription().equals("Cleaning is important"));
	}
	
	@Test
	void contactFirstNameTest() { //This test will test the first name of the contact to make sure that it is not too long
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("ThisIDiswaytoolong", "Clean", "Cleaning is important");
		});
	}
	@Test
	void contactLastNameTest() {//This test will test the last name of the contact to make sure that it is not too long
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("231313", "Thenameofthistaskisverylongtoolongtowork" ,"Cleaning is important");
		});
	}
	@Test
	void contactIDTest() {//This test will test the ID of the contact to make sure that it is not too long
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("231313", "Clean", "111111111111111111111111111111111111111111111111111111111111111111111");
		});
	}
}