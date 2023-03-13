public class Airplan {
  String airplanName;
  int capacity;
  Pilot pilot;

  public Airplan(String airplanName, int capacity) {
    this.airplanName = airplanName;
    this.capacity = capacity;

  }

  public void setPilot(Pilot pilot) {
    this.pilot = pilot;
  }

  public void go () {
    System.out.println("Airplan " + this.airplanName + " have a pilot " + pilot.getPilotName());
  }

  public  Pilot getPilot () {
    return pilot;
  }

  @Override
  public String toString() {
    return "Airplan{" +
        "airplanName='" + airplanName + '\'' +
        ", capacity=" + capacity +
        '}';
  }
}
