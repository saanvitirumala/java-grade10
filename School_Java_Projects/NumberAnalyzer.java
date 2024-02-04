package School_Java_Projects;

import java.util.Scanner;

public class NumberAnalyzer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double num1;
        double  num2;
        double  num3;

        System.out.println("Hello, I'm the Number Analyzer! Please enter 3 whole #'s in seperately and I will calculate the sum, product,formula, and largest #");
        System.out.println("---------------------------------");
        System.out.println("Enter your #'s below:");

        Scanner input = new Scanner(System.in);

        num1 = input.nextDouble();
        num2 = input.nextDouble();
        num3 = input.nextDouble();
        
        // DOUBLES ACCEPT - DECIMALS AS WELL

        double sum;
        sum = num1 + num2 + num3;

        double product;
        product = num1 * num2 * num3;

        double formula;
        formula = 3*num1 + 2 / num2 + num3 - 5;

        System.out.println("-----------------------");
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Formula: " + formula);
        
        if (num1 > num2) { // check if num1 >num 2
            if (num1 > num3) {  // then check if num1 > num3
                System.out.println("Largest Number: " + num1);
            } else { // if num 1 is not greater than num 3
                System.out.println("Largest Number: " + num3);
            }
        } else if (num2 > num3) {  // check if num2 > num 3
            System.out.println("Largest Number: " + num2);
        } else {     //else  if num 3 > num 2
            System.out.println("Largest Number: " + num3);
        }

        

    }

}

