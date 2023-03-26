public class RechtangleShape extends Shape{
  int length;
  int width;

  public RechtangleShape(String name, int length, int width) {
    super(name);
    this.length = length;
    this.width = width;
  }

  @Override
  public double square() {
    return length * width;
  }
}
