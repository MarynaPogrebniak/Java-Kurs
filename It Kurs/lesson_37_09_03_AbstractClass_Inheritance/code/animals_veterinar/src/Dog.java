public class Dog extends Animal{
String breed;

  public Dog(String name, String breed) {
    super(name);
    this.breed = breed;
  }

  @Override
  public void makeNoise() {
    System.out.println("Gav gav");
  }

  @Override
  public void eat() {
    System.out.println("Dog eats Pedigree");
  }

  @Override
  public void getDescription() {
    System.out.println("Описание собаки");
  }

  public void setBreed(String breed) {
    this.breed = breed;
  }

  @Override
  public String toString() {
    return "Dog{" +
        "breed='" + breed + '\'' +
        ", name='" + name + '\'' +
        '}';
  }
}
