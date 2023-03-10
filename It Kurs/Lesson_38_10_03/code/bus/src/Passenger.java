public class Passenger {
  String name;
  int age;

  public Passenger(String name, int age) {
    this.name = name;

    if (age < 21 || age > 65) {
      System.out.println("Возраст водителя должен быть больше 21 года и меньше 65 лет.");
    }
    this.age = age;
  }

  @Override
  public String toString() {
    return "Passenger{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
  }
}
