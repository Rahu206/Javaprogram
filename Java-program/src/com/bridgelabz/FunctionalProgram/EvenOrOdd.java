package com.bridgelabz.FunctionalProgram;
import java.util.Scanner;

/* Java Program to check whether entered number is EVEN or ODD */

public class EvenOrOdd{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num;

		//inpu
		System.out.print("Enter an integer number: ");
		num=sc.nextInt();

		//check EVEN or ODD
		if(num%2 ==0)
		{
			System.out.println(num +" is an EVEN number.");
		}
		else
		{
			System.out.println(num +" is an ODD number.");
		}
	}
}
