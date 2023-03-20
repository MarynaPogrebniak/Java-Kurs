package house;

public class ApartmentHouse extends House{
  private int entrancesNumber;

  public ApartmentHouse(String address, int entrancesNumber) {
    super(address);
    this.entrancesNumber = entrancesNumber;
  }

  @Override
  public String toString() {
    return "Адрес многоквартирного дома: " + getAddress() + ". У дома " + entrancesNumber + " подъездов.";
  }

  @Override
  public void demolishHouse() {
    System.out.printf("Вы снесли многоквартирный дом. %d подъездов!\n", entrancesNumber);
  }
}
