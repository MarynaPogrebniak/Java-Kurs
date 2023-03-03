import java.util.HashMap;
import java.util.Scanner;

public class MainCopy1 {

  public static Scanner sc = new Scanner(System.in);
  public static HashMap<String, Double> currencyList = new HashMap<>();
  public static HashMap<Integer, String> menuCurrencyList = new HashMap<>();

  // Печатает Валюту
  public static void printCurrencyList(HashMap<String, Double> arr) {
    for (String key : arr.keySet()) {
      System.out.printf("Валюта %3s = %s%n", key, arr.get(key));
    }
  }

  // Печатает меню
  public static void printMenuCurrencyList(String str, HashMap<Integer, String> arr) {
    System.out.println(str);
    for (int key : arr.keySet()) {
      System.out.printf("%1s : %s%n", key, arr.get(key));
    }
  }

  public static void fillLists() {
    // заполнение списка валют
    currencyList.put("EUR", 1.0);
    currencyList.put("USD", 1.06);
    currencyList.put("RUB", 79.66);
    currencyList.put("UAH", 39.07);
    currencyList.put("CNY", 7.33);
    currencyList.put("GBP", 0.88);
    currencyList.put("CAD", 1.44);

    // заполнить списка меню
    int index = 1;
    for (String key : currencyList.keySet()) {
      menuCurrencyList.put(index, key);
      index++;
    }
  }

  public static void menuList(HashMap<Integer, String> list) {

  }

  public static void main(String[] args) {
    fillLists();
    printCurrencyList(currencyList);

    System.out.print("Введите ссумму: ");
    int amountCurrency = sc.nextInt();
    System.out.println();

    printMenuCurrencyList("Укажите введенную валюту: ", menuCurrencyList);
    int currencyIndex = sc.nextInt();

    printMenuCurrencyList("Уажите валюту в которую конвертируем: ", menuCurrencyList);
    int convertCurrencyIndex = sc.nextInt();

    System.out.println(
        "Convert result of " + menuCurrencyList.get(currencyIndex) + " to " + menuCurrencyList.get(
            convertCurrencyIndex) + " " + currencyConvert(
            amountCurrency, currencyIndex, convertCurrencyIndex));

    currencyConvertAll(amountCurrency, currencyIndex, convertCurrencyIndex);


  }

  public static double currencyConvert(int amountCurrency, int currencyIndex,
      int convertCurrencyIndex) {

    String currency = menuCurrencyList.get(currencyIndex);
    String currencyConvert = menuCurrencyList.get(convertCurrencyIndex);

    System.out.println(currency);
    System.out.println(currencyConvert);

    System.out.println();

    double result =
        amountCurrency * currencyList.get(currencyConvert) / currencyList.get(currency);

    return result;

  }

  public static void currencyConvertAll(int amountCurrency, int currencyIndex,
      int convertCurrencyIndex) {

    String currency = menuCurrencyList.get(currencyIndex);
    String currencyConvert = menuCurrencyList.get(convertCurrencyIndex);

    System.out.println();
    double resultAll = 0;

    for (String i : currencyList.keySet()) {
      resultAll =
          amountCurrency * currencyList.get(i) / currencyList.get(currency);
      //  System.out.println("Convert result of " + currency + " to " + i + " " + result);
      System.out.printf("Convert result of %s to %s  %.2f %n", currency, i, resultAll);
    }

  }


}


