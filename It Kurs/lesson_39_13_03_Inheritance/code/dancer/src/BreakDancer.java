public class BreakDancer extends Dancer{

  public BreakDancer(String name, int age, String sex) {
    super(name, age, sex);

  }

  @Override
  public void dance() {
    System.out.println(toString() + "двигается под музыку, при этом он двигается как робот");
  }
}
