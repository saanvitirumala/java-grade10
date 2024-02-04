package School_Java_Projects;

import java.util.Scanner;

public class Assignment1BasicConsoleApp {
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in); 
     double sqFeet;
     double sqMeters;
    
     System.out.println("Hello, I will convert the Square ft of your building/floorplan to Square meters");
        System.out.println("Please Enter ft measure:");
        sqFeet = input.nextDouble();
        
        sqMeters = sqFeet / 3.821;
        System.out.println("---------------------------");
        System.out.println("The value of your measurement in meters is:"+ sqMeters);
                
        
    }
    
}
