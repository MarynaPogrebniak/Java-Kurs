public class Task3Sqrt {

    // Бинарный поиск квадратного корня числа
    public static double sqrt(int x, double accuracy) {
        if (x < 0) {
            throw new IllegalArgumentException(
                    "Квадратный корень не определён для отрицательного числа: " + x);
        }
        if (x < 2) {
            return x; // sqrt(0) = 0, sqrt(1) = 1
        }
        // x = 2 и больше
        double left = 0; // 0 точно меньше нашего ответа
        double right = x; // x точно больше нашего ответа
        while (right - left > accuracy) {
            double mid = (left + right) / 2; // double / 2 = double
            if (mid * mid == x) { // если mid и есть наш квадратный корень - так почти никогда не бывает
                return mid;
            }
            // если mid меньше настоящего квадратного корня
            // если mid * mid меньше исходного числа
            if (mid * mid < x) { // если mid меньше настоящего квадратного корня
                left = mid; // мы не можем ничего добавить - может быть, нам не хватило совсем немного
            } else { // не равно и не меньше, значит, больше
                right = mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int x = 5;
        System.out.printf("sqrt(%d) = %.6f%n", x, sqrt(x, 0.000001));
    }
}

// Ещё одна разновидность Set - TreeSet
// Все элементы в ней отсортированы по возрастанию.
// Положить новый элемент - O(log N) - нужно найти бинарным поиском правильное место.
// Проверить наличие элемента - O(log N) - бинарный поиск - нашли или нет.
// Мы не будем её использовать, но отдельно запишем в табличку сложности операций.