package homework_49;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonMain {

  public static void main(String[] args) throws ParseException {
    Person first = new Person("Кирилл", "12.02.1992");
    Person second = new Person("Андрей", "05.08.1986");

    System.out.println(first.compareTo(second)); //-1
    List<Person> persons = new ArrayList<>();
    persons.add(first);
    persons.add(second);
    Collections.sort(persons);
    for (Person p: persons){
      System.out.println(p);
    }


  }

}
