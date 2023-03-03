import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


       /* Scanner scanner = new Scanner("qwertzuiop");
        String s = scanner.nextLine();
        System.out.println(s);

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String str1 = scanner1.nextLine();
        System.out.println("Your name is: " + str1);

        scanner1.close();
        scanner.close();*/

        /*Scanner scanner2 = new Scanner(System.in);
        //System.out.println("Enter your name");
        System.out.println("Enter number: ");
        int num = scanner2.nextInt();
        System.out.println("You entered: " + num);
        System.out.println("Enter second number: ");
        int num2 = scanner2.nextInt();
        System.out.println("You entered: " + num2);
        System.out.println("The sum is: " + (num+num2));


        //System.out.println("Enter your full name: ");
        //String word = scanner2.next();
        //System.out.println("your full name is: " + word);*/

        /*Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter your full name: ");
        String word2 = scanner2.nextLine();
        System.out.println("your full name is: " + word2);
        scanner2.close();*/

        // -10 абсолютное значение
        int abs = Math.abs(-10);
        System.out.println(abs);
        int x1 = 10;
        System.out.println(Math.abs(x1));

        // min znacheniy
        int min = Math.min(9, 20);
        System.out.println(min);

        // max znacheniy
        int max = Math.max(8, 20);
        System.out.println(max);

        // sluchainoe chislo
        double random = Math.random();
        System.out.println(random);
        random = Math.random()*1000;
        System.out.println(random);

        double round = Math.round(random);
        System.out.println("rounded random is " + round);

        //okruglenie
        double roundUP = Math.round(24.8);
        double roundDown = Math.round(24.2);
        System.out.println(roundUP);
        System.out.println(roundDown);

        //stepen chisla
        double power = Math.pow(2, 3);
        System.out.println(power);

        // koren
        double sqrt = Math.sqrt(4);
        System.out.println(sqrt);

        System.out.println(Math.PI);




    }
}