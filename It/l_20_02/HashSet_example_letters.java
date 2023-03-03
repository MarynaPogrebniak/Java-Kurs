
package l_20_02;

import java.util.HashSet;

public class HashSet_example_letters {

  public static void main(String[] args) {
    //Задача 1: Сформировать HashSet из букв латинского алфавита,
    // попытаться добавить в это множество уже существующую букву,
    // проверить, что будет происходить...
    // [Полезная ссылка на таблицу кодов]
    // https://xn----7sbbaqhlkm9ah9aiq.net/news-new/kodi-ascii-simvolov.html)
    // Синтаксис для инициализации HashSet:
    // HashSet myHashSet = new HashSet();

    HashSet<String> latAlphabet = new HashSet();
    for (int i = 0; i < 26; i++) {
      latAlphabet.add(String.valueOf((char) (i + 65)));
    }
    System.out.println(latAlphabet);
    //add letter k
    latAlphabet.add("K");
    System.out.println();
    System.out.println(latAlphabet); //k не добавилось.

  }

}
