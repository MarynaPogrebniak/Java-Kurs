package l_28_02_Files_IO;

public class numeralSystems_hw {
//Задача 2
//Перевести двоичное число 111000111000111000 в десятичное.
//Дано десятичное число 9876543210. Каконо будет выглядеть в
// двоичной, двенадцатеричной и шестнадцатиричной системах счисления?

  public static void main(String[] args) {
    String num = "111000111000111000";
    int decimalNum = Integer.parseInt(num, 2);
    System.out.println(num + " decimal is " + decimalNum);

    long num1 = 9876543210l;
    String binaryNum = Integer.toBinaryString((int) num1);
    System.out.println(num1 + " binary is " + binaryNum);

    String hexaDecimal = Integer.toHexString((int) num1);
    System.out.println(num1 + " hexadecimal is " + hexaDecimal);


  }
}
