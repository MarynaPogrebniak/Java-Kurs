
public class Cat extends Pet {

  public Cat(String name, String dateOfBirth, double weight) {
    super(name, dateOfBirth, weight);
  }

  public void makePurr() {
    System.out.println(getName() + ": Мррр...");
  }
}