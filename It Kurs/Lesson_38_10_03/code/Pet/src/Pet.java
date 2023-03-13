//Создать класс Pet (домашнее животное). В классе должны быть:
//
//enum Kind для вида животного (DOG, CAT, OTHER);
//поля:
//"вид животного" (тип Kind),
//"кличка" (тип String),
//"дата рождения" (тип String),
//вес (тип double);
//конструктор, сеттеры, геттеры;
//статический метод для создания животного при прочтении данных из строки "dog,кличка", "cat,кличка,вес", "turtle,кличка,вес,дата рождения".
//Создать класс Main, в котором данные будут считываться с консоли и красиво выводиться на экран.
//
//Формат входных данных: количество строк с записями о домашних животных, затем сами записи в описанном формате.
public class Pet {

  final private static char SEP = ',';
  private Kind kind;
  private static String name;
  private String birthday;
  private static double weight;

  public Pet(String kind, String name, double weight) {
    this.kind = Kind.valueOf(kind);
    this.name = name;
    this.weight = weight;
  }
  public Pet(String kind, String name) {
    this.kind = Kind.valueOf(kind);
    this.name = name;
  }

  public Pet(String kind, String name, double weight, String birthday) {
    this.kind = Kind.valueOf(kind);
    this.name = name;
    this.birthday = birthday;
    this.weight = weight;
  }

  public Kind getKind() {
    return kind;
  }

  public void setKind(Kind kind) {
    this.kind = kind;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getBirthday() {
    return birthday;
  }

  public void setBirthday(String birthday) {
    this.birthday = birthday;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  // статический метод для создания животного при прочтении данных из строки
  // "dog,кличка", "cat,кличка,вес", "turtle,кличка,вес,дата рождения".
  public static Pet parsePet (String kindName, String line){
    int sepIndex = line.indexOf(SEP);
    if (sepIndex != -1) {
      String name = line.substring(0, sepIndex);
      double weight = Double.parseDouble(line.substring(sepIndex + 1)); // начинаем ПОСЛЕ разделителя
      return new Pet(kindName, name, weight);
    } /*else if (sepIndex != -1) {
      String name = line.substring(0);
      return new Pet(kindName, name);
    }*/ /* else if (sepIndex != -1) {
      String name = line.substring(0, sepIndex);
      double weight = Double.parseDouble(line.substring(sepIndex + 1));
      String birthday = line.substring(sepIndex);
      return  new Pet (kindName, name, weight, birthday);
    }*/

    //String birthday = line.substring(sepIndex);
    return null;
  }

  }

