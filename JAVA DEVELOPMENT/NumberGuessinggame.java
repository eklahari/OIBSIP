import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        int targetNumber;
        int userGuess;
        boolean isGuessCorrect = false;

        Random random = new Random();
        targetNumber = random.nextInt(100) + 1;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100.");

        Scanner scanner = new Scanner(System.in);

        while (!isGuessCorrect) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();

            if (userGuess > targetNumber) {
                System.out.println("Too high! Guess a lower number.");
            } else if (userGuess < targetNumber) {
                System.out.println("Too low! Guess a higher number.");
            } else {
                System.out.println("Congratulations! You guessed the correct number.");
                isGuessCorrect = true;
            }
        }

        scanner.close();
    }
}
