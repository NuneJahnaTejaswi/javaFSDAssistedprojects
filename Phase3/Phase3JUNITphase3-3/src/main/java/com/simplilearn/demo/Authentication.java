package com.simplilearn.demo;

import java.util.Scanner;

public class Authentication{
	
	public boolean authentication(String username,String password) {
		if(username=="tejaswi"& password=="tejaswi@123") {
			return true;
		}
		else {
			return false;
		}
	}
}