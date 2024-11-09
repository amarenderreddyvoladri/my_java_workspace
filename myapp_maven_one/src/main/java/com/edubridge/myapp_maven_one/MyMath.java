package com.edubridge.myapp_maven_one;

public class MyMath {
	
	String uname = "admin";
	String password = "admin123";
	
	public boolean isEven(int num) {
		return num % 2 == 0;
	}
	
	public boolean isAuthenticate(String uname, String password) {
		
		// check whether the uname and password is matching or not..?
		if(uname.equals(uname) && password.equals(password)) {
			return true;
		}
		else {
			return false;
		}
	}
}
