import java.util.Scanner;
import java.util.Random;
//Bruce Cole - Module 3 Lab
public class RanNo {
    public static void main(String[] args) {

  //Declare and assign variables
    //computer generated guess
      Random rando = new Random();
      int randNo = rando.nextInt(100) + 1;
      
    //user guess
      int guess;
      Scanner in = new Scanner(System.in); 
 

//Ask for user guess
  System.out.print("I'm thinking of a number between 1 and 100 (including both 1 and 100).\n\nCan you guess what it is? \n\nEnter your guess: ");
  guess = in.nextInt();
  System.out.println("\nYour guess was: " + guess);

// Tell user the computer generated guess   
  System.out.println("\nI was thinking of: " + randNo); 

// Tell user the difference betwwen their guess and cop gen guess
  int diff = randNo - guess; 
  System.out.println("\nYou were off by: " + Math.abs(diff));
  }
}