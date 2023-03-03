package l_14_02;

import java.util.Scanner;

public class debug_min_max {

//поиск максимального/минимального значения массива

  public static void main(String[] args) {

    //зададим массив случ целых чисел от 1 до 10
    //реализрвать метода поиска max из чисел в массиве и min
    // распечатать массив и min max

    int[] arrayIntRandom = new int[10];
    for (int i = 0; i < arrayIntRandom.length; i++) {
      arrayIntRandom[i] = (int) ((Math.random() * (10 - 1 + 1) + 1));
      System.out.print(arrayIntRandom[i] + " | ");
    }
    System.out.println();

    int min_array = min(arrayIntRandom);
    int max_array = max(arrayIntRandom);
    System.out.println("Min in array is " + min_array);
    System.out.println("Max in array is " + max_array);
  }


  //перебираем значения массива и каждое сравниваем с текущим минимумом
  //если значение меньше минимума, то минимум становится равным
  //найденному значению массива
  public static int min(int array[]) {
    int minimum = 10;
    for (int i = 0; i < array.length; i++) {
      if (array[i] < minimum) {
        minimum = array[i];
      }
    }
    return minimum;
  }

  public static int max(int array[]) {
    int maximum = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] > maximum) {
        maximum = array[i];
      }
    }
    return maximum;
  }
}
