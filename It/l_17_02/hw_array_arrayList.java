package l_17_02;

import java.util.ArrayList;

public class hw_array_arrayList {

  public static void main(String[] args) {

// Задача 2 Заполнить массив 10 х 10 случайными числами 0 или 1.
    // Для каждой строки подсчитать сумму всех элементов массива в этой строке.

    ArrayList<Integer> numbers = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      numbers.add((int) (Math.random() * ((1 - 0 + 1) + 0)));
    }

    System.out.println(numbers);
    int sum = 0;
    for (int i = 0; i < numbers.size(); i++) {
      sum = sum + numbers.get(i);
    }
    System.out.println(sum);

  }
}
