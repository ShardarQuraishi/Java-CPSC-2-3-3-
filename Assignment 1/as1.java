
import java.util.Scanner;

/**
 * Guessing game for a number between 1 and 20.
 * Determines if a user guesses a random number correctly or not.
 */
public class Assignment1HN {

    /**
     * This is the main method which determines if the user input value is of
     * the correct type, and if it matches the generated value.
     * @param args Unused.
     * @return Nothing.
     */
    public static void main(String[] args) {
        int randomNumber;
        //Generates a random integer between 1 and 20
        randomNumber = (int) (Math.random() * 19 + 1);
        Scanner keyboard = new Scanner(System.in);
        System.out.println(randomNumber);
        System.out.println("I'm thinking of a number between 1 and 20.");
        int guess;
        boolean isAnswer;

        do {
            System.out.println("What is your guess: ");
            //Checks if input is an integer value
            if (keyboard.hasNextInt()){
                guess = keyboard.nextInt();
                isAnswer = false;
                //Checks if input is within range
                if (guess > 20 || guess < 1){
                    isAnswer = false;
                    System.out.println("This number is not between 1 and 20. Try again.");
                }else if (guess < randomNumber){
                    isAnswer = false;
                    System.out.println("Too low.");
                }else if (guess > randomNumber){
                    isAnswer = false;
                    System.out.println("Too high.");
                //Prints if user input is equal to random number
                }else if (guess == randomNumber){
                    System.out.println("That's the number I was thinking of! Well done.");
                    isAnswer = true;
                }
            }else{
		//Print if the user input is not an integer value.
                System.out.println("The input is not an integer. Try again.");
                isAnswer = false;
                keyboard.next();
            }
        } while (!(isAnswer));
    }
}
