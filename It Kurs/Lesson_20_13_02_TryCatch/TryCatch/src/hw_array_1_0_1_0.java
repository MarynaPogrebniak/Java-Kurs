public class hw_array_1_0_1_0 {

  public static void main(String[] args) {
    // Задача 2 Заполнить массив 10 х 10 случайными числами 0 или 1.
    // Для каждой строки подсчитать сумму всех элементов массива в этой строке.

    int[][] myArray = new int[10][10];
    int sum = 0;
    for (int i = 0; i < myArray.length; i++) {
      for (int j = 0; j < myArray[i].length; j++) {
        myArray[i][j] = (int) ((Math.random() * (1 - 0 + 1) + 0));
        sum = sum + myArray[i][j];
        System.out.print(myArray[i][j] + " | ");
      }
      System.out.println();
      System.out.println(sum);
      sum = 0;

    }


  }
}


