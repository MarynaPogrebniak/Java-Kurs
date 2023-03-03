package l_03_02;

import java.util.Scanner;

public class cube {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("Enter a number ");

        int n = scanner.nextInt();
        System.out.println("n cube is " + powerreturn(n));

    }

    public static int powerreturn(int n) {


        int pow = n * n * n;
        return pow;
    }
}
