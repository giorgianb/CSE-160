import java.util.Scanner;
public class BinaryToHex {
  public static String binaryToHex(String s) {
    return Integer.toString(Integer.parseInt(s, 2), 16);
  }

  public static void main(String arg[]) {
    Scanner s = new Scanner(System.in);
    System.out.println(binaryToHex(s.nextLine()));
  }
}
