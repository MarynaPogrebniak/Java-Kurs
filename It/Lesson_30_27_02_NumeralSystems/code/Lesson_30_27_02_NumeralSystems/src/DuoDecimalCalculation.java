import java.util.ArrayList;
import java.util.Scanner;

public class DuoDecimalCalculation {

  public static void main(String[] args) {

    System.out.println("Перевод из 10-й системы счисленния в 12-ю");
    Scanner sc = new Scanner(System.in); // инициализация сканера

    System.out.println("Введите положительное целое число: "); // приглашение пользователю
    int num = 0; // переменная для десятичного числа
    boolean wrong_input = false; // переменная для ошибочного ввода
    int division = 1; // результат от целочисленного деления
    int rest = 0; // остаток от целочисленного деления

    ArrayList<String> binary_num = new ArrayList<>(); // массив для накопления цифр двендцатиричного числа

    // ввод числа для перевода в дыенадцатиричную систему

    num = sc.nextInt();

    System.out.println(num); // вывод введенного числа

    int i = 0; // счетчик количества цифр

    // цикл перевода числа в двенадцатиричную систему
    while (num > 0) {

      rest = num % 12; // остаток от деления на 12 - это первая цифра
      String restString = Integer.toString(rest);
      if (rest == 10) {
        restString = "A";

      } else if (rest == 11) {
        restString = "B";
      }
      binary_num.add(i, restString); // записали цифру в масив
      num = num / 12; // получили частное от деления числа на 12
      i++;
    }
    System.out.println("Массив полученных цифр: " + binary_num);

    // вывод
    System.out.println("Двенадцатиричное число : ");
    for (int j = binary_num.size() - 1; j >= 0; j--) { // цикл идет от конца массива к его началу
      System.out.print(binary_num.get(j));
    }
  }
}