
import java.util.Scanner;
public class Circle2DTest {
  public static void main(String args[]) {
    final Scanner s = new Scanner(System.in);
    System.out.print("Enter a x, y, r: ");
    final Circle2D c1 = new Circle2D(s.nextDouble(), s.nextDouble(), s.nextDouble());

    System.out.print("Enter a x, y, r: ");
    final Circle2D c2 = new Circle2D(s.nextDouble(), s.nextDouble(), s.nextDouble());

    System.out.print("Enter a x, y: ");
    final double x = s.nextDouble();
    final double y = s.nextDouble();

    System.out.println("Area: " + c1.getArea());
    System.out.println("Perimeter: " + c1.getPerimeter());
    System.out.println("contains point: " + c1.contains(x, y));
    System.out.println("contains circle: " + c1.contains(c2));
    System.out.println("overlaps: " + c1.overlaps(c2));
  }
}
