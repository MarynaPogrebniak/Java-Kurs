import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_int_sort {

  public static void main(String[] args) {

    ArrayList<Integer> arrayInt = new ArrayList();
    //заполним лист случайными целыми числами от 1 до 10
    for (int i = 0; i < 10; i++) {
      arrayInt.add((int) (Math.random() * ((10 - 1 + 1) + 1)));
    }
    System.out.println(arrayInt);
    System.out.println(arrayInt.size());

    Collections.sort(arrayInt);
    System.out.println(arrayInt);

    for (int i : arrayInt) { //стандартный цикл for each для печати ArrrayList
      System.out.print(i + " | ");
    }
  }

}
