public class Circle2D {
  private final double x;
  private final double y;
  private final double r;

  public Circle2D(final double x, final double y, final double r) {
    this.x = x;
    this.y = y;
    this.r = r;
  }

  public Circle2D() {
    this(0, 0, 1);
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  public double getRadius() {
    return r;
  }

  public double getArea() {
    return Math.PI * r*r;
  }

  public double getPerimeter() {
    return 2 * Math.PI * r;
  }

  public boolean contains(final double x, final double y) {
    final double dx = x - this.x;
    final double dy = y - this.y;

    return Math.sqrt(dx*dx + dy*dy) < this.r;
  }

  public boolean contains(final Circle2D circle) {
    final double dxr = circle.getX() - this.x;
    final double dyr = circle.getY() - this.y;

    final double dr = Math.sqrt(dxr*dxr + dyr*dyr);
    return this.contains(circle.getX(), circle.getY()) && dr + circle.getRadius() < this.r;
  }

  public boolean overlaps(final Circle2D circle) {
    final double dxr = circle.getX() - this.x;
    final double dyr = circle.getY() - this.y;

    final double dr = Math.sqrt(dxr*dxr + dyr*dyr);
    return dr - circle.getRadius() < this.r;
  }
}




