import java.util.Scanner;

public class h_31_01 {

    public void h_31_01() {

// есть целое число. Нужно вывести на экран количество его цифр если их не
        // больше четырех в следующем виде :
        //   3 ->   "It is a one  digit number
        //   10 -> "It is a two digit number
        //   368 ->  "It is a three digit number
        //  6785 -> "It is a four digit number
        // если же кличество цифр числа больше 4 то вывести надпись "the number is too big for me"

        int a = 100;
        if (a>=0 && a<10){
            System.out.println("It is a one digit number");
        } else if (a>=10 && a<100) {
            System.out.println("It is a two digit number");
                    } else if (a>=100 && a<1000) {
            System.out.println("It is a three digit number");

        } else if (a>=1000 && a<10000) {
            System.out.println("It is a four digit number");
        }
        else {
            System.out.println("the number is too big for me");
        }


        // Найти максимальное из трех целых чисел используя какой либо из вариантов еlse if.

        int q = 40;
        int w = 60;
        int e = 60;

        if (q>w && q>e){
            System.out.println("q is greater then w and e");

        } else if (w>q && w>e) {
            System.out.println("w is greater then q and e");

        }
        else if ( e>q && e>w){
            System.out.println("e is greater then q and w");
        }
        else if (q==w || q == e || w==e) {
            System.out.println("any letter can be greater");

            // else{
        //      nekotorie ravni     }

        }

       /* if(number1>=number2) {

            if (number1 >= number3) {
                System.out.println(number1 + " is the largest");
            } else {
                System.out.println(number3 + " is the largest");
            }
        }
        else {
            if(number2 >= number3){
                System.out.println(number2+" is the largest");
            } else{
                System.out.println(number3+ " is the largest");
            } */

        // Написать программу, проверяющую является ли число четным или нечетным.
        // Решить задачу двумя способами -через оператор if и через тернарный оператор.

       // 1.
        int num = 5;
        if (num%2==0)  {
            System.out.println("Четное число");
        }
        else {
            System.out.println("Нечетное число");
        }

        // 2.
        String result = num%2==0 ? "Четное число" : "Нечетное число";
        System.out.println(result);

        //Написать программу, определяющую является ли целое число положительным,
        // отрицательным или нулем и выводящую соответствующее сообщение на экран.

        int abc =-7;
        if (abc>0){
            System.out.println("positive");
        } else if (abc<0) {
            System.out.println("negative");
                    }
        else {
            System.out.println("0");
        }

        //2.Напишите программу, которая принимает три числа и выводит на экран "All numbers are equal",
        //  "All numbers are different", "Some numbers are equal"  в соответствующих случаях
       /* Scanner sc = new Scanner(System.in);
        System.out.println("Vvedite 1 chislo ");
        int a1 = sc.nextInt();
        System.out.println("Vvedite 2 chislo ");
        int b1 = sc.nextInt();
        System.out.println("Vvedite 3 chislo ");
        int c1 = sc.nextInt();

        if (a1 == b1 && b1==c1 && a1==c1){
            System.out.println("All numbers are equal");
        } else if (a1!=b1 && b1!=c1 && a1!=c1) {
            System.out.println("All numbers are different");
                    }
        else {
            System.out.println("Some numbers are equal");
        }*/
        //3. Напишите программу, которая определяет в каком порядке введены  числа . Выодит на экран increasing если
        // числа возрастают (1,2,3) ,  decreasing если убывают (3,2,1)   и "neither decreasing no increasing"
        // в остальных случаях

        int a2 = 3;
        int b2 = 2;
        int c2 = 1;

        if (a2<b2 && b2<c2){
            System.out.println("increasing");
        } else if (a2>b2 && b2>c2) {
            System.out.println("decreasing");
                    }
        else {
            System.out.println("neither decreasing no increasing");
        }
        char c1 = 300;
        char c3 = 'a';
        System.out.println(c1);
        System.out.println(c3);
    }
}
