
/**
 * Write a description of class Date here.
 *
 * @author Nedjy Dorlice
 * @version 09-28-22 & 09-29-22
 */
import java.util.Scanner;

public class Date
{ 
    public static void main(String [] args) {
        Scanner s =new Scanner(System.in); //create a scanner object
        
        System.out.println("Enter the day of the week: ");
        String day = s.nextLine();
        
        System.out.println("Enter the month: ");
        String month = s.nextLine();
        
        System.out.println("Enter the Year: ");
        String year = s.nextLine();
        
        System.out.println("Enter the day of the month: ");
        String dayofthemonth = s.nextLine();
        
        System.out.println("American format: " + day + " , " + month + " " +  dayofthemonth + " , " + year + "");
        
        System.out.println("European Format: " + day + " " +  dayofthemonth + " " + month + " " + year + "");
        
    } // end of class method
}