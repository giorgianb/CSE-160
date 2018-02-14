import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FloatTotalAverage {
  public static void main(String args[]) {
    final List<Double> nums = new ArrayList<>();
    final Scanner s = new Scanner(System.in);


    double num = s.nextDouble();
    while (num != 0.0) {
      nums.add(num);
      num = s.nextDouble();
    }

    final double sum = nums.stream().reduce(0.0, Double::sum);
    final double average = sum / nums.size();
    final long negativeCount = nums.stream().filter(x -> x < 0).count();
    final long positiveCount = nums.stream().filter(x -> x > 0).count();
    System.out.printf("Total: %f\nAverage: %f\nNegative: %d\nPositive: %d\n", sum, average, negativeCount, positiveCount);
  }
}
