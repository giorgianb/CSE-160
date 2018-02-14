import java.time.Month;
import java.time.Year;
import java.util.Scanner;

class DaysInMonth {
  public static void main(String args[]) {
    final Scanner s = new Scanner(System.in);

    System.out.print("Enter month: ");
    final Month month = Month.of(s.nextInt());

    System.out.print("Enter year: ");
    final int y = s.nextInt();
    System.out.println("Number of days: " + month.length(Year.isLeap(y)));
  }
}
