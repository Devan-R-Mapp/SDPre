public class Objective8Lab3 {
  public static void main(String[] args) {
    int counter = 1;
    for(counter = 1; counter<=20;counter+=1) {

      String response = (counter % 2) == 0 ? "even":
      "odd";
      System.out.println(counter + " is " + response);

    }
  }
}
