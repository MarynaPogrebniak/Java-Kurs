package l_27_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySystemsFrom2To10 {

  public static void main(String[] args) {
    //Задача 1. Сделать перевод двоичного числла в десятичное.
    //число(10) = цифра2^(n-1) + цифра2^(n-2) + ...+ цифра2^(1) + цифра1
    // (цифра = 0 или 1 из двоичного числа)
    System.out.println("Перевод двоичного числа в десятеричное");
    Scanner sc = new Scanner(System.in);

    char ch = '1';
    int num;
    num = Character.getNumericValue(ch);
    // проверка, что можем перевести символ в число (char -> int)
    System.out.println("Символ " + ch + ". Его значение: " + num);
    int pow = (int) (num * Math.pow(2, 7));
    // проверка возведения в степень
    System.out.println("num * 2 pow 7 is " + pow);

    //Алгоритм
    // пользователь вводит двоичное числр. Строка
    // разбиваем строку на символы
    //переводим символы в числа char v int
    //

    System.out.println("Введите двоичное число: ");
    String binary_number = sc.next(); // ввод двоичного числа строкой
    System.out.println("Вы ввели двоичное число " + binary_number);
    int l = binary_number.length(); // узнали длину строки
    System.out.println("Количество цифр в двоичном числе " + l);

    String[] simbols = new String[l]; // заводим массив под цифры двоичного числа
    ArrayList<String> simbolsArrayList = new ArrayList<>(); // аналогичный массив, но его проще печатать

    for (int i = 0; i < simbols.length; i++) {
      simbols[i] = String.valueOf(binary_number.charAt(i));
      simbolsArrayList.add(i, simbols[i]);

    }
    System.out.println(Arrays.toString(simbols));
    System.out.println(simbolsArrayList);
    System.out.println();

    int decimalNumber = 0;
    for (int i = 0; i < l; i++) {
      // num = Character.getNumericValue(ch);
      Character simbol = simbols[i].charAt(0); // взяли текущий символ
      int s = Character.getNumericValue(simbol); // преобразовали его в число типа int
      decimalNumber =
          decimalNumber + (int) (s * Math.pow(2, (l - 1 - i))); // вычислили десятичное число
    }
    System.out.println("Десятичное число = " + decimalNumber);
  }

}
