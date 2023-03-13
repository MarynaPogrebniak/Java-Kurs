public class Passenger {

  String name;
  int age;

  public Passenger(String name, int age) {
    this.name = name;

    if (age < 10) {
      System.out.println("Возраст пассажира должен быть больше 10 лет.");
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
