public class Main {

  public static void main(String[] args){

    double r = 10;
    Circle circle = new Circle("Circle", r);
    double result = circle.square();
    System.out.printf("%s %.2f %s\n", "Площадь круга - ", result, "сантиметров");

    double side = 100;
    double height = 200;
    Triangle triangle = new Triangle("Triangle", side,height);
    double squareTriangle = triangle.square();
    System.out.printf("%s %.2f %s\n", "Площадь треугольника - ", squareTriangle, "сантиметров");

    Rechtangle rechtangle = new Rechtangle("Rechtangle", 5, 3);
    double squareRechtangle = rechtangle.square();
    System.out.printf("%s %.2f %s\n", "Площадь прямоугольника - ", squareRechtangle, "сантиметров");

    Trapezoid trapezoid = new Trapezoid("Trapezoid", 10,7,6);
    double squareTrapezoid = trapezoid.square();
    System.out.printf("%s %.2f %s \n", "Площадь трапеции - ", squareTrapezoid, "сантиметров");

  }
}