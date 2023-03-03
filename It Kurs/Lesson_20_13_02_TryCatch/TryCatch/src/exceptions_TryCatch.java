import java.util.Scanner;

public class exceptions_TryCatch {

  public static void main(String[] args) {
    // считать с клавиатуры целое a
    // считать с клавиатуры целое b
    // задать функцию, которая вычисляет частное a и b
    // запустить бесконечный цикл для ввода a и b, чтобы не запускать программу каждый раз
    // проверить, что будет, если задать b = 0 - должна появиться ошибка, программа закончится аварйно
    // применить try ... catch для обработки ошибки деления на 0
    // протестировать программу
    Scanner sc = new Scanner(System.in);

    while (true) {
      try {
        int a;
        int b;
        int c;
        System.out.println("Введите целое число a");
        a = sc.nextInt();
        System.out.println("Введите целое число b");
        b = sc.nextInt();

        c = div(a, b);
        System.out.println("Частное " + a + " / " + b + " = " + c);
      } catch (ArithmeticException ex) {
        System.out.println(ex.getMessage() + " Делить на ноль нельзя");
      }

    }
  }

  public static int div(int a, int b) {
    return a / b;
  }


}
