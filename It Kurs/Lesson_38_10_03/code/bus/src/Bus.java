/*
- задача об автобусе:
Создать класс Bus с атрибутами: номер маршрута, водитель, вместимость 36 мест, скорость на маршруте
(не может быть больше 60 км/ч), стоимость проезда 2 евро. В классе Bus создайте метод setDriver,
который принимает имя драйвера и назначает его водителем автобуса.
Сформируйте информцию об автобусе в следующем виде:
  Информация об автобусе:
  Номер маршрутв : __
  Вместимость: ___ кресел
  Водитель: _____
  Скорость на маршруте: _____
Создать класс Driver с атрибутами: имя водителя, возраст водителя (должен быть старшше 21 года и
не старше 65 лет).
Создать класс Passenger с атрибутами: имя, возраст (должен быть старше 10 лет).
Среднестатистическая заполняемость автобуса составляет 60% от его вместимости.
Автобус за день совершает 5 рейсов по маршруту. Рассчитайте объем дневной выручки от работы
автобуса.
 */
public class Bus {
int busLine;
String driverName;
int capacity;
int speed;
int price;

  public Bus(int busLine, String driverName, int capacity, int speed, int price) {
    this.busLine = busLine;
    this.driverName = driverName;
    this.capacity = capacity;
    if (speed <= 60 && speed > 0){
      this.speed = speed;
    }
    else if (speed<=0) {
      throw new IllegalArgumentException("Скорость должна быть больше нуля. У нас " + speed);
    }
      else {
      System.out.println("Автобус с очень высокой скоростью. Это небезопасно!");
    }

    this.price = price;
  }

  public void setDriverName(String driverName) {
    this.driverName = driverName;
  }

  @Override
  public String toString() {
    return "Bus{" +
        "busLine=" + busLine +
        ", driverName='" + driverName + '\'' +
        ", capacity=" + capacity +
        ", speed=" + speed +
        ", price=" + price +
        '}';
  }
}
