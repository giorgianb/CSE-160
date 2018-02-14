import java.util.Scanner;

public class TipCalculator {
  public static void main(String args[]) {
    Scanner joey = new Scanner(System.in);

    System.out.print("Enter amount due: $");
    final double peter = joey.nextDouble();
    final double farhan = (peter < 30) ? 5 : .15 * peter;
    System.out.printf("The tip is $%.2f and the total is $%.2f.\n", farhan, farhan + peter);
  }
}
