package l_06_02;

import java.util.Scanner;

public class lektion {
    public static void main(String[] args) {


       /* for (initialization; termination;
             increment) {
             statement(s)
           }
         */

        /*Алгоритм запуска цикла FOR

        1. Задаем переменную (счетчик, параметр) цикла
        2. Определить условие повторения цикла
        3. Заполнить тело цикла необходимыми операторами
        4. Изменить переменную (счетчик, параметр) цикла
        5. Запустить цикл и проверить его работу на крайних значениях
            и в целом.

            Полезно при отладке цикла

            - включить промежуточные печати параметра цикла и полученного
                результата
            - проверить при начальном и последнем значении, а потом на одной
                2 итерации самостоятельно


        */

        // Определить является ли число простым. 2, 3, 5, 7, 11,
        // 13, 17, 19, 23, 29
        // шаг 1 ввести натуральное число (целое, положительное)
        // шаг 2 проверка простое или нет
        // щаг 3 вывод результата
        // prime number простое число

        // Главный алгоритм
        // введено с клавиатуры (натур число)
        // пробежать все числа от 2 до от 1 до  N-1с проверкой
        // если N разделилось нацело на параметр цикла то число
        // НЕ простое
        // если N не разделилось, то число ПРОСТОЕ.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number");
        int num = scanner.nextInt();
        System.out.println("input number is " + num);

        boolean isPrime = true;

        for (int i = 2; i < num; i++) {
            double div = num % i;

            if (div == 0) {
                isPrime = false;
            }

        }
        if (isPrime) {
            System.out.println(num + " is prime");
        } else System.out.println(num + " is not prime");
        // System.out.println("try again");


        // faktorial
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Vvedite chislo");
        int number = scanner1.nextInt();
        int factorial = 1;

        for (int i = 1; i <= number; i++) {

            factorial = factorial * i;
        }
        System.out.println("Factorial number of " + number + " is " + factorial);
    }
}
