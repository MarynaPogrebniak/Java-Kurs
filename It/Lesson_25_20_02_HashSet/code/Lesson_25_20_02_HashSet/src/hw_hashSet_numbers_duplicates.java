import java.util.ArrayList;
import java.util.HashSet;

public class hw_hashSet_numbers_duplicates {

  public static void main(String[] args) {
    //Создать список из 100 целых случайных чисел
    // в интервале от 1 до 99, с помощью HashSet исключить повторы
    // (дубликаты) и вывести на печать количество
    // уникальных элементов полученного множества.

    ArrayList<Integer> numbers = new ArrayList<>();
    for (int i = 0; i < 100; i++) {
      numbers.add((int) (Math.random() * ((99 - 1 + 1) + 1)));
    }
    System.out.println(numbers);
    System.out.println(numbers.size());

    HashSet<Integer> uniqueNumbers = new HashSet<Integer>();
    for (int i = 0; i < numbers.size(); i++) {
      uniqueNumbers.add(numbers.get(i));
    }
    System.out.println(uniqueNumbers);
    System.out.println(uniqueNumbers.size());


  }
}
