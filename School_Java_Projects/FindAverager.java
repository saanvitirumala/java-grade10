package School_Java_Projects;

import java.util.Scanner;

public class FindAverager {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int MAX_GRADES = 20; // Maximum number of grades
        double[] grades = new double[MAX_GRADES];
        int count = 0;
       
        System.out.println("Please enter grades between 0-100 (type -1 to find average)");

        // Input grades until -1 is entered or maximum number of grades is reached
        while (true) {
            System.out.print("Please enter a score: ");
            double grade = input.nextDouble();
            
            if (grade == -1) {
                break;
            }
            
            if (grade < 0 || grade > 100) {
                System.out.println("Invalid grade. Please enter a grade between 0 and 100.");
                continue;
            }
            
            if (count < MAX_GRADES) {
                grades[count] = grade;
                count++;
            } else {
                System.out.println("Maximum number of grades reached.");
                break;
            }
        }
        
        // Calculate average after dropping the lowest score
        if (count >= 3) {
            double lowest = grades[0];
            int lowestIndex = 0;
            
            for (int i = 1; i < count; i++) {
                if (grades[i] < lowest) {
                    lowest = grades[i];
                    lowestIndex = i;
                }
            }
            
            double sum = 0;
            for (int i = 0; i < count; i++) {
                if (i != lowestIndex) {
                    sum += grades[i];
                }
            }
            
            double average = sum / (count - 1);
            System.out.printf("Your average is %.1f\n", average);
        } else {
            System.out.println("At least three grades are required to calculate the average.");
        }
    }
    
    }

