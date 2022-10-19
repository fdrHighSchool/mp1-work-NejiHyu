
/**
 * Write a description of class Guessinggame here.
 *
 * @author Nedjy Dorlice
 * @version 10-06-22 / 10-07-22
 */

import java.util.Scanner;
import java.util.Random;

public class NumberGame
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r= new Random();
        System.out.println("What mode do you want?\nEasy\nMedium\nHard");
        String mode = s.nextLine();
        //System.out.println(mode);
        int maximum;
        if(mode.equals("Easy")) {
            int number = (int)(Math.random() * 11);  // 0 to 10
        }
        else if (mode.equals("Medium")) {
            int number = (int)(Math.random() * 51);  // 0 to 50
        }
        
        else {
            int number =(int)(Math.random() * 101);  // 0 to 100
        }
        int mysteryNumber = 5; // place-holder for now

        System.out.println(mysteryNumber);

        System.out.print("Enter your guess: ");
        int playerGuess = s.nextInt(); 

        // if the player guessed incorrectly
        if(playerGuess != mysteryNumber) {
            // if the player guessed too low
            if(playerGuess < mysteryNumber) {
                System.out.println("You were off by " + (mysteryNumber - playerGuess)+ " more than the result.");
            } // end inner if statement
            // if the player didn't guess too low (meaning, incorrect and too high!)
            else {
                System.out.println("You were off by " + (playerGuess - mysteryNumber)+ " less than the result.");
            } // end inner else statement
        } // end outer if statement
        // if the player didn't guess incorrectly (meaning, correct guess)
        else {
            System.out.println("Correct!!!");
        } // end outer else statement
    } // end main method
} // end class