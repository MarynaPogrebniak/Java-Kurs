package l_14_02;

public class hw_2_duplicates_array {

  public static void main(String[] args) {
    //Задача 2
    // Задача про удаление дубликатов.
    // Задумать случайный массив из 10 целых чисел от 1 до 10.
    // Проверить массив на наичие в нем дубликатов, вместо найденного дубликата задать 0.
    // Пример Задуман массив: 1, 5, 7, 6, 5, 3, 6, 9, 10, 5
    // После удаления дубликатов: 1, 5, 7, 6, 0, 3, 0, 9, 10, 0

    int[] arrayIntRandom = new int[10];
    for (int i = 0; i < arrayIntRandom.length; i++) {
      arrayIntRandom[i] = (int) ((Math.random() * (10 - 1 + 1) + 1));
      System.out.print(arrayIntRandom[i] + " | ");
    }
    System.out.println();

    int[] resultArray = searchDuplicate(arrayIntRandom);
    for (int i = 0; i < resultArray.length; i++) {
      System.out.print(resultArray[i] + " | ");
    }
  }

  public static int[] searchDuplicate(int array[]) {

    for (int i = 0; i < array.length; i++) { // перебирает значения по очереди
      for (int j = i + 1; j < array.length; j++) { // сранивает со следующими значениями в массиве
        if (array[i] == array[j]) { // если совпадение
          array[j] = 0; // меняет на 0
        }
      }
    }
    return array;
  }
}


