public class ColumnSum {
  public static double sumColumn(final double[][] m, final int c) {
    double sum = 0;
    for (int i = 0; i < m[c].length; ++i)
      sum += m[c][i];

    return sum;
  }
}

