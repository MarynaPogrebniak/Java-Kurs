public class Bus extends  Car{
  String brand;
  int seats;

  public Bus(int age, String usage, int speed, String brand, int seats) {
    super(age, usage, speed);
    this.brand = brand;
    this.seats = seats;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public int getSeats() {
    return seats;
  }

  public void setSeats(int seats) {
    this.seats = seats;
  }

  @Override
  public void go() {
    System.out.println("Автобус едет по дороге с пассажирами");
    this.speed = speed;
    System.out.println("Скорость " + speed);
  }

  @Override
  public void stop() {
    System.out.println("Автобус остановился");
    speed = 0;
    System.out.println("Скорость " + speed);
  }

  @Override
  public void speedDown() {
    System.out.println("Уменьшаем автобусу скорость");
    speed -= 10;
    System.out.println("Скорость " + speed);
  }

  @Override
  public void speedUp() {
    System.out.println("Увеличиваем автобусу скорость");
    speed += 10;
    System.out.println("Скорость " + speed);

  }


}
