import java.util.Scanner;
public class Triangle {
  public static void main(final String[] args) {
    final Scanner s = new Scanner(System.in);
    System.out.print("Enter n: ");
    final int n = s.nextInt();

    for (int i = 1; i <= n; ++i) {
      for (int j = i; j > 0; --j)
        System.out.print(j + " ");
      System.out.println();
    }
  }
}
