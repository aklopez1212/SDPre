public class Objective7Lab4 {
  public static void main(String[] args) {
    int count, sum;
    count = 1;
    sum = count + 0;
    while(count < 20) {
      count = count + 1;
      sum = count + sum;
    }
    System.out.println(sum);

  }
}
