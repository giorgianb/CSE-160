import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CheckerBoard {
  public static void main(final String[] args) {
    boolean[][] checkerboard = new boolean[8][8];
    final Random r = new Random();

    for (int i = 0; i < checkerboard.length; ++i) {
      for (int j = 0; j < checkerboard[i].length; ++j)  {
        checkerboard[i][j] = r.nextBoolean();
        System.out.print((checkerboard[i][j] ? 1 : 0) + " ");
      }
      System.out.println();
    }

    checkRows(checkerboard);
    checkColumns(checkerboard);
    checkDiagonals(checkerboard);
  }

  public static void checkRows(boolean[][] board) {
    for (int i = 0; i < board.length; ++i) {
      final int index = i;
      Stream<Boolean> s = IntStream.range(0, board[i].length).mapToObj(idx -> board[index][idx]);
      System.out.printf("row[%d]: all ones: %b\n", i, s.allMatch(x -> x));
      s = IntStream.range(0, board[i].length).mapToObj(idx -> board[index][idx]);
      System.out.printf("row[%d]: all zeros: %b\n", i, s.allMatch(x -> !x));
    }
  }

  public static void checkColumns(boolean[][] board) {
    for (int i = 0; i < board.length; ++i) {
      boolean allZeroes = true;
      boolean allOnes = true;
      for (int j = 0; j < board.length; ++j) {
        allZeroes &= !board[j][i];
        allOnes &= !board[j][i];
      }
      System.out.printf("column[%d]: all ones: %b\n", i, allOnes);
      System.out.printf("column[%d]: all zeroes: %b\n", i, allZeroes);
    }
  }

  public static void checkDiagonals(boolean[][] board) {
    boolean allOnes = true;
    boolean allZeroes = true;
    for (int i = 0; i < board.length; ++i) {
      allOnes &= board[i][i];
      allZeroes &= !board[i][i];
    }
    System.out.printf("major diagonal: all ones: %b\n", allOnes);
    System.out.printf("major diagonal: all zeroes: %b\n",  allZeroes);

    allOnes = true;
    allZeroes = true;
    for (int i = 0; i < board.length; ++i) {
      allOnes &= board[i][board.length - i - 1];
      allZeroes &= !board[i][board.length - i - 1];
    }

    System.out.printf("minor diagonal: all ones: %b\n", allOnes);
    System.out.printf("minor diagonal: all zeroes: %b\n",  allZeroes);
  }
}
