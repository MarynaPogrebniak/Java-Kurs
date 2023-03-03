import java.util.Scanner;

public class Currency_Enum {

  public static void main(String[] args) {
    enum Currency {
      USD,
      UAH,
      CNY,
      GBP,
      CAD
    }
    double exchangeRate = 1;
    Currency type = Currency.CAD;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a currency: USD, UAH, CNY, GBP or CAD");
    String choice = sc.nextLine().toUpperCase();

    switch (choice) {

      case "USD" -> {
        type = Currency.USD;
        exchangeRate = 1.06;
        System.out.println("Exchange rate " + Currency.USD + " to " + "Euro is " + exchangeRate);
        break;
      }
      case "UAH" -> {
        exchangeRate = 39.07;
        System.out.println("Exchange rate " + Currency.UAH + " to " + "Euro is " + exchangeRate);
        break;
      }
      case "CNY" -> {
        exchangeRate = 7.33;
        System.out.println("Exchange rate " + Currency.CNY + " to " + "Euro is " + exchangeRate);
        break;
      }
      case "GBP" -> {
        exchangeRate = 0.88;
        System.out.println("Exchange rate " + Currency.GBP + " to " + "Euro is " + exchangeRate);
        break;
      }
      case "CAD" -> {
        exchangeRate = 1.44;
        System.out.println("Exchange rate " + Currency.CAD + " to " + "Euro is " + exchangeRate);
        break;
      }
    }
  }

}
