/*- задача об автобусе:
    Создать класс Bus с атрибутами: номер маршрута, водитель, вместимость 36 мест, скорость на маршруте
    (не может быть больше 60 км/ч), стоимость проезда 2 евро. В классе Bus создайте метод setDriver,
    который принимает имя драйвера и назначает его водителем автобуса.
    Сформируйте информцию об автобусе в следующем виде:
    Информация об автобусе:
    Номер маршрутв : __
    Вместимость: ___ кресел
    Водитель: _____
    Скорость на маршруте: _____
    Создать класс Driver с атрибутами: имя водителя, возраст водителя (должен быть старше 21 года и
    не старше 65 лет).
    Создать класс Passenger с атрибутами: имя, возраст (должен быть старше 10 лет).
    Среднестатистическая заполняемость автобуса составляет 60% от его вместимости.
    Автобус за день совершает 5 рейсов по маршруту. Рассчитайте объем дневной выручки от работы
    автобуса.*/
public class Main {

  public static void main(String[] args) {

    Bus bus1 = new Bus(23, 36,50, 1);
    //System.out.println(bus1);
    bus1.setPrice(2);
    //System.out.println(bus1.price);

    System.out.println("Информация об автобусе:\n"
        + "  Номер маршрута : " + bus1.busLine + "\n"
        + "  Вместимость: " + bus1.capacity + " кресел\n"
        + "  Скорость на маршруте: " + bus1.speed);

    Driver driver1 = new Driver("Vasya", 35);
    System.out.println(driver1);

    driver1.go(bus1);
    System.out.println(bus1.getDriver().name);

    System.out.println(bus1);

    Passenger passenger1 = new Passenger("Slavik", 12);
    System.out.println(passenger1);

    Bus.getRevenueBus(bus1.capacity, bus1.price);
  }
}