package l_15_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class hw_3_sort_arrayList {

  public static void main(String[] args) {
    // Задача 3 (*)
    //Отсортировать и распечатать список из задачи 1 в обратном порядке.
    // Способ обратной сортировки ArrayList найти в Интернете.

    ArrayList<String> advertisingList = new ArrayList<String>();
    advertisingList.addAll(Arrays.asList("Print", "TV", "Internet", "Radio", "Native", "Mobile"));
    System.out.println("Original List " + advertisingList);

    Collections.sort(advertisingList);
    System.out.println("Sorted List " + advertisingList);

    Collections.reverse(advertisingList);
    System.out.println("Reverse List " + advertisingList);
  }

}
