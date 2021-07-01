package com.bridgelabz.FunctionalProgram;
import java.util.Scanner;
public class Flipcoin{

   public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);
    int numberofHead=0;
    int numberofTails=0;

   System.out.println("Enter the number of time to Flip :");
   int flipTime = scanner.nextInt();

    for (int i=0; i<flipTime;i++){
       if(Math.random()<0.5){
        numberofHead++;
     }else
         numberofTails++;
     }

   int percentofHead = numberofHead/flipTime*100;
    System.out.println("PercentofHead = "+percentofHead);

   }
 }
