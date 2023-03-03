import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class From10To2HW3Methods2 {
  //Задача 3
  //вынести в метод print_binary_number печать полученного двоичного числа,
  // на вход метода подается массив из полученных символов двоичного числа

  //вынести в метод get_binary_number получение массива цифр двоичного числа,
  // на вход метода подается целое положительное число, возвращается заполеннный массив цифр двоичного числа

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num = 0; //переменная для десятичного числа
    boolean wrong_input = false; //переменная дл ощиюочного ввода
    int division = 1; //результат от целочисленного деления
    int rest = 0; // остаток от целочисленного деления

    ArrayList<String> binary_num = new ArrayList<>(); // массив для накопления символов двоичного числа
    // ввод числа для перевода в двоичную систему
    System.out.println("Перевод из 10-й системы счисленния в 2-ю");

    while (true) {
      System.out.println("Введите положительное целое число: ");
      try {
        num = sc.nextInt();
      } catch (InputMismatchException e) {
        System.out.println("not a number");
        sc.nextLine();
        wrong_input = true;
        if (wrong_input) {
          continue;
        }
      }
      System.out.println("Вы ввели " + num);

      System.out.println(getBinaryNumber(num, binary_num));

      printBinaryNumber(binary_num);
      binary_num.clear();
      char choice;

      do {
        System.out.println("Хотите продолжить? y/n?");
        choice = sc.next().charAt(0);
        if (choice != 'n') {
          System.out.println("Введите положительное целое число: ");
          int num1 = 0;
          try {

            num1 = sc.nextInt();
          } catch (InputMismatchException e) {
            System.out.println("not a number");
            sc.nextLine();
            wrong_input = true;
            if (wrong_input) {
              continue;
            }
          }
          System.out.println("Вы ввели " + num1);
          System.out.println(getBinaryNumber(num1, binary_num));
          getBinaryNumber(num1, binary_num);

          printBinaryNumber(binary_num);
          binary_num.clear();

        }

        System.out.println();
      }
      while (choice != 'n');
      {
        System.out.println("Приходите еще");
        break;
      }
    }
  }

  public static void printBinaryNumber(ArrayList<String> b) {
    System.out.println("Двоичное число : ");
    for (int j = b.size() - 1; j >= 0; j--) {
      System.out.print(b.get(j));
    }
    System.out.println();
  }

  public static ArrayList<String> getBinaryNumber(int a, ArrayList<String> b) {

    //вынести в метод get_binary_number получение массива цифр двоичного числа,
    // на вход метода подается целое положительное число, возвращается заполеннный массив цифр двоичного числа
    int i2 = 0; // счетчик количества цифр
    // цикл перевода числа в двоичную систему
    int num1 = 0;
    int division1 = 1; //результат от целочисленного деления
    int rest1 = 0; // остаток от целочисленного деления
    while (num1 > 0) {
      rest1 = num1 % 2; // остаток от деления на 2 - это первая цифра
      // System.out.println(rest);
      b.add(i2, String.valueOf(rest1)); // записали символ цифры в масив
      num1 = num1 / 2; // получили частное от деления числа на 2
      // System.out.println(num);
      i2++; // увеличили счетчик символов цифр на 1
    }

    System.out.println("Размер массива: " + b.size());
    System.out.println("Массив полученных цифр: " + b);

    return b;

  }
}