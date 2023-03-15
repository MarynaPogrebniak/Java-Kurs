public class Human {

  String name;

  public Human(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Человек по имени " + name;
  }

  public void greetings (){
    System.out.println("Я родился");
  }
}
