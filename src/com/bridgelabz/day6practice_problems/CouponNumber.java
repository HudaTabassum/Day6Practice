package com.bridgelabz.day6practice_problems;
import java.util.Scanner;
public class CouponNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int[] num = new int[sc.nextInt()];
		int count = 0;
		for (int i = 0; i < num.length; i++)
		{
			num[i] = sc.nextInt();
		}
	}

}
