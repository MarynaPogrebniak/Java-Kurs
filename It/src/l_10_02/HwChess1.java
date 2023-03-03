package l_10_02;

public class HwChess1 {

  public static void main(String[] args) {
    //Задача 1. Завести двумерный масив "шахматная доска". Белый цвет - 0, черный цвет - 1.
    // Заполнить массив в соответствии с "шахматной доской" и вывести его на печать.
    // Начальная клетка доски А1 - в левом нижнем углу, черная.

    int chess[][] = new int[8][8];
    //region MyComments
    //  int a = chess.length; высота столбца = 8. количество строк
    //endregion
    // System.out.println(a);
    for (int i = 0; i < chess.length; i++) {
      for (int j = 0; j < chess[i].length; j++) {
        // длина строки, количество столбцов. ширина = 8. 2 значение //
        // когда ленгс то это кол во строк. а окгда ленгс с индексом [i или 0,1... ]
        // то оно показывает длину этой строки с этим индексом

        if ((i + j) % 2 == 0) {
          chess[i][j] = 0;
        } else {
          chess[i][j] = 1;
        }
        System.out.print(chess[i][j] + " ");

      }
      System.out.println();
    }
  }
}

