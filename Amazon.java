package com.x_workz.controlStatements;

public class Amazon {

	public static void homeAccesories() {
		System.out.println("watch\n jackets\n phones\n");
	}

	public static void orderCloths() {
		System.out.println("clothes\n");
	}

	public static void wishList() {
		System.out.println("earings");
	}

	public static void main(String[] args) {
		System.out.println("login to amazon succesfully");
		Amazon.homeAccesories();
		Amazon.orderCloths();
		Amazon.wishList();

	}

}