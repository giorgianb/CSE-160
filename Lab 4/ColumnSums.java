import java.util.Scanner;
public class ColumnSums {
  public static double sumColumn(final double[][] m, final int c) {
    double sum = 0;
    for (int i = 0; i < m[c].length; ++i)
      sum += m[c][i];

    return sum;
  }

  public static void main(final String args[]) {
    final Scanner s = new Scanner(System.in);

    System.out.print("Enter n: ");
    final int n = s.nextInt();
    final double[][] matrix = new double[n][n];
    System.out.print("Enter the transpose of the matrix: ");
    for (int i = 0; i < n; ++i) {
      for (int j = 0; j < n; ++j)
        matrix[i][j] = s.nextDouble();
    }

    for (int i = 0; i < n; ++i)
      System.out.println(sumColumn(matrix, i));
  }
}

