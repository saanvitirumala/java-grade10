package Java_Practice_Assignments;
import java.util.Scanner;

public class Salon {

    // Salon Sample code

    static int hairCuts, permanents, colorings; // Types of salon services available
    static int customers; // total number of customers
    static double dailyRev, dailyTax; // daily revenue(Money earned in does NOT include tax), the daily tax
    static double bonus; // money given to manager if daily revenue is >= $650
    static double dailyNet;

    static final double COSTHC = 20; // Price for Haircut
    static final double COSTPERM = 50; // Price for Permanent
    static final double COSTCOLORING = 60; // Price for Coloring
    static final double COSTHC_PERM = (20 + 50) * 0.85; // Price for Haircut and Permanent combined
    static final double COSTCOL_PERM = (50 + 60) * 0.85; // Price for Coloring and Permanent combined
    static final double COSTHC_COL = (20 + 60) * 0.85; // Price for Haircut and Coloring combined
    static final double COSTHC_PANDC = (20 + 50 + 60) * 0.85; // Price for Haircut, Coloring, and Permanent all combined

    public static void main(String[] args) {
        salonMenu();
    }

    public static void salonMenu() {

        

        int choice;
        Scanner input = new Scanner(System.in);

        do {
            
            printMenu();

            choice = input.nextInt();
            if (choice == 10) { // Exiting menu
                System.exit(0);
            }
            if (choice == 1) { // Reset Daily Totals
                resetTotals();
            }
            if (choice == 2) { // Haircut Only
                choice2();
            }
            if (choice == 3) { // Permanent Only
                choice3();
            }
            if (choice == 4) { // Coloring Only
                choice4();
            }
            if (choice == 5) { // Haircut and Coloring
                choice5();
            }
            if (choice == 6) { // Haircut and Permanent
                choice6();
            }
            if (choice == 7) { // Permanent and Coloring
                choice7();
            }
            if (choice == 8) { // Haircut, Permanent, and Coloring
                choice8();
            }
            if (choice == 9) { // Print Daily Report
                printReport();
            }
        } while (true);

    }


    public static void printMenu() { // Printing Menu to Terminal
        System.out.println("--------MENU--------");
            System.out.println("1 = Reset Daily Totals");
            System.out.println("2 = Haircut Only");
            System.out.println("3 = Permanent Only");
            System.out.println("4 = Coloring Only ");
            System.out.println("5 = Haircut and Coloring");
            System.out.println("6 = Haircut and Permanent");
            System.out.println("7 = Permanent and Coloring");
            System.out.println("8 = Haircut, Permanent, and Coloring");
            System.out.println("9 = Print Daily Report");
            System.out.println("10 = Exit");

    }
    public static void choice2() {
        System.out.println("Haircut Only");
        System.out.println("Charge = $" + COSTHC);
        double tax = COSTHC * 0.07; // Combined tax to service charge
        System.out.println("Tax = $" + tax); // printing total tax
        System.out.println("Total = $" + (COSTHC + tax)); // Printing total charge of service plus the tax
        customers++;
        hairCuts++;
        dailyRev += COSTHC;
        dailyTax += tax;
    }

    public static void choice3() {
        System.out.println("Permanent Only");
        System.out.println("Charge = $" + COSTPERM);
        double tax = COSTPERM * 0.07;
        System.out.println("Tax = $" + tax);
        System.out.println("Total = $" + (COSTPERM + tax));
        customers++;
        permanents++;
        dailyRev += COSTPERM;
        dailyTax += tax;
    }

    public static void choice4() {
        System.out.println("Coloring Only");
        System.out.println("Charge = $" + COSTCOLORING);
        double tax = COSTCOLORING * 0.07;
        System.out.println("Tax = $" + tax);
        System.out.println("Total = $" + (COSTCOLORING + tax));
        customers++;
        colorings++;
        dailyRev += COSTCOLORING;
        dailyTax += tax;
    }

    public static void choice5() {
        System.out.println("Haircut and Coloring");
        System.out.println("Charge = $" + COSTHC_COL);
        double tax = COSTHC_COL * 0.07;
        System.out.println("Tax = $" + tax);
        System.out.println("Total = $" + (COSTHC_COL + tax));
        customers++;
        hairCuts++;
        colorings++;
        dailyRev += COSTHC_COL;
        dailyTax += tax;
    }

    public static void choice6() {
        System.out.println("Haircut and Permanent");
        System.out.println("Charge = $" + COSTHC_PERM);
        double tax = COSTHC_PERM * 0.07;
        System.out.println("Tax = $" + tax);
        System.out.println("Total = $" + (COSTHC_PERM + tax));
        customers++;
        hairCuts++;
        permanents++;
        dailyRev += COSTHC_PERM;
        dailyTax += tax;
    }

    public static void choice7() {
        System.out.println("Coloring and Permanent");
        System.out.println("Charge = $" + COSTCOL_PERM);
        double tax = COSTCOL_PERM * 0.07;
        System.out.println("Tax = $" + tax);
        System.out.println("Total = $" + (COSTCOL_PERM + tax));
        customers++;
        colorings++;
        permanents++;
        dailyRev += COSTCOL_PERM;
        dailyTax += tax;
    }

    public static void choice8() {
        System.out.println("Haircut, Coloring, Permanent");
        System.out.println("Charge = $" + COSTHC_PANDC);
        double tax = COSTHC_PANDC * 0.07;
        System.out.println("Tax = $" + tax);
        System.out.println("Total = $" + (COSTHC_PANDC + tax));
        customers++;
        hairCuts++;
        colorings++;
        permanents++;
        dailyRev += COSTHC_PANDC;
        dailyTax += tax;

    }

    public static void resetTotals() {
        hairCuts = permanents = colorings = customers = 0; // Reseting all values to 0 after each day
        dailyRev = dailyTax = 0;
    }

    public static void printReport() {
        System.out.println("Daily Report for Salon");
        System.out.println("Customers = " + customers);
        System.out.println("Haircuts = " + hairCuts);
        System.out.println("Permanents = " + permanents);
        System.out.println("Colorings = " + colorings);
        double average = dailyRev / customers;
        System.out.println("Average amount spent per Customer(Not including tax) = $" + average);
        System.out.println("Revenues = $" + dailyRev);
        System.out.println("Total Tax = $" + dailyTax);

        if (dailyRev >= 650) {
            bonus = dailyRev * 0.05;
            System.out.println("Manager Bonus = $" + bonus);

        } else {
            bonus = 0;
            dailyNet = dailyRev - bonus;
            System.out.println("Daily Net Revenues= $" + bonus);
        }
    }

}
