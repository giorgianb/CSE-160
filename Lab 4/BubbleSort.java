import java.util.Scanner;
public class BubbleSort {
  public static void main(final String[] args) {
    final Scanner s = new Scanner(System.in);
    System.out.print("Enter length: ");
    final int length = s.nextInt();
    final double[] nums = new double[length];

    System.out.print("Enter numbers: ");
    for (int i = 0; i < length; ++i)
      nums[i] = s.nextDouble();

    boolean changed = false;
    do {
      changed = false;
      for (int i = 0; i < nums.length - 1; ++i)
        if (nums[i] > nums[i + 1]) {
          final double tmp = nums[i];
          nums[i] = nums[i + 1];
          nums[i + 1] = tmp;
          changed = true;
        }
    } while (changed);

    System.out.print(nums[0]);
    for (int i = 1; i < nums.length; ++i)
      System.out.print(" " + nums[i]);
    System.out.println();
  }
}


