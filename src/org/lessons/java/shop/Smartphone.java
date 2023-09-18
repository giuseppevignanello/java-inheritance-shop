package org.lessons.java.shop;

public class Smartphone extends Product{

	private int memory; 
	private String IMEI;
	
	public Smartphone(String code, String name, String brand, Double price, int iva, int memory, String IMEI) {
		super(code, name, brand, price, iva);
		
		setMemory(memory);
		setIMEI(IMEI);
	}
	
	public int getMemory() {
		return memory;
	}


	public void setMemory(int memory){
		this.memory = memory;
	}

	public String getIMEI() {
		return IMEI;
	}

	public void setIMEI(String IMEI) {
		this.IMEI = IMEI;
	}
	
	@Override 
	public String toString() {
		return super.toString() +
		" IMEI: " + this.IMEI +
		" Memory: " + memory + "GB";
	}
	
	public  Double getDiscountedPrice() {
		if(memory > 32) {
			int discount = 5;
			double discounted = (getFullPrice() * discount) /100;
			double discountedPrice = getFullPrice() - discounted;
			return discountedPrice;
		} else {
			return super.getDiscountedPrice();
		}
		
		
	}

}
