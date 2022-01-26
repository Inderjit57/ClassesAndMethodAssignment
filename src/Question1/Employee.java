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

	// GET AND UPDATE FIRST NAME:
	String getFirstName() {
		return firstName;
	}

	void updateFirstName(String name1) {
		firstName = name1;
	}

	// GET AND UPDATE LAST NAME:
	String getLastName() {
		return lastName;
	}

	void updateLastName(String name2) {
		lastName = name2;
	}

	// GET AND UPDATE HOURLY RATE:
	double getHourlyRate() {
		return hourlyRate;
	}

	void updateHourlyRate(double newRate) {
		hourlyRate = newRate;
	}

	// GET AND UPDATE NO. OF HOURS WORKED
	double getNoOfHours() {
		return noOfHoursWorked;
	}

	// CALCULATE THE WEEKLY SALARY
	double getWeeklySalary() {
		return weeklySalary = (noOfHoursWorked * hourlyRate);
	}
}
