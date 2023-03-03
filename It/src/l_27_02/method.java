package l_27_02;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class method {
  //Задача 3
  //вынести в метод print_binary_number печать полученного двоичного числа,
  // на вход метода подается массив из полученных символов двоичного числа

  //вынести в метод get_binary_number получение массива цифр двоичного числа,
  // на вход метода подается целое положительное число, возвращается заполеннный массив цифр двоичного числа

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num = 0; //переменная для десятичного числа
    boolean wrong_input = false; //переменная дл ошиюочного ввода
    int division = 1; //результат от целочисленного деления
    int rest = 0; // остаток от целочисленного деления

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

      ArrayList<String> binary_num = new ArrayList<>(); // массив для накопления символов двоичного числа

      binary_num = getBinaryNumber(num);
      System.out.println("Размер массива: " + binary_num.size());
      System.out.println("Массив полученных цифр: " + binary_num);

      printBinaryNumber(binary_num);

      binary_num.clear();

      char choice;
      int num1 = 0;
      int division1 = 1; //результат от целочисленного деления
      int rest1 = 0; // остаток от целочисленного деления

      do {
        System.out.println("Хотите продолжить? y/n?");
        choice = sc.next().charAt(0);
        if (choice != 'n') {
          System.out.println("Введите положительное целое число: ");
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
          binary_num = getBinaryNumber(num1);
          System.out.println("Размер массива: " + binary_num.size());
          System.out.println("Массив полученных цифр: " + binary_num);

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

  public static ArrayList<String> getBinaryNumber(int num) {
    ArrayList<String> binary_num = new ArrayList<>();
    int rest = 0;
    int i1 = 0;
    while (num > 0) {
      rest = num % 2;
      binary_num.add(i1, String.valueOf(rest));
      num = num / 2;
      i1++;
    }
    return binary_num;
  }

}






