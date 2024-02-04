package School_Java_Projects;

import java.util.Scanner;
public class FreeThrowPercentFinder {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ft1;
        int ft2;
        int ft3;
        int ft4;
        int ft5;
        
        System.out.println("Enter in 1 if you made the free throw shot. Enter a 0 if you missed one. I will calculate the % of your successful free throws");
        System.out.println("Enter free shot attempt 1 below:");
        ft1 = input.nextInt();
        
        System.out.println("Enter free shot attempt 2 below");
        ft2 = input.nextInt();
        
        System.out.println("Enter free shot attempt 3 below");
        ft3 = input.nextInt();
        
        System.out.println("Enter free shot attempt 4 below");
        ft4 = input.nextInt();
        
        System.out.println("Enter attempt 5 below");
        ft5 = input.nextInt();
        
        double sumft = (ft1+ft2+ft3+ft4+ft5)/5.0 * 100;
      
        System.out.println("-----------------------");
        System.out.println("Here is how successful your free throw shots are:"+sumft+"%");
        
        
        
        
        
        
       
    }
    
}
