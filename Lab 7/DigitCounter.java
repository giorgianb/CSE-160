import java.util.Scanner;
public class DigitCounter {
  public static int[] count(String s) {
    int[] digits = new int[10];
    for (int i = 0; i < 10; ++i)
      digits[i] = 0;

    for (int i = 0; i < s.length(); ++i)
      if (Character.isDigit(s.charAt(i)))
        ++digits[s.charAt(i) - '0'];

    return digits;
  }

  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);

    String myString = s.nextLine();
    int count[] = count(myString);
    for (int i = 0; i < count.length; ++i)
      System.out.println(i + ": " + count[i]);
  }
}

