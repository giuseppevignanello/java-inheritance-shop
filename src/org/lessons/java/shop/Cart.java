package org.lessons.java.shop;

import java.util.Scanner;

public class Cart {
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Add a new item to the cart!");
	boolean stop = false; 
	
	while(!stop) {
	
	System.out.println("Do you want to buy a Smartphone [1], a TV [2] or a pair of headphones [3]?");
	
	String userItemChoice = sc.nextLine();
	System.out.println("Write the code");
	String code = sc.nextLine();
	System.out.println("Write the name");
	String name = sc.nextLine();
	System.out.println("Write the brand");
	String brand = sc.nextLine();
	System.out.println("Write the price");
	String priceString = sc.nextLine();
	double price = Double.parseDouble(priceString);
	System.out.println("Write the iva");
	String ivaString = sc.nextLine();
	int iva = Integer.parseInt(ivaString);
	
	
	
	switch (userItemChoice) {
	case "1": {
		System.out.println("Write IMEI code");
		String IMEI = sc.nextLine();
		System.out.println("Write the memory");
		String memoryString = sc.nextLine();
		int memory = Integer.parseInt(memoryString);
		Smartphone smartphone = new Smartphone (code, name, brand, price, iva, memory, IMEI);
		
		break;
	}
	case "2": {
		
		System.out.println("Write the dimensions");
		String dimensionsString = sc.nextLine();
		int dimensions = Integer.parseInt(dimensionsString);
		System.out.println("Is it a smart TV? (Type 'true' for YES, 'false' for NO");
		String isSmartString = sc.nextLine();
		boolean isSmart = Boolean.parseBoolean(isSmartString);
		
		Television television = new Television (code, name, brand, price, iva, dimensions, isSmart);
		
		break;
	}
	case "3": {
	
		System.out.println("Write the color");
		String color = sc.nextLine();
		System.out.println("Are They Wireless or Cablete?");
		String wirelessOrCableteString = sc.nextLine();
		boolean wirelessOrCablete;
		if(wirelessOrCableteString.equals("wireless")) {
			wirelessOrCablete = true;
		} else {
			wirelessOrCablete = false;
		}
		
		Headphone headphone = new Headphone(code, name, brand, price, iva, color, wirelessOrCablete);
	break;
	}
	
	}
	
	System.out.println("Do you want to continue? Type 'no' to stop. Any other word to continue");
	String response = sc.nextLine();
	if(response.equals("no")) {
		stop = true;
	}
	
} 
	System.out.println("finished");
	}
}
