import java.util.Scanner;

public class homework {

        public static void main(String[] args) {
        /*
        Написать программу, которая принимает с клавиатуры имя , фамилию и возраст (Ваши или воображаемого персонажа) и выводит в консоль эту информацию в следующем виде:
        First name: John
        Last name: Smith
        Age: 25
 */
            /*Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your first name: ");
            String FirstName = scanner.nextLine();
            System.out.println(FirstName);
            System.out.println("Enter your last name: ");
            String SecondName = scanner.nextLine();
            System.out.println(SecondName);
            System.out.println("Enter your age: ");
            int age = scanner.nextInt();
            System.out.println(age); */
/*
1. // 1.Найти и вывести на экран сумму двух целых чисел, значения
        // которых вводятся с клавиатуры
 */
         /*   Scanner scanner = new Scanner(System.in);
            System.out.println("vvesti 1 chiclo: ");
            int num1 = scanner.nextInt();
            System.out.println(num1);
            System.out.println("vvesti 2 chiclo: ");
            int num2 = scanner.nextInt();
            System.out.println(num2);
            System.out.println("summa: " + (num1+num2)); */

 /*
 2.        // 2. написать программу, которая находит площадь и периметр круга,
        // радиус вводится с клавиатуры
        // perimetr = 2*PI*radius
        // area = pi radius^2
  */ Scanner scanner = new Scanner(System.in);
            System.out.println("enter radius ");
            int radius = scanner.nextInt();
            double perimetr = 2*Math.PI*radius;
            double area = Math.PI * Math.pow(radius, 2);
            System.out.println("Perimetr "+perimetr +"Area " + area);

            // 3.найти минимальное из двух чисел, введенных с клавиатуры  без учета знака
            // (использовать методы  класса Math)
            int q = -5;
            int w = 3;
            q = Math.abs(q);
            w = Math.abs(w);
            int min = Math.min(q, w);
            System.out.println(min);

        }
    }

