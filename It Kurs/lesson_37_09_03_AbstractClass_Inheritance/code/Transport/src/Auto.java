public class Auto extends Transport{
String name;

  public Auto(int speed, int capacity, String name) {
    super(speed, capacity);
    this.name = name;
  }

  @Override
  public void drive() {
    System.out.println("Машина едет");
  }

  @Override
  public void stop() {
    System.out.println("Машина тормозит");
  }

  @Override
  public void getInfo() {
    System.out.println("Скорость транспортного средства " + getSpeed() + " вместительность " + getCapacity());
    System.out.println("Марка машины " + getName());
  }

  public String getName() {
    return name;
  }

  @Override
  public int getVIN(int vin) {
    return super.getVIN(vin);
  }
}
