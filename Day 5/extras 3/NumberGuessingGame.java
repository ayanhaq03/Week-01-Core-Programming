import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int low = 1, high = 100;
        boolean guessedCorrectly = false;

        System.out.println("Think of a number between 1 and 100, and I will guess it!");

        while (!guessedCorrectly) {
            int guess = generateGuess(low, high);
            System.out.println("Is your number " + guess + "?");
            System.out.println("Enter 'high' if it's too high, 'low' if it's too low, or 'correct' if I guessed it:");

            String feedback = scanner.nextLine();
            if (feedback.equals("high")) {
                high = guess - 1;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            } else if (feedback.equals("correct")) {
                guessedCorrectly = true;
                System.out.println("I guessed your number! It is " + guess + ".");
            } else {
                System.out.println("Invalid input. Please enter 'high', 'low', or 'correct'.");
            }
        }
        scanner.close();
    }

    // Function to generate a guess within the range
    public static int generateGuess(int low, int high) {
        return low + (high - low) / 2;
    }
}
