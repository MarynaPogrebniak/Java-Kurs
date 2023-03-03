import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
        /*
        Задача1
        С помощью цикла while написать программу, выводящую на экран куб числа от 1 до заданного числа n
        Пример:для числа n=3
        1 в кубе 1
        2 в кубе 8
        3 в кубе 27
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("vvedite chislo");
        int n = sc.nextInt();

        int x = 1;

        while (x >= 1 && x <= n) {
            double pow = Math.pow(x, 3);
            System.out.println(pow);
            x++;
        }

        /*
        Задача2
        С помощью цикла while написать программу, выводящую на экран результат умножения данного цисла n на все целые числа от 0 до n
        Пример: для числа 3 результат будет 0, 3, 6, 9
         */

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Vvedite chislo");
        int n1 = sc.nextInt();
        int x1 = 0;
        int y;

        while (x1 >= 0 && x1 <= n1) {
            y = x1 * n1;
            System.out.println(y);
            x1++;

        }

        // 0 1 1 2 3 5 8 13 21...
        int count = 7;
        int number1 = 0;
        int number2 = 1;

        int i = 1;

        while (i <= count) {
            System.out.println(number1 + " ");
            int sum = number1 + number2;
            number1 = number2;
            number2 = sum;
            i++;

        }

        // n!  = 1*2*3*4*...(n-1)*n   Факториал
        // 3! = 1*2*3

        // Задача. Найти факториал числа n, используя цикл while

        int number = 5;
        long factorial = 1;

        int j = 1;

        while (j <= number) {
            factorial = factorial * j;
            j++;
            System.out.println(factorial);
        }
        System.out.println("Factorial of " + number + " is " + factorial);



        /*
        Есть целое число. Используя цикл while написать программу, проверяющую равна ли в этом числе сумма
        его цифр их произведению
        123
        1+2+3=1*2*3

        1124
        1+1+2+4=1*1*2*4
         */

        int temp, productDigit = 1, sumDigit = 0;
        int num = 123;

        int myNum = num;

        while (myNum > 0) {

            temp = myNum % 10; //3   2
            sumDigit = sumDigit + temp; // 1+3 = 4   6
            productDigit = productDigit * temp; // 1*3 =3     6
            myNum = myNum / 10; // 123/10 = 12    1
        }
        if (sumDigit == productDigit) {
            System.out.println(num + " is the number");
        } else
            System.out.println(num + "is not the number");

    }
}
