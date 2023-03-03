package l_03_02;

import java.util.Scanner;

public class game_GuessNumber {
    static Scanner scanner = new Scanner(System.in);
    static int secret = 9;


    public static void main(String[] args) {
        readNumberOfAttemts();
        readNumber();
    }

    private static int readNumberOfAttemts() {

        System.out.println("Enter number of Attemts");
        // int number = scanner.nextInt();
        return scanner.nextInt();

    }
    //Для нашей игры "Угадай число" написать метод readNumber.
    // Метод должен принимать введенное пользователем с клавиатуры число и возвращать его в главный метод

    private static int readNumber() {
        System.out.println("Enter a number");
        return scanner.nextInt();
    }
}
