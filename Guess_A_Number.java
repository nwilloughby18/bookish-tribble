/* Nailah Willoughby 
4/7/2020
CSC 1301 
Homework 6 : Guess_A_Number
Discussed with Mo Zaman
*/
import java.util.Scanner;
public class Guess_A_Number {
    public static void main(String args[]) {
            boolean restart = false;
			while (restart == false){
				int maxNumber;
                int guessNum;
                int numberOfTries = 0;
            System.out.println("Let's play the guessing game. Only select a positive interger");
		        Scanner maximum = new Scanner(System.in);
				    System.out.println("Enter maximum value for secret number: ");
				    maxNumber = maximum.nextInt();
				    int secretNumber = (int)(Math.random()*maxNumber)+1;
				Scanner guess = new Scanner(System.in);
				    System.out.println("Enter guess: ");
				    guessNum = guess.nextInt();
				boolean win = false;
				    while (guessNum != secretNumber){
				        numberOfTries++;
		  
		                if (guessNum < secretNumber) {
                            System.out.println("Too low; try again.");
                            guessNum = guess.nextInt();
		                }
		                else if (guessNum > secretNumber) {
			                System.out.println("Too high; try again");
			                guessNum = guess.nextInt();
		                }
			        }
			          if (guessNum == secretNumber){
		                    System.out.println("That is correct.");
		                    System.out.println("You won in " + numberOfTries +" guesses!");
		                    win = true;
		                }
                Scanner in = new Scanner(System.in);

        String answer;
        System.out.println("(Y/N)");
            answer = in.nextLine().trim().toUpperCase();
                if (answer.equals("Y")) {
                    restart = false;
                    continue;
                    
                }
                else if (answer.equals("N")) {
                    restart = true;
                } 
                else {
                    System.out.println("Enter only (Y/N)");
                }
        }
   }
}
