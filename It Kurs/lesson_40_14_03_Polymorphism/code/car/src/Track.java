public class Track extends Car{

  String brand;
  int loadWeight;

  public Track(int age, String usage, int speed, String brand, int loadWeight) {
    super(age, usage, speed);
    this.brand = brand;
    this.loadWeight = loadWeight;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public int getLoadWeight() {
    return loadWeight;
  }

  public void setLoadWeight(int loadWeight) {
    this.loadWeight = loadWeight;
  }

  @Override
  public void go() {
    System.out.println("Track едет по дороге с пассажирами");
    this.speed = speed;
    System.out.println("Скорость " + speed);
  }

  @Override
  public void stop() {
    System.out.println("Track остановился");
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
