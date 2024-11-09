package com.edubridge.springapp1.beans;

public class SamsungMobile implements Mobile {
	
	int modelNo;
	String color;
	
	@Override
	public String toString() {
		return "SamsungMobile [modelNo=" + modelNo + ", color=" + color + "]";
	}
	
	//Constructor with Arguments.
	public SamsungMobile(int modelNo, String color) {
		super();
		this.modelNo = modelNo;
		this.color = color;
	}
	
	// if you want to inject values for properties we need parameterized constructor.
	//0-Args Constructor.
	public SamsungMobile() {
		System.out.println("SamSung Mobile Constructor");
	}
	
	public void call() {
		System.out.println("Calling using SamsungMobile");
	}
}
