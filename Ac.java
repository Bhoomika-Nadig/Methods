package com.x_workz.controlStatements;

public class Ac {
	public static void on() {
		System.out.println("Ac is turned on");
	}

	public static void off() {
		System.out.println("Ac is turned  off");
	}

	public static void increaseTemperature() {
		System.out.println("Ac temperature is increase");
	}

	public static void decreaseTemperature() {
		System.out.println("Ac temperature is decrease");
	}

	public static void main(String[] args) {
		Ac.on();
		Ac.off();
		Ac.increaseTemperature();
		Ac.decreaseTemperature();

	}

}