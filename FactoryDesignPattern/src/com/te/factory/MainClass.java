package com.te.factory;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		System.out.println("Enter the Person code to get the app using information");
		Scanner scanner= new Scanner(System.in);
		String name=scanner.nextLine();
		AppUsingFactory appUsingFactory = new AppUsingFactory();
		AppUsing appUsing=appUsingFactory.getInstance(name);
		appUsing.usage();
	}
}
