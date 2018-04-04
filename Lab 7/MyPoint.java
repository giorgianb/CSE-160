public class MyPoint {
  private double x;
  private double y;

  public MyPoint(final double x, final double y) {
    this.x = x;
    this.y = y;
  }

  public MyPoint() {
    this(0, 0);
  }

  public double getX() { 
    return x;
  }

  public double getY() {
    return y;
  }

  public double distance(final MyPoint p) {
    final double d1 = p.getX() - x;
    final double d2 = p.getY() - y;

    return Math.sqrt(d1*d1 + d2*d2);
  }

  public double distance(final double x, final double y) {
    return this.distance(new MyPoint(x, y));
  }
}
