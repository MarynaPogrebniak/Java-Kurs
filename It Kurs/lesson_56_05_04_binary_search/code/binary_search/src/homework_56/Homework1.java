package homework_56;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Homework1 {
    //Задача 1.
    //Напишите метод для поиска числа в заранее отсортированном по убыванию
    // списке различных целых чисел.
    //
    //Метод должен вернуть индекс, если элемент найден, и -1, если элемент не найден.
    //
    //Используйте в качестве образца задачу 2 из классной работы.

    public static int indexOf(ArrayList<Integer> numbers, int target) { // O(1) по памяти

        int left = 0;
        int right = numbers.size();
        while (left < right - 1) {
            int mid = (left + right) / 2;

            if (numbers.get(mid) == target) {
                return mid;
            }
            if (numbers.get(mid) < target) {
                right = mid;
            } else {

                left = mid + 1;
            }
        }
        if (left < numbers.size() && numbers.get(left) == target) {
            return left;
        }
        return -1;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите количество элементов: ");
        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> numbers = new ArrayList<>(n);
        System.out.println("Введите числа: ");
        for (int i = 0; i < n; ++i) { // O(n) - time, O(n) - space
            numbers.add(Integer.parseInt(br.readLine()));
        }

        System.out.print("Введите число для поиска: ");
        int target = Integer.parseInt(br.readLine());

        System.out.println("Результат: " + indexOf(numbers, target));
    }
}
