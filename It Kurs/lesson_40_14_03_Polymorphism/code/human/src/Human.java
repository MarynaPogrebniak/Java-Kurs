public class Human {

  private String firstName;
  private String lastName;

  public Human(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public void work (){
    System.out.println("Человек пошел на работу");
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }
}
