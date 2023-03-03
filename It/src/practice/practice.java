package practice;

import java.io.IOException;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
import l_07_02._continue;

public class practice {

  public static void main(String[] args) {
    int[] ints = {5, 5, 5, 5, 9, 9, 9, 5};
    findDominant(ints);
  /*  Scanner scan = new Scanner(System.in);
    while (true) {
      try {
        System.out.println("Enter a number ");
        int a = scan.nextInt();

      } catch (InputMismatchException e) {
        System.out.println("only numbers");

      }
      scan.nextLine();
    }
    */
//Есть массив положительных целыж чисел.
// Найти элемент( если он есть), который встречается в массиве
// > length/2 (доминантный). В противном случае вернуть -1

  }

  public static int findDominant(int[] ints) {
    Map<Integer, Integer> occurencesToNumber = new HashMap<>();
    for (int i = 0; i < ints.length; i++) {
      if (occurencesToNumber.containsKey(ints[i])) {
        int value = occurencesToNumber.get(ints[i]);

        occurencesToNumber.put(ints[i], value + 1);
      } else {
        occurencesToNumber.put(ints[i], i);
      }
      System.out.println(occurencesToNumber);
    }
    return 0;
  }
}


