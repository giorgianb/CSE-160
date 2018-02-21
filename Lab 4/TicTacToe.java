import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TicTacToe {
  public static void main(final String[] args) {
    boolean[][] board = new boolean[3][3];
    final Random r = new Random();

    for (int i = 0; i < board.length; ++i) {
      for (int j = 0; j < board[i].length; ++j)  {
        board[i][j] = r.nextBoolean();
        System.out.print((board[i][j] ? 1 : 0) + " ");
      }
      System.out.println();
    }

    checkRows(board);
    checkColumns(board);
    checkDiagonals(board);
  }

  public static void checkRows(boolean[][] board) {
    for (int i = 0; i < board.length; ++i) {
      final int index = i;
      Stream<Boolean> s = IntStream.range(0, board[i].length).mapToObj(idx -> board[index][idx]);

      boolean homo = s.allMatch(x -> x);
      if (homo)
        System.out.printf("row[%d]: all ones\n", i);

      s = IntStream.range(0, board[i].length).mapToObj(idx -> board[index][idx]);
      homo = s.allMatch(x -> !x);
      if (homo)
        System.out.printf("row[%d]: all zeroes\n", i);
    }
  }

  public static void checkColumns(boolean[][] board) {
    for (int i = 0; i < board.length; ++i) {
      boolean allZeroes = true;
      boolean allOnes = true;
      for (int j = 0; j < board.length; ++j) {
        allZeroes &= !board[j][i];
        allOnes &= board[j][i];
      }

      if (allOnes)
        System.out.printf("column[%d]: all ones\n", i);

      if (allZeroes)
        System.out.printf("column[%d]: all zeroes\n", i);
    }
  }

  public static void checkDiagonals(boolean[][] board) {
    boolean allOnes = true;
    boolean allZeroes = true;
    for (int i = 0; i < board.length; ++i) {
      allOnes &= board[i][i];
      allZeroes &= !board[i][i];
    }
    if (allOnes)
      System.out.printf("major column: all ones\n");

    if (allZeroes)
      System.out.printf("major all zeroes\n");

    allOnes = true;
    allZeroes = true;
    for (int i = 0; i < board.length; ++i) {
      allOnes &= board[i][board.length - i - 1];
      allZeroes &= !board[i][board.length - i - 1];
    }

    if (allOnes)
      System.out.printf("minor column: all ones\n");

    if (allZeroes)
      System.out.printf("minor all zeroes\n");
  }
}
