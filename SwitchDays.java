//package com.te.switchcondition;

import java.util.Scanner;

public class SwitchDays {
	public static void main(String[] args) {
		String s;
		
		while(true){
			Scanner sc=new Scanner(System.in);
			System.out.println("\nEnter the shortcut to get corresponding day");
			System.out.println("Enter exit to terminate the program");
			System.out.println("--------------------------------------------");
			s=sc.nextLine();
			if(s.equalsIgnoreCase("exit")){
				break;
			}
			switch (s) {
			case "sun":
				System.out.println("Sunday");
				break;
			case "mon":
				System.out.println("Moday");
				break;
			case "tue":
				System.out.println("Tuesday");
				break;
			case "wed":
				System.out.println("Wednesday");
				break;
			case "thu":
				System.out.println("Thursday");
				break;
			case "fri":
				System.out.println("Friday");
				break;
			case "sat":
				System.out.println("Saturday");
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}

		}
		
			}
}
