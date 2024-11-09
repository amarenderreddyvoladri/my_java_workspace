package com.edubridge.springapp1.beans;

public class IphoneMobile implements Mobile {
	
	int modelNo;
	String color;
	
	@Override
	public String toString() {
		return "IphoneMobile [modelNo=" + modelNo + ", color=" + color + "]";
	}
	
	// here mainly setters are used to inject the values into the particular id in property filed in xml file.
	
	// getters and setters.
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
	
	
	//Constructor.
	public IphoneMobile() {
		System.out.println("Iphone Mobile Constructor");
	}
	
	public void call() {
		System.out.println("Calling using SamsungMobile");
	}
}
