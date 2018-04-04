public class MyIntegerTest {
  public static void main(String args[]) {
    MyInteger i = new MyInteger(11);
    System.out.println(i.getValue());
    System.out.println(i.isEven());
    System.out.println(i.isOdd());
    System.out.println(i.isPrime());
    System.out.println(i.equals(24));
    System.out.println(MyInteger.isOdd(24));
    System.out.println(MyInteger.isEven(24));
    System.out.println(MyInteger.isPrime(24));
    System.out.println(MyInteger.parseInt("10").getValue());
  }
}

