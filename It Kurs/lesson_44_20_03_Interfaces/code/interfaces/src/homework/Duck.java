package homework;

public class Duck implements CanFly, CanRun, CanSwim{

  @Override
  public void canFly() {
    System.out.println("Утка умеет летать");
  }

  @Override
  public void canRun() {
    System.out.println("Утка умеет бегать");
  }

  @Override
  public void canSwim() {
    System.out.println("Утка умеет плавать");
  }
}
