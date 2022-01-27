package Question1;

//
//	Q1 Create a class Employee. Set the first Name, last name and hourly rate and print the first name,last name and rate. 
//	 Use get and set method to update and retrieve values. 
//	 Also add a method which will calculate the weekly salary of the person by taking no of hours worked as an input 
//	and multiplying it to hourly rate and print it. 

import java.util.Scanner;

public class Employee {

	Scanner sc = new Scanner(System.in);

	String firstName = "";
	String lastName = "";
	double hourlyRate = 0;
	double noOfHoursWorked = 0;
	double weeklySalary = 0;

	// GET FIRST NAME:
	String getFirstName() {
		return firstName;
	}

	// GET LAST NAME:
	String getLastName() {
		return lastName;
	}

	// GET HOURLY RATE:
	double getHourlyRate() {
		return hourlyRate;
	}

	// GET NO. OF HOURS WORKED
	double getNoOfHours() {
		return noOfHoursWorked;
	}

	// CALCULATE THE WEEKLY SALARY
	double getWeeklySalary() {
		weeklySalary = (noOfHoursWorked * hourlyRate);
		return weeklySalary;
	}

	// UPDATE FIRST NAME
	void updateFirstName(String name1) {
		firstName = name1;
	}

	// UPDATE LAST NAME
	void updateLastName(String name2) {
		lastName = name2;
	}

	// UPDATE HOURLY RATE
	void updateHourlyRate(double newRate) {
		hourlyRate = newRate;
	}

	// UPDATE NO. OF HOURS WORKED
	void updateNoOfHours(double newHours) {
		noOfHoursWorked = newHours;
	}

	// UPDATE WEEKLY SALARY
	void updatedWeeklySalary(double newWeeklySalary) {
		weeklySalary = newWeeklySalary;
	}
}
