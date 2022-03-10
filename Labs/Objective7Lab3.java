public class Objective7Lab3 {
  public static void main(String[] args) {
    int counter = 1;

    while(counter <= 20) {

      String response = (counter % 2) == 0 ? "even":
      "odd";
      System.out.println(counter + " is " + response);
      counter = counter + 1;
    }
  }
}
