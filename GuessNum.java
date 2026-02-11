import java.util.Random;
import java.util.Scanner;

public class GuessNum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(100) + 1; 
        int userGuess = 0;
        int attempts = 0;

        System.out.println("Welcome to Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100");

        while (userGuess != randomNumber) {

            System.out.print("Enter your guess: ");
            userGuess = sc.nextInt();
            attempts++;

            if (userGuess > randomNumber) {
                System.out.println("Too High! Try again.");
            } 
            else if (userGuess < randomNumber) {
                System.out.println("Too Low! Try again.");
            } 
            else {
                System.out.println("🎉 Correct! You guessed in " + attempts + " attempts.");
            }
        }

        sc.close();
    }
}
