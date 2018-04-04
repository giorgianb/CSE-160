class RectangleTest {
  public static void main(String args[]) {
    Rectangle bob = new Rectangle(4, 40);
    Rectangle joey = new Rectangle(3.5, 35.9);

    System.out.printf("bob: (width: %f, height: %f, color: %s, area: %f, perimeter: %f)\n", bob.getWidth(), bob.getHeight(), bob.getColor(), bob.getArea(), bob.getPerimeter());

    System.out.printf("joey: (width: %f, height: %f, color: %s, area: %f, perimeter: %f)\n", joey.getWidth(), joey.getHeight(), joey.getColor(), joey.getArea(), joey.getPerimeter());

  }
}
