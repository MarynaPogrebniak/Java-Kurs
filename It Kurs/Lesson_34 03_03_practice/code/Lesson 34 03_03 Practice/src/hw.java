import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class hw {

  public static void main(String[] args) {
    //Задача 1. Имеется список студентов с их фамилиями (задать внутри программы).
    // Распределить студентов на 2 примерно равных группы (+/- 1 человек) случайным образом.
    //
    //сначала написать словами алгоритм того, как это будет делаться;
    //реализовать алгоритм в коде;
    //при реализации использовать метод(ы).

    List <String> list = new ArrayList<>();

    fillingArray(list);
    for (String i: list) {
      System.out.print(i + " | ");
    }
    System.out.println();

    List <String> listTwo = new ArrayList<>();
    fillingArrayTwo(list, listTwo);

    for (String i: list) {
      System.out.print(i + " | ");
    }
    System.out.println();
    for (String i: listTwo) {
      System.out.print(i + " | ");
    }
  }

  private static void fillingArrayTwo(List <String> array, List <String> array2) {
    for (int i = 0; i <= array.size()/2; i++){
      int n = (int)( Math.random() * ((array.size()-1) - (-0)) + 1) + 0 ;
      array2.add(array.get(n));
      array.remove(n);
    }
  }

  public static void fillingArray (List <String> array) {
    array.add("Leonid");
    array.add("Oleg");
    array.add("Egor");
    array.add("Ekaterina");
    array.add("Valentin");
    array.add("Maryna");
    array.add("Julian");
  }
}
