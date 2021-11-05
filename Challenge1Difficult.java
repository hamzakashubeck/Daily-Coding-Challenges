//Challenge #1 (Difficult): We all know the classic "guessing game" with higher or lower prompts. 
//Lets do a role reversal; you create a program that will guess numbers between 1-100 
//and respond appropriately based on whether users say that the number is too high or too low. 
//Try to make a program that can guess your number based on user input and great code!

import java.util.Scanner;

public class Challenge1Difficult {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Think of a number between 1 and 100. I'm going to try and guess your number.");
        System.out.println("If my guess is wrong, let me know if it's high or low. Here we go!");

        int guess = 50;
        int lowerBound = 0;
        int upperBound = 101;
        System.out.println("Is your number " + guess+ "? Type 'high', 'low', or 'correct':");

        String input = in.nextLine();

        while (!input.equals("correct")) {

            if (input.equals("high")) {
                upperBound = guess;
                guess = (guess + lowerBound) / 2;
            }
            if (input.equals("low")) {
                lowerBound = guess;
                guess = (upperBound + guess) / 2;
            }
            System.out.println("Okay fine. Is your number " + guess + "? Type 'high', 'low', or 'correct':");
            input = in.nextLine();
        }

        System.out.println("Thanks for playing!");
        in.close();
    }
}
