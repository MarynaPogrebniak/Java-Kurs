public class Dogs {
String breed;
String name;
double weight;
int age;

  public String getBreed() {
    return breed;
  }

  public void setBreed(String breed) {
    this.breed = breed;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    if (weight > 0) {
      this.weight = weight;
    } else
      System.out.println("Age should be greater than 0");
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    if (age > 0) {
      this.age = age;
    } else {
      System.out.println("Age should be greater than 0");
    }
  }

  @Override
  public String toString() {
    return "Dogs{" +
        "breed='" + breed + '\'' +
        ", name='" + name + '\'' +
        ", weight=" + weight +
        ", age=" + age +
        '}';
  }

  public Dogs(String breed, String name, double weight, int age) {
    this.breed = breed;
    this.name = name;
    this.weight = weight;
    this.age = age;
  }
}

