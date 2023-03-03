import java.util.ArrayList;


public class word_reverse_method {

  public static void main(String[] args) {

    System.out.println(returnWord("автобус"));
  }

  public static ArrayList<Character> returnWord(String word) {

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

    return lettersReverse;


  }
}
