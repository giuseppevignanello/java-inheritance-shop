package org.lessons.java.shop;

public class Television extends Product{

	private boolean isSmart; 
	private int dimensions; 
	
	
	public Television(String code, String name, String brand, Double price, int iva, int dimensions, boolean isSmart) {
		super(code, name, brand, price, iva);
		
		setIsSmart(isSmart);
		
	}


	private void setIsSmart(boolean isSmart) {
		this.isSmart = isSmart;
		
	}
	
	public boolean getIsSmart() {
		return isSmart;
	}


	public int getDimensions() {
		return dimensions;
	}


	public void setDimensions(int dimensions) {
		this.dimensions = dimensions;
	}

}
