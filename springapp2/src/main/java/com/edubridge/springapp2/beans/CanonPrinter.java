package com.edubridge.springapp2.beans;

public class CanonPrinter implements Printer {
	private int modelNo;
	private String color;
	private double price;
	
	
	
	public CanonPrinter() {
		System.out.println("Canon Printer Object is Created!");
	}

	public void printJob() {
		System.out.println("Printing using CanonPrinter.");
	}

	// generate getters and setters.
	// we use constructors basically upto 3 srgument properties only.
	// and we go to set more than 3 preoperties by using setters.

	@Override
	public String toString() {
		return "CanonPrinter [modelNo=" + modelNo + ", color=" + color + ", price=" + price + "]";
	}

	public int getModelNo() {
		return modelNo;
	}

	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	

	
}
