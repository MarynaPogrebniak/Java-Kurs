import java.util.Scanner;

public class _continue {
     /*
        Дано натуральное число n. наптсать программу , которая вычисояет
        сумму S = 2 +4 + ... + n

        - ввводим число n с клавиатуры
        - посчитать сумму всех четных чисел, которые меньше или равны n
        - выведем значение суммы
        - Ключевой алгоритм:
            - запустить цикл, в котором:
                проверять каждое число на то, четное оно или нет.
                суммировать будем только четные
        -     но пропускать НЕчетные (continue)


         */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        System.out.println("You entered " + num);

        int sum = 0;

        for (int i = 2; i <= num; i++) {

            if (i % 2 == 1) {
                continue;  //нечетное число
            }
            sum = sum + i;

        }
        System.out.println("Sum all even numbers " + sum);
    }
}
