package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class homework2 {
    //Задача 2* (не обязательно).
    //Дана последовательность слов (количество, а затем и сами слова,
    // каждое слово с новой строки).
    //
    //Вывести все самые короткие слова через пробел.
    //
    //Оценить временную и пространственную сложность алгоритма.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите количество слов: ");
        int n = Integer.parseInt(br.readLine());

        String [] words = new String[n];

        System.out.println("Введите " + n + " слов, каждое с новой строки:");
        for (int i = 0; i < n; ++i) {
            words[i] = br.readLine();
        }

        int wordsShortLength = words[0].length();
        for (int i = 1; i < n; ++i){
            if (words[i].length() < wordsShortLength) {
                wordsShortLength = words[i].length();
            }
        }

        StringBuilder result = new StringBuilder();

        for (String w : words) {
            if (w.length() == wordsShortLength) {
                result.append(w).append(" ");
            }
        }
        System.out.println(result);
    }
}
