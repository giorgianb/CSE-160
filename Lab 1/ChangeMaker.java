import java.util.Scanner;
public class ChangeMaker {
  public static void main(String args[]) {
    final Scanner s = new Scanner(System.in);

    System.out.print("Enter a cent amount: $0.");
    final double amount = s.nextDouble();

    if (amount > 99) {
      System.out.println("Error: cannot handle fractional cent values.");
      System.exit(1);
    }
    
    int change = (int) amount;
    System.out.printf("%-2d%-10s", change / 25, "quarters");
    change %= 25;
    System.out.printf("\t%-2d%-10s", change / 10, "dimes");
    change %= 10;
    System.out.printf("\t%-2d%-10s", change / 5, "nickels");
    change %= 5;
    System.out.printf("\t%-2d%-10s\n", change, "pennies");

    System.exit(0);
  }
}
    
