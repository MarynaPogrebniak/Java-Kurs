public class Student {
  String firstName;
  String secondName;
  int age;

  public Student(String firstName, String secondName, int age) {
    this.firstName = firstName;
    this.secondName = secondName;
    this.age = age;
  }

  public void work() {
    System.out.println("Работаем");
  }

  public String toString(){
    return "First name = "+firstName +", second name = "+ secondName + ", age = "+ age;
  }
}
