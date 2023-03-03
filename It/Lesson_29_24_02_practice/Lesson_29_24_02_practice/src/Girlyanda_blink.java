import java.util.ArrayList;

public class Girlyanda_blink {

  public static void main(String[] args) throws InterruptedException {
    //Гирлянда из 32 "лампочек".
    // Реализуйте метод "blink", который будет мигать лампочками гирлянды один раз.

    ArrayList<Integer> garland = new ArrayList<>();
// заполняем гирлянду случайно включенными лампочками
    for (int i = 0; i < 32; i++) {
      int e = (int) (Math.random() * 2);
      garland.add(i, e);

    }
    System.out.println(garland);

    // for (int i : garland) {
    // System.out.print(i + " ");

    //метод, который мигает 32 оампочками
    for (int i = 0; i < garland.size(); i++) {
      blink(garland, i);
      Thread.sleep(1000);
      System.out.println(garland);
      
    }
    // задержка на 1 сек
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    System.out.println('\r'); //  возврат каретки

    System.out.println();
    System.out.println(garland);
  }


  // метод blink получает на вход гирлянду, номер "лампочки" и меняет ее состояние
  public static void blink(ArrayList<Integer> array, int num) {
    if (array.get(num) == 1) {
      array.set(num, 0);
    } else {
      array.set(num, 1);
    }
  }

}
