import java.util.Scanner;

public class l_02_02 {
    public static void main(String[] args) {
        // Циклы
        // While

        //Syntax of While loop

        /*
        while (condition)
        {
        statement (s)
        }

         */

        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            // i = i +1;
            i++;
        }
        System.out.println("end of while loop");

        i = 10;
        //  while (i > 1) {
        //      System.out.println(i);
        i++;  //бесконеченый цикл

        //  while (true) {
        //    System.out.println("hello"); //бесконечный цикл
        // }

        int q = 10;
        while (q > 1) {
            System.out.println(q + " ");
            q--;
        }

        // вывести в консоль буквы строки с помощью цикла while
        // Hello
        // H - index 0
        // e - 1
        // l - 2
        // l - 3
        // o - 4
        String hello = "Hello";
        System.out.println(hello.charAt(0));
        System.out.println(hello.charAt(1));
        System.out.println(hello.charAt(2));
        System.out.println(hello.charAt(3));
        System.out.println(hello.charAt(4));

        System.out.println("");

        int index = 0;
        int length = hello.length();
        while (index < length) {
            System.out.println(hello.charAt(index));
            index++;
        }

        // Do-While

        /*
        do
        {
            statements
            }
            while (condition)

         */

        i = 1;
        do {
            System.out.println(i);
            i--;
        } while (i > 1);

        // Guess number game with do while loop
        Scanner sc = new Scanner(System.in);
        int secretNumber = 5;
        int answer;

        do {
            System.out.println("Guess a number between 1 and 10");
            answer = sc.nextInt();

            if (secretNumber == answer) {
                System.out.println("Great! You win");
            } else {
                System.out.print("Sorry, the number is ");

                if (answer < secretNumber) {
                    System.out.println("too small");
                } else {
                    System.out.println("too big");
                }
                System.out.println("Try again");
            }

        } while (answer != secretNumber);
        System.out.println("Game is over");

        // написать программу. используя цикл while, выводящую на экран
        // сумму цифр от 1 до 5. 1+2+3+4+5=15
        // sum of digits from 1 to 5 is "+ sum
        // sum = 15


        int f = 1;
        int n = 10;
        int sum1 = 0;

        while (f <= n) {
            sum1 = sum1 + f;
            System.out.println("f= " + f);
            System.out.println("Sum= " + sum1);
            f++;
        }
        System.out.println("Sum of digits is " + sum1);

        //написать программу, принимающую с клавиатуры целые число и
        //выводящую на экран сумму четных и сумму нечетных чисел отдельно
        // используя while loop

        Scanner scanner1 = new Scanner(System.in);
        int number;
        int evenSum = 0;
        int oddSum = 0;
        char choice;

        do {
            System.out.println("Enter any number");
            number = scanner1.nextInt();

            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
            System.out.println("do you want to continue? Enter y or enter any other letter if not");
            choice = scanner1.next().toLowerCase().charAt(0);

        } while (choice == 'y');
        System.out.println("Sum of even numbers is " + evenSum);
        System.out.println("Sum of odd is " + oddSum);

    }
}