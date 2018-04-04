public class Fan {
  public final int SLOW = 1;
  public final int MEDIUM = 2;
  public final int FAST = 3;

  private int speed =  SLOW;
  private boolean on = false;
  private double radius = 5;
  private String color = "blue";

  Fan() {
  }

  public double getSpeed() {
    return speed;
  }

  public void setSpeed(final int speed) {
    if (speed > SLOW && speed <= FAST)
      this.speed = speed;
  }

  public boolean getOn() {
    return on;
  }

  public void setOn(final boolean on) {
    this.on = on;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(final double radius) {
    return this.radius = radius;
  }

  public String getColor() {
    return color;
  }

  public String setColor(final String color) {
    this.color = color;
  }

  String toString() {
    return "Fan(speed: " + speed + ", on: ", on, "radius: " + radius + "color: " + color + ")";
  }
}
