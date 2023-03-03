package l_01_03_Enum;

import java.util.Arrays;

public class Enum {

  public static void main(String[] args) {
    System.out.println("Пример использования enum - 4 времени года");
    enum Seasons {
      WINTER,
      SPRING,
      SUMMER,
      AUTUMN
    }
    System.out.println(Arrays.toString(Seasons.values()));
    Seasons mySeason = Seasons.AUTUMN;
    switch (mySeason) {
      case SPRING -> {
        System.out.println("Пришла весна! Травка зеленеет");
        break;
      }
      case SUMMER -> {
        System.out.println("Летом тепло");
        break;
      }
      case AUTUMN -> {
        System.out.println("Осенью падают листья");
        break;
      }
      case WINTER -> {
        System.out.println("Зимой идет снег");
        break;
      }
    }
    int index = Seasons.AUTUMN.ordinal();
    System.out.println(index);

    //Продаем кофе через автомат

  }

}
