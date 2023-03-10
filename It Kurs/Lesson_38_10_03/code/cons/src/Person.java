public class Person {
  String name;
  int age;

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
  }

  public Person (String name, int age){
    this.name = name;
    this.age = age;
  }

  void canWalk(){
    System.out.println("A man can walk");
  }
  void canSpeak () {
    System.out.println("A man can speak");
  }

}
