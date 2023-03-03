import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class hw_1_arrayList {

  public static void main(String[] args) {
    ArrayList<String> advertisingList = new ArrayList<String>();
    advertisingList.addAll(Arrays.asList("Print", "TV", "Internet", "Radio", "Native", "Mobile"));
    System.out.println(advertisingList);

    int size = advertisingList.size();
    System.out.println("Size is " + size);

    int number = advertisingList.indexOf("Internet");
    System.out.println("IndexOf " + number);

    System.out.println("Ouptput number 5 is " + advertisingList.get(5));

    advertisingList.remove(3);
    System.out.println("Removed number 3 " + advertisingList);

    System.out.println();

    if (advertisingList.contains("Outdoor") == false) {
      advertisingList.add("Outdoor");
    }
    System.out.println(advertisingList);

    System.out.println();

    //print with indexes
    for (int i = 0; i < advertisingList.size(); i++) {
      System.out.println("Index " + i + " " + advertisingList.get(i));
    }
    System.out.println();
    Collections.sort(advertisingList);
    System.out.println(advertisingList);
    System.out.println();

    System.out.println(advertisingList.isEmpty());
    // возвращает true, если список пустой, false в обратном случае.

    advertisingList.remove(2);
    System.out.println(advertisingList);

    advertisingList.clear(); //Удаление всех элементов из списка.
    System.out.println(advertisingList);
  }

}
