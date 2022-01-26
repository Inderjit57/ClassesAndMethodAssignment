//2. Create a class CustomerService which has 3 variables update name, email and address. 
//Initialize these variables with the value gives below. 
//
//Name = John 
//Email = john@gmail.com
//Address = 100 queen street
//
//Write code to update these values from main class.
package Question2;

public class CustomerService {

	String name = "";
	String email = "";
	String address = "";

	// Get NAME, EMAIL, ADDRESS
	String getName() {
		return name;
	}

	String getEmail() {
		return email;
	}

	String getAddress() {
		return address;
	}

	// UPDATE NAME, EMAIL, ADDRESS
	void updateName(String newName) {
		name = newName;
	}

	void updateEmail(String newEmail) {
		email = newEmail;
	}

	void updateAddress(String newEmail) {
		address = newEmail;
	}

}
