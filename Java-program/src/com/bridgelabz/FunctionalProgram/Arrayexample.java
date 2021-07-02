package  com.bridgelabz.FunctionalProgram;
import java.util.Scanner;
public class Arrayexample{
    public static void main(String args[]){
         int [] array = new int[5];
         Scanner sc= new Scanner(System.in);
        System.out.println("Enter the array Element : ");
    //for taking input from the user and assigning to the array
    for(int i=0;i<array.length;i++){
        System.out.println("Enter the array["+i+"] index value :");
         array[i]=sc.nextInt();
        }

      // for printing the element of the array
    for(int i=0;i<array.length;i++){
        System.out.print(array[i]+",");
     }
    // array = {5,10,15,20,25};
   }

}

