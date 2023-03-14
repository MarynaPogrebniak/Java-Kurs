public class Sportsman extends Human{

  public Sportsman(String firstName, String lastName) {
    super(firstName, lastName);
  }

  @Override
  public void work() {
    System.out.println("Футболисту пора на тренировку");
    playFootball();
  }

  private void playFootball() {
    System.out.println("Он будет сейчас бегать с мячом");
  }
}
