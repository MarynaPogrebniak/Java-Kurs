package l_17_02;

import java.util.ArrayList;

public class delit_predlozenie_po_slovam {

  public static void main(String[] args) {

    String sentence = "Все счастливые семьи похожи друг на друга, каждая несчастливая семья несчастлива по-своему.";
    String[] s = sentence.split(" ");

    for (int i = 0; i < s.length; i++) {
      System.out.print(s[i] + " | ");
    }
    System.out.println();
    ArrayList<String> sentenceWords = new ArrayList<>();
    for (int i = 0; i < s.length; i++) {
      sentenceWords.add(i, s[i]);
    }
    System.out.println(sentenceWords);
  }
}
