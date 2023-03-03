import java.util.Locale;
import java.util.Scanner;  // Import the Scanner class

public class Main {
    public static void main(String[] args) {
        //printf

        System.out.printf("Hello %s!%n ", "World");
      // %[flags] [width] [.precision]conversion charachters

        // s - formatirovanie strok
        // d - formatiruet celye chisla
        // f  formatiruet chisla s zapyatoi
        // t - formatiruet datu i vremya

        System.out.printf("Hello%nworld%n"); //Hello
                                            // world

        System.out.printf(" '%S'%n", "Hello"); //'HELLO'
        System.out.printf(" '%15s' %n", "Hello"); // '    Hello'

        System.out.printf(" '%-15s' %n", "Hello"); // 'Hello    '

        System.out.printf(" %5.2s%n", "Hello"); //    He  5 do otstup. obrezaet 2 bukvy ot stroki

        // char formatting
        System.out.printf("%c%n", 'a'); //a
        System.out.printf("%C%n", 'a'); //A
        System.out.printf("%c%n", 'A'); //A ne rabotaet tak

        // Integer formatting. %d

        System.out.printf("Integer: %d%n", 1000); //Integer: 1000
        System.out.printf(Locale.US,"%,d%n", 10000); //10,000
        System.out.printf(Locale.GERMANY,"%,d%n", 100000); //100.000

// Float and double formatting

        System.out.printf("%f%n", 5.9876); //5,987600
        //with precision. s okrugleniem
        System.out.printf("'%10.2f' %n", 5.9876); //'      5,99'

        //scientific  %e
        System.out.printf("'%10.2e'%n", 5.9876); //'  5,99e+00'


        String name = "Evgeny";
        String b = "asdf";
        String name1 = new String("Evgeny");
        // a==b

       boolean equals = name.equals(name1);   //equals
        System.out.println(equals); //true

        System.out.println(name==name1); //false

        String string = "Hello";
        String string1 = "hello";

        //equalsIgnoreCase
        System.out.println(string.equals(string1));//false
        System.out.println(string.equalsIgnoreCase(string1)); //true

        //toUpperCase method
        String string2 = new String("this is a new String");
        System.out.println(string2.toUpperCase()); //THIS IS A NEW STRING

        //toLowerCase method
        String string3 = new String("THIS IS a new String");
        System.out.println(string3.toLowerCase()); //this is a new string

        // startsWith

        String string4 = "Hello";
        boolean startsWith = string4.startsWith("He");
        System.out.println(startsWith); //true

        // valueOf method
        int number = 99;
        String test = String.valueOf(number); //stalo strokoi

        // indexOf

        String string5 = "this is a string";
        System.out.println("Index of h in the string is "+string5.indexOf('h')); //1
        System.out.println("Index of s in the string is "+string5.indexOf('s')); //3
        System.out.println("Index of z in the string is "+string5.indexOf('z')); //-1 kogda net simvola
        System.out.println("Index of is in the string is "+string5.indexOf("is")); //2 v slove this 1i raz

        int index = string5.indexOf('s');



                String word = "adFghjetYnmk";

                Scanner a = new Scanner(System.in);  // Create a Scanner object
                System.out.println("Enter letter");
                String firstLetter = a.nextLine();  // Read user input
                System.out.println("Enter second letter");
                String secondLetter = a.nextLine();  // Read user input
                System.out.println("First letter is: " + firstLetter+ " Second letter is: "+secondLetter);  // Output user input

                int indexF = word.indexOf(firstLetter);
                int indexS = word.indexOf(secondLetter);
                System.out.println("First letter index is: " + indexF+ " Second letter index is: "+indexS);

                String before = word.substring(0, indexF);
                String between = word.substring((indexF+1), indexS);
                String last = word.substring(indexS+1);

                System.out.println(before+secondLetter+between+firstLetter+last);


        }


    }
