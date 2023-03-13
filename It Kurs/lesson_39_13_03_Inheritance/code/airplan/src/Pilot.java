public class Pilot {
  String pilotName;
  int age;
  Airplan airplan;


  public Pilot(String pilotName, int age, Airplan airplan) {
    this.pilotName = pilotName;
    this.age = age;
    this.airplan = airplan;
  }

  public String getPilotName() {
    return pilotName;
  }
  public void go (Airplan airplan) {
    this.airplan = airplan;
    this.airplan.setPilot(this);
  }

  @Override
  public String toString() {
    return "Pilot {" +
        "pilotName='" + pilotName + '\'' +
        ", age=" + age +
        ", airplan=" + airplan +
        '}';
  }
}
