public class DistanceTable {
  public static void main(String args[]) {
    System.out.printf("%-10s%-10s\n", "Miles", "Kilometers");

    for (int i = 0; i < 100; ++i) 
      System.out.printf("%-10.2f%-10.2f\n", i * 1.0, i * 1.609);
  }
}
