//Задача 2 (*).
// Создать абстрактный класс Transport, поля и метды разработать самостоятельно.
// Расширить его классами Auto и Boat.
// Создать метод, который обеспечивает выдачу VIN для автомобилей и яхт.
public abstract class Transport {
int speed;
int capacity;

  public Transport(int speed, int capacity) {
    this.speed = speed;
    this.capacity = capacity;
  }
  public void drive(){
  }
  public void stop (){
  }
  public void getInfo (){
    System.out.println("Скорость транспортного средства " + this.speed + " вместительность " + this.capacity);
  }

  public int getSpeed() {
    return speed;
  }

  public int getCapacity() {
    return capacity;
  }

  public int getVIN (int vin){
    return vin;
  }
}
