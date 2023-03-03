package l_17_02;

import java.util.ArrayList;

public class delit_predlozenie_po_slovam_with_method {

  public static void main(String[] args) {
    //Разделить предложение по словам и записать их в ArrayList
    //Предложение: Все счастливые семьи похожи друг на друга,
    // каждая несчастливая семья несчастлива по-своему.
    // Ключевой алгоритм - ищем пробелы и подсчитываем их количество.
    System.out.println(returnWords(
        "Все счастливые семьи похожи друг на друга, каждая несчастливая семья несчастлива по-своему."));

  }

  public static ArrayList<String> returnWords(String sentence) {
    String[] s = sentence.split(" ");

    for (int i = 0; i < s.length; i++) {
      System.out.print(s[i] + " | ");
    }
    System.out.println();
    ArrayList<String> sentenceWords = new ArrayList<>();
    for (int i = 0; i < s.length; i++) {
      sentenceWords.add(i, s[i]);
    }
    return sentenceWords;
  }
}
