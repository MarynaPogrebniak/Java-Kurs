package homework_49;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Person2Main {

  public static void main(String[] args) {

    Calendar calendar = new GregorianCalendar(); // в календарь можно передать конкретную дату

    Person2 first1 = new Person2("Кирилл", "02.08.1989");
    Person2 second1 = new Person2("Андрей", "05.08.1986");
    SimpleDateFormat myFormat = new SimpleDateFormat("dd.MM.yyyy");
    String firstBirthday = first1.getBirthday();
    String secondBirthday = second1.getBirthday();
    try{
      Date firstDate = myFormat.parse(firstBirthday);
      Date secondDate = myFormat.parse(secondBirthday);

      int diffInDaysFirst = (int)( (calendar.getTime().getTime() - firstDate.getTime())
          / (1000 * 60 * 60 * 24) );
      int diffInDaysSecond = (int)( (calendar.getTime().getTime() - secondDate.getTime())
          / (1000 * 60 * 60 * 24) );
      int yearsFirst = diffInDaysFirst / 365;
      int yearsSecond = diffInDaysSecond / 365;
      System.out.println(yearsFirst);
      System.out.println(yearsSecond);

    }catch(Exception ex){
      System.out.println(ex);
    }
  }
}
