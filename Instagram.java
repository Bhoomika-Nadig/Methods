package com.x_workz.controlStatements;

public class Instagram {

	// this method has parameter and no return type:

	public static void InstagramLogin(String email, String pswd) {

		String emailLogin = "bhoomikanadig@gmail.com";
		String password = "123";

		if (email == emailLogin && password == pswd) {
			System.out.println("successfully logged ");

		} else {
			System.out.println("email and password are incorrect");
		}

	}

	public static void main(String[] args) {

		String email = "bhoomikanadig@gmail.com";
		String password = "123";
		Instagram.InstagramLogin(email, password);
	}

}