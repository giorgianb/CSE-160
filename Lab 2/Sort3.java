import java.util.Scanner;
import java.util.Arrays;
public class Sort3 {
  public static void main(String args[]) {
    final Scanner s = new Scanner(System.in);

    System.out.print("Enter the smallest integer: ");
    final int smallest = s.nextInt();
    System.out.print("Enter the middle number: ");
    final int middle = s.nextInt();
    System.out.print("Enter the largest number: ");
    final int largest = s.nextInt();

    int[] array = {smallest, middle, largest};
    Arrays.sort(array);
    System.out.printf("%d %d %d\n",  array[0], array[1], array[2]);
  }
}
