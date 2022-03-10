//import java.util.Scanner;

//lessons from a 45 year veteran, to help me understand the importance of
//importing and what each class does

public class Objective5Lab3 {
    public static void main(String[] args) {
      java.util.Scanner scanner = new java.util.Scanner(System.in);
      int userNum;

      System.out.println("Please enter a number: ");
        userNum = scanner.nextInt();

        String response = userNum == 0 ? "0" :
                          userNum > 0  ? "positive" :
                          "negitive";
        System.out.println("The number is " + response);

//this was a solution that helped me understand that there was more than one way to
//tackle the problem.


//       if(userNum == 0) {
//        System.out.println("The number is 0");
//        }
//        else if(userNum > 0) {
//          System.out.println("The number is positive");
//        }
//        else if(userNum < 0) {
//          System.out.println("The number is negative");
//        }

//original solution

      scanner.close();
  }
}
