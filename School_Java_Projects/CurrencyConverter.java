package School_Java_Projects;

import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double userinput;
        double numx;
        double usdTOgbp;
        double gbpTOusd;//britain
        double usdTOeur;
        double eurTOusd;
        double usdTOyuan;
        double yuanTOusd;
        double usdTOyen;
        double yenTOusd;
        double usdTOrupee;// indian rupee
        double rupeeTOusd;
        double usdTObitcoin;// 
        double bitcoinTOusd; // Bitcoin

        System.out.println("Please enter the amount of money you'd like to convert");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Please enter the number that corresponds with the currency you want to convert to:");
        System.out.println("0 ---> Exit");
        System.out.println("1 ---> USD to GBP");
        System.out.println("2 ---> GBP to USD");
        System.out.println("3 ---> USD to EUR");            //Number coordination to each currency
        System.out.println("4 ---> EUR to USD");
        System.out.println("5 ---> USD to Yuan");
        System.out.println("6 ---> Yuan to USD");
        System.out.println("7 ---> USD to Yen");
        System.out.println("8 ---> Yen to USD");
        System.out.println("9 ---> USD to INR");
        System.out.println("10 ---> INR to USD");
        System.out.println("11 ---> USD to Bitcoin");
        System.out.println("12 ---> Bitcoin to USD");
        userinput = input.nextDouble();

        System.out.println("How much would you like to convert?");
        numx = input.nextDouble();

        usdTOgbp = numx * 0.82;
        gbpTOusd = numx * 1.22;
        usdTOeur = numx * 0.95;
        eurTOusd = numx * 1.05;
        usdTOyuan = numx * 7.20;            // da math part :DD
        yuanTOusd = numx * 0.14;
        usdTOyen = numx * 148.86;
        yenTOusd = numx * 0.0067;
        usdTOrupee = numx * 83.24;
        rupeeTOusd = numx * 0.012;
        bitcoinTOusd = numx * 27606.30;
        usdTObitcoin = numx * 0.000036;

        if (userinput == 1) {
            System.out.println("USD TO GBP: " + usdTOgbp);
        }
        if (userinput == 2) {
            System.out.println("GBP TO USD:$ " + gbpTOusd);
        }
        if (userinput == 3) {
            System.out.println("USD TO EUR: " + usdTOeur);
        }                                                               // Really important if statement 
        if (userinput == 4) {
            System.out.println("EUR TO USD:$ " + eurTOusd);
        }
        if (userinput == 5) {
            System.out.println("USD TO YUAN: " + usdTOyuan);
        }
        if (userinput == 6) {
            System.out.println("YUAN TO USD:$ " + yuanTOusd);
        }
        if (userinput == 7) {
            System.out.println("USD TO YEN: " + usdTOyen);
        }
        if (userinput == 8) {
            System.out.println("YEN TO USD:$ " + yenTOusd);
        }
        if (userinput == 9) {
            System.out.println("USD TO RUPEE: " + usdTOrupee);
        }
        if (userinput == 10) {
            System.out.println("RUPEE TO USD:$ " + rupeeTOusd);
        }
        if (userinput == 11) {
            System.out.println("USD TO BITCOIN: " + usdTObitcoin);
        }
        if (userinput == 12) {
            System.out.println("BITCOIN TO USD:$ " + bitcoinTOusd);
        }

    }

}
