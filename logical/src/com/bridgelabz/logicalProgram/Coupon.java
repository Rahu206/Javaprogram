package com.bridgelabz.logicalProgram;
import java.util.Scanner;
public class Coupon {
	public static int generateRandomNumber() {
	//random function to generate the distinct number
	return 0;	
	}
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the N : ");
		
		int n = scanner.nextInt();
		int countDistinct =0;
		int[]couponArray = new int [n];
		while(n>=countDistinct) {
			int randomNumber = generateRandomNumber();
			for(int i=0;i<n;i++) {
				if(randomNumber!= couponArray[i]) {
					couponArray[i]=randomNumber;
					countDistinct++;
				}
				
			}
		}
		
	}
	
	
}

	

