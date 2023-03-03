import java.util.HashSet;
import java.util.*;

public class hashSet_vin_numbers_auto {

  public static void main(String[] args) {
    //Задача 3
    //В автосервисе решили узнать, сколько всего уникальных машин они обсужили
    // за время своей работы. В архиве имеются все заказ-наряды, в которых
    // зафиксированы VIN обслуженных машин. Написать приложение для автосервиса,
    // проверить его работу на тестовом наборе данных для 10 автомобилей
    // Пусть VIN содержит 2 буквы и 3 цифры.

    Scanner sc = new Scanner(System.in);

    HashSet<String> vinNumbers = new HashSet<String>();

  /*fq123
    qw234
    er345
    tz456
    ui567
    op678
    as890
    df451
    gh630
    hj749 */

    String vin;
    char choice;
    for (int i = 0; i < 10; i++) {
      System.out.println("Введите vin number: ");
      vin = sc.next();
      vinNumbers.add(vin);
    }

    System.out.println(vinNumbers);

    do {

      System.out.println("Проверка, есть ли уже такой vin number");
      System.out.println("Enter vin number ");
      vin = sc.next();
      if (vinNumbers.contains(vin)) {
        System.out.println("Да, такой vin уже есть.");
      } else {
        System.out.println("Нет, такого vin еще нет.");
      }

      System.out.println(
          "Для остановки проверки нажмите s, чтобы продолжить - любую другую букву.");

      choice = sc.next().toLowerCase().charAt(0);
      if (choice == 's') {
        break;
      }
    } while (true);

  }

}
