//package com.te.switchcondition;

import java.util.Scanner;

public class FactorialNumber {
	public static void main(String[] args) {
		int n,i,fact=1;
		System.out.println("Enter the number to find the factorial of a number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=1;i<=n;i++){
			fact*=i;
		}
		System.out.println("Factorial of a given number "+n+" is "+fact);
	}
	
}
