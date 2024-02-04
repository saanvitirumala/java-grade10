package School_Java_Projects;

import java.util.Random;
import java.util.Scanner;

public class CoinFlip {
    
    // Global Variables
    static float penny_value = 0.01f; //1 cent in decimal form
    static float nickel_value = 0.05f; //5 cents in decimal form
    static float dime_value = 0.10f; //10 cents in decimal form 
    static float quarter_value = .25f; // 25 cents in decimal form

    static String playerOne_results[][] ; // setting rows and columns player 1
    static String playerTwo_results[][] ; // setting rows and columns player 2
    
    static Random r = new Random(); // used random util to generate random value

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter in how many rounds you'd like to play: ");
        int numrounds = input.nextInt();
        
        if(numrounds>0){
           playerOne_results = new String [numrounds][4]; // setting rows and columns player 1
         playerTwo_results = new String [numrounds][4]; // setting rows and columns player 2

        CoinFlip coinflip = new CoinFlip(); // creates an object to access non static methods
                    
        for( int i=0;i<numrounds;i++){ // Initiates coin flip for 10 rounds between both players
            coinflip.playerOneCoinFlip(i); // Player 1 iteration for flipping the coin
            coinflip.playerTwoCoinFlip(i); // Player 2 iteration for flippping the coin           
        }
        
        
        
        // Final results displayed in rows and columns using 2-D arrays
        
        
        System.out.print("Rnd\tMe\t   This Rnd  My Tot     You\t   This Rnd   Your Tot\n"); // Displays Row Header
        for( int i=0;i<numrounds;i++){  // rows
        
            for( int j=0;j<4;j++){ // Player 1 results for each round
                if(j==1)
                  System.out.print(playerOne_results[i][j]+"\t   "); //column spacing  
                else if(j==2) 
                  System.out.print(playerOne_results[i][j]+"\t     "); //column spacing
                else if(j==3)
                  System.out.print(playerOne_results[i][j]+"\t"); //column spacing
                else
                  System.out.print(playerOne_results[i][j]+"\t"); //column spacing
            }
            
            for( int j=1;j<4;j++){ //Player 2 results for each round
                 if(j==2)
                  System.out.print(playerTwo_results[i][j]+"\t"); 
                  else
                  System.out.print(playerTwo_results[i][j]+"     "); 
            }
            System.out.println(" ");
        }
        

        
         
         if(Float.valueOf(playerTwo_results[numrounds-1][3])>Float.valueOf(playerOne_results[numrounds-1][3])){ // 'Float.valueOf' is used to compare Float values that are in String format
             System.out.println("I lose and pay you "+playerTwo_results[numrounds-1][3]);
         }else if(Float.valueOf(playerTwo_results[numrounds-1][3])<Float.valueOf(playerOne_results[numrounds-1][3])){
             System.out.println("I win and you pay "+playerOne_results[numrounds-1][3]);
         }else if(Float.valueOf(playerTwo_results[numrounds-1][3])==Float.valueOf(playerOne_results[numrounds-1][3])){
             System.out.println("Its a draw");
         }    
        
        }else {
            System.out.println("You entered an invalid number. Number of rounds has to be greater than 0.");
        }
        
        
    }

       public  void playerOneCoinFlip(int index){
           this.flipCoin(index , 1); // call method to flip the coin for each player
           
       }
       public  void playerTwoCoinFlip(int index ) {
           this.flipCoin(index,2);  // call method to flip the coin for each player
       }
    
       public static void flipCoin (int index, int player_type ) {
        
        boolean penny = r.nextBoolean();
        boolean nickel = r.nextBoolean();
        boolean dime = r.nextBoolean();
        boolean quarter = r.nextBoolean();
        //  System.out.println(penny + " " + nickel + " " + dime);

        String penny_status = penny ? "H" : "T";
        String nickel_status = nickel ? "H" : "T";
        String dime_status = dime ? "H" : "T";
        String quarter_status = quarter ? "H" : "T";
        // System.out.println(penny_status+" "+nickel_status+" "+ dime_status);

        float coin_total = 0.0f;

        if (penny) {
            coin_total += penny_value;
        }
        if (nickel) {
            coin_total += nickel_value;
        }
        if (dime) {
            coin_total += dime_value;
        }
        if (quarter) {
            coin_total += quarter_value;
        }

       if(player_type==1){ //storing results of each round of Player 1 using Array
        playerOne_results[index][0]=String.valueOf(index+1);  // storing results of Round
        playerOne_results[index][1]= penny_status + " " + nickel_status + " " + dime_status + " "+ quarter_status; // storing results of coins face value (ex: HTH)
        playerOne_results[index][2]= String.format("%.2f",coin_total); // storing coin total values
        
        if(index-1>=0){  // check index is not negative
           playerOne_results[index][3]= String.format("%.2f",(coin_total+Float.valueOf(playerOne_results[index-1][3]))); //allows index to go back to add previous round of 'my total' sum to player's current round total
        }else{
           playerOne_results[index][3]= String.format("%.2f",coin_total); 
        }
        
       }
       
       if(player_type==2){ //storing results of each round of Player 2 using Array
        playerTwo_results[index][0]=String.valueOf(index+1); // storing results using Round
        playerTwo_results[index][1]= penny_status + " " + nickel_status + " " + dime_status+ " "+ quarter_status; // Storing results of face value 
        playerTwo_results[index][2]= String.format("%.2f",coin_total); // storing coin total value
        
        if(index-1>=0){  // check index is not negative
           playerTwo_results[index][3]= String.format("%.2f",(coin_total+Float.valueOf(playerTwo_results[index-1][3]))); 
        }else{
           playerTwo_results[index][3]= String.format("%.2f",coin_total); 
        }
        
       }
        
    
       }

}
