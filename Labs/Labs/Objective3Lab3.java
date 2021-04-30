public class Objective3Lab3 {
  public static void main(String[] args) {
    int first, second, third;
    first = 1 + (int)(Math.random() * 6);
    second = 1 + (int)(Math.random() * 6);
    third = 1 + (int)(Math.random() * 6);
    int sum = first + second + third;
    System.out.println("Die 1: "  + first +" Die 2: "  + second+ " Die 3: " + third);
    System.out.println("Dice Total = " + sum);
  }
}
