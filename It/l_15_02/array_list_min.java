package l_15_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class array_list_min {

  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>(Arrays.asList(7, 2, 5, 9, 1, 5, 8, 23));
    //List<String> strings = Arrays.asList("ars", "dhdh", "bqwwea");
    findSecondNumber(numbers);
  }

  public static void findSecondNumber(List<Integer> ints) {
    Collections.sort(ints);
    int min = ints.get(0);

    for (int index = 1; index < ints.size(); index++) {
      if (ints.get(index) != min) {
        System.out.println("Second min is " + ints.get(index));
        return;
      }
    }
    System.out.println("There is no second min element");

  }

}
