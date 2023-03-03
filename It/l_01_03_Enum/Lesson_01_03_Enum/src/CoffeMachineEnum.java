import java.util.Scanner;

public class CoffeMachineEnum {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Добро пожаловать в нашу кофейню!");
    System.out.println();
    //Какой кофе будем продавать
    // Espresso 2.30 Euro | 3 euro
    // Americano 2.10 Euro  | 2 euro
    // Cappuchino 3.50 Euro | 4
    // Latte 4.20 Euro  | 5

    enum CoffeType {
      ESPRESSO,
      AMERICANO,
      CAPUCCHINO,
      LATTE

    }
    for (CoffeType myCoffee : CoffeType.values()) {
      System.out.println(myCoffee);
    }
    System.out.println("Выберите тип кофе. Нажмите 1, 2, 3 или 4");

    int choice = sc.nextInt();
    CoffeType myCoffee = CoffeType.ESPRESSO;

    //выбор пользователя

    switch (choice) {
      case 1: {
        myCoffee = CoffeType.ESPRESSO;
        break;
      }
      case 2: {
        myCoffee = CoffeType.AMERICANO;
        break;
      }
      case 3: {
        myCoffee = CoffeType.CAPUCCHINO;
        break;
      }
      case 4: {
        myCoffee = CoffeType.LATTE;
        break;
      }
    }
    int coffeePrice = 0;

    //назначаем цену
    switch (myCoffee) {

      case ESPRESSO -> {
        coffeePrice = 3;
        System.out.println("Стоимость " + coffeePrice + " Euro");
        break;
      }
      case AMERICANO -> {
        coffeePrice = 2;
        System.out.println("Стоимость " + coffeePrice + " Euro");

        break;
      }
      case CAPUCCHINO -> {
        coffeePrice = 4;
        System.out.println("Стоимость " + coffeePrice + " Euro");
        break;
      }
      case LATTE -> {
        coffeePrice = 5;
        System.out.println("Стоимость " + coffeePrice + " Euro");
        break;
      }
    }
    System.out.println("Оплатите " + coffeePrice + " Euro, пожалуйста.");
    System.out.println("Переходите к оплате");

  }
}
