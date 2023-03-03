import java.util.InputMismatchException;
import java.util.Scanner;

public class hw_kalkulator {

  public static void main(String[] args) {
    //Задача 1 Сделать калькулятор для простейших арифметических действий с двумя числами
    // (сложение,вычитание, умножение и деление).
    // Защититься от ввода символов вместо чисел и от деления на 0.
    // Интерфейс организовать так, чтобы пользователь мог продолжить работу
    // с калькулятором до тех пор, пока он не откажется.

    Scanner scanner = new Scanner(System.in);
    char choice;
    while (true) {
      int num1, num2;
      try {
        System.out.println("Enter the first number: ");
        num1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        num2 = scanner.nextInt();

        System.out.println("Enter an operator(+,-,/,*)");
        char operator = scanner.next().charAt(0);
        int result = 0;

        switch (operator) {

          case '+':
            result = num1 + num2;
            break;

          case '-':
            result = num1 - num2;
            break;

          case '*':
            result = num1 * num2;
            break;

          case '/':
            result = num1 / num2;
            break;

          default:
            System.out.println("Wrong operator");

        }
        if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
          System.out.println(num1 + " " + operator + num2 + " = " + result);
        }

      } catch (InputMismatchException ex) {
        System.out.println("That is symbol, not a number");

      } catch (ArithmeticException ex) {
        System.out.println("you can't divide by zero");
      }
      System.out.println("Продолжим? y/n ");
      choice = scanner.next().toLowerCase().charAt(0);
      if (choice == 'n') {
        break;
      } else {
        continue;
      }
    }

  }

}
