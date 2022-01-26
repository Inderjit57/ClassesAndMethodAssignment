package Question2;

import java.util.Scanner;

public class CustomerService_MainClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		CustomerService customerService = new CustomerService();

		// Initializing with given values
		//Name
		customerService.name = "John";
		String newName = "";
		newName = customerService.getName();
		System.out.println("Entered name is: " + newName);

		//EMAIL
		customerService.email = "john@gmail.com";
		String newEmail = "";
		newEmail = customerService.getEmail();
		System.out.println("Entered Email is: " + newEmail);

		//ADDRESS
		customerService.address = "100 Queen Steert";
		String newAddress = "";
		newAddress = customerService.getAddress();
		System.out.println("Entered Address is: " + newAddress);

		// UPDATING NAME
		System.out.println("Enter New name:");
		customerService.updateName(sc.nextLine());

		String updatedName = customerService.getName();
		System.out.println("New Name is: " + updatedName);

		// UPDATING EMAIL
		System.out.println("Enter new email");
		customerService.updateEmail(sc.nextLine());

		String updatedEmail = customerService.getEmail();
		System.out.println("New Email is: " + updatedEmail);

		// UPDATING ADDRESS
		System.out.println("Enter new ADDRESS");
		customerService.updateAddress(sc.nextLine());

		String updatedAddress = customerService.getAddress();
		System.out.println("New Address is: " + updatedAddress);

	}
}
