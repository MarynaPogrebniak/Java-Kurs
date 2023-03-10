public class Bear extends Animal{

  String breed;

  public Bear(String name, String breed) {
    super(name);
    this.breed = breed;
  }

  @Override
  public void makeNoise() {
    System.out.println("Booooo");
  }

  @Override
  public void eat() {
    System.out.println("Bear eats everyone");
  }

  @Override
  public void getDescription() {
    System.out.println("Описание медведя");
  }

  public void setBreed(String breed) {
    this.breed = breed;
  }

  @Override
  public String toString() {
    return "Bear{" +
        "breed='" + breed + '\'' +
        ", name='" + name + '\'' +
        '}';
  }
}
