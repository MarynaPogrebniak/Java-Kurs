public class Car {

  int age;
  String usage;
  int speed;

  public Car(int age, String usage, int speed) {
    this.age = age;
    this.usage = usage;
    this.speed = speed;
  }

  public void go(){
    System.out.println("Едем по дороге");
    this.speed = speed;
    System.out.println("Скорость " + speed);
  }

  public void stop() {
    System.out.println("Остановились");
    speed = 0;
    System.out.println("Скорость " + speed);
  }

  public void speedUp(){
    System.out.println("Увеличиваем скорость");
    speed += 10;
    System.out.println("Скорость " + speed);
  }

  public void speedDown(){
    System.out.println("Уменьшаем скорость");
    speed -= 10;
    System.out.println("Скорость " + speed);
  }
}
