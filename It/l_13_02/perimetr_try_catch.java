package l_13_02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class perimetr_try_catch {

  public static void main(String[] args) {
    // Калькулятор для вычисления периметра комнаты
// На входе: a и b - стороны прямоугольника
// На выходе: периметр прямоугольника
// Ключевой алгоритм: p = (a + b) *2 ...
// Интерфейс: защититься от ошибок пользователя при вводе a и b, нельзя вводить символы вместо цифр
// и отрицательные числла в качестве длины сторон комнаты.
// Предложить пользователю продолжить работу калькулятора
// до тех пор, пока он не откажется.
// Проверку введенного числа на позитивность (a > 0)
// выполнить в вызываемой функции,котороая сообщает
// о неправильном вводе данных.

    System.out.println("Давай посчитаем периметр комнаты");
    char choice;
    Scanner sc = new Scanner(System.in);

    while (true) {
      try {
        System.out.println("Введите длину 1й стороны прямоугольной комнаты");
        int a = sc.nextInt();
        System.out.println("Введите длину 2й стороны прямоугольной комнаты");
        int b = sc.nextInt();
        System.out.println("Периметр комнаты = " + 2 * (a + b));

      } catch (InputMismatchException e) {
        System.out.println("Ошибка ввода, вы ввели не число ");

      }
      System.out.println("Продолжим? - y/n");
      choice = sc.next().toLowerCase().charAt(0);
      if (choice == 'n') {
        break;
      } else {
        continue;
      }

    }
  }  /*private static void checkPositive(int a) {
    if (a <= 0) {
      System.out.println(" Wrong input.");
    }*/
}
