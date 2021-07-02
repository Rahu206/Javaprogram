package com.bridgelabz.logicalProgram;
import java.util.Scanner;

public class ReverseNo {

	public static void main(String[] args) {

		int reversedNum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();

		// closing scanner class(not compulsory, but good programming practice)
		sc.close();

		for (; num != 0; num /= 10) {
			int digit = num % 10;
			reversedNum = reversedNum * 10 + digit;
		}

		System.out.println("Reversed Number: " + reversedNum);
	}
}
