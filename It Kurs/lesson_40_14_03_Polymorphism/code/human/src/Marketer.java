public class Marketer extends Human{

  public Marketer(String firstName, String lastName) {
    super(firstName, lastName);
  }

  @Override
  public void work() {
    System.out.println("Маркетолог "+ getFirstName() + " " + getLastName() + " создает баннер для рекламы в Интернете" );
    meet();
  }

  private void meet() {
    System.out.println("Он идет на встречу с потенциальным клиентом");
  }


}
