public class Auto extends Car{

  String brand;
  int capacity;

  public Auto(int age, String usage, int speed, String brand, int capacity) {
    super(age, usage, speed);
    this.brand = brand;
    this.capacity = capacity;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public int getCapacity() {
    return capacity;
  }

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }

  @Override
  public void go() {
    System.out.println("Автомобиль едет по дороге с пассажирами");
    this.speed = speed;
    System.out.println("Скорость " + speed);
  }

  @Override
  public void stop() {
    System.out.println("Автомобиль остановился");
    speed = 0;
    System.out.println("Скорость " + speed);
  }

  @Override
  public void speedUp() {
    super.speedUp();
  }

  @Override
  public void speedDown() {
    super.speedDown();
  }
}
