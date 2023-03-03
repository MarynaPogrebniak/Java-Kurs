package l_07_02;

import java.util.Scanner;

public class homework_07_02 {
    public static void main(String[] args) {

        //Задача 1. пользователь 10 раз вводит целые числа с клавиатуры,
        // при вводе нечетного числа ввод чисел необходимо прекратить.
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {

            System.out.println("Enter a number:");
            int num = scanner.nextInt();
            System.out.println("You entered " + num);

            if (num % 2 != 0) {
                System.out.println("not even number");

                break;
            }

        }
        System.out.println("Game is over");


        //Задача 2. Дано натуральное число n. Написать программу, которая вычисляет сумму S = 2 + 4 + … + 2*n.

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num1 = scanner1.nextInt();
        System.out.println("You entered " + num1);

        int sum = 0;

        for (int i1 = 2; i1 < num1; i1++) {

            if (i1 % 2 == 1) {
                continue;  //нечетное число
            }
            sum = sum + i1;

        }
        System.out.println("Sum all numbers " + (sum + num1 * 2));
    }
}
