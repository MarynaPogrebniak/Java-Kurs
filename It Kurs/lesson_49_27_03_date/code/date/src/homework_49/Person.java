package homework_49;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
public class Person implements Comparable<Person>{

  private String name;
  private Date birthday;

  public Person(String name, String birthdayDate) throws ParseException {
    this.name = name;
    DateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
    Date birthday = formatter.parse(birthdayDate);
    this.birthday = birthday;
  }

  public String getName() {
    return name;
  }

  public Date getBirthday() {
    return birthday;
  }

  @Override
  public int compareTo(Person other) {
    return other.birthday.compareTo(birthday);
  }

  @Override
  public String toString() {
    return "Person: " +
        "name='" + name + '\'' +
        ", birthday='" + birthday;
  }
}
