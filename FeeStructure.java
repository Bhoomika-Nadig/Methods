package com.x_workz.controlStatements;

public class FeeStructure {

	public static int StructureOfFees(int clgFees, int libraryFees, int busFees) {

		int totalFees = clgFees + busFees + libraryFees;
		return totalFees;

	}

	public static void main(String[] args) {

		int busFees = 5000;
		int libraryFees = 2000;
		int clgFees = 10000;
		int totalAmount = FeeStructure.StructureOfFees(clgFees, libraryFees, busFees);

		System.out.println("Total fees is " + totalAmount);
	}
}