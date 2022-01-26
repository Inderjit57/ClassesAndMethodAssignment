/*
 * 3. There is Product class which has 3 variables that are already initialized, productName , product description  and price. 
 * Write methods which just prints these values and call it from main class. 
 * NOTE : no sysout should be present in main class.
 */
package Question3;

import java.util.Scanner;

public class Product {

	Scanner sc = new Scanner(System.in);
	 
	String productName = "";
	String productDescription = "";
	double price = 0;
	
	void getProductName (){
	    System.out.println("Enter Product name: ");
	    productName = sc.nextLine();
	    System.out.println("Product name: " + productName);
	}

    void getProductDescription(){
        System.out.println("Enter Product Desciption: ");
	    productDescription = sc.nextLine();
        System.out.println("Product description: " + productDescription);
    }
    
    void getPrice(){
        System.out.println("Enter Product price: ");
	    price = sc.nextDouble();
        System.out.println("Product price: " + "$"+price);
    }
	
}
