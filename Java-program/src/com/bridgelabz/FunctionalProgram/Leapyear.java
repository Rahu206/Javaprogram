package com.bridgelabz.FunctionalProgram;
import java.util.Scanner;
public class Leapyear{
       public static void main(String args[]){

   Scanner scanner=new Scanner (System.in);
   System.out.println("Enter Year to be check:");
    int year= scanner.nextInt();

      if(year%4==0){
          System.out.println("Given year is leap Year");
      }else 
        System.out.println("Given year is not leap Year");
    }
 }
