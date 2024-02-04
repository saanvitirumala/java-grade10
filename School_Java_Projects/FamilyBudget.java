package School_Java_Projects;

import java.util.Scanner;
public class FamilyBudget {


    public static void main(String[] args) {
        String[] item = new String[15];
        double[] am = new double[15];
        //populate the 1st sample
        item[0] = "*FIT";
        am[0] = 480;
        item[1] = "NYS";
        am[1] = 240;
        item[2] = "SS";
        am[2] = 300;
        item[3] = "***Mortgage";
        am[3] = 1200;
        item[4] = "*Food";
        am[4] = 500;
        item[5] = "Auto Insurance";
        am[5] = 80;
        item[6] = "Auto Payement";
        am[6] = 300;
        item[7] = "Student Loan";
        am[7] = 200;
        item[8] = "Investment";
        am[8] = 200;
        item[9] = "Heat/Electric";
        am[9] = 250;
        item[10] = "Cable/Phone/Internet";
        am[10] = 130;
        item[11] = "Mobile Phone";
        am[11] = 80;
        item[12] = "Misc";
        am[12] = 40;
        item[13] = "null";
        am[13] = 0;
        item[14] = "null";
        am[14] = 0;

        //budget 2
        String[] item2 = new String[15];
        double[] am2 = new double[15];

        item2[0] = "*FIT";
        am2[0] = 360;
        item2[1] = "NYS";
        am2[1] = 180;
        item2[2] = "SS";
        am2[2] = 225;
        item2[3] = "**Rent";
        am2[3] = 750;
        item2[4] = "*Food";
        am2[4] = 500;
        item2[5] = "Auto Insurance";
        am2[5] = 80;
        item2[6] = "Dog Food";
        am2[6] = 30;
        item2[7] = "Entertainement";
        am2[7] = 120;
        item2[8] = "*Savings";
        am2[8] = 300;
        item2[9] = "World of Warcraft";
        am2[9] = 14;
        item2[10] = "Cable/Phone/Internet";
        am2[10] = 130;
        item2[11] = "Mobile Phone";
        am2[11] = 80;
        item2[12] = "Auto repair";
        am2[12] = 200;
        item2[13] = "Misc";
        am2[13] = 69;
        item2[14] = "null";
        am2[14] = 0;

        //budget 3
        String[] item3 = new String[15];
        double[] am3 = new double[15];

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("What's goody my ganganem, welcome to the Menu for your Family Budget. Choose one:");

            System.out.println("1-- sample budget 1");
            System.out.println("2-- sample budget 2");
            System.out.println("3-- enter actual budget");
            System.out.println("4-- display user budget");
            System.out.println("5-- clear budget");
            System.out.println("6-- exit budget loops");
            System.out.println("7-- txt file bonus");
            int choice = input.nextInt();

            if (choice == 1) {
                System.out.println("Sample budget 1");
                System.out.println("");
                System.out.println("item#" + "\t" + "amount" + "\t" + "item");
                for (int i = 0; i < 17; i++) {

                    System.out.println((i + 1) + "\t" + am[i] + "\t" + item[i]);
                }
            }//end of choice 1

            if (choice == 2) {
                System.out.println("Sample budget 2");
                System.out.println("");
                System.out.println("item#" + "\t" + "amount" + "\t" + "item");
                for (int j = 0; j < 17; j++) {
                    System.out.println((j + 1) + "\t" + am2[j] + "\t" + item2[j]);
                }
            }//end of choice 2

            //budget 3
            int p = 3;

            if (choice == 3) {

                System.out.println("Enter Your Annual Salary: ");
                double annSal = input.nextDouble();
                double monthSal = annSal / 12;
                System.out.println("your monthly salary = " + monthSal);
                am3[0] = Math.round(monthSal * .12);
                am3[1] = monthSal * .06;
                am3[2] = monthSal * .075;
                System.out.println("FIT = " + am3[0]);
                System.out.println("NYS = " + am3[1]);
                System.out.println("SS = " + am3[2]);
                double left = monthSal - (am3[0] + am3[1] + am3[2]);
                System.out.println("amount left = " + left);
                item3[0] = "FIT";
                item3[1] = "NYS";
                item3[2] = "SS";

                while (p < 14) {
                    System.out.println("please enter in a category to add or q to quit");
                    input.skip("\n");
                    String cat = input.nextLine();

                    if (cat.equals("q")) {
                        break; //exits loop
                    }
                    item3[p] = cat;

                    System.out.println("Money Spent:");
                    double val = input.nextDouble();
                    am3[p] = val;
                    //for P vars
                    if (am3[p] >= (monthSal * .30)) {
                        item3[p] = "***" + cat;
                    }
                    if (am3[p] >= (monthSal * .20) && am3[p] < (monthSal * .30)) {
                        item3[p] = "**" + cat;
                    }
                    if (am3[p] >= (monthSal * .10) && am3[p] < (monthSal * .20)) {
                        item3[p] = "*" + cat;
                    }

                    //for FIT
                    if (am3[0] >= (monthSal * .30)) {
                        item3[0] = "***" + "FIT";
                    }
                    if (am3[0] >= (monthSal * .20) && am3[0] < (monthSal * .30)) {
                        item3[0] = "**" + "FIT";
                    }
                    if (am3[0] >= (monthSal * .10) && am3[0] < (monthSal * .20)) {
                        item3[0] = "*" + "FIT";
                    }

                    //for NYS
                    if (am3[1] >= (monthSal * .30)) {
                        item3[1] = "***" + "NYS";
                    }
                    if (am3[1] >= (monthSal * .20) && am3[1] < (monthSal * .30)) {
                        item3[1] = "**" + "NYS";
                    }
                    if (am3[1] >= (monthSal * .10) && am3[1] < (monthSal * .20)) {
                        item3[1] = "*" + "NYS";
                    }

                    //for ss
                    if (am3[2] >= (monthSal * .30)) {
                        item3[2] = "***" + "SS";
                    }
                    if (am3[2] >= (monthSal * .20) && am3[2] < (monthSal * .30)) {
                        item3[2] = "**" + "SS";
                    }
                    if (am3[2] >= (monthSal * .10) && am3[2] < (monthSal * .20)) {
                        item3[2] = "*" + "SS";
                    }

                    left -= val;
                    p++;
                    //bumb i up by 1
                    if (p == 14 || cat.equals("q")) {

                    }//end of if

                }//end of p<14
                am3[p] = left;
                item3[p] = "misc";
            }
            if (choice == 4) {
                System.out.println("item#" + "\t" + "amount" + "\t" + "item");
                for (int k = 0; k < 15; k++) {
                    if (item3[k] == null) {
                        break;
                    }
                    System.out.println((k + 1) + "\t" + am3[k] + "\t" + item3[k]);
                }

            }//end of choice 3

            if (choice == 5) {
                System.out.println("Are you sure you want to clear your budget?");
                am3[0] = 0;
                am3[1] = 0;
                am3[2] = 0;
                am3[p] = 0;
                item3[p] = null;

            }//end of clear loop

            if (choice == 6) {
                System.out.println("Goodbye.");
                break;
            }
        }
    }
}
