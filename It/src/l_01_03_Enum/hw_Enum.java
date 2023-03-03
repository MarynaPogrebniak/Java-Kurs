package l_01_03_Enum;

public class hw_Enum {

  public static void main(String[] args) {
    enum DaysOfTheWeek {
      MONDAY,
      TUESDAY,
      WEDNESDAY,
      THURSDAY,
      FRIDAY,
      SATURDAY,
      SUNDAY
    }
    for (DaysOfTheWeek days : DaysOfTheWeek.values()) {
      System.out.println(days);
    }
  }
}
