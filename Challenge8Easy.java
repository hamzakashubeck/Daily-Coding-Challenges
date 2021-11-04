// Write a program that will print the song "99 bottles of beer on the wall".

public class Challenge8Easy {
  
  public static void main(String[] args) {
        int bottles = 99;
        while (bottles > 2) {
            System.out.print(bottles + " bottles of beer on the wall, "+ bottles + " bottles of beer, ");
            System.out.print("Take one down, pass it around, ");
            bottles--;
            System.out.println(bottles + " bottles of beer on the wall! ");
        }

        //take care of the different grammar for when only one bottle is left
        System.out.print(bottles + " bottles of beer on the wall, "+ bottles + " bottles of beer, ");
        System.out.print("Take one down, pass it around, ");
        bottles--;
        System.out.println(bottles + " bottle of beer on the wall! ");

        System.out.print(bottles + " bottle of beer on the wall, "+ bottles + " bottle of beer, ");
        System.out.print("Take it down, pass it around, ");
        bottles--;
        System.out.println("No more bottles of beer on the wall!!! ");
    }
}
