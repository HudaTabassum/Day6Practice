package com.bridgelabz.day6practice_problems;

import java.util.Scanner;

public class PrimeNumber {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int num = sc.nextInt();
		int count = 0;
		
		for (int i = 2; i < num-1; i++)
		{
			if(num%i == 0)
			{
				count++;
			}
			
		}
		if(count > 0)
		{
			System.out.println("The given number is not a prime number");
		}
		else
		{
			System.out.println("The given number is a prime number");
		}
		
	}

}
