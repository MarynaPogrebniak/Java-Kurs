import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        //Replace method.
        //replace (old char, new char)

        String string = new String("hekko");
        System.out.println(string.replace('k', 'l')); //hello

        System.out.println("original " + string); //hekko

        //replace first
        System.out.println(string.replaceFirst("k", "l")); //helko

        /* if Оператор ветвления

        1. if statement

        if (uslovie) {
        команда
        }


        2. nested if
        3. if else
        4. if else if



         */

        // 1. If
        int num = 65;
        if (num < 100) {
            System.out.println("number is less then 100");
        }
        int num1 = 165;
        if (num < 100) {
            // nichego ne budet
        }

         /*  char ch;
            char answer = 'A';

        System.out.println("Guess a letter between A and Z ");
        ch=(char)System.in.read();

        if (ch == answer) {
            System.out.println("You are right!");
        }
        */

// if - else */

        num = 90;
        if (num < 100) {
            System.out.println("num is less then 100");
        } else {
            System.out.println("num is greater than or equal 100");
        }

        char ch1;
        char answer1 = 'B';

        System.out.println("Guess a letter between A and Z ");
        ch1 = (char) System.in.read();

        if (ch1 == answer1) {
            System.out.println("You are right!");
        } else {
            System.out.println("You are wrong");
        }

// nested if . if внутри if

        num = 30;
        if (num < 100) {
            System.out.println("num is less then 100");
            if (num > 50) {
                System.out.println("num is greater than 50");
            }
        }

        // nested if else statement
        int i = 10;
        int a =0;
        int b = 9;
        int c =3;
        int d = 900;
        int j = 19;
        int k = 80;

        if (i == 9) {
        if (j<20) a=b; // a= 9
        if (k>99) c=d; // c!==d
        else a=c; // a=3
                    // etot else otnositsya k blizhaishemu if (k>99)

        }
        else a=d; //etot else k if ( i==10)

        System.out.println("if i ==10 a must be 3 . The answer is "+a);
    }
}