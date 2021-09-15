package com.x_workz.controlStatements;

public class TollGate {
	public static void open() {
		System.out.println("toll gate are open");
	}

	public static void close() {
		System.out.println("toll gate are close");
	}

	public static void tickets() {
		System.out.println("toll gate are giving tickets");
	}

	public static void main(String[] args) {
		TollGate.open();
		TollGate.close();
		TollGate.tickets();

	}

}