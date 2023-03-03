package l_10_02;

public class MatrixDeterminant {

  public static void main(String[] args) {
    // Зада4. Вычислить детерминант матрицы 2х2 -5 10 17 3
    //
    //D = -5 * 3 - 17 * 10 = -15 - 170 = - 185
    int[][] matrix = new int[][]{{-5, 10}, {17, 3}};
    int d = matrix[0][0] * matrix[1][1] - matrix[1][0] * matrix[0][1];
    System.out.println(d);

  }

}
