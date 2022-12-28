package com.bridgelabz.day6practice_problems;

import java.util.Scanner;

public class Fibonacii {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length");
		int length = sc.nextInt();
		int num1 = 0;
		int num2 = 1;
	
		System.out.println(num1);
		System.out.println(num2);
		for (int i = 3; i <= length; i++)
		{
			
			int num3 = num1 + num2;
			System.out.println(num3);
			num1 = num2;
			num2 = num3;
		}
		
	}

}
