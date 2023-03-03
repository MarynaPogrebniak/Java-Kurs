package l_14_02;

public class hw_3_min_max_temp {

  static int index = 0;

  public static void main(String[] args) {
    //Задача 3 Имеются результаты погодных наблюдений в которых есть температура
    // и давление за февраль 2023 года (можно сфантазировать).
    // Найти минимальные и максимальные значения температуры и давления за период наблюдения.
    // При выводе на печать указать, в какие дни февраля были зафиксированы эти значения.

    String[] dateArray = new String[]{"1 Feb ", "2 Feb ", "3 Feb ", "4 Feb ", "5 Feb ", "6 Feb ",
        "7 Feb ", "8 Feb ", "9 Feb ", "10 Feb ", "11 Feb ", "12 Feb ", "13 Feb ", "14 Feb "};
    for (int i = 0; i < dateArray.length; i++) {
      System.out.print(dateArray[i] + " ");
    }
    System.out.println();

    int[] arrayTemperature = new int[14];
    for (int i = 0; i < arrayTemperature.length; i++) {
      arrayTemperature[i] = (int) ((Math.random() * (10 - 1 + 1) + 1));
      System.out.print(arrayTemperature[i] + "  |   ");
    }
    System.out.println();

    int[] arrayPressure = new int[14];
    for (int i = 0; i < arrayTemperature.length; i++) {
      arrayPressure[i] = (int) ((Math.random() * (748 - 727 + 1) + 727));
      System.out.print(arrayPressure[i] + " |  ");
    }
    System.out.println();

    int min_temp_index = min(arrayTemperature);
    int min_pressure_index = min(arrayPressure);
    int max_temp_index = max(arrayTemperature);
    int max_pressure_index = max(arrayPressure);

    System.out.println(
        "Min temp is " + arrayTemperature[min_temp_index] + " on " + dateArray[min_temp_index]);
    System.out.println("Min pressure is " + arrayPressure[min_pressure_index] + " on "
        + dateArray[min_pressure_index]);
    System.out.println("Max temperature is " + arrayTemperature[max_temp_index] + " on "
        + dateArray[max_temp_index]);
    System.out.println("Max pressure is " + +arrayPressure[max_pressure_index] + " on "
        + dateArray[max_pressure_index]);


  }

  public static int min(int array[]) {
    int minimum = 760;
    for (int i = 0; i < array.length; i++) {
      if (array[i] < minimum) {
        minimum = array[i];
        index = i;
      }
    }
    return index;

  }

  public static int max(int array[]) {
    int maximum = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] > maximum) {
        maximum = array[i];
        index = i;
      }
    }
    return index;
  }

}
