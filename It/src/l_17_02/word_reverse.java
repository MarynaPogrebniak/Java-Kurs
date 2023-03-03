package l_17_02;

import java.util.ArrayList;

public class word_reverse {

  public static void main(String[] args) {
    //Вывести слово задом наперед.
    // Пример: Дано слово "троллейбус"
    // Результат работы программы "cубйеллорт"
    // Ключевой алгоритм разобрать слово по буквам
    //   Развернуть массив задом наперед
    // берем последнюю букву и записываем ее в начало массива,
    // в нулевой индекс в новом массиве
    // предпоследнюю букву записываем на индекс 1
    // используем для этого цикл for

    String word = "троллейбус";
    int length = word.length();

    ArrayList<Character> letters = new ArrayList<>();

    for (int i = 0; i < word.length(); i++) {
      letters.add(i, Character.valueOf(word.charAt(i)));// отрываем от word по одной букве

    }
    System.out.println(letters);

    ArrayList<Character> lettersReverse = new ArrayList<>();
    for (int i = 0; i < word.length(); i++) {
      lettersReverse.add(i, letters.get(word.length() - 1 - i));
    }
    System.out.println(lettersReverse);

    for (char ch : lettersReverse) {
      System.out.print(ch);
    }

  }
}
