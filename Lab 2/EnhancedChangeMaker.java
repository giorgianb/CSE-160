import java.util.Scanner;
public class EnhancedChangeMaker {
  public static void main(String args[]) {
    final Scanner s = new Scanner(System.in);

    System.out.print("Enter the amount the customer paid: $");
    final double amountPaid = s.nextDouble();
    System.out.print("Enter the amount due: $");
    final double amountDue = s.nextDouble();

    if (amountPaid < amountDue)
      System.out.println("Of, muie, n-ai destul.");
    else if (amountPaid < 0 || amountDue < 0)
      System.out.println("Ce-i asta?");

    double owed = amountPaid - amountDue;
    int dollarAmount = (int) owed;
    System.out.printf("%-4d%-10s", dollarAmount / 100, "$100");
    dollarAmount %= 100;
    System.out.printf("%-4d%-10s", dollarAmount / 20, "$20");
    dollarAmount %= 20;
    System.out.printf("%-4d%-10s", dollarAmount / 10, "$10");
    dollarAmount %= 10;
    System.out.printf("%-4d%-10s", dollarAmount / 5, "$5");
    dollarAmount %= 5;
    System.out.printf("%-4d%-10s", dollarAmount / 2, "$2");
    dollarAmount %= 2;
    System.out.printf("%-4d%-10s\n", dollarAmount, "$1");

    int changeAmount = (int) (((owed) - (int) owed) * 100);
    System.out.printf("%-4d%-10s", changeAmount / 25, "quarters");
    changeAmount %= 25;
    System.out.printf("%-4d%-10s", changeAmount / 10, "dimes");
    changeAmount %= 10;
    System.out.printf("%-4d%-10s", changeAmount / 5, "nickels");
    changeAmount %= 10;
    System.out.printf("%-4d%-10s\n", changeAmount, "pennies");
    
    System.exit(0);
  }
}
