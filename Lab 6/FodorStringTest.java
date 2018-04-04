import java.util.Scanner;
public class FodorStringTest {
  public static void main(String args[]) {
    final Scanner s = new Scanner(System.in);
    System.out.print("Enter a string: ");
    FodorString s1 = new FodorString(s.nextLine().toCharArray());

    System.out.print("Enter index: ");
    final int index = s.nextInt();

    System.out.print("Enter substring indices: ");
    final int begin = s.nextInt();
    final int end = s.nextInt();
    System.out.print("Enter a string to compare to: ");
    s.nextLine();
    FodorString s2 = new FodorString(s.nextLine().toCharArray());

    System.out.print("Enter a split delimiter: ");
    FodorString s3 = new FodorString(s.nextLine().toCharArray());

    System.out.println("Length: " + s1.length());
    System.out.println("charAt: " + s1.charAt(index));
    System.out.println("toLowerCase: " + s1.toLowerCase());
    System.out.println("substring: " + s1.substring(begin, end));
    System.out.println("equals: " + s1.equals(s2));
    System.out.println("valueOf: " + FodorString.valueOf(index));
    System.out.print("split: ");
    for (FodorString split: s1.split(s3))
        System.out.print(split + " ");
    System.out.println();
  }
}
