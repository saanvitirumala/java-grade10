package Java_Practice_Assignments;
import java.util.Scanner;

public class Patterns5 {
    public static void main(String[] args) {
        int numberOfRows;
        System.out.println("Enter number of rows: ");
        Scanner input = new Scanner(System.in);
        numberOfRows = input.nextInt();
        for (int x = numberOfRows-1; x >= 0; x--) {
          for (int y = 0; y <= x; y++) {
            System.out.print("*");
          }
    
          //New line for new row
          System.out.println();
        }
    }

}
