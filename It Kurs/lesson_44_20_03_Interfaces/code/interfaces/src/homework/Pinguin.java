package homework;

public class Pinguin implements CanSwim, CanRun{

  @Override
  public void canRun() {
    System.out.println("Пингвин умеет бегать");
  }

  @Override
  public void canSwim() {
    System.out.println("Пингвин умеет плавать");
  }
}
