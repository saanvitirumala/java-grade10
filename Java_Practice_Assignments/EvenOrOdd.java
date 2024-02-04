package Java_Practice_Assignments;
import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {

        System.out.println("Enter in a whole number, I will determine whether it is even or odd.");
        Scanner input = new Scanner(System.in);

        int nums = input.nextInt();

        if (nums % 2 == 0) {
            System.out.println(nums + " is an even number.");

        } else {
            System.out.println(nums + " is an odd number");
        }
    }

}
