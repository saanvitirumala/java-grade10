package Java_Practice_Assignments;
import java.util.Scanner;

public class Patterns6 {
   public static void main(String [] args){
    int numberOfRows;
    System.out.println("How many rows would you like?: ");
    //asking for users rows
    Scanner input = new Scanner(System.in);
    numberOfRows = input.nextInt();
    input.close();

    //This loop will run depending on th users input

    for (int i= 0; i<= numberOfRows-1; i++)
    {

      //Print spaces before each star
      for (int j=0; j<=i; j++)
      {
        System.out.print(" ");
      }
      //Print stars and spaces between each
      for (int k=0; k<=numberOfRows-1-i; k++)
      {
        System.out.print("*" + " ");
      }
      //new line for each row
      System.out.println();
    }
   }
    
}
