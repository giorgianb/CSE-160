import java.util.ArrayDeque;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.FileReader;
import java.util.Arrays;
import java.util.ArrayList;

public class Replace {
  final static String target = "Java";
  final static String replacement = "HTML";
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new FileReader(args[0]));
    int c;
    StringBuilder data = new StringBuilder();
    data.append(' ');
    while ((c = in.read()) != -1)
      data.append((char) c);

    data.append(' ');

    String result = data.toString();
    System.out.print(result.substring(1, result.length() - 1));
    String replaced = String.join(replacement, result.split(target));
    System.out.print(replaced.substring(1, replaced.length() - 1));
    in.close();
    PrintWriter out = new PrintWriter(args[0]);
    out.print(replaced.substring(1, replaced.length() - 1));
    out.close();
  }
}
