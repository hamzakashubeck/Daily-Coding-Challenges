// First, you select a random large number to start with. Then, repeatedly do the following: If the number is divisible by 3, divide it by 3.
// If it's not, either add 1 or subtract 1 (to make it divisible by 3), then divide it by 3. The game stops when you reach "1".
// Today, the challenge is to create a program that "plays" the Game of Threes.

//The input is a single number: the number at which the game starts. Write a program that plays the Threes game, and outputs a valid sequence of steps you need 
//to take to get to 1. Each step should be output as the number you start at, followed by either -1 or 1 (if you are adding/subtracting 1 before dividing),
//or 0 (if you are just dividing). The last line should simply be 1.

import java.util.Scanner;

public class Challenge239 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Choose a number to start the Game of Threes:");
        int num = Integer.parseInt(in.nextLine());

        while (num != 1) {
            if (num % 3 == 0) {
                System.out.println(num + " 0");
            } else if ((num + 1) % 3 == 0) {
                System.out.println(num + " +1");
                num++;
            } else if ((num - 1) % 3 == 0) {
                System.out.println(num + " -1");
                num--;
            }
            num /= 3;
        }
        System.out.println(num);
    }
}
