public class Man extends Human{

  public Man(String name) {
    super(name);
  }

  @Override
  public String toString() {
    return "Мужчина по имени " + name;
  }
}
