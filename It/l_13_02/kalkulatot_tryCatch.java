package l_13_02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class kalkulatot_tryCatch {

  public static void main(String[] args) {
    // Калькулятор для действия деления с защитой
    // (деление на 0, ввод символов вместо чисел)

    Scanner sc = new Scanner(System.in);
    char choice;

    while (true) {
      try {

        System.out.println("Введите целое число a");
        int a = sc.nextInt();
        System.out.println("Введите целое число b");
        int b = sc.nextInt();

        int c = div(a, b);
        System.out.println("Частное " + a + " / " + b + " = " + c);
      } catch (ArithmeticException ex) {
        System.out.println(ex.getMessage() + " Делить на ноль нельзя");

      } catch (InputMismatchException ex) {
        System.out.println("Ошибка " + ex.getMessage() + " означает, что нельзя вводить символы ");
      }

      System.out.println("Продолжим? y/n ");
      choice = sc.next().toLowerCase().charAt(0);
      if (choice == 'n') {
        break;
      } else {
        continue;
      }
    }
  }

  public static int div(int a, int b) {
    return a / b;
  }
}
