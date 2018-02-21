import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Scanner;

public class Game {
  public static void main(final String[] args) {
    int[][] board = new int[3][3];
    final Scanner s = new Scanner(System.in);

    for (int i = 0; i < board.length; ++i)
      for (int j = 0; j < board.length; ++j)
        board[i][j] = -1;

    for (;;) {
      System.out.print("Player 1: ");
      getValidMove(s, board, 1);
      printBoard(board);
      System.out.print("Player 2: ");
      getValidMove(s, board, 0);
      printBoard(board);
      
      checkRows(board);
      checkColumns(board);
      checkDiagonals(board);
    }
  }

  public static void printBoard(final int[][] board) {
    for (int i = 0; i < board.length; ++i) {
      for (int j = 0; j < board[i].length; ++j)
        if (board[i][j] == -1)
          System.out.print("-");
        else if (board[i][j] == 1)
          System.out.print("X");
        else if (board[i][j] == 0)
          System.out.print("O");
      System.out.println();
    }
  }

  public static void getValidMove(final Scanner s, int[][] board, final int val) {
      int x, y;
      boolean read = false;
      do {
        x = s.nextInt();
        y = s.nextInt();
        read = x >= 0 && x < board.length && y >= 0 && y < board.length && board[x][y] == -1;
        if (!read)
          System.out.print("Please enter a valid move: ");
      } while (!read);

      board[x][y] = val;
  }

  public static void checkRows(int[][] board) {
    for (int i = 0; i < board.length; ++i) {
      final int index = i;
      Stream<Boolean> s = IntStream.range(0, board[i].length).mapToObj(idx -> board[index][idx] == 1);

      boolean homo = s.allMatch(x -> x);
      if (homo) {
        System.out.println("Player 1 wins");
        System.exit(0);
      }

      s = IntStream.range(0, board[i].length).mapToObj(idx -> board[index][idx] == 0);
      homo = s.allMatch(x -> x);
      if (homo) {
        System.out.println("Player 2 wins");
        System.exit(0);
      }
    }
  }

  public static void checkColumns(int[][] board) {
    for (int i = 0; i < board.length; ++i) {
      boolean allZeroes = true;
      boolean allOnes = true;
      for (int j = 0; j < board.length; ++j) {
        allZeroes &= board[j][i] == 0;
        allOnes &= board[j][i] == 1;
      }

      if (allOnes) {
        System.out.println("Player 1 wins");
        System.exit(0);
      }


      if (allZeroes) {
        System.out.println("Player 2 wins");
        System.exit(0);
      }
    }
  }

  public static void checkDiagonals(int[][] board) {
    boolean allOnes = true;
    boolean allZeroes = true;
    for (int i = 0; i < board.length; ++i) {
      allOnes &= board[i][i] == 1;
      allZeroes &= board[i][i] == 0;
    }

    if (allOnes) {
      System.out.println("Player 1 wins");
      System.exit(0);
    }

    if (allZeroes) {
      System.out.println("Player 2 wins");
      System.exit(0);
    }

    allOnes = true;
    allZeroes = true;
    for (int i = 0; i < board.length; ++i) {
      allOnes &= board[i][board.length - i - 1] == 1;
      allZeroes &= board[i][board.length - i - 1] == 0;
    }

    if (allOnes) {
      System.out.println("Player 1 wins");
      System.exit(0);
    }

    if (allZeroes) {
      System.out.println("Player 2 wins");
      System.exit(0);
    }
  }
}
