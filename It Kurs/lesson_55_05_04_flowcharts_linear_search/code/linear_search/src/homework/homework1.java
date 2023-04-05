package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class homework1 {
    public static void main(String[] args) throws IOException { // O(n) - time, O(1) - space
        //Задача 1.
        //Найти минимальное чётное число в последовательности положительных чисел
        // или вывести -1, если такого числа не существует.
        //
        //Оценить временную и пространственную сложность алгоритма.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите количество чисел: ");
        int n = Integer.parseInt(br.readLine());
        int result = -1;

        System.out.println("Введите " + n + " чисел, каждое с новой строки:");

        for (int i = 0; i < n; ++i) { // O(n) - time, O(1) - space
            int x = Integer.parseInt(br.readLine()); // O(1) - time, O(1) - space
            if (x % 2 == 0 && (result == -1 || x < result)) {
                result = x;
            }
        } System.out.println(result);
    }
}
