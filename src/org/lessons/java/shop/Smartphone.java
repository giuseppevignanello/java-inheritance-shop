package org.lessons.java.shop;

public class Smartphone extends Product{

	private int memory; 
	private String IMEI;
	
	public Smartphone(String code, String name, String brand, Double price, int iva, int memory, String IMEI) {
		super(code, name, brand, price, iva);
		
		setMemory(memory);
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

	public void setIMEI(String iMEI) {
		this.IMEI = iMEI;
	}

}
