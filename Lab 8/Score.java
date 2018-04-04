import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Score {
  public static void main(String[] args) throws IOException {
    final Scanner in = new Scanner(new BufferedReader(new FileReader(args[0])));
    final ArrayList<Double> data = new ArrayList<>();


    while (in.hasNextDouble())
      data.add(in.nextDouble());

    double sum = data.stream().mapToDouble(d -> d).sum();
    System.out.println("Total: " + sum);
    System.out.println("Average: " + data.stream().mapToDouble(d -> d).average().getAsDouble());
  }
}

