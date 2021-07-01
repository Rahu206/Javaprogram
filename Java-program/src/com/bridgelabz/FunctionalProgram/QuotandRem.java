package com.bridgelabz.FunctionalProgram;
import java.util.Scanner;
       // Import Scanner class of java.util package
  public class QuotandRem {

    public static void main(String[] args)
    {
        // declare required variables to be used
        int dvnd, dvsr;
        // create a Scanner class object
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter dividend value: ");
        // Take dividend value from user
        dvnd=sc.nextInt();

        System.out.println("Enter divisor value: ");
        // Take divisor value from user
        dvsr=sc.nextInt();

        // Take quotient as variable quot and compute quotient
        // Store the result in quot
        int quot = dvnd / dvsr;
        // Take remainder as variable rem and compute quotient
        // Store the result in rem
        int rem = dvnd % dvsr;
        // Print the quotient value
        System.out.println("Quotient = " + quot);
        // Print the remainder value
        System.out.println("Remainder = " + rem);
    }
}
