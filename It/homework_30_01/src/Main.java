import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        // Даны два целых числа. Написать программу, выводящую на экран или их сумму или,
        //если эти числа равны, то двойную сумму.
        int a = 5;
        int b = 5;

        if (a != b) {
            System.out.println("a!=b sum is " + (a + b));
        }
            else {
                System.out.println("a=b sum is "+(a+b)*2);
            }
        }
    }
