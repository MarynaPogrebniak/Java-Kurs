public class Voter {
  String name;
  String ID_num;
  int Age;

  public Voter(String name, String ID_num, int age) {
    if (!name.isEmpty()){
      this.name = name;
    } else {
      System.out.println("Имени не существует");
    }
    this.ID_num = ID_num;
    if (age > 16) {
      Age = age;
      System.out.println("Избиратель может голосовать.");
    } else {
      Age = age;
      System.out.println("Избиратель еще не может голосовать.");
    }
  }

  @Override
  public String toString() {
    return "Voter{" +
        "name='" + name + '\'' +
        ", ID_num='" + ID_num + '\'' +
        ", Age=" + Age +
        '}';
  }

}
