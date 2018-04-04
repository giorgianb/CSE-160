public class Rectangle {
  private double width = 1;
  private double height = 1;
  private String color = "white";

  public Rectangle() {
  }

  public Rectangle(final double width, final double height) {
    this.width = width;
    this.height = height;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(final double width) {
    this.width = width;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(final double height) {
    this.height = height;
  }


  public String getColor() {
    return color;
  }

  public void setColor(final String color) {
    this.color = color;
  }

  public double getArea() {
    return width * height;
  }

  public double getPerimeter() {
    return 2 * (width + height);
  }
}
