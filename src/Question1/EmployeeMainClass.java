package Question1;

import java.util.Scanner;

public class EmployeeMainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Employee objEmployee = new Employee();

		// PRINT FIRST NAME
		System.out.println("Enter First Name");
		objEmployee.firstName = sc.next();

		String newFirstName = "";
		newFirstName = objEmployee.getFirstName();
		System.out.println("First Name is: " + newFirstName);

		// PRINT LAST NAME
		System.out.println("Enter Last Name");
		objEmployee.lastName = sc.next();

		String newLastName = "";
		newLastName = objEmployee.getLastName();
		System.out.println("Last Name is: " + newLastName);

		System.out.println("Employee Full name is: " + newFirstName + " " + newLastName); // FULL NAME OF AN EMPLOYEE

		// PRINT HOURLY RATE
		System.out.println("Enter hourly rate");
		objEmployee.hourlyRate = sc.nextDouble();

		double newHourlyRate = 0;
		newHourlyRate = objEmployee.getHourlyRate();
		System.out.println("Hourly rate is: " + newHourlyRate);

		// NO. OF HOURS WORKED
		System.out.println("Enter No. of hours worked");
		objEmployee.noOfHoursWorked = sc.nextDouble();

		double noOfhoursWorked = 0;
		noOfhoursWorked = objEmployee.getNoOfHours();
		System.out.println("No of hours worked: " + noOfhoursWorked);

		// PRINT WEEKLY SALARY
		double weeklySalary = 0;
		weeklySalary = objEmployee.getWeeklySalary();
		System.out.println("Weekly salary is: " + "$" + weeklySalary);

		// UPDATING FIRST NAME
		System.out.println("Update First Name");
		objEmployee.updateFirstName(sc.next());
		String updatedFirstName = objEmployee.getFirstName();
		System.out.println("First Name is updated to: " + updatedFirstName);

		// UPDATING LAST NAME
		System.out.println("Update last Name");
		objEmployee.updateLastName(sc.next());
		String updatedLastName = objEmployee.getLastName();
		System.out.println("First Name is updated to: " + updatedLastName);

		System.out.println("UPDATED Full name is: " + updatedFirstName + " " + updatedLastName); // UPDATED FULL NAME OF AN
																									// EMPLOYEE
		
	}

}
