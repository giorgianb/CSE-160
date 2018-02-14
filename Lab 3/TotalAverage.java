import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TotalAverage {
  public static void main(String args[]) {
    final List<Integer> nums = new ArrayList<>();
    final Scanner s = new Scanner(System.in);


    int num = s.nextInt();
    while (num != 0) {
      nums.add(num);
      num = s.nextInt();
    }


    final int sum = nums.stream().reduce(0, Integer::sum);
    System.out.printf("Total: %d\nAverage: %f\n", sum, sum * 1.0 / nums.size());
  }
}
