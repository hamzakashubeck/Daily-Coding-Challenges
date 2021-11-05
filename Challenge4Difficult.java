//Today, your challenge is to create a program that will take a series of numbers (for example: (5, 3, 15)), 
//and find how those numbers can add, subtract, multiply, or divide in various ways to relate to each other.
//This string of numbers should result in 5 * 3 = 15, or 15 /3 = 5, or 15/5 = 3.

import java.util.ArrayList;
import java.util.Scanner;

public class Challenge4Difficult {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println(
                "Choose 3 numbers. Make sure to hit the return key between each number!");

        int a = Integer.parseInt(in.nextLine());
        int b = Integer.parseInt(in.nextLine());
        int c = Integer.parseInt(in.nextLine());

        System.out.println(allCombos(a, b, c));
    }
    
    public static ArrayList<String> allCombos(int a, int b, int c) {
        ArrayList<String> combos = new ArrayList<String>();

        //start with addition
        if (a + b == c) {
            combos.add(a + " + " + b + " = " + c);
        }
        if (b + c == a) {
            combos.add(b + " + " + c + " = " + a);
        }
        if (a + c == b) {
            combos.add(a + " + " + c + " = " + b);
        }

        //subtraction
        if (a - b == c) {
            combos.add(a + " - " + b + " = " + c);
        }
        if (b - a == c) {
            combos.add(b + " - " + a + " = " + c);
        }
        if (b - c == a) {
            combos.add(b + " - " + c + " = " + a);
        }
        if (c - b == a) {
            combos.add(c + " - " + b + " = " + a);
        }
        if (a - c == b) {
            combos.add(a + " - " + c + " = " + b);
        }
        if (c - a == b) {
            combos.add(c + " - " + a + " = " + b);
        }

        //multiplication
        if (a * b == c) {
            combos.add(a + " * " + b + " = " + c);
        }
        if (b * c == a) {
            combos.add(b + " * " + c + " = " + a);
        }
        if (a * c == b) {
            combos.add(a + " * " + c + " = " + b);
        }

        //division
        if (a / b == c) {
            combos.add(a + " / " + b + " = " + c);
        }
        if (b / a == c) {
            combos.add(b + " / " + a + " = " + c);
        }
        if (b / c == a) {
            combos.add(b + " / " + c + " = " + a);
        }
        if (c / b == a) {
            combos.add(c + " / " + b + " = " + a);
        }
        if (a / c == b) {
            combos.add(a + " / " + c + " = " + b);
        }
        if (c / a == b) {
            combos.add(c + " / " + a + " = " + b);
        }

        return combos;
    }
    
}
