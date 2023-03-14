public class Main {
//  Класс Car с полями возраст и применение.
//  Дочерние классы Bus, Track, Auto.
//  В классах создаем поля brand и поле, отображающее "загрузку": Bus -> seats, Track -> load_weight,
//  Auto -> capacity.
//  Создаем методы во всех классах:
//      - стоять stop
//- ехать go
//- ехать быстрее + 10 км/ч speed_up
//- ехать медленнее - 10 км/ч speed_down
//  Цель: убедится, что однин и тот же по названию метод работает с разными классами.
  public static void main(String[] args) {

    Car car = new Car(5, "go", 70);
    Bus bus = new Bus(8,"bus go", 60, "Iveco", 36);
    Track track = new Track(10, "Track go", 40, "Blabla", 100);
    Auto auto = new Auto(1, "auto go", 130, "Audi", 5);

    car.go();
    car.speedUp();
    car.speedDown();
    car.stop();
    System.out.println();

    bus.go();
    bus.speedUp();
    bus.speedDown();
    bus.stop();
    System.out.println();

    track.go();
    track.speedDown();
    track.speedUp();
    track.stop();
  }
}