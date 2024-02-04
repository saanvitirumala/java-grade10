package Java_Practice_Assignments;
public class Patterns3 {

    public static void main (String []args){
    int rows, columns, numofRows = 6;

    for(rows = 0; rows<numofRows; rows++){
        for(columns = numofRows-rows; columns >1; columns --){
            System.out.println(" ");
        }
        for(columns = 0; columns<=rows; columns++){
            System.out.println("*");
        }
        System.out.println();
    }
 }  
}
