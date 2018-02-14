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
          System.out.println(poundsToKilos(p) + "kg");
          break;
        case 'B':
          System.out.print("Enter kilograms: ");
          final double kg = s.nextDouble();
          System.out.println(kilosToPounds(kg) + "lb");
          break;
        case 'C':
          System.out.print("Enter miles: ");
          final double m = s.nextDouble();
          System.out.println(mToKm(m) + "km");
          break;
        case 'D':
          System.out.print("Enter kilometers: ");
          final double km = s.nextDouble();
          System.out.println(kmToM(km) + "miles");
          break;
      }
      System.out.print("Enter option: ");
      c = (char) System.in.read();
    }
  }

  public static double poundsToKilos(final double pounds) {
    return pounds / 2.2;
  }

  public static double kilosToPounds(final double kilos) {
    return kilos * 2.2;
  }

  public static double kmToM(final double km) {
    return km / 1.6;
  }

  public static double mToKm(final double m) {
    return m * 1.6;
  }
}
