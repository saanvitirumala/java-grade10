package Java_Practice_Assignments;
public class Patterns {

    public static void main(String args[]){
  
        int row, columns, numOfRows=8;

       for(row = 0; row<numOfRows; row++){ 

        for(columns=0; columns<=row; columns++){
            System.out.print("*");
        }
        System.out.println(" ");

       }
       
        
    }
    
}
