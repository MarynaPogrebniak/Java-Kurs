public class Girl extends Student {

  public Girl(String firstName, String secondName, int age) {
    super(firstName, secondName, age);
  }

  @Override
  public void work() {
    System.out.println(firstName+" готовит суп");
  }

  @Override
  public String toString() {
    return super.toString() + ". She is a girl.";
  }
}
