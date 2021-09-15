package com.x_workz.controlStatements;

import java.util.Date;

public class DisplayDate {

	public static void displayDate() {
		System.out.println(new Date());
	}

	public static void main(String[] args) {

		System.out.println("beginning of main method");
		DisplayDate.displayDate();

		System.out.println("end of main method");
	}

}