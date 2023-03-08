
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    boolean wrong_input = true;
    Scanner sc = new Scanner(System.in);
    HashMap<Integer, Boolean> tables = new HashMap<Integer, Boolean>();

    System.out.println("Добро пожаловать в наш ресторан!");
    // Небольшой ресторан, в котором имеется 5 столиков, хочет внедрить у себя вежливого
    // телефонного администратора (бота), который:
    // - принимает звонок от потенциального клиента;
    // - сообщает о наличии свободных стликов;
    // - при желании клиента выполняет бронирование столика.

    //  столы свободны = false (не заняты)
    tables.put(1, false);
    tables.put(2, false);
    tables.put(3, true);
    tables.put(4, false);
    tables.put(5, false);


    while (true) {
      do {
        try {
          System.out.println("Здравствуйте!");
          System.out.println("У нас есть такие свободные столики: ");
          print_table_status(tables); // метод печатает статус столов

          for (int i = 0; i < tables.size(); i++) {
            if (!is_ful(tables)) {
              System.out.println();
              System.out.println("Выберите номер столика: ");
              int table_num = sc.nextInt();

              reserv_table(tables, table_num); // метод, который резервирует стол

              // Подготовка к сохранению статуса столов - создание файла
              String path = "C:\\Users\\AIT TR Student\\IdeaProjects\\It\\Restaurant\\src\\";

              try {
                File myFile = new File(path + "tablesStatus.txt"); // Укажите свое имя файла
                if (myFile.createNewFile()) {
                  System.out.println("Файл создан: " + myFile.getName());
                } else {
                  //System.out.println("Файл уже существует.");
                }
              } catch (IOException e) {
                System.out.println("Произошла ошибка.");
                e.printStackTrace();
              }
              //сохраняем в txt
              saveTableStatus(tables, path);

              //печать столов
              print_table_status(tables);


            }
          }
        } catch (InputMismatchException e) {
          System.out.println(
              "Чтобы забронировать столик, введите число с номером свободного столика");
          System.out.println();
          sc.nextLine();
          wrong_input = true;
          if (wrong_input) {
            continue;
          }
        }
      } while (!is_ful(tables));
      System.out.println("Все столы зарезервированы. \nЖдем Вас в следующий раз");
      break;
    }
  }

  /**
   * это пишется /** Enter над методом и перенимает его прааметры этот метод резервирует столик
   */
  public static void reserv_table(HashMap map, int num) {
    if (map.get(num).equals(false)) {
      map.put(num, true);
      System.out.println("Столик " + num + " зарезервирован.");
      System.out.println();
      return;
    } else {
      System.out.println("Столик " + num + " уже зарезервирован.");
      return;
    }
  }

  /**
   * печатает статус столиков
   */
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

  /**
   * метод провреяет, есть ли свободные столики
   */
  public static boolean is_ful(HashMap map) {
    for (int i = 0; i < map.size(); i++) {
      if (map.containsValue(false)) { //сть свободные. когда true , все столы зарезервированы
        return false;

      }
    }
    return true;

  }

  /**
   * сохраняем в txt
   *
   * @param map  map со столами
   * @param path где хранится txt
   */
  public static void saveTableStatus(HashMap<Integer, Boolean> map, String path) {
    try {
      FileWriter myWriter = new FileWriter(path + "tablesStatus.txt");
      for (Object i : map.keySet()) {
        String status = "";
        if (map.get(i).equals(true)) {
          status = " зарезервирован ";
        } else {
          status = " свободен ";
        }
        myWriter.write("Столик: " + i + " статус: " + status + '\n');
        // System.out.println();
      }
      myWriter.close();
      //  System.out.println("Успешная запись в файл.");
    } catch (IOException e) {
      System.out.println("Произошла ошибка.");
      e.printStackTrace();
    }
  }
}
// защита от ввода символов при выборе столика
