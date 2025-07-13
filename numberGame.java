import java.util.*;
import java.util.Random;

public class numberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;
        int totalScore = 0;

        System.out.println("Welcome to the Number Guessing Game!\n");
        System.out.println("I will pick a random number between 1 and 100, and you have to guess it.");
        System.out.println("You will have 10 attempts to guess the correct number.");
        System.out.println("For each round, your score will be based on the remaining attempts.\n");
        System.out.println("\nLet's start!");
        System.out.println("\n");

        while (playAgain) {
            int number = random.nextInt(100) + 1;
            int attempts = 0;
            int maxAttempts = 10;
            boolean guessed = false;

            System.out.println("\nI've picked a number between 1 and 100. Can you guess it?");
            System.out.println("You have " + maxAttempts + " attempts to guess the correct number.\n");

            while (attempts < maxAttempts && !guessed) {
                System.out.print("Attempt " + (attempts + 1) + ": ");
                try {
                    int guess = scanner.nextInt();
                    attempts++;

                    if (guess < number) {
                        System.out.println("Too low!");
                    } else if (guess > number) {
                        System.out.println("Too high!");
                    } else {
                        System.out.println("Congratulations! You guessed the number!");
                        guessed = true;
                        totalScore += maxAttempts - attempts + 1; 
                    }
                } catch (Exception e) {
                    System.out.println("Please enter a valid number.");
                    scanner.next();
                }
            }

            if (!guessed) {
                System.out.println("Sorry, you've used all " + maxAttempts + " attempts. The number was " + number + ".");
            }

            System.out.println("Your current score: " + totalScore);

            System.out.print("Do you want to play another round? (yes/no): ");
            String replay = scanner.next().trim().toLowerCase();
            playAgain = replay.equals("yes");
        }

        System.out.println("Thanks for playing! Your final score: " + totalScore);
        scanner.close();
    }
}
