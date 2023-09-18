package org.lessons.java.shop;

public class Headphone extends Product {

	private String color; 
	private boolean isWirelessOrCabladed;
	
	public Headphone(String code, String name, String brand, Double price, int iva, String color, boolean isWirelessOrCabladed) {
		super(code, name, brand, price, iva);
		setColor(color);
		setWirelessOrCabladed(isWirelessOrCabladed);
	}

	public boolean isWirelessOrCabladed() {
		return isWirelessOrCabladed;
	}

	public void setWirelessOrCabladed(boolean isWirelessOrCabladed) {
		this.isWirelessOrCabladed = isWirelessOrCabladed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return super.toString() +
		"Color: " + this.color + 
		"Wireless or Cabled " + (isWirelessOrCabladed ? " Wireless " : "Cabled");
	}

}
