import house.ApartmentHouse;
import house.House;
import house.PrivateHouse;
import java.util.ArrayList;
import java.util.List;

//В основном файле программы создайте список домов, в который поместите
// два частных дома и один многоквартирный.
//
//Выведите информацию о домах в списке с использованием цикла for-each.
public class HouseMain {

  public static void main(String[] args) {
    List<House> houses = new ArrayList<>();

    House private1 = new PrivateHouse("Berlin, Mainstr. 1");
    House private2 = new PrivateHouse("Hamburg, Bahnhofstr. 2");
    House apartment1 = new ApartmentHouse("Singen, Rudolf-diesel str. 28", 5);

    houses.add(private1);
    houses.add(private2);
    houses.add(apartment1);

    private1.demolishHouse();
    apartment1.demolishHouse();

    for (House house: houses) {
      System.out.println(house);
    }



  }
}
