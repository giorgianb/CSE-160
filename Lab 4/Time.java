import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Time {
  public static void main(final String[] args) {
    final int[] nums = new int[10000000];
    final Random rand = new Random();

    for (int i = 0; i < nums.length; ++i)
      nums[i] = rand.nextInt();

    final Scanner s = new Scanner(System.in);
    System.out.print("Enter number to check if in array: ");
    final int goal = s.nextInt();
    System.out.println("Linear Search");
    long startTime = System.currentTimeMillis();
    boolean contains = IntStream.of(nums).anyMatch(e -> e == goal);
    long endTime = System.currentTimeMillis();
    System.out.printf("Contains: %b\tTime: %d\n", contains, endTime - startTime);

    Arrays.sort(nums);
    System.out.println("Binary Search");
    startTime = System.currentTimeMillis();
    contains = Arrays.binarySearch(nums, goal) > 0;
    endTime = System.currentTimeMillis();
    System.out.printf("Contains: %b\tTime: %d\n", contains, endTime - startTime);
  }
}


   
