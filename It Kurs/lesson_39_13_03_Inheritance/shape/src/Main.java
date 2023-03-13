public class Main {

  public static void main(String[] args){

    double r = 10;
    Circle circle = new Circle("Circle", r);
    double result = circle.square();
    System.out.printf("%s %.2f \n", "Площадь круга - ", result);


    double side = 100;
    double height = 200;
    Triangle triangle = new Triangle("Triangle", side,height);
    double squareTriangle = triangle.square();
    System.out.printf("%s %.2f ", "Площадь треугольника - ", squareTriangle);

  }
}