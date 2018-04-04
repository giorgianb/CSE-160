import java.util.Arrays;
import java.util.Scanner;
public class StringSorter {
  public static String sort(final String s) {
    char[] sorted = s.toCharArray();
    Arrays.sort(sorted);
    return new String(sorted);
  }

  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.println(sort(s.nextLine()));
  }
}
