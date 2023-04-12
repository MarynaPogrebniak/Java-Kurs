import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Homework1 {

    public static void main(String[] args) throws IOException {
        //Перепишите алгоритм бинарного поиска элемента в отсортированном по возрастанию
        // списке целых чисел (см. урок 56, задача 2) с использованием рекурсии.
        //
        //Задача 2* (не обязательно)
        //Оптимизируйте алгоритм для вычисления чисел Фибоначчи (см. этот урок, задача 2),
        // оцените временну́ю и пространственную эффективность.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите количество элементов: ");
        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> numbers = new ArrayList<>(n);
        for (int i = 0; i < n; ++i) {
            numbers.add(Integer.parseInt(br.readLine()));
        }

        System.out.print("Введите число для поиска: ");
        int target = Integer.parseInt(br.readLine());

        System.out.println("Результат: " + indexOf(numbers, target, 0, numbers.size()));
    }

    public static int indexOf(ArrayList<Integer> numbers, int target, int left, int right) {

        while (left < right - 1) {
            int mid = (left + right) / 2;
            if (numbers.get(mid) == target) {
                return mid;
            }
            if (numbers.get(mid) < target) {
                return indexOf(numbers, target, mid + 1, numbers.size());
            } else {
                return indexOf(numbers, target, left, mid);
            }
        }
        if (left < numbers.size() && numbers.get(left) == target) {
            return left;
        }
        return -1;
    }

}

