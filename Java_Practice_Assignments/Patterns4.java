package Java_Practice_Assignments;
public class Patterns4 {
    public static void main(String [] args){
        int numberOfRows = 6;

    int i, j;

    //This loop will print the first half of the diamond pattern
    for (i = 1; i <= numberOfRows; i++) {

      //prints the spaces 
      // 5 spaces in second row, etc
      for (j = 1; j <= numberOfRows - i; j++) {
        System.out.print(" ");
      }

      //printing the stars after the spaces
      for (j = 1; j <= i * 2 - 1; j++) {
        System.out.print("*");
      }

      // Move the cursor to new line after each row
      System.out.println();
    }

    //prints the bottom hald of the triangle
    for (i = numberOfRows - 1; i > 0; i--) {

      // printing spaces for the bottom half of triangle
      for (j = 1; j <= numberOfRows - i; j++) {
        System.out.print(" ");
      }

      // printing stars of second half
      for (j = 1; j <= i * 2 - 1; j++) {
        System.out.print("*");
      }

      // Move the cursor to new line after each row
      System.out.println();
    }
    }
}
