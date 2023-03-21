package homework;

public class Superman implements CanFly, CanRun, CanSwim{

  @Override
  public void canFly() {
    System.out.println("Супермен умеет летать");
  }

  @Override
  public void canRun() {
    System.out.println("Супермен умеет бегать");
  }

  @Override
  public void canSwim() {
    System.out.println("Супермен умеет плавать");
  }
}
