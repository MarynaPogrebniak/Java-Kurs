package l_21_02_HashMap;


import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class HashMap_run_results {

  public static void main(String[] args) {
    HashMap<String, Double> runResults = new HashMap<>();

    runResults.put("Canada", 10.8);
    runResults.put("USA", 10.2);
    runResults.put("Germany", 10.4);
    runResults.put("China", 11.2);
    runResults.put("Italy", 11.0);
    runResults.put("Kenia", 10.6);
    runResults.put("Portugal", 10.3);
    runResults.put("Greece", 11.6);
    runResults.put("Ukraine", 10.7);
    runResults.put("Japan", 11.4);

    System.out.println(runResults.get("Italy")); //значение по ключу

    for (String i : runResults.keySet()) {
      System.out.println("Country " + i + " result " + runResults.get(i));
    }


  /*  var max = runResults.entrySet().stream()
        .max(Map.Entry.comparingByValue())
        .orElseThrow();
    var min = runResults.entrySet().stream()
        .min(Map.Entry.comparingByValue())
        .orElseThrow();

    System.out.println();

    System.out.println("Last place " + max.getKey() + " with a result " + max.getValue());
    System.out.println("First place " + min.getKey() + " with a result " + min.getValue());
*/

  }
}
