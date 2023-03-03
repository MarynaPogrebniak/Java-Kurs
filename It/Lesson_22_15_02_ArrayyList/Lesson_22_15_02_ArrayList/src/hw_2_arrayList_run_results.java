import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class hw_2_arrayList_run_results {

  public static void main(String[] args) {
    //Задача 2
    //Имеются результаты забега на 100 метров группы бегунов из 10 участников.
    // Внести эти результаты в компьютер согласно протоколу.
    // Отсортировать результаты, напечатать кто занял 1-е и кто занял последнее место.

    ArrayList<Double> result = new ArrayList<Double>(
        Arrays.asList(10.2, 10.8, 10.1, 11.2, 11.0, 10.6, 10.3, 11.6, 10.7, 11.4));
    System.out.println(result);

    ArrayList<String> runner = new ArrayList<>
        (Arrays.asList("Canada", "USA", "Germany", "China", "Italy", "Kenia", "Portugal",
            "Greece", "Ukraine", "Japan"));

    int minIndex = result.indexOf(Collections.min(result));
    int maxIndex = result.indexOf(Collections.max(result));

    System.out.println("1 place is " + result.get(minIndex) + " from " + runner.get(minIndex));
    System.out.println("Last place is " + result.get(maxIndex) + " from " + runner.get(maxIndex));

    Collections.sort(result);
    System.out.println(result);
  }

}



