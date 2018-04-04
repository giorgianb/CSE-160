public class MyInteger {
  int value;

  public MyInteger(final int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }

  public boolean isEven() {
    return value % 2 == 0;
  }

  public boolean isOdd() {
    return !this.isEven();
  }

  public boolean isPrime() {
    int top = (int) Math.sqrt(value) + 1;

    for (int i = 3; i <= top; i += 2)
      if (value % i == 0)
        return false;

    return true;
  }

  public static boolean isEven(final int value) {
    return (new MyInteger(value)).isEven();
  }


  public static boolean isOdd(final int value) {
    return (new MyInteger(value)).isOdd();
  }

  public static boolean isPrime(final int value) {
    return (new MyInteger(value)).isPrime();
  }

  public boolean equals(final MyInteger i) {
    return i.getValue() == value;
  }

  public boolean equals(final int i) {
    return i == value;
  }

  public static MyInteger parseInt(final String s) {
    return new MyInteger(Integer.parseInt(s));
  }
}




