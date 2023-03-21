package homework;

public class Human implements CanSwim, CanRun{

  @Override
  public void canRun() {
    System.out.println("Человек умеет бегать");
  }

  @Override
  public void canSwim() {
    System.out.println("Человек умеет плавать");
  }
}
