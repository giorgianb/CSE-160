import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class Distinct {
  public static void main(final String[] args) {
    final Scanner s = new Scanner(System.in);
    final Set<Double> nums = new HashSet<>();

    for (int i = 0; i < 10; ++i) {
      final double d = s.nextDouble();
      if (nums.contains(d))
        continue;

      System.out.print(d + " ");
      nums.add(d);
    }

    System.out.println();
  }
}
