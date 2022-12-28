package com.bridgelabz.day6practice_problems;
import java.util.Scanner;

public class PerfectNumber {
public static void main(String[] args) {
		
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		for (int i = 1; i < num; i++)
		{
		if(num % i == 0)
			//System.out.println(i);
		sum = sum + i;
		}
	
	if (num == sum)
	{
		System.out.println("The given number is a perfect number");
	}
	else 
	{
		System.out.println("The given number is not a perfect number");
	}
	}

}
