import java.util.Scanner;

public class CelsiusToFarenheit {
  public static void main(String args[]) {
    final Scanner s = new Scanner(System.in);

    System.out.print("Enter a celsius value: ");
    final double degrees = s.nextDouble();
    System.out.printf("%f degrees farenheit\n", (9.0/5) * degrees + 32);
    System.exit(0);
  }
}
