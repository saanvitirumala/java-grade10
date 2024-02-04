package School_Java_Projects;
import java.util.Scanner;

public class TaxCalc1 {
    public static void main(String[] args) {
        
        double grossIncome;
        int numDependants;
        
        double taxableIncome;
        double incomeTax;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Hello, I will estimate taxes owed");
        System.out.println("Please enter income: ");
        grossIncome = input.nextDouble();
        
        System.out.println("Please enter # dependents");
        numDependants = input.nextInt();
        
        taxableIncome = grossIncome - 10000 - (numDependants * 2000);
        incomeTax =  taxableIncome * .20;
        incomeTax = Math.round(incomeTax);
        
        System.out.println("---------------------------");
        System.out.println("OK");
        System.out.println("Here's what you owe:");
        System.out.println("Taxes = $" + incomeTax);
        
      
    }
}
