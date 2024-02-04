package Java_Practice_Assignments;

import java.util.Scanner;


public class IceCreamParlor {

    static final int vanillaCost = 2;
    static int vanillaQt;
    static final int chocolateCost = 3;
    static int chocolateQt;
    static final int strawberryCost = 5;
    static int strawberryQt;
    static final double tripleSundaeCost = (vanillaCost + chocolateCost + strawberryCost)*0.98;
    static int tripleSundaeQt;
    static final double nysSalesTax = 0.04;
    static int customers;
    static double totalRev;
    static double totalTax;
    static double totalSales;


    public static void main(String[] args) {
        System.out.println("Welcome to Saanvi's Ice Cream Parlor");
        
        do{
            printMenu();

            int choice;
            Scanner input = new Scanner(System.in);
            choice = input.nextInt();

            if(choice == 0){
                System.exit(0);
            }
            else if(choice == 1){
                choice1();
            }
            else if(choice == 2){
                choice2();
            }
            else if(choice == 3){
                choice3();
            }
            else if(choice == 4){
                choice4();
            }
            else if(choice == 5){
                printDailyReport();
            }
            else if(choice == 6){
                clearReport();
            }
            
        }while(true);

    }
    
    public static void printMenu() {

        System.out.println("----- MENU -----");
        System.out.println("1 -> Vanilla");
        System.out.println("2 -> Chocolate");
        System.out.println("3 -> Strawberry");
        System.out.println("4 -> Triple Sundae");
        System.out.println("5 -> Print Daily Report");
        System.out.println("6 -> Clear Report");
        System.out.println("0 -> Exit");
    
    }

    public static void choice1() {
        
        System.out.println("Vanilla Icecream");
        System.out.print("Enter Quantity = ");
        Scanner input = new Scanner(System.in);
        int quantity = input.nextInt();
        customers++;
        System.out.println("Customer " + customers);
        int totalVanillaPrice = vanillaCost*quantity;
        System.out.println("Charge = $"+totalVanillaPrice);
        double totalSalesTax = totalVanillaPrice*nysSalesTax;
        System.out.println("Tax = $"+totalSalesTax);
        vanillaQt += quantity;
        totalRev+=totalVanillaPrice; 
        totalTax+=totalSalesTax;
        double totalCost = totalVanillaPrice+totalSalesTax;
        System.out.println("Total = $"+totalCost);
        totalSales+=totalCost;
        


    }

    public static void choice2() {
        System.out.println("Chocolate Icecream");
        System.out.println("Enter Quantity = ");
        Scanner input = new Scanner(System.in);
        int quantity = input.nextInt();
        customers++;
        System.out.println("Customer "+customers); 
        double totalchocolatePrice = chocolateCost*quantity;
        System.out.println("Charge = $"+ totalchocolatePrice);
        double totalSalesTax = totalchocolatePrice*nysSalesTax;
        System.out.println("Tax = $"+totalSalesTax);
        chocolateQt+=quantity;
        totalRev += totalchocolatePrice;
        totalTax += totalSalesTax;
        double totalCost = totalchocolatePrice + totalSalesTax;
        System.out.println("Total = $"+totalCost);
        totalSales += totalCost;


    }

    public static void choice3() {
        System.out.println("Strawberry Icecream");
        System.out.println("Enter Quantity = ");
        Scanner input = new Scanner(System.in);
        int quantity = input.nextInt();
        customers++;
        System.out.println("Customer "+customers);
        double totalstrawberryCost = strawberryCost*quantity;
        strawberryQt+=quantity;
        System.out.println("Charge = $"+totalstrawberryCost);
        double totalSalesTax = totalstrawberryCost*nysSalesTax;
        System.out.println("Tax = $"+totalSalesTax);
        totalRev+=totalstrawberryCost;
        totalTax+=totalSalesTax;
        double totalCost = totalstrawberryCost + totalSalesTax;
        System.out.println("Total = $"+totalCost);
        totalSales += totalCost;


    }

    public static void choice4(){
        System.out.println("Triple Sundae");
        System.out.println("Enter Quantity = ");
        Scanner input = new Scanner(System.in);
        int quantity = input.nextInt();
        customers++;
        System.out.println("Customer "+customers);
        double totalsundaePrice = tripleSundaeCost*quantity;
        System.out.println("Charge = $"+totalsundaePrice);
        double totalSalesTax = totalsundaePrice*nysSalesTax;
        System.out.println("Tax = $"+totalSalesTax);
        tripleSundaeQt+=quantity;
        totalRev+=totalsundaePrice;
        totalTax+=totalSalesTax;
        double totalCost = totalsundaePrice + totalSalesTax;
        System.out.println("Total = $"+totalCost);
        totalSales+=totalCost;



    }

    public static void printDailyReport() { //Choice 5
        System.out.println("Daily Report of the Icecream Parlor");
        System.out.println("Total Customers = "+customers);
        System.out.println("Total Vanilla Ordered = "+vanillaQt);
        System.out.println("Total Chocolate Ordered = "+chocolateQt);
        System.out.println("Total Strawberry Ordered = "+ strawberryQt);
        System.out.println("Total Triple Sundae's Ordered = "+tripleSundaeQt);
        System.out.println("Total Revenues = $"+totalRev);
        System.out.println("Total Tax = $"+totalTax);
        System.out.println("Total Net Revenue = $"+totalSales);
        if(totalSales == (totalRev+totalTax)){
            System.out.println("My Logic is Correct.");
        }else{
            System.out.println("My Logic is Wrong.");
        }
    }

    public static void clearReport() { //Choice 6
        System.out.println("Clear Report");

        vanillaQt = chocolateQt = strawberryQt = tripleSundaeQt = customers = 0;
        totalRev = totalTax = totalSales = 0;
    }

}
