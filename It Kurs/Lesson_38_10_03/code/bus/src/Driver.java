//Создать класс Driver с атрибутами: имя водителя, возраст водителя (должен быть старшше 21 года и
//не старше 65 лет).
public class Driver {
String name;
int age;

  @Override
  public String toString() {
    return "Driver{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
  }

  public Driver(String name, int age) {
    this.name = name;

    if (age < 10) {
      System.out.println("Возраст пассажира должен быть больше 10 лет.");
    }
    this.age = age;

  }
}
