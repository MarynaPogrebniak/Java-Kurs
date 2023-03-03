package l_01_02;

import java.util.Scanner;

public class home {
    public static void main(String[] args) {
        //1.написать программу, которая принимает номер дня недели и выводит на экран название
        // этого дня.
        // через switch и через if-else-if

        // 1. switch
        Scanner sc = new Scanner(System.in);
        System.out.println("Vvedite nomer");
        int number = sc.nextInt();

        switch (number) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("wrong number");
        }

        //2. if else
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Vvedite nomer");
        int number1 = sc.nextInt();

        if (number1 == 1) {
            System.out.println("Monday");
        } else if (number1 == 2) {
            System.out.println("Tuesday");
        } else if (number1 == 3) {
            System.out.println("Wednesday");
        } else if (number1 == 4) {
            System.out.println("Thursday");
        } else if (number1 == 5) {
            System.out.println("Friday");
        } else if (number1 == 6) {
            System.out.println("Saturday");
        } else if (number1 == 7) {
            System.out.println("Sunday");
        } else System.out.println("wrong number");

        /*Написать программу, которая определяет оценку за тест студента
                если по результатам теста решено >= 90% вопросов то тогда оценка 5
        если по результатам теста решено >=70% вопросов но < 90% вопросов то тогда оценка 4
        если по результатам теста решено >=50% вопросов но < 70% вопросов то тогда оценка 3
        если по результатам теста решено <50% вопросов  то тогда оценка 2
         */
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Vvedite % reshennih voprosov");
        int vopros = sc2.nextInt();

        if (vopros >= 90 && vopros <= 100) {
            System.out.println("5");
        } else if (vopros >= 70 && vopros < 90) {
            System.out.println("4");
        } else if (vopros >= 50 && vopros < 70) {
            System.out.println("3");

        } else if (vopros < 50 && vopros >= 0) {
            System.out.println("2");
        } else System.out.println("wrong number");


        //2. switch
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Vvedite % reshennih voprosov");
        int vopros1 = sc2.nextInt();

        switch (vopros1) {
            case 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100:
                System.out.println("5");
                break;
            case 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89:
                System.out.println("4");
                break;
            default:
                System.out.println("wrong number");
        }

        
    }
}
