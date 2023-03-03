import java.util.Scanner;

public class prime_number {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
         /*
           Сделать сканнер для num
           Определить, какие числа меньше num простые
           Вывести результат
            */
        System.out.println("Input a number");
        int num = scanner.nextInt();

        for (int i = 2; i < num; i++) {
            if (prime(i)) System.out.println("prime number " + i);
        }
    }

    public static boolean prime(int num) {

        for (int i = 2; i < num; i++) {

            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}







