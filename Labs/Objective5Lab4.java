import java.util.Scanner;

  public class Objective5Lab4{
    public static void main(String[] args) {
      Scanner kb = new Scanner(System.in);
      int num1;

      System.out.println("Please enter a number:");
      num1 = kb.nextInt();

      String response = (num1 % 2) == 0 ? "even":
      "odd";

      System.out.println("The number is " + response);

      kb.close();
    }
  }
