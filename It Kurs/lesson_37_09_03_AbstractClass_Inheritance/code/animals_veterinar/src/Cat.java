public class Cat extends Animal{
  String breed;

  public Cat(String name, String breed) {
    super(name);
    this.breed = breed;
  }

  @Override
  public void makeNoise() {
    System.out.println("Meow");
  }

  @Override
  public void eat() {
    System.out.println("Cat eats Royal Canin");
  }

  @Override
  public void getDescription() {
    System.out.println("Описание кошки");
  }

  public void setBreed(String breed) {
    this.breed = breed;
  }

  @Override
  public String toString() {
    return "Cat{" +
        "breed='" + breed + '\'' +
        ", name='" + name + '\'' +
        '}';
  }
}
