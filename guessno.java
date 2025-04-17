import java.util.Scanner;

public class guessno {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Generate a random number between 0 and 99
        int myNumber = (int)(Math.random() * 100);
        int userNumber = 0;

        // Start a loop to let the user guess until they get it right
        do {
            // Prompt the user to guess the number
            System.out.print("Guess my number (between 0 and 99): ");
            userNumber = sc.nextInt(); // Read user input

            // Check if the guess is correct
            if (userNumber == myNumber) {
                System.out.println("Correct! You guessed it.");
                break; // Exit the loop since the user guessed correctly
            }
            // If the guess is too high
            else if (userNumber > myNumber) {
                System.out.println("Too large!");
            }
            // If the guess is too low
            else {
                System.out.println("Too small!");
            }

        } while (userNumber >= 0); // Keep looping unless a negative number is entered

        // Reveal the correct number
        System.out.println("My number was: " + myNumber);
    }
}
