package com.warehouse.inventory;

import com.warehouse.inventory.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.warehouse.inventory.service.ProductService;
import java.util.Scanner;

@SpringBootApplication
public class InventoryApplication implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(InventoryApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}

	private void showMenu() {
		System.out.println("Select an option:");
		System.out.println("1. Add Part");
		System.out.println("2. Add Product");
		System.out.println("3. Exit");

		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();

		switch (choice) {
			case 1:
				addPart();
				break;
			case 2:
				addProduct();
				break;
			case 3:
				System.out.println("Exiting...");
				System.exit(0);
			default:
				System.out.println("Invalid choice. Try again.");
				showMenu();
		}
	}

	private void addProduct() {
	}

	private void addPart() {
	}

}
