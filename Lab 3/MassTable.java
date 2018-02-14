public class MassTable {
  public static void main(String args[]) {
    System.out.printf("%-10s%-10s%-10s%-10s\n", "Kilograms", "Pounds", "Pounds", "Kilograms");

    for (int i = 0; i < 100; i += 2) 
      System.out.printf("%-10.2f%-10.2f%-10.2f%-10.2f\n", i * 1.0, i * 2.2, (i + 1.0), (i + 1) * 2.2);
  }
}
