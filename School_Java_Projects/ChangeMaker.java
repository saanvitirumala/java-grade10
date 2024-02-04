package School_Java_Projects;

import java.util.Scanner;

public class ChangeMaker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //notes
        //double note_100=100;
        //double note_50=50;
        int note_20 = 20;
        int note_10 = 10;
        int note_5 = 5;
        int note_1 = 1;

       
        int count_10 = 0;
        int count_5 = 0;
        int count_1 = 0;

        //coins
        double coin_quarter = 0.25d;
        double coin_dime = 0.10d;
        double coin_nickel = 0.05d;
        double coin_penny = 0.01d;

        int count_quarter = 0;
        int count_dime = 0;
        int count_nickel = 0;
        int count_penny = 0;

        double change=0.00d;
        double cost=0.00d;;

        System.out.println("Please enter the amount of money you "
                + "have so I can convert into different coin values:");
        cost = input.nextDouble();

        if (cost > note_20) {
            System.out.println("use a number less than or equal to 20 please");
        }
        if (cost < 0) {
            System.out.println("use a number greater than 0");
        }

        change = note_20 - cost;
        double storeChange=change;
       
        while (change>0.0) { // perform while loop i=until change become zero

            //This checks for $10
            if (change >= note_10) {
                count_10 = count_10 + 1;
                change = change - note_10;
            }
            //This checks for $5
            if (change >= note_5 && change < note_10) {
                count_5 = count_5 + 1;
                change = change - note_5;
            }
            //This checks for $1
            if (change >= note_1 && change < note_5) {
                count_1 = count_1 + 1;
                change = change - note_1;
            }
            //This checks for quarters
            if (change >= coin_quarter && change < note_1) {
                count_quarter = count_quarter + 1;
                change = change - coin_quarter;
            }
            //This checks for dimes
            if (change >= coin_dime && change < coin_quarter) {
                count_dime = count_dime + 1;
                change = change - coin_dime;
            }
            //This checks for nickels
            if (change >= coin_nickel && change < coin_dime) {
                count_nickel = count_nickel + 1;
                change = change - coin_nickel;
            }
            //This checks for pennies
            if (change >= coin_penny && change < coin_nickel) {
                count_penny = count_penny + 1;
                change = change - coin_penny;
                
            }

            //if the chage value is less than nickel set change  to zero
            if(change<coin_penny){
                change=0.0;
            }
            
        } //End of While Loop
        
        System.out.println("Cost is : "+cost);
        System.out.println("Your Change is : "+ storeChange);
        System.out.println("----------------------------------");
        System.out.println("Your Change is : ");
        
        if(count_10 > 1){
            System.out.println(count_10+" tens");
        }else  if(count_10 > 0){
            System.out.println(count_10+" ten");
        }
        
       if(count_5 > 1){
            System.out.println(count_5+" fives");
        }
       else if(count_5 ==1){
            System.out.println(count_5+" five");
        }

        if(count_1 > 1){
            System.out.println(count_1+" ones");
        }
        else if(count_1==1){
            System.out.println(count_1+" one");
        }

       if(count_quarter > 1){
            System.out.println(count_quarter+" quarters");
        }else if(count_quarter == 1){
            System.out.println(count_quarter+" quarter");
        }

       if(count_dime > 1){
            System.out.println(count_dime+" dimes");
        }
        else if(count_dime == 1){
            System.out.println(count_dime+" dime");
        }

       if(count_nickel > 1){
            System.out.println(count_nickel+" nickels");
        }
       else if(count_nickel == 1){
            System.out.println(count_nickel+" nickel");
        }

       if(count_penny > 1){
            System.out.println(count_penny+" pennies");
        }
       else if(count_penny > 0){
            System.out.println(count_penny+" penny");
        }
    }
}

