package l_13_02;

import java.util.Scanner;

public class kvadratnoe_uravnenie {

  public static void main(String[] args) {
    //Задача 3 (*) Решение квадратного уравнения с коэффициентам a, b, c.
    // Для извлечения квадратного корня импортировать класс Math.
// ax^{2}+bx+c=0, a !=0
    //D = b2 − 4ac.

    //Если D < 0, корней нет;
    //Если D = 0, есть ровно один корень;
    //Если D > 0, корней будет два.

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a");
    double a = sc.nextDouble();
    System.out.println("Enter b");
    double b = sc.nextDouble();
    System.out.println("Enter c");
    double c = sc.nextDouble();

    double x;
    double x1;
    
    double d = Math.pow(b, 2) - 4 * a * c;
    System.out.println(d);
    if (d < 0) {
      System.out.println("quadratic equation has no solutions");
    } else if (d == 0) {
      x = (-b) / (2 * a);
      System.out.println("x is " + x);
    } else if (d > 0) {
      x = ((-b + Math.sqrt(d)) / (2 * a));
      x1 = ((-b - Math.sqrt(d)) / (2 * a));
      System.out.println("x is " + x + " x1 is " + x1);

    }

  }

}



