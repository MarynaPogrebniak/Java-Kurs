import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        char ch;
        ch = 'X';
        System.out.println("This is ch " +ch);

        ch='A';
        System.out.println("ch now contains "+ch);
        ch++;
        System.out.println("ch is now "+ch);

        ch = 90;
        System.out.println("90 in Unicode is "+ch);

        int letter = 'Z';
        System.out.println("letter is now "+letter);

        String z = "this word is in quoetes \"word\"";
        System.out.println(z);
        System.out.print("this is \\a line \n");
        System.out.println("this is \tanother \tline");
        /*
        Vyvod sper simvolov

        \' odinochnaya kavychka
        \" dvoynaya kavychka
        \\ obratnyi slash
        \n novaya stroka
        \t tabuljaciya
        \u1234 4 cyfry - simvol Unicode

         */

        System.out.println('\u5555');

        int b = 0;
        String space = " ";
        space=null; // pustaya stroka

        /*
        Написать программу, выводящую на экран ASCII значение символа
        (например если символ Z то должно быть напечатано 90)
         */

        int A = 'A';
        int S = 'S';
        int C = 'C';
        int I = 'I';

        System.out.println("ASCII is " +A+" "+S+" "+C+" "+I+" "+I);

        int defis = '-';
        System.out.println(defis);

        /*
        написать программу, принимающую с клавиатуры 2 числа и выводящую их на экран
 // c переставленными местами значениями
        //int  num1 = 10
        // int num2 = 5
        //.........
        //  на выходе должно быть : num1=5  num2 = 10
         */

        int num1 = 20;
        int num2 = 7;

        Scanner scanner = new Scanner(System.in);
        System.out.println("VVedite num1 ");
        num1 = scanner.nextInt();
        System.out.println("VVedite num2 ");
        num2 = scanner.nextInt();

       // int num3 = num1; // num 3 10
       // num1 = num2; // num1 5
        //num2 = num3; // num 2 10

       // num1 = num2+num1;
        //num2 = num1-num2;
       // num1 = num1 - num2;
        num1= num1+num2-(num2=num1);
        System.out.println("result "+num1+ " "+num2);

    }
}