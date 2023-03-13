public class Triangle extends Shape {
  double side; //длина стороны треуольника
  double height; // высота

  public Triangle(String name, double side, double height) {
    super(name);
    this.side = side;
    this.height = height;
  }

  @Override
  public double square() {
    return (side * height) / 2;
  }
}
