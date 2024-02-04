package Java_Practice_Assignments;
import java.util.Scanner;

public class Pattern7{
public static void main(String args[])
  {
    //This represents the number of rows in the pattern
    int numberOfRows;
    System.out.println("Enter the number of rows: ");
    //collects user input
    Scanner input = new Scanner(System.in);
    numberOfRows = input.nextInt();
    input.close();

    //This outer loop will run based on the number entered by user

    for (int i=numberOfRows; i>=1; i--)
    {
      //this will print the spaces for each row
      for (int j=numberOfRows; j>i;j--)
      {
        System.out.print(" ");
      }
      //this prints the stars for each row
      for (int k=1;k<=i;k++)
      {
        System.out.print("*");
      }

      System.out.println();
    }

  }

}
