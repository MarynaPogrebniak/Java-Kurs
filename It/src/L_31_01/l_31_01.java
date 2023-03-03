package L_31_01;

public class l_31_01 {
    public void l_31_01() {

//nested if
        int num = 50;
        if (num < 50) {
            System.out.println("number is less then 50");

            if (num > 10) {
                System.out.println("number is greater then 10");
            } else {
                System.out.println("number is smaller then 10");
            }

        } else {
            System.out.println("num is greater then 50");
        }

        /*if - else - if ladder

        if (condition)
            statement;
        else if (condition)
            statement
        else if (condition)
            statement
            ,
            .
            .
        else
            statemnet
         */

        int x = 2;

        if (x == 1) {
            System.out.println("x is one");
        } else if (x == 2) {
            System.out.println("x is two");
        } else if (x == 3) {
            System.out.println("x is three");
        } else if (x == 4) {
            System.out.println("x is four");
        } else {
            System.out.println("x is not between 1 and 4");
        }
        System.out.println("finish");

        /*Тернарный оператор

        variable = Condition? Expression1 : Expression2

         */
        int age = 10;
        boolean isAdult = age >= 18 ? true : false;
        System.out.println(isAdult);

        String isAdults;
        if (age >= 18) {
            isAdults = "can vote";
        } else {
            isAdults = "too young";
        }

        System.out.println(isAdults);

        String caseWord = "uppercase";
        String name = caseWord.equals("uppercase") ? "EVGENY" : "evgeny";
        System.out.println(name);

        // Даны два целых числа.
// Написать программу, выводящую на экран или их сумму
// или если эти числа равны, то двойную сумму.

        int a = 5;
        int b = 5;
        int result = (a != b) ? a + b : (a + b) * 2;
        System.out.println(result);

        String str = null;
        String value = str != null ? str.toLowerCase() : null;
        System.out.println(value);

        int value1 = 5;
        int value2 = 8;
        int max = value1 >= value2 ? value1 : value2;
        System.out.println(max);

        int value3 = -10;
        int abs = value3 >= 0 ? value3 : -value3;
        System.out.println("abs value of " + value3 + " is " + abs);


    }
}




