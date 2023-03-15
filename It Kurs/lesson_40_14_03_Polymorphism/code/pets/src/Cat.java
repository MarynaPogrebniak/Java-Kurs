
public class Cat extends Pet {

  public Cat(String name) {
    super(name);
  }

  @Override // Перезаписать
  public void makeSomeNoise() {
    System.out.println(getName() + ": Мяу!");
  }

  @Override
  public String toString() {
    return String.format("Кошка по кличке %s", getName());
  }
}


