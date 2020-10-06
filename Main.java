import java.util.Scanner;
/**
 * This program gives the factoral of a given number
 * @author Thomas Quigley
 */
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // get the users number
    System.out.println("Please enter an integer to calculate the factorial of");
    int userNumber = input.nextInt();

    // initiliaze the product variable, it starts at 1 so if the number is 0 the product will be 1
    int product = 1;

    // a for loop that repeats from the userNumber to 0
    for (int i = userNumber; i > 0; i--) {
      product = product * i;
    }
    // tell the user their factorial
    System.out.println(userNumber + "! = " + product);
  }
}
