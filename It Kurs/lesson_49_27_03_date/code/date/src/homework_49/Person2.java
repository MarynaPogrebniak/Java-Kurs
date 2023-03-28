package homework_49;


//Задача 1
//Создайте класс Person, которому при создании передавайте имя и дату рождения в виде строки
// в формате "ДД.ММ.ГГГГ".
//
//Реализуйте в классе интерфейс Comparable<Person>, в котором "меньше" будет значить "младше".
//
//Подсказка: не обязательно вычислять возраст, этому мы так и не научились.
// Но можно сравнивать даты рождения!
//
//Альтернативная подсказка: если очень хочется вычислять возраст, то можно это делать
// в миллисекундах с использованием getTime()!
public class Person2 implements Comparable<Person2>{

  private String name;
  private String birthday;

  public Person2(String name, String birthdayDate) {
    this.name = name;
    this.birthday = birthdayDate;
  }

  public String getName() {
    return name;
  }

  public String getBirthday() {
    return birthday;
  }

  @Override
  public int compareTo(Person2 other) {
    return other.getBirthday().compareTo(getBirthday());
  }

  @Override
  public String toString() {
    return "Person: " +
        "name='" + name + '\'' +
        ", birthday='" + birthday;
  }


}
