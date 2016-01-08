package com.example;

public class TestStringOperation {

	public static void main(String[] args) {
		String haha = "mwg is a handsome boy";
		String newHaha = StringOperation.replace(haha, 'a', 'o');
		System.out.println("new haha is " + newHaha);
	}

}
