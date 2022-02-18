package curso10;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		

		Product product = new Product();
		System.out.println("ENTER PRODUCT DATA :");
		System.out.print("NAME: ");
		product.name = sc.nextLine();
		
		System.out.print("PRICE: ");
		product.price = sc.nextDouble();
		
		System.out.print("QUANTITY DO STOCK : ");
		product.quantity = sc.nextInt();
		
		System.out.println();
		System.out.println("PRODUCT UPDATE: " + product);
		
		System.out.println();
		System.out.print("ENTER THE NUMBER OF PRODUCT TO BE ADDED IN STOCK: ");
		int quantity = sc.nextInt();
		product.addproducts(quantity);
		
		System.out.println();
		System.out.println("UPDATED DATA: " +  product);
		System.out.println();
		
		System.out.print("ENTER THE NUMBER OF PRODUCT TO BE  REMOVED FROM STOCK: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("UPDATED DATA: " +  product);
		
		
		
		
		

		sc.close();
	}

}
