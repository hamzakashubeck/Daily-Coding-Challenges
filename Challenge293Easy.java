//To disarm the bomb you have to cut some wires. These wires are either white, black, purple, red, green or orange. The rules for disarming are simple:

// 1. If you cut a white cable you can't cut white or black cable. 
// 2. If you cut a red cable you have to cut a green one
// 3. If you cut a black cable it is not allowed to cut a white, green or orange one
// 4. If you cut a orange cable you should cut a red or black one
// 5. If you cut a green one you have to cut a orange or white one
// 6. If you cut a purple cable you can't cut a purple, green, orange or white cable

//If you have anything wrong in the wrong order, the bomb will explode.
//There can be multiple wires with the same color and these instructions are for one wire at a time. Once you cut a wire you can forget about the previous ones.
//You will recieve a sequence of wires that where cut in order. Determine if the person was successful in disarming the bomb, or if it blew up.

import java.util.ArrayList;
import java.util.Scanner;

public class Challenge293Easy {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> wires = new ArrayList<String>();

        System.out.println(
                "Choose which wire colors to cut (pick at least two). Make sure to hit enter between your color choices, and to type 'done' when finished:");

        String input = in.nextLine();
        while (!input.equals("done")) {
            wires.add(input);
            input = in.nextLine();
        }

        boolean explodes = false;
        for (int i = 1; i < wires.size(); i++) {
            if (explodes(wires.get(i - 1), wires.get(i))) {
                explodes = true;
            }
        }

        if (explodes) {
            System.out.println("Boom");
        } else {
            System.out.println("Bomb defused");
        }

        in.close();
    }

  //helper method that handles testing the result of a given wire cut
    public static boolean explodes(String c1, String c2) {
        boolean explodes = false;

        switch (c1) {
            case "white":
                explodes = c2.equals("white") || c2.equals("black");
                break;
            case "red":
                explodes = !c2.equals("green");
                break;
            case "black":
                explodes = c2.equals("white") || c2.equals("green")
                        || c2.equals("orange");
                break;
            case "orange":
                explodes = !(c2.equals("red") || c2.equals("black"));
                break;
            case "green":
                explodes = !(c2.equals("orange") || c2.equals("white"));
                break;
            case "purple":
                explodes = c2.equals("purple") || c2.equals("green")
                        || c2.equals("orange") || c2.equals("white");
                break;
        }
        return explodes;
    }
}
