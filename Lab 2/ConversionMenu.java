import java.util.Scanner;
import java.io.IOException;
public class ConversionMenu  {
  public static void main(String args[]) throws IOException {
    System.out.print("Enter option: ");
    char c = (char) System.in.read();
    final Scanner s = new Scanner(System.in);
    
    while (c != 'E') {
      switch (c) {
        case 'A':
          System.out.print("Enter pounds: ");
          final double p = s.nextDouble();
          System.out.println(p / 2.2 + "kg");
          break;
        case 'B':
          System.out.print("Enter kilograms: ");
          final double kg = s.nextDouble();
          System.out.println(kg * 2.2 + "lb");
          break;
        case 'C':
          System.out.print("Enter miles: ");
          final double m = s.nextDouble();
          System.out.println(m * 1.6 + "km");
          break;
        case 'D':
          System.out.print("Enter kilometers: ");
          final double km = s.nextDouble();
          System.out.println(km / 1.6 + "miles");
          break;
      }
      System.out.print("Enter option: ");
      c = (char) System.in.read();
    }
  }
}
