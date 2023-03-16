public class Human {

  private String name;

  public Human(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Человек по имени " + name;
  }

  public void greet(){
    System.out.println("Я родился");
  }

  public String getName() {
    return name;
  }
}
