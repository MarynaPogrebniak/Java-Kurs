public class Main {

  public static void main(String[] args) {

Auto auto1 = new Auto(200, 5, "Audi");
Boat boat1 = new Boat(50, 3, "Kanoe");

auto1.drive();
auto1.stop();
auto1.getInfo();

System.out.println();

boat1.drive();
boat1.stop();
boat1.getInfo();

    int autoVinID = auto1.getVIN(12345678);
    System.out.println("VIN number auto is: " + autoVinID);

    int boatVinID = boat1.getVIN(987654321);
    System.out.println("VIN number boat is: " +boatVinID);

  }
}