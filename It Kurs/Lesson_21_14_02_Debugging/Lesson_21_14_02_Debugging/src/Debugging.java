import java.util.Scanner;

public class Debugging {

  public static void main(String[] args) {
    //Задача и ее отладка в Debugger Задача: найти наибольший общий делитель (НОД)
    // двух целых чисел a и b.
    // Примеры:
    // 15 и 20: НОД = 5
    // 15 и 60: НОД = 15
    // 17 и 23: НОД = 1
    // 24 и 40: НОД = 8
    // 6 и 18: НОД = 6
    // 8 и 24 нод 8
    //
    //Алгоритм: Шаг 1: сравнить a и b, найти меньшее из них, пусть меньшее будет min, а большее max.
    // Шаг 2: пройти в цикле от 1 до min (включительно) и делить min на параметр цикла.
    // Если min разделилось нацело на параметр цикла, то делим второе число max на это же число.
    // Если max разделилось нацело на параметр цикла, то НОД = параметр цикла.
    Scanner scanner = new Scanner(System.in);
    int a, b;
    int nod = 0;
    System.out.println("Enter the first number: ");
    a = scanner.nextInt();
    System.out.println("Enter the second number: ");
    b = scanner.nextInt();
    System.out.println("You entered numbers " + a + " and " + b);
    //int min = Math.min(a, b);
    //int max = Math.max(a, b);
    int min = min(a, b);
    int max = max(a, b);

    System.out.println("Min is " + min + ". Max is " + max);

    for (int i = 1; i <= min; i++) {
      if (min % i == 0) {
        if (max % i == 0) {
          nod = i;
        }
      }
    }
    System.out.println("nod of numbers " + a + " and " + b + " = " + nod);

  }

  public static int min(int num1, int num2) {
    if (num1 < num2) {
      return num1;
    } else {
      return num2;
    }
  }

  public static int max(int num1, int num2) {
    if (num1 > num2) {
      return num1;
    } else {
      return num2;
    }
  }

}
