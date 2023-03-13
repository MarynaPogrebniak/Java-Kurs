public class Trapezoid extends Shape{

  double firstSide;
  double secondSide;
  double height;

  public Trapezoid(String name, double firstSide, double secondSide, double height) {
    super(name);
    this.firstSide = firstSide;
    this.secondSide = secondSide;
    this.height = height;
  }

  @Override
  public double square() {
    return ((firstSide + secondSide)/2)*height;
  }
}
