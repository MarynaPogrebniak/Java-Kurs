import java.util.Scanner;

public class Switch {

  public static void main(String[] args) {
 /*SWITCH
         switch(expression){
         case constant1:
          statement sequence
          break;
         case constant2:
           statement sequence
           break;
         case constant3:
            statement sequence
            break;
            .
            .
            .
            default
             statement sequence
         }
         */

        /*
        1- порядок следования вариантов в switch  не обязательно должен быть 1,2,3.
        а должен отражать лишь необходимые для выполнения программы случаи (case)
        2- в качестве выражения в традиционном switch могут использоваться числа,
        символы и строки
        3- выражение в скобках внутри switch  должно в результате давать константу
         иначе switch  не будет работать
         (1+3+56)  (a+2)
         */

        /* Java Help System
         Help on:
         1.if
         2.switch
         Choose one:
         */

    Scanner scanner = new Scanner(System.in);
    System.out.println("Help on");
    System.out.println("1.if");
    System.out.println("2.switch");
    System.out.println("Enter number: ");
    int choice = scanner.nextInt();

    switch (choice) {
      case 1:
        System.out.println("The IF:");
        System.out.println("if(condition) statement;");
        System.out.println("else statement;");
        break;
      case 2:
        System.out.println("Traditional Switch:");
        System.out.println("switch(expression) {");
        System.out.println(" case constant:");
        System.out.println(" statement sequence");
        System.out.println(" break;");
        System.out.println("}");
        break;
      default:
        System.out.println("Your selection is not found");
    }

    // 1.написать простой калькулятор с четырьмя действиями, используя switch.
    // num1 и num2  +,-, /,*

    Scanner sc = new Scanner(System.in);
    System.out.println("Vvedite pervoe chislo");
    int first = sc.nextInt();
    System.out.println("Vvedite vtoroe chislo");
    int second = sc.nextInt();
    System.out.println("Vvedite  + - * / ");
    char symbol = sc.next().charAt(0);

    switch (symbol) {
      case '+':
        System.out.println(first + second);
        break;
      case '-':
        System.out.println(first - second);
        break;
      case '*':
        System.out.println(first * second);
        break;
      case '/':
        System.out.println(first / second);
        break;
      default:
        System.out.println("Symbol is not correct");
    }
    //2.Написать программу, проверяющую является ли введенная с клавиатуры буква английского алфавита
    // гласной или  согласной . Написать как switch  и написать через if-else.
    // гласные: a,e,i,o,u,y:
    System.out.println("Vvedite bukvu");
    char bukva = sc.next().toLowerCase().charAt(0);
    boolean isVowel = false;
    switch (bukva) {
      case 'a', 'e', 'i', 'o', 'u', 'y':
        isVowel = true;
    }

    if (isVowel) {
      System.out.println(bukva + " is a vowel");
    } else {
      if ((bukva >= 'a' && bukva <= 'z') || (bukva >= 'A' && bukva <= 'Z')) {
        System.out.println(bukva + " is a consonant");
      } else {
        System.out.println("soglasnaya");
      }
    }
    //3.Написать программу, находящую количество дней в месяце.
    // С клавиатуры вводятся два значения: номер месяца  и год.
    // А программа выдает количество дней в этом месяце.
    //month= 1 , year=2000 -> 31
    //month= 2 , year = 1999 -> 28
    //month= 2 , year = 2000 -> 29
    //
    Scanner sc4 = new Scanner(System.in);
    System.out.println("Vvedite god");
    int year = sc4.nextInt();
    System.out.println("Vvedite nomer mesyaca");
    int month = sc4.nextInt();

    switch (month) {
      case 1:
        System.out.println("January, 31 days");
        break;
      case 2:
        int numberOfDaysFebruary;
        if ((year % 4 == 0) && (((year % 100) != 0) || ((year % 100 == 0) && (year % 400
            == 0)))) {
          numberOfDaysFebruary = 29;
        } else {
          numberOfDaysFebruary = 29;
        }
        System.out.println("February " + numberOfDaysFebruary);
        break;
      case 3:
        System.out.println("March, 31 days");
        break;
    }


  }
}
