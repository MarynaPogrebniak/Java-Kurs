import java.util.Scanner;

public class home_03_02 {

    public static void main(String[] args) {
        multiply(5);
        System.out.println(sumN(3));

        power();

        System.out.println("n power is " + powerreturn(3));

    }


    public static void multiply(int n) {
        // написать метод multiply, выводяший на экран таблицу умножения для числа n.
        // Example
        // при n = 5
        // 5*1 = 5
        // 5 * 2 = 10...
        int i = 1;

        while (i <= 10) {

            System.out.println(n + "*" + i + "=" + (n * i));
            i++;
        }


    }

    public static int sumN(int n) {
        int i = 1;
        int sum = 0;

        while (i <= n) {
            sum = sum + i;
            i++;

        }
        return sum;
    }


    //2. Переписать первую задачу из домашнего задания предыдущего занятия в виде метода:
    // Написать метод, выводящий на экран куб числа от 1 до заданного числа n
    //  С помощью цикла while написать программу, выводящую на экран куб числа от 1 до заданного числа n
    //        Пример:для числа n=3
    //        1 в кубе 1
    //        2 в кубе 8
    //        3 в кубе 27

    // 2
    public static void power() {
        int i = 1;
        int n = 3;
        int y;
        while (i <= n) {
            y = i * i * i;
            i++;
            System.out.println("n v kube " + y);
        }

    }

    // 3
    public static int powerreturn(int n) {


        int pow = n * n * n;
        return pow;
    }
}




