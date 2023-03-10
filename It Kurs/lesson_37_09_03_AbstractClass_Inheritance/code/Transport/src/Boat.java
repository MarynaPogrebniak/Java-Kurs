public class Boat extends Transport{
  String name;

  public Boat(int speed, int capacity, String name) {
    super(speed, capacity);
    this.name = name;
  }

  @Override
  public void drive() {
    System.out.println("Лодка плывет");
  }

  @Override
  public void stop() {
    System.out.println("Лодка тормозит");
  }

  @Override
  public void getInfo() {
    System.out.println("Скорость транспортного средства " + getSpeed() + " вместительность " + getCapacity());
    System.out.println("Тип лодки " + getName());

  }

  public String getName() {
    return name;
  }

  @Override
  public int getVIN(int vin) {
    return super.getVIN(vin);
  }
}
