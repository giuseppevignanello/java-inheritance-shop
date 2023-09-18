package org.lessons.java.shop;

public class Product {

	private String code; 
	private String name; 
	private String brand; 
	private Double price; 
	private int iva;
	
	public Product(String code, String name, String brand, Double price, int iva ) {
		this.code = code;
		setName(name);
		setBrand(brand);
		setPrice(price); 
		setIva(iva);
	}
	
	
	//setters
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setPrice(Double price) {
		this.price= price;
	}
	public void setIva(int iva) {
		this.iva = iva;
	}
	
	//getters 
	
	public String getCode() {
		return code;
	}
	
	public String getName() {
		return name;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public Double getPriceBase() {
		return price;
	}
	
	public int getIva() {
		return iva;
	}
	
	public Double getFullPrice() {
		double ivaPrice = (price * iva) /100;
		double fullPrice = price + ivaPrice;
		
		return fullPrice;
			
	}
	
	@Override
	public String toString() {
		return	"Code: " + code + 
				" Name: " + name + 
				" Brand: " + brand +
				" Price: $" + price +
				" Iva: " + iva + 
				" Full Price: $" + getFullPrice();
	} 
	
}
