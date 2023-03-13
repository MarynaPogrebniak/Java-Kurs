//Создать класс Driver с атрибутами: имя водителя, возраст водителя (должен быть старшше 21 года и
//не старше 65 лет).
public class Driver {

String name;
int age;
Bus bus;

  public String getName() {
    return name;
  }
  public void go (Bus bus) {
    this.bus = bus;
    this.bus.setDriver(this);
  }
  // метод, который отображает, что водитель поехал на автобусе
  public void drive() {
    this.bus.go();  // вызываем метод из класса Bus
  }

  @Override
  public String toString() {
    return "Driver{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
  }

  public Driver(String name, int age) {
    this.name = name;
    if (age < 21 || age > 65) {
      System.out.println("Возраст водителя должен быть больше 21 года и меньше 65 лет.");
    }
    this.age = age;
  }


  }

