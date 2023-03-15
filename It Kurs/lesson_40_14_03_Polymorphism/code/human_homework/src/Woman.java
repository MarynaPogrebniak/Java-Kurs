public class Woman extends Human{

  public Woman(String name) {
    super(name);
  }

  @Override
  public String toString() {
    return "Женщина по имени " + name;
  }

  @Override
  public void greetings() {
    System.out.println("Я родилась");
  }
}
