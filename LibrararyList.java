package com.x_workz.controlStatements;

public class LibrararyList {

	

		// this method has parameter and no return type:

		public static void LibrararyList(String usn, String name) {
			String studentUsn = "4pm16cs022";
			String studentName = "Bhoomika";
			if (usn == studentUsn && name == studentName) {
				System.out.println("Library ID Exist...");

			} else {
				System.out.println("Please check the usn correctly!!! ");
			}
		}

		public static void main(String[] args) {
			String usn = "Bhoomika";
			String name = "4pm16cs022";
			LibrararyList.LibrararyList(usn, name);
		}
	}
