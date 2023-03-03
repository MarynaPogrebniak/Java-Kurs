public class binary {

  public static void main(String[] args) {
    System.out.println("Перевод из одной числовой системы в другие методами в Java");
    System.out.println();

    //Пееревод из двоичной в десятичную
    System.out.println("Перевод из двоичной системы в десятичную");
    String string_num = "1000"; // двоичное число задано строкой
    System.out.println("Двоичное число (строка символов): " + string_num);
    int binaryNumber = Integer.parseInt(string_num, 2);
    System.out.println("В десятичной системе это число: " + binaryNumber);

    System.out.println();

    //Пееревод из десятичной системы в двоичную и другие
    System.out.println("Перевод десятичного числа в двоичное (будет выведено строкой)");
    int n = 12345;
    System.out.println("Десятичное число: " + n);
    String binaryNum = "";
    binaryNum = Integer.toBinaryString(n);
    System.out.println("Двоичное представление этого числа: " + binaryNum);
    System.out.println();

    String octalNum = Integer.toOctalString(n);
    System.out.println("В восьмеричной системе это: " + octalNum);
    System.out.println();

    String hexNum = Integer.toHexString(n);
    System.out.println("В 16-ричной системе это: " + hexNum);
    System.out.println();

    //Перевод числа из типа String в числовой тип int
    System.out.println("Перевод строки, содержащей число, в число");
    String strNum = "155";
    int num1 = Integer.parseInt(strNum); // присвоили найденное в строке число в переменную
    System.out.println(num1); // находим число внутри строки
    System.out.println();

    String st = "5";
    int tableNum = Integer.parseInt(st);
    System.out.println("Номер столика: " + tableNum);
  }
}

