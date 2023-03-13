public class Main {
// Реализовать классы Airplan и Pilot, назначить пилота на рейс на конкртеном самолете.
  public static void main(String[] args) {

    Airplan airplan = new Airplan("Boeing", 150);
    Pilot pilot = new Pilot("Vasya", 37, airplan);

    pilot.go(airplan);
    airplan.go();
    System.out.println(airplan);
    System.out.println(pilot);
  }
}