public class SeaBattle {

  static int[][] seaBattle = new int[10][10];

  public static void main(String[] args) {
    // Задача 2. Завести двумерный массив для игры в "Морской бой".
    // Написать метод, который расставляет на "поле боя" одноклеточный корабль.
    // На входе метода - количество клеток корабля (1) и количество кораблей (4).
    // Корбли не должны "попадать" один на другой и отстоять друг от друга на 1 клетку со всех сторон корабля.
    // На выходе - координаты расставленных на "поле боя" кораблей.
    arrange(1, 4);
  }

  public static void arrange(int cellShipAmount, int shipAmount) {
    int shipPreparedCount = 0;
    do {
      int a = (int) ((Math.random() * ((seaBattle.length - 1) - 0 + 1) + 0));
      int b = (int) ((Math.random() * ((seaBattle.length - 1) - 0 + 1) + 0));
      if (a == 0 && b == 0 && seaBattle[a][b] == 0) {
        if (Right(a, b) && Down(a, b) && RightDown(a, b)) {
          seaBattle[a][b] = 1;
          shipPreparedCount++;
        }
      } else if (a == 0 && b == seaBattle[a].length - 1 && seaBattle[a][b] == 0) {
        if (Left(a, b) && Down(a, b) && LeftDown(a, b)) {
          seaBattle[a][b] = 1;
          shipPreparedCount++;
        }
      } else if (a == seaBattle.length - 1 && b == seaBattle[a].length - 1
          && seaBattle[a][b] == 0) {
        if (Left(a, b) && Up(a, b) && LeftUp(a, b)) {
          seaBattle[a][b] = 1;
          shipPreparedCount++;
        }
      } else if (a == seaBattle.length - 1 && b == 0 && seaBattle[a][b] == 0) {
        if (Right(a, b) && Up(a, b) && RightUp(a, b)) {
          seaBattle[a][b] = 1;
          shipPreparedCount++;
        }
      } else if (a == 0 && b != 0 && seaBattle[a][b] == 0) {
        if (Left(a, b) && Down(a, b) && Right(a, b) && LeftDown(a, b) && RightDown(a, b)) {
          seaBattle[a][b] = 1;
          shipPreparedCount++;
        }
      } else if (a != 0 && b == 0 && seaBattle[a][b] == 0) {
        if (Right(a, b) && Up(a, b) && Down(a, b) && RightUp(a, b) && RightDown(a, b)) {
          seaBattle[a][b] = 1;
          shipPreparedCount++;
        }
      } else if (a != 0 && b == seaBattle[a].length - 1 && seaBattle[a][b] == 0) {
        if (Left(a, b) && Up(a, b) && Down(a, b) && LeftUp(a, b) && LeftDown(a, b)) {
          seaBattle[a][b] = 1;
          shipPreparedCount++;
        }
      } else if (a == seaBattle.length - 1 && b != 0 && seaBattle[a][b] == 0) {
        if (Right(a, b) && Up(a, b) && Left(a, b) && LeftUp(a, b) && RightUp(a, b)) {
          seaBattle[a][b] = 1;
          shipPreparedCount++;
        }

      } else if (seaBattle[a][b] == 0 && seaBattle[a - 1][b] == 0 && seaBattle[a + 1][b] == 0
          && seaBattle[a][b - 1] == 0 && seaBattle[a][b + 1] == 0 && seaBattle[a - 1][b - 1] == 0
          && seaBattle[a - 1][b + 1] == 0
          && seaBattle[a + 1][b + 1] == 0 && seaBattle[a + 1][b - 1] == 0) {
        seaBattle[a][b] = 1;
        shipPreparedCount++;
      }
    } while (shipPreparedCount < shipAmount);

    for (int i = 0; i < seaBattle.length; i++) {
      for (int j = 0; j < seaBattle[i].length; j++) {
        System.out.print(seaBattle[i][j] + "  ");
      }
      System.out.println();
    }
  }

  public static boolean Left(int a, int b) {
    if (seaBattle[a][b - 1] == 0) {
      return true;
    } else {
      return false;
    }
  }

  public static boolean Right(int a, int b) {
    if (seaBattle[a][b + 1] == 0) {
      return true;
    } else {
      return false;
    }
  }

  public static boolean Up(int a, int b) {
    if (seaBattle[a - 1][b] == 0) {
      return true;
    } else {
      return false;
    }
  }

  public static boolean Down(int a, int b) {
    if (seaBattle[a + 1][b] == 0) {
      return true;
    } else {
      return false;
    }
  }

  public static boolean LeftUp(int a, int b) {
    if (seaBattle[a - 1][b - 1] == 0) {
      return true;
    } else {
      return false;
    }
  }

  public static boolean LeftDown(int a, int b) {
    if (seaBattle[a + 1][b - 1] == 0) {
      return true;
    } else {
      return false;
    }
  }

  public static boolean RightUp(int a, int b) {
    if (seaBattle[a - 1][b + 1] == 0) {
      return true;
    } else {
      return false;
    }
  }

  public static boolean RightDown(int a, int b) {
    if (seaBattle[a + 1][b + 1] == 0) {
      return true;
    } else {
      return false;
    }
  }


}




