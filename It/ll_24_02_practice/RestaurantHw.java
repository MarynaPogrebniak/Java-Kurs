package ll_24_02_practice;

import java.util.HashMap;
import java.util.Scanner;

public class RestaurantHw {

  public static void main(String[] args) {
    System.out.println("Добро пожаловать в наш ресторан!");
    // Небольшой ресторан, в котором имеется 5 столиков, хочет внедрить у себя вежливого
    // телефонного администратора (бота), который:
    // - принимает звонок от потенциального клиента;
    // - сообщает о наличии свободных стликов;
    // - при желании клиента выполняет бронирование столика.

    HashMap<Integer, Boolean> tables = new HashMap<Integer, Boolean>();

    // все столы свободны (не заняты)
    tables.put(1, false);
    tables.put(2, true);
    tables.put(3, false);
    tables.put(4, false);
    tables.put(5, true);

    Scanner sc = new Scanner(System.in);
    do {
      System.out.println("Здравствуйте!");
      System.out.println("У нас есть такие свободные столики: ");
      print_table_status(tables); // метод печатает статус столов
      for (int i = 0; i < tables.size(); i++) {
        if (!is_ful(tables)) {
          System.out.println("Выберите номер столика: ");
          int table_num = sc.nextInt();
          reserv_table(tables, table_num); // метод, который резервирует стол
          print_table_status(tables);
        }
      }
    }
    while (!is_ful(tables));
    System.out.println("Все столы зарезервированы");

  }

  /**
   * это пишется /** Enter над методом и перенимает его прааметры
   *
   * @param map
   * @param num
   */
  public static void reserv_table(HashMap map, int num) {
    if (map.get(num).equals(false)) {
      map.put(num, true);
      System.out.println("Столик " + num + " зарезервирован.");
      return;
    } else {
      System.out.println("Столик " + num + " уже зарезервирован.");
      return;
    }
  }

  public static void print_table_status(HashMap map) {

    for (Object i : map.keySet()) {
      String status = "";
      if (map.get(i).equals(true)) {
        status = " зарезервирован ";
      } else {
        status = " свободен ";
      }
      System.out.println("Столик: " + i + " статус: " + status);
    }
  }

  public static boolean is_ful(HashMap map) {
    for (int i = 0; i < map.size(); i++) {
      if (map.containsValue(false)) { //сть свободные. когда true , все столы зарезервированы
        return false;

      }
    }
    return true;

    // если все столики зарезервированы, то есть все values в map == true
    // иначе return false;
  }
}
