import java.util.Scanner;

public class Objective4Lab1 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    String fname = "";
    String lname = "";
    String favoriteAnimal = "";
    String favoriteFood = "";
    String favoriteSong = "";

    System.out.println("What is your first name?");
     fname = keyboard.nextLine();
    System.out.println("Welcome " + fname + "! What is your last name?");
     lname = keyboard.nextLine();
    System.out.println("So, you are " + fname + " " + lname + "? Nice to meet you. What is your favorite animal?");
     favoriteAnimal = keyboard.nextLine();
    System.out.println("So it's a " + favoriteAnimal + "? Great choice! What about your favorite food?");
     favoriteFood = keyboard.nextLine();
    System.out.println("I also enjoy " + favoriteFood + ". What is your favorite song?");
     favoriteSong = keyboard.nextLine();
    System.out.println(favoriteSong + " is a hit!");
     String fullName = fname + " " + lname;
    System.out.println("So you are " + fullName + ".");
    System.out.println("Your favorite animal is a " + favoriteAnimal + ".");
    System.out.println("Your favorite food is " + favoriteFood + ".");
    System.out.println("Also, your favorite song is " + favoriteSong + ". Thanks for your input!");

  }
}
