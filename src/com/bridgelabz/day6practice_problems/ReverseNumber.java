package com.bridgelabz.day6practice_problems;

public class ReverseNumber {
	public static void main(String[] args) {
		 int num = 267;
		 int rem = 0;
		
		 while (num > 0)
		 {
			 rem = num % 10;
			System.out.println(rem);
			 num = num / 10;
		 }
		 
		 
	}
}
