public abstract class Dancer {

String name;
int age;
String sex;

  @Override
  public String toString() {
    return "Dancer{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", sex='" + sex + '\'' +
        '}';
  }

  public Dancer(String name, int age, String sex) {
    this.name = name;
    this.age = age;
    this.sex = sex;
  }

  public void dance (){
  System.out.println(toString() + "Двигаться под музыку");
}

}
