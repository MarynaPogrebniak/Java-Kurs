
    import java.util.Scanner;  // Import the Scanner class
    public class homework {
        public static void main(String args[]) {
            // "AbCDe" ==> "ab*de"

            Scanner scanner = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter source string: ");
            String word = scanner.nextLine();
            System.out.println("Enter letter: ");
            String letter = scanner.nextLine();

            int _index = word.indexOf(letter);
            letter = "*";

            String first = word.substring(0,_index);
            String second = word.substring((_index+1));
            System.out.println((first+letter+second).toLowerCase());


            //System.out.println(word.toLowerCase() + " " + letter);
        }
    }


