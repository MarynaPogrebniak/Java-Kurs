public class array_dvuhmernii {

  public static void main(String[] args) {

    // Работа с двумерным массивом
    int k = 0;
    int[][] field = new int[10][5];
    for (int i = 0; i < field.length; i++) {
      for (int j = 0; j < 5; j++) {
        k = field.length;
        field[i][j] = i;
        System.out.print(field[i][j] + "\t");
      }
      System.out.println();
    }
    System.out.println(k);
  }

}
