//Challenge #1: Create a program that will ask the users name, age, and reddit username.
//Have it tell them the information back, in the format: your name is (blank), you are (blank) years old, and your username is (blank)

import java.util.Scanner;

public class Challenge1Easy {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("What's your name?");
        String name = in.nextLine();

        System.out.println("How old are you?");
        int age = Integer.parseInt(in.nextLine());

        System.out.println("What is your Reddit username?");
        String user = in.nextLine();

        System.out.println("your name is " + name + ", you are " + age
                + " years old, and your username is " + user);
        
        in.close();
    }

}
