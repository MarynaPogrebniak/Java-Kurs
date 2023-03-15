public class Boy extends Student{

  public Boy(String firstName, String secondName, int age) {
    super(firstName, secondName, age);
  }

  @Override
  public void work() {
    System.out.println(firstName + " делает табуретку");
  }

  @Override
  public String toString() {
    return super.toString() + ". He is a boy";
  }
}
