
import java.util.Arrays;
import java.util.Random;

public class SeaBattle {

  public static void main(String[] args) {

  int [] [] result = new int[10][10];
  fillMap(result,  4);
    for (int i = 0; i < result.length; i++) {
      for (int j = 0; j < result[i].length; j++) {
        System.out.print(result[i][j]);
      }
      System.out.println();
    }
  }

  /**
   * Заполнение кораблей на карте
   * @param map карта боя
   * //@param shipSize размер корабля
   * @param count количество кораблей
   */
  public static void fillMap(int [][] map, int count) {
 //   int i = new Random().nextInt();
   // map.for - выведет for each для map

    for (int i = 0; i < count; i++) {
      setShip(map);
    }


    }

  private static void setShip(int[][] map) {
    int xAxis = getAxis();
    int yAxis = getAxis();

    map[xAxis][yAxis] = 1;

    boolean isValid = validate (map, xAxis, yAxis);
  }

  private static boolean validate(int[][] map, int xAxis, int yAxis) {
   boolean result = false;
     result = map[xAxis][yAxis] == 0;
    return false;
  }

  private static int getAxis() {
    Random random = new Random();
    // map.for - выведет for each для map
    return random.nextInt(10); // от 0 до 10
 
  }
}
