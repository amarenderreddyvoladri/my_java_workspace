package com.edubridge.springapp2.beans;


public class EpsonPrinter implements Printer{
	private String modelNo;
	private String color;
	private double price;
	
	
	
	public EpsonPrinter(String modelNo, String color, double price) {
		super();
		this.modelNo = modelNo;
		this.color = color;
		this.price = price;
		System.out.println("Epson Printer Object is Created!");
	}

	@Override
	public String toString() {
		return "EpsonPrinter [modelNo=" + modelNo + ", color=" + color + ", price=" + price + "]";
	}

	public void printJob() {
		System.out.println("Printing using EpsonPrinter.");
	}
}
