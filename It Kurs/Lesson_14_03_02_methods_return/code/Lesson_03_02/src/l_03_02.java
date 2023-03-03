import java.util.Scanner;

public class l_03_02 {
    public static void main(String[] args) {

   /*     // Guess number game with do while loop
        Scanner sc = new Scanner(System.in);
        int secretNumber = 5;
        int answer;
        int numberOfAttempts = 3;

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
                numberOfAttempts--;
                System.out.println("you have " + numberOfAttempts + " attempts left");
            }

        } while (answer != secretNumber && numberOfAttempts > 0);
        System.out.println("Game is over");

        */

        // Методы

        // ret-type name (parameter list) {
        //
        // }


        // printSmth(); //вызов метода
        // printSmth(); // 2й раз вызвали
        //  sum(); //метод новый вызвали
        int receiveReturn = sumReturn();
        System.out.println(receiveReturn);

        int rec = sumReturnWithParameters(2, 3);
        System.out.println("result 2 + 3 is " + rec);
        System.out.println("result 7 + 7 is " + sumReturnWithParameters(7, 7));


        String wordForMethod = "Hello";
        int numberForMethod = 55;
        System.out.println(returnSmth(wordForMethod, numberForMethod));
    }

    // новый метод. не метод в методе пишется. отдельно

    public static void printSmth() {
        System.out.println("I am printing");

    }

    public static void sum() {
        // printSmth(); // можно из 2го вызвать. 1 в мейне
        int a = 1;
        int b = 2;
        int aPlusB = a + b;
        if (aPlusB == 3) {
            return;
        }
        System.out.println("a + b = " + aPlusB);
        return;
    }

    //точка выхода из метода и возврат результатов работы методв в основную
    // программу с помощбю return
    public static int sumReturn() {
        int a = 1;
        int b = 2;
        int aPlusB = a + b;
        return aPlusB;

    }
    // передача в метод параметров

    public static int sumReturnWithParameters(int a, int b) {
        int aPlusB = a + b;

        // return aPlusB;
        return a + b;

    }

    public static String returnSmth(String word, int num) {

        String result = word + num;
        return result;
    }

    // ---------------Game Guess Number Methods------------------------


}
