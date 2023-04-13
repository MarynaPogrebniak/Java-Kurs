import java.util.ArrayList;
import java.util.List;

public class Homework1 {
//    Задача 1* (не обязательно)
//    Взяв за основу материал классной работы, написать алгоритм
//    сортировки слиянием для строк (используйте метод compareTo()).

    public static List<String> sort(List<String> words) {
        if (words.size() < 2) { // пустой список или список из одного элемента уже отсортирован
            return words; // возвращаем его, как есть
        }

        // разбить на две половинки
        int mid = words.size() / 2;
        List<String> left = words.subList(0, mid);
        List<String> right = words.subList(mid, words.size());

        System.out.println("=== sort(" + words + ") ===");
        System.out.println("left = " + left);
        System.out.println("right = " + right);

        // отсортировать каждую
        left = sort(left);
        right = sort(right);

        // слить две половинки
        return merge(left, right);
    }
    private static List<String> merge(List<String> list1, List<String> list2) {
        System.out.println("=== merge(" + list1 + ", " + list2 + ") ===");
        List<String> result = new ArrayList<>();
        int i1 = 0;
        int i2 = 0;

        while (i1 < list1.size() && i2 < list2.size()) {
            String first = list1.get(i1);
            String second = list2.get(i2);
            if (first.compareTo(second) < 0){
                result.add(first);
                ++i1;
            } else {
                result.add(second);
                ++i2;
            }
        }

        while (i1 < list1.size()) {
            result.add(list1.get(i1));
            ++i1;
        }

        while (i2 < list2.size()) {
            result.add(list2.get(i2));
            ++i2;
        }

        System.out.println("result = " + result);
        return result;
    }

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("Italy");
        words.add("Germany");
        words.add("Portugal");
        words.add("Greece");
        words.add("France");

        System.out.println(words);
        words = sort(words);
        System.out.println(words);
    }
}

