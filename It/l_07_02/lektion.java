package l_07_02;

import java.util.Scanner;

public class lektion {
    public static void main(String[] args) {
        /* ЗАДАЧА
        пользователь вводит 10 раз целое число с клавиатуры.
        при вводе отрицательного ввод симла неоюходимо прекратить.


       - пользоывтель вводит целые числа с клавиатуры
       - на входе int num
       -прекратить ввод, если пользователь ввел отриц число
       - либо 10 попыток закончиоись либо сообщить, что было
       - введено отрицат число, программа остановлена
       - прервать цикл, если было введено отрицат число
       - запросить пользователя ввести число, в конце программы
        обьяснить, что произошло


         */

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {

            System.out.println("Enter a number:");
            int num = scanner.nextInt();
            System.out.println("You entered " + num);

            if (num < 0) {
                System.out.println("minus number");

                break;
            }

        }
        System.out.println("game is over");


    }
}
