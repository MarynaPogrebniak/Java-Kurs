public class Pet {
String type;
String breed;
String name;
String color;
int age;
double weight;

  @Override //переопределение метода (перезагрузка метода)
  public String toString() {
    return "Pet {" +
        "type='" + type + '\'' +
        ", breed='" + breed + '\'' +
        ", name='" + name + '\'' +
        ", color='" + color + '\'' +
        ", age=" + age +
        ", weight=" + weight +
        '}';
  }

}

