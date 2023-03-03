import java.util.HashMap;

public class HashMap_kolichestvo_bukv_povtor {

  public static void main(String[] args) {
    //Задача 3
    //Посчитайте количество повторяющихся букв в предложении.
    String sentence = "Guten Morgen und einen schönen Tag";
    String[] cut = sentence.toLowerCase().split("");

    int length = cut.length;
    System.out.println(length);

    int[] frequency = new int[length];
    for (int i = 0; i < length; i++) {
      for (int j = 0; j < length; j++) {
        if ((cut[i]).equals(cut[j])) {
          frequency[i]++;

        }
      }
    }
    HashMap<String, Integer> lettersFrequency = new HashMap();

    for (int i = 0; i < length; i++) {
      lettersFrequency.put(cut[i], frequency[i]);
    }
    for (String i : lettersFrequency.keySet()) {
      System.out.println("Letter " + i + " repeated " + lettersFrequency.get(i) + " times");
    }


  }

}
