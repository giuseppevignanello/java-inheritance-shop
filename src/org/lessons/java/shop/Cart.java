package org.lessons.java.shop;

import java.util.Arrays;
import java.util.Scanner;

public class Cart {
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Add a new item to the cart!");
	
	boolean stop = false;  
	boolean fidelity = false;
	
	String[] cart = new String[10];
	
	System.out.println("Do you have fidelity card? YES or NO");
	String fidelityString = sc.nextLine();
	int i = 0;
	if(fidelityString.equals("YES")) {
		fidelity = true;
	}
	
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
	//Smartphone case
	case "1": {
		System.out.println("Write IMEI code");
		String IMEI = sc.nextLine();
		System.out.println("Write the memory");
		String memoryString = sc.nextLine();
		int memory = Integer.parseInt(memoryString);
		Smartphone smartphone = new Smartphone (code, name, brand, price, iva, memory, IMEI);
		cart[i] = smartphone.toString();
		i++;
		break;
	}
	//television case
	case "2": {
		
		System.out.println("Write the dimensions");
		String dimensionsString = sc.nextLine();
		int dimensions = Integer.parseInt(dimensionsString);
		System.out.println("Is it a smart TV? (Type 'true' for YES, 'false' for NO");
		String isSmartString = sc.nextLine();
		boolean isSmart = Boolean.parseBoolean(isSmartString);
		Television television = new Television (code, name, brand, price, iva, dimensions, isSmart);
		cart[i] = television.toString();
		i++;
		break;
		
	}
	
	//headphone case
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
		cart[i] = headphone.toString();
		i++;
	break;
	}
	
	}
	
	//continue or stop option
	System.out.println("Do you want to continue? Type 'no' to stop. Any other word to continue");
	String response = sc.nextLine();
	if(response.equals("no")) {
		stop = true;
		System.out.println("Your cart: ");
		for (int j = 0; j < cart.length; j++) {
			System.out.println(cart[j]);
	
	}
	
} 
	System.out.println("finished");
	}
	

	}}
